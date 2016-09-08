package a1.camelrouter;

import javax.inject.Named;

import org.switchyard.Exchange;

public interface CheckInputMessageFeatures {
	
	public boolean verify(Exchange exchange);

}
