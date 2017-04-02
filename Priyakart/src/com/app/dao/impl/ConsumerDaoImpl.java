package com.app.dao.impl;
import org.springframework.stereotype.Repository;

import com.app.client.RestClient;
import com.app.dao.IConsumerDao;
import com.app.model.Consumer;
import com.app.util.JsonUtil;

@Repository
public class ConsumerDaoImpl implements IConsumerDao{
	
	@Override
	public String saveConsumer(Consumer cons) {
		
		//1.convert obj to json
		 String json=JsonUtil.convertObjToJson(cons);
			
		//2.get response msg back
		  return RestClient.connectToProviderToSaveConsumer(json);
	}

	@Override
	public Consumer getConsumerByUmailAndPwd(String consEmail, String Pwd) {
		
		//get response msg back
				Consumer consObj=null;
				String json= RestClient.connectToProviderToLoginConsumer(consEmail, Pwd);
				if(json!=null)
				consObj=(Consumer)JsonUtil.convertJsonToObj(json, Consumer.class);
			  return consObj;
	}
	
}
