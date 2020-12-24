package com.trial.dms.trialCode.test.testMethod;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Demo3 {
	
	private static final Logger logger  = LoggerFactory.getLogger(Demo3.class);
	
	private int count = 10;

    //直接加在方法声明上，相当于是synchronized(this)
    public synchronized void test(){
        count--;
        logger.debug("count = " + count);
    }

}
