package com.hoby.springboot.annotation;

import com.hoby.springboot.autoconfigure.AutoConfigurationImportSelector;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * @author hoby
 * @since 2024-01-12
 */
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@Configuration
@ComponentScan
@Import(AutoConfigurationImportSelector.class)
public @interface MySpringBootApplication {

}
