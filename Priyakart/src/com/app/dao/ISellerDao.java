package com.app.dao;

import com.app.model.Seller;

public interface ISellerDao {
	
    public String saveSeller(Seller seller);
    public Seller getSellerByUmailAndPwd(String sellerEmail,String Pwd);
	
}
