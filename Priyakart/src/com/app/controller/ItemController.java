package com.app.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.app.model.Item;
import com.app.service.IItemService;

@Controller
public class ItemController {
	
	@Autowired
	private IItemService service;
	
//=================Item related page Call===============
	@RequestMapping("/addItem")
	public String showAddItemPage()
	{
		return "ItemAdd";
	}
	@RequestMapping("/trackApprovalItem")
	public String showTrackApprovalItemPage()
	{
		return "itemApproval";
	}
	
//===============Insert Item In The Vendor DB=============	
	@RequestMapping(value="/insertItem",method=RequestMethod.POST)
	public String saveItemData(@ModelAttribute("Item")Item item,ModelMap map)
	   {
	  String msg=service.saveItem(item);
	   map.addAttribute("msg", msg);
	    return "ItemAdd";
      }	
//=================View All Item In Vendor DB==============
	@RequestMapping("/priyakart")
	public String showAllPriyakrtItem(ModelMap map){
		//read data from SL
		List<Item> itemList=service.getAllItem();
		//send to UI 
		map.addAttribute("itemListObj", itemList);
		//specify UI page name
		return  "ItemHome";
	   }
//========Getting a item of Vendor DB for Updating ==========
	@RequestMapping("/updateItem")
	public String showItemEditPage(@RequestParam("itemId")int itemId,ModelMap map){
		Item item=service.getItemById(itemId);
		map.addAttribute("itemObj",item);
		return "";
	}
//=======Update item in vendor DB According to the Seller======
	@RequestMapping(value="/itemUpdate",method=RequestMethod.POST)
	public String updateItemData(
	  @ModelAttribute("item")Item item){
		service.updateItem(item);
		return "redirect:viewAllVen";
	}
//=============Delete item in Vendor DB========================
	@RequestMapping("deleteVen")
	public String deleteItem(
			@RequestParam("itemId")int itemId){
		service.deleteItemById(itemId);
		return "redirect:viewAllVen";
	 }

}
