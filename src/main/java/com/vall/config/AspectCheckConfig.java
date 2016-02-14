package com.vall.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

/**
 *
 * Created by Vall on 14.02.2016.
 */

@Configuration
@ComponentScan(value = "com.vall")
@EnableAspectJAutoProxy
public class AspectCheckConfig {
}
