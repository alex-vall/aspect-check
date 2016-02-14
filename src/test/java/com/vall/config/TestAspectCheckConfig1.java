package com.vall.config;

import com.vall.aspect.ActionPerformerAspect;
import com.vall.logic.ActionPerformer;
import com.vall.logic.ActionPerformerDefault;
import org.mockito.Mockito;
import org.springframework.context.annotation.*;

/**
 * Created by Vall on 14.02.2016.
 */


@Configuration
@Profile("test-config-1")
@ComponentScan(value = "com.vall")
@EnableAspectJAutoProxy
public class TestAspectCheckConfig1 {

    @Bean
    @Primary
    public ActionPerformerAspect actionPerformerAspect(){
        return Mockito.mock(ActionPerformerAspect.class);
    }

    @Bean
    @Primary
    public ActionPerformer actionPerformer() {
        return new Mockito().mock(ActionPerformer.class);
    }

//    public ActionPerformer actionPerformer() {
//        return new ActionPerformerDefault();
//    }
}
