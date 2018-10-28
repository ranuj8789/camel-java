package com.javainuse;

import java.io.ByteArrayInputStream;
import javax.xml.transform.stream.StreamSource;
import org.apache.camel.Exchange;
import org.apache.camel.Processor;
import org.milyn.Smooks;
import org.milyn.container.ExecutionContext;
import org.milyn.payload.JavaResult;
import com.javainuse.OrderItem;

public class MyProcessor implements Processor {

	public void process(Exchange exchange) throws Exception {
		String body = exchange.getIn().getBody().toString();
		Smooks smooks = new Smooks("smooks-config.xml");
		try {			
			ExecutionContext executionContext = smooks.createExecutionContext();			
			JavaResult result = new JavaResult();
			smooks.filterSource(executionContext, new StreamSource(new ByteArrayInputStream(body.getBytes())), result);
			OrderItem item = (OrderItem) result.getBean("orderItem");
			 exchange.getOut().setBody(item);			
		} finally {

		}
	}
}
