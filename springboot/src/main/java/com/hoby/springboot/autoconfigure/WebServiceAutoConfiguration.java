package com.hoby.springboot.autoconfigure;

import com.hoby.springboot.annotation.MyConditionalOnClass;
import com.hoby.springboot.server.JettyWebServer;
import com.hoby.springboot.server.TomcatWebServer;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author hoby
 * @since 2024-01-12
 */
@Configuration
public class WebServiceAutoConfiguration implements AutoConfiguration {

    @Bean
    @MyConditionalOnClass("org.apache.catalina.startup.Tomcat")
    public TomcatWebServer tomcatWebServer() {
        return new TomcatWebServer();
    }

    @Bean
    @MyConditionalOnClass("org.eclipse.jetty.server.Server")
    public JettyWebServer jettyWebServer() {
        return new JettyWebServer();
    }

}
