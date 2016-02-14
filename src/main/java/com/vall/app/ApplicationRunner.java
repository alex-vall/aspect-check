package com.vall.app;

import com.vall.config.AspectCheckConfig;
import com.vall.logic.ActionPerformer;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 *
 * Created by Vall on 14.02.2016.
 */
public class ApplicationRunner {

    private static ApplicationContext applicationContext;

    public static void main(String[] args) throws Exception {
        applicationContext = new AnnotationConfigApplicationContext(AspectCheckConfig.class);

        ActionPerformer actionPerformer = applicationContext.getBean(ActionPerformer.class);

        actionPerformer.performAction(15);

    }
}
