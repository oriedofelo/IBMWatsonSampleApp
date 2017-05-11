package com.app.ibmwatsonimpl;

import java.util.HashMap;
import java.util.Map;

import com.ibm.watson.developer_cloud.alchemy.v1.AlchemyLanguage;
import com.ibm.watson.developer_cloud.alchemy.v1.model.DocumentSentiment;
import com.ibm.watson.developer_cloud.http.ServiceCall;

public class WatsonRequest {

	public static void main(String[] args) {
		AlchemyLanguage service = new AlchemyLanguage();
		service.setApiKey("<api_key>");
		Map<String,Object> params = new HashMap<String, Object>();
		params.put(AlchemyLanguage.TEXT, "IBM Watson won the Jeopardy television show hosted by Alex Trebek");
		ServiceCall<DocumentSentiment> sentiment =  service.getSentiment(params);
		sentiment.execute();
		System.out.println(sentiment);

	}

}
