package com.javainuse;

import org.apache.camel.builder.RouteBuilder;
import org.apache.camel.component.jackson.JacksonDataFormat;
import com.javainuse.MyProcessor;
import org.springframework.stereotype.Component;

@Component
public class MyRoute extends RouteBuilder {

	@Override
	public void configure() throws Exception {
		JacksonDataFormat jsonDataFormat = new JacksonDataFormat(OrderItem.class);
		from("file:C:/inputFolder?noop=true").convertBodyTo(String.class).process(new MyProcessor()).to("direct:foo");
		
		

		from("direct:foo").marshal(jsonDataFormat).to("file:C:/outputFolder");

//		from("file:C:/inputFolder?noop=true")
//		.convertBodyTo(String.class)
//		.process(new MyProcessor()).to("direct:foo");
//		

//	
//		.process(new WriteProcessor())
//		.to("file:C:/outputFolder");		
	}
}
////main working
//from("file:C:/inputFolder?noop=true")
//.convertBodyTo(String.class)
//.process(new MyProcessor())
//.marshal(jsonDataFormat)		
//.to("file:C:/outputFolder");		
