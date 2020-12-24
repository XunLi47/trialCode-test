package com.trial.dms.trialCode.test.testMethod;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Demo4 {
	
	private static final Logger logger  = LoggerFactory.getLogger(Demo4.class);
	
	private static int count = 10;

    //synchronized 关键字修饰静态方法锁定的是类的对象
    public synchronized static void test(){
        count--;
        logger.debug("count =" + count);
    }

    //与上面的效果相同
    public static void test2(){
        synchronized (Demo4.class){//这里不能替换成this
            count--;
        }
    }

}
