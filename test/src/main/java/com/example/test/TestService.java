package com.example.test;

import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;


@Service
public class TestService {
	private final RestTemplate restTemplate;

	public TestService(RestTemplateBuilder restTemplateBuilder) {
		this.restTemplate = restTemplateBuilder.build();
	}
	
	public Test getURL(){

		return this.restTemplate.getForObject("https://api.sec.or.th/FundFactsheet/fund/amc", Test.class);
	}
}
