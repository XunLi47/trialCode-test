package com.trial.dms.trialCode.test.testMethod;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Demo2 {
	
	private static final Logger logger  = LoggerFactory.getLogger(Demo2.class);
	
	private int count = 10;

    public void test(){
        /**
         * synchronized（this）锁定的是当前类的实例，这里锁定的是Demo2类的实例
         */
        synchronized (this){
            count--;
            logger.debug("count = " + count);
        }
    }

}
