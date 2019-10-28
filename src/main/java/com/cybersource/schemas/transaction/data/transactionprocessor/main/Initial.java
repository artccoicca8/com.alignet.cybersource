package com.cybersource.schemas.transaction.data.transactionprocessor.main;

import java.math.BigInteger;
import java.net.MalformedURLException;
import java.net.URL;

import javax.xml.namespace.QName;

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

public class Initial {

	private static Logger LOGGER = LoggerFactory.getLogger(Initial.class);

	public static void main(String[] args) throws MalformedURLException {
		LOGGER.info("Iniciando Salida .............");

		URL url = new URL("https://ics2wstesta.ic3.com/commerce/1.x/transactionProcessor/CyberSourceTransaction_1.159.wsdl");
		QName qname = new QName("urn:schemas-cybersource-com:transaction-data:TransactionProcessor","TransactionProcessor");

		TransactionProcessor processorService = new TransactionProcessor(url, qname);
		RequestMessage request = new RequestMessage();
		request.setMerchantID("ripley_pe");
		request.setMerchantReferenceCode("your_merchant_reference_code");

//	       request.setClientLibrary( "Java Axis WSS4J" );
//	       request.setClientLibraryVersion( "" );
//	       request.setClientEnvironment(
//	                 System.getProperty( "os.name" ) + "/" +
//	                 System.getProperty( "os.version" ) + "/" +
//	                 System.getProperty( "java.vendor" ) + "/" +
//	                 System.getProperty( "java.version" ) );
//	   

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
		billTo.setEmail("null@cybersource.com");
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

//	       request.set

		ITransactionProcessor port = processorService.getPort(ITransactionProcessor.class);
		ReplyMessage message = port.runTransaction(request);

		LOGGER.info("Response={}", message.getApOrderReply());

//		BasicAlumnoServiceService service =	new BasicAlumnoServiceService(url, qname);
//		AlumnoService port = service.getPort(AlumnoService.class);
//		LOG.info("Response={}", port.consultar("01"));

	}
}
