package com.hoby.springboot.server;

import org.springframework.web.context.WebApplicationContext;

/**
 * @author hoby
 * @since 2024-01-12
 */
public interface WebServer {

    void start(WebApplicationContext applicationContext);

}
