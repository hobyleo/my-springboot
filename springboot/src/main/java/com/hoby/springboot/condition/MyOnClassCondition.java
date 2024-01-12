package com.hoby.springboot.condition;

import com.hoby.springboot.annotation.MyConditionalOnClass;
import org.springframework.context.annotation.Condition;
import org.springframework.context.annotation.ConditionContext;
import org.springframework.core.type.AnnotatedTypeMetadata;

import java.util.Map;

/**
 * @author hoby
 * @since 2024-01-12
 */
public class MyOnClassCondition implements Condition {

    @Override
    public boolean matches(ConditionContext context, AnnotatedTypeMetadata metadata) {
        Map<String, Object> annotationAttributes =
                metadata.getAnnotationAttributes(MyConditionalOnClass.class.getName());

        String className = (String) annotationAttributes.get("value");

        try {
            context.getClassLoader().loadClass(className);
            return true;
        } catch (ClassNotFoundException e) {
            return false;
        }
    }

}
