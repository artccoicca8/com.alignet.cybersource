package com.cybersource.schemas.transaction.data.transactionprocessor.handler;

import java.util.Set;

import javax.xml.namespace.QName;
import javax.xml.soap.SOAPElement;
import javax.xml.soap.SOAPEnvelope;
import javax.xml.soap.SOAPHeader;
import javax.xml.ws.handler.MessageContext;
import javax.xml.ws.handler.soap.SOAPHandler;
import javax.xml.ws.handler.soap.SOAPMessageContext;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class AuthClientHandler implements SOAPHandler<SOAPMessageContext>{

	private static final Logger LOG = LoggerFactory.getLogger(AuthClientHandler.class);
	private static final String MERCHANT_ID = "ripley_pe";
	private static final String PASSWORD = "Letmein01";
	@Override
	public boolean handleMessage(SOAPMessageContext context) {

		Boolean isResponse = (Boolean)context.get(MessageContext.MESSAGE_OUTBOUND_PROPERTY);
		String usuario="";
		String clave="";
		try{
			if(isResponse){
				 
				LOG.info("Habilitando la cabecera Cybersource");  
				SOAPEnvelope envelope = context.getMessage().getSOAPPart().getEnvelope();
				SOAPHeader header = envelope.getHeader()==null? envelope.addHeader() : envelope.getHeader();
				SOAPElement element = header.addNamespaceDeclaration("au", "http://security/");
//				element.addChildElement("user","au").setValue("duke");
//				element.addChildElement("clave","au").setValue("java");
				element.addChildElement("user","au").setValue(MERCHANT_ID);
				element.addChildElement("clave","au").setValue(PASSWORD);
				
				
			}
			
		}catch(Exception ex){
			LOG.error("Error al procesar la autenticación..", ex);
		}
		return true;
	}

	@Override
	public boolean handleFault(SOAPMessageContext context) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void close(MessageContext context) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Set<QName> getHeaders() {
		// TODO Auto-generated method stub
		return null;
	}

}
