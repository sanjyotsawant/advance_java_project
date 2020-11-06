package com.shop.cntr;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.shop.dto.Product;
import com.shop.service.ProductService;

@Controller
public class ProductContoller {
	
	@Autowired
	private ProductService productService;
	
	@RequestMapping(value="/pre_prod_form.htm", method=RequestMethod.GET)
	public String preProductForm(ModelMap map) {
		
		
		map.put("prod", new Product());
		return "add_prod_form";
		
	}
	
	@RequestMapping(value="/add_prod_form.htm", method=RequestMethod.POST)
	public String addProductForm(Product prod,ModelMap map) {
		productService.addProduct(prod);
		return "home";
		
	}
	
	@RequestMapping(value="/show.htm", method=RequestMethod.GET)
	public String showProducts(ModelMap map) {
		List<Product> li = productService.select();
		map.put("prodList", li);
		return "show_product";
		
	}
	
	@RequestMapping(value="/showCategory.htm", method=RequestMethod.GET)
	public String showCategoryForm(ModelMap map) {
		map.put("prod", new Product());
		return "show_Category_Form";
		
	}
	
	
	@RequestMapping(value="/show_Category1.htm", method=RequestMethod.POST)
	public String showProductsOFCategory(Product prod, ModelMap map) {
		List<Product> li = productService.selectCategory(prod);
		map.put("prodList", li);
		return "show_Category";
		
	}
	
	@RequestMapping(value="/delete.htm", method=RequestMethod.GET)
	public String delete(ModelMap map) {
		List<Product> li = productService.select();
		map.put("prodList", li);
		return "delete_form";
		
	}
	
	@RequestMapping(value="/delete1.htm", method=RequestMethod.POST)
	public String delete1(ModelMap map, @RequestParam("productId") Integer[] productIds) {
		for(int id:productIds) {
			productService.removeProduct(id);
		}
		List<Product> li = productService.select();
		map.put("prodList", li);
		return "delete_form";
	}
	
	
	@RequestMapping(value="/update.htm", method=RequestMethod.GET)
	public String update(ModelMap map) {
		List<Product> li = productService.select();
		map.put("prodList", li);
		return "update";
		
	}
	
	@RequestMapping(value = "/update_form.htm",method = RequestMethod.GET)
	public String expenseUpdateForm(@RequestParam int productId,ModelMap map) {
		
		Product prod = productService.findProduct(productId);
		map.put("prod", prod);
		
		return "update_form";
	}
	
	
	@RequestMapping(value = "/product_update.htm",method = RequestMethod.POST)
	public String expenseUpdate(Product prod,ModelMap map) {
		
		productService.modifyProduct(prod);
	
		List<Product> li = productService.select();
		map.put("prodList", li);
		return "update";
	}
	

}
