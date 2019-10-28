package com.cybersource.schemas.transaction.data.transactionprocessor.callback;

import java.io.IOException;

import javax.security.auth.callback.Callback;
import javax.security.auth.callback.CallbackHandler;
import javax.security.auth.callback.UnsupportedCallbackException;

import org.apache.wss4j.common.ext.WSPasswordCallback;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.cybersource.schemas.transaction.data.util.Constants;

public class UTPasswordCallback implements CallbackHandler {
	private static final Logger logger = LoggerFactory.getLogger(UTPasswordCallback.class);
	
	
	
	public void handle(Callback[] callbacks) throws IOException, UnsupportedCallbackException {
		logger.info("Salida Key : "+ Constants.TRANSACTION_KEY);
		for (Callback callback : callbacks) {
			WSPasswordCallback wpc = (WSPasswordCallback) callback;
			if (wpc.getIdentifier().equals(Constants.TRANSACTION_USER)) {
				wpc.setPassword(Constants.TRANSACTION_KEY);
				return;
			}
		}

	}

}
