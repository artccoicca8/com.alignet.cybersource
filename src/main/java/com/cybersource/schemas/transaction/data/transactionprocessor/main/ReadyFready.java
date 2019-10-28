package com.cybersource.schemas.transaction.data.transactionprocessor.main;

import java.math.BigInteger;
import java.util.HashMap;
import java.util.Map;

import org.apache.cxf.endpoint.Client;
import org.apache.cxf.endpoint.Endpoint;
import org.apache.cxf.frontend.ClientProxy;
import org.apache.cxf.ws.security.wss4j.WSS4JOutInterceptor;
import org.apache.wss4j.dom.WSConstants;
import org.apache.wss4j.dom.handler.WSHandlerConstants;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.cybersource.schemas.transaction.data.BillTo;
import com.cybersource.schemas.transaction.data.CCAuthService;
import com.cybersource.schemas.transaction.data.Card;
import com.cybersource.schemas.transaction.data.Item;
import com.cybersource.schemas.transaction.data.PurchaseTotals;
import com.cybersource.schemas.transaction.data.ReplyMessage;
import com.cybersource.schemas.transaction.data.RequestMessage;
import com.cybersource.schemas.transaction.data.transactionprocessor.ITransactionProcessor;
import com.cybersource.schemas.transaction.data.transactionprocessor.TransactionProcessor;
import com.cybersource.schemas.transaction.data.transactionprocessor.callback.UTPasswordCallback;

public class ReadyFready {
	private static final Logger logger = LoggerFactory.getLogger(ReadyFready.class);

	public static void main(String[] args) {

		logger.info(" ******** Iniciando el consumo ************");

		TransactionProcessor processor = new TransactionProcessor();
		ITransactionProcessor transactionProcessor = processor.getPortXML();
		
		Client client = ClientProxy.getClient(transactionProcessor);
		Endpoint endpoint = client.getEndpoint();

		Map<String, Object> props = new HashMap<String, Object>();
		props.put(WSHandlerConstants.ACTION, WSHandlerConstants.USERNAME_TOKEN);
		props.put(WSHandlerConstants.PASSWORD_TYPE, WSConstants.PW_TEXT);
		props.put(WSHandlerConstants.PW_CALLBACK_CLASS, UTPasswordCallback.class.getName());
		props.put(WSHandlerConstants.USER, "ripley_pe");

		WSS4JOutInterceptor wssOut = new WSS4JOutInterceptor(props);
		endpoint.getOutInterceptors().add(wssOut);

		RequestMessage request = new RequestMessage();

		request.setMerchantID("ripley_pe");

		// Before using this example, replace the generic value with
		// your reference number for the current transaction.
		request.setMerchantReferenceCode("111122561");

		// To help us troubleshoot any problems that you may encounter,
		// please include the following information about your application.
//		request.setClientLibrary("Java Axis WSS4J");
		request.setClientLibraryVersion("");
//	        request.setClientEnvironment(
//	                  System.getProperty( "os.name" ) + "/" +
//	                  System.getProperty( "os.version" ) + "/" +
//	                  System.getProperty( "java.vendor" ) + "/" +
//	                  System.getProperty( "java.version" ) );
//	    
		// This section contains a sample transaction request for the authorization
		// service with complete billing, payment card, and purchase (two items)
		// information.
		request.setCcAuthService(new CCAuthService());
		request.getCcAuthService().setRun("true");

		BillTo billTo = new BillTo();
		billTo.setFirstName("John");
		billTo.setLastName("Doe");
		billTo.setStreet1("1295 Charleston Road");
		billTo.setCity("Mountain View");
		billTo.setState("CA");
		billTo.setPostalCode("94043");
		billTo.setCountry("US");
		billTo.setEmail("cyber@cybersource.com");
		billTo.setIpAddress("10.7.111.111");
		request.setBillTo(billTo);

		Card card = new Card();
		card.setAccountNumber("4111111111111111");
		card.setExpirationMonth(new BigInteger("12"));
		card.setExpirationYear(new BigInteger("2020"));
		request.setCard(card);

		PurchaseTotals purchaseTotals = new PurchaseTotals();
		purchaseTotals.setCurrency("USD");
		request.setPurchaseTotals(purchaseTotals);

		Item[] items = new Item[2];

		Item item = new Item();
		item.setId(new BigInteger("0"));
		item.setUnitPrice("12.34");
		item.setQuantity("2");
		items[0] = item;

		item = new Item();
		item.setId(new BigInteger("1"));
		item.setUnitPrice("56.78");
		items[1] = item;

//		request.setItem(items);

		try {
			logger.info("Preparando envio de objeto : ");
			ReplyMessage replyMessage = transactionProcessor.runTransaction(request);
		} catch (Exception e) {
			e.printStackTrace();
		}

	}
}
