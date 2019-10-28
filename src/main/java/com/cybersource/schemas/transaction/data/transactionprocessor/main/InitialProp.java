package com.cybersource.schemas.transaction.data.transactionprocessor.main;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.cybersource.schemas.transaction.data.util.ApplicationProperties;

public class InitialProp {
	private static final Logger logger = LoggerFactory.getLogger(InitialProp.class);
	
	public static void main(String[] args) {
		logger.info(ApplicationProperties.getAppName("app.name"));
	}
}
