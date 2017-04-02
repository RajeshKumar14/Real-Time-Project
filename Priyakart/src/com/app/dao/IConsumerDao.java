package com.app.dao;

import com.app.model.Consumer;

public interface IConsumerDao {
	
    public String saveConsumer(Consumer cons);
    public Consumer getConsumerByUmailAndPwd(String consEmail,String Pwd);
	
}
