package com.cybersource.schemas.transaction.data.transactionprocessor.callback;

import java.io.IOException;

import javax.security.auth.callback.Callback;
import javax.security.auth.callback.CallbackHandler;
import javax.security.auth.callback.UnsupportedCallbackException;

import org.apache.wss4j.common.ext.WSPasswordCallback;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.cybersource.schemas.transaction.data.util.ApplicationProperties;

public class UTPasswordCallback implements CallbackHandler {
	private static final Logger logger = LoggerFactory.getLogger(UTPasswordCallback.class);
	private static final String TRANSACTION_KEY = ApplicationProperties.getAppName("app.key.cyber");
	
	
	
	public void handle(Callback[] callbacks) throws IOException, UnsupportedCallbackException {
		logger.info("Salida Key : "+ TRANSACTION_KEY);
		for (Callback callback : callbacks) {
			WSPasswordCallback wpc = (WSPasswordCallback) callback;
			if (wpc.getIdentifier().equals("ripley_pe")) {
				wpc.setPassword(TRANSACTION_KEY);
				return;
			}
		}

	}

}
