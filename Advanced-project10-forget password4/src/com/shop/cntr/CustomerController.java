package com.shop.cntr;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.support.SessionStatus;

import com.shop.dto.Customer;
import com.shop.dto.Product;
import com.shop.dto.cust_prod;
import com.shop.service.CustomerService;
import com.shop.service.ProductService;

@Controller
public class CustomerController {
	
	@Autowired
	private ProductService productService;
	@Autowired
	private CustomerService customerService;
	
	
	@RequestMapping(value="/pre_purchase.htm", method=RequestMethod.GET)
	public String preCustomerForm(ModelMap map) {
		map.put("cust", new Customer());
		return "customer_form";
		
	}
	
	@RequestMapping(value="/customer1.htm", method=RequestMethod.POST)
	public String CustomerForm(Customer cust, ModelMap map,HttpSession session) {
		
		List<Product> li = productService.select();
		map.put("prodList", li);
	
			int cid = customerService.addCustomer(cust);
			
			Customer c = customerService.findCust(cid);
		
			session.setAttribute("cust",c);
			
			return "buy_product_form";
		
		
	}
	
	@RequestMapping(value="/customer2.htm", method=RequestMethod.POST)
	public String delete1( ModelMap map, @RequestParam("productId") Integer[] productIds,HttpSession session) {
		Customer cust1 =((Customer)session.getAttribute("cust"));

		for(int id:productIds) {
			Product p = productService.findProduct(id);
			
			cust_prod cp = new cust_prod();
			cp.setC_id(cust1.getCustId());
			cp.setP_id(id);
			customerService.addCP(cp);
			productService.modifyQuantity(id);
			System.out.println(p.getQuantity());
		}
		
		int cid = ((Customer)session.getAttribute("cust")).getCustId();
		List<cust_prod> l1 = customerService.selCP(cid);
		System.out.println(l1);
		List<Product> l2 = new ArrayList<Product>();
		for(cust_prod a : l1) {
			Product p = productService.findProduct(a.getP_id());
			l2.add(p);
		}
		System.out.println(l2);
		map.put("list",l2);
		
		
		return "cust_details";
	}
	
	
	@RequestMapping(value="/customer3.htm", method=RequestMethod.GET)
	public String done(ModelMap map, HttpSession session) {

//		Customer cust1 =((Customer)session.getAttribute("cust"));
//		cust_prod c = new cust_prod();
//		c.setC_id(cust1.getCustId());
//		customerService.deleteCust1(c);
		session.removeAttribute("cust");
		session.invalidate();
		
		return "home";
		
	}
	
}
