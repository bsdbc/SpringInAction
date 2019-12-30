package com.wwr.chapter3.part3_2;

import org.springframework.context.annotation.Condition;
import org.springframework.context.annotation.ConditionContext;
import org.springframework.core.io.Resource;
import org.springframework.core.type.AnnotatedTypeMetadata;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class MagicExistsCondition implements Condition {
    /**
     *判断resources下application.properties文件中是否同时存在magic的配置，存在则创建magicBean
     *
     * */
    public boolean matches(ConditionContext conditionContext, AnnotatedTypeMetadata annotatedTypeMetadata) {
        Resource resource = conditionContext.getResourceLoader().getResource("application.properties");
        Properties prop=new Properties();
        try {
            prop.load(new FileInputStream(resource.getFile()));

        } catch (IOException e) {
            e.printStackTrace();
        }


        return prop.containsKey("magic");
    }
}
