package com.app.ibmwatsonimpl;

import java.util.HashMap;
import java.util.Map;

import com.ibm.watson.developer_cloud.alchemy.v1.AlchemyLanguage;
import com.ibm.watson.developer_cloud.alchemy.v1.model.DocumentSentiment;
import com.ibm.watson.developer_cloud.http.ServiceCall;
import com.ibm.watson.developer_cloud.natural_language_understanding.v1.NaturalLanguageUnderstanding;
import com.ibm.watson.developer_cloud.natural_language_understanding.v1.model.AnalysisResults;
import com.ibm.watson.developer_cloud.natural_language_understanding.v1.model.AnalyzeOptions;
import com.ibm.watson.developer_cloud.natural_language_understanding.v1.model.EntitiesOptions;
import com.ibm.watson.developer_cloud.natural_language_understanding.v1.model.Features;

public class WatsonRequest {

	public static void main(String[] args) {
		NaturalLanguageUnderstanding service;
		service = new NaturalLanguageUnderstanding(NaturalLanguageUnderstanding.VERSION_DATE_2017_02_27);
		service.setUsernameAndPassword("e56c4fb7-21a7-4199-84f9-0666e7a121ab",
				"5lEZ3Vo0kiVA");
		service.setEndPoint("https://gateway.watsonplatform.net/natural-language-understanding/api");
		EntitiesOptions entities = new EntitiesOptions.Builder().sentiment(true).emotion(true).limit(5).build();
		Features features = new Features.Builder().entities(entities).build();
		AnalyzeOptions parameters = new AnalyzeOptions.Builder().text("Who won USA elections 2016?").features(features).build();
		AnalysisResults results = service.analyze(parameters).execute();
		System.err.println(results.getAnalyzedText());
		
		

	}

}
