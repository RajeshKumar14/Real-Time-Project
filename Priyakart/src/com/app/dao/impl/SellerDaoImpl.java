package com.app.dao.impl;
import org.springframework.stereotype.Repository;

import com.app.client.RestClient;
import com.app.dao.ISellerDao;
import com.app.model.Seller;
import com.app.util.JsonUtil;

@Repository
public class SellerDaoImpl implements ISellerDao{
      
	@Override
	public String saveSeller(Seller seller) {
		 String json=null;
		//1.convert obj to json
		 if(seller!=null){
		  json=JsonUtil.convertObjToJson(seller);
		//2.get response msg back
		  return RestClient.connectToProviderToSaveSeller(json);
		 }
		 return "Please passing the data";
	}

	@Override
	public Seller getSellerByUmailAndPwd(String sellerEmail, String Pwd) {
		
		//get response msg back
		Seller sellerObj=null;
		String json= RestClient.connectToProviderToLoginSeller(sellerEmail, Pwd);
		if(json!=null)
		sellerObj=(Seller)JsonUtil.convertJsonToObj(json, Seller.class);
	  return sellerObj;
	}
	

}
