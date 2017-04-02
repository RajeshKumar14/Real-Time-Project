package com.app.dao.impl;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.app.client.RestClient;
import com.app.dao.IItemDao;
import com.app.model.Item;
import com.app.util.JsonUtil;

@Repository
public class ItemDaoImpl implements IItemDao {
    
//=============Save item In Vendor DB==========
	@Override
	public String saveItem(Item item) {
		String json=null;
		if(item!=null){
		//1.convert obj to json
		 json=JsonUtil.convertObjToJson(item); 
		//2.get response msg back
		 return RestClient.connectToProviderToSaveItem(json);
		}
		return "Please Not pass the null object";
	  }	
//=============View All item ==================
	@SuppressWarnings("unchecked")
	@Override
	public List<Item> getAllItem() {
		List<Item> itemObj=null;
		String json=RestClient.connectToProviderToViewAllItem();
		if(json!=null)
		itemObj=(List<Item>) JsonUtil.convertJsonToListObj(json, Item.class);
	  return itemObj;
	}
	/*@Override
	public List<Item> getAllItem() {
		List<Item> itemObj=null;
		itemObj=RestClient.connectToProviderToViewAllItem();
		return itemObj;
	}*/
//=============View Item by Item Id in Vendor DB=============
	 @Override
	public Item getItemById(int itemId) {
		 Item itemObj=null;
			String json=RestClient.connectToProviderToViewItemByItemId(itemId);
			if(json!=null)
			itemObj=(Item)JsonUtil.convertJsonToObj(json,Item.class);
		  return itemObj;
	   }
//===============Update Item in Vendor DB====================
	 @Override
	public void updateItem(Item item) {
		// TODO Auto-generated method stub
		
	}@Override
	public boolean isItemExist(String itemName) {
		// TODO Auto-generated method stub
		return false;
	}
	@Override
	public void deleteItemById(int itemId) {
		// TODO Auto-generated method stub
		
	}	
}
