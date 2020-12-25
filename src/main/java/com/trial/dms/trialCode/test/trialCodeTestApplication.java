package com.trial.dms.trialCode.test;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

//@ComponentScan("com.trial.dms")
@SpringBootApplication
public class trialCodeTestApplication
{
    public static void main( String[] args ){
    	SpringApplication.run(trialCodeTestApplication.class,args);
    }
}
