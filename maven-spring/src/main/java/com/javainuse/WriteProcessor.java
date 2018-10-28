package com.javainuse;

import org.apache.camel.Exchange;
import org.apache.camel.Processor;

public class WriteProcessor implements Processor {
	public void process(Exchange exchange) throws Exception {
		String item = exchange.getIn().getBody().toString();
		System.out.println(item);

	}

}
