package com.hoby.springboot.annotation;

import com.hoby.springboot.condition.MyOnClassCondition;
import org.springframework.context.annotation.Conditional;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * @author hoby
 * @since 2024-01-12
 */
@Target({ ElementType.TYPE, ElementType.METHOD })
@Retention(RetentionPolicy.RUNTIME)
@Conditional(MyOnClassCondition.class)
public @interface MyConditionalOnClass {

    String value() default "";

}
