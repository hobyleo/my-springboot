package com.hoby.springboot.autoconfigure;

import org.springframework.context.annotation.DeferredImportSelector;
import org.springframework.core.type.AnnotationMetadata;

import java.util.ArrayList;
import java.util.List;
import java.util.ServiceLoader;

/**
 * @author hoby
 * @since 2024-01-12
 */
public class AutoConfigurationImportSelector implements DeferredImportSelector {

    @Override
    public String[] selectImports(AnnotationMetadata importingClassMetadata) {
        ServiceLoader<AutoConfiguration> serviceLoader = ServiceLoader.load(AutoConfiguration.class);

        List<String> list = new ArrayList<>();
        for (AutoConfiguration autoConfiguration : serviceLoader) {
            list.add(autoConfiguration.getClass().getName());
        }

        return list.toArray(new String[0]);
    }

}
