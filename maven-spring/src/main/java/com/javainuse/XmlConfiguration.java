package com.javainuse;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;

@Configuration
@ImportResource({"classpath*:applicationcontext.xml"})
public class XmlConfiguration {
}