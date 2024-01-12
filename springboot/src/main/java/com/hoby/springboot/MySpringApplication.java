package com.hoby.springboot;

import com.hoby.springboot.server.WebServer;
import org.springframework.context.ApplicationContext;
import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;

import java.util.Map;

/**
 * @author hoby
 * @since 2024-01-12
 */
public class MySpringApplication {

    public static void run(Class<?> clazz, String[] args) {

        // create application context
        AnnotationConfigWebApplicationContext applicationContext = new AnnotationConfigWebApplicationContext();
        applicationContext.register(clazz);
        applicationContext.refresh();

        // start web server
        WebServer webServer = getWebServer(applicationContext);
        webServer.start(applicationContext);
    }

    public static WebServer getWebServer(ApplicationContext applicationContext) {
        // key为beanName, value为Bean对象
        Map<String, WebServer> webServers = applicationContext.getBeansOfType(WebServer.class);

        if (webServers.isEmpty()) {
            throw new NullPointerException();
        }
        if (webServers.size() > 1) {
            throw new IllegalStateException();
        }

        // 返回唯一的一个
        return webServers.values().stream().findFirst().get();
    }

}
