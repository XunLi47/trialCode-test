package com.trial.dms.trialCode.test.testMethod;

import java.util.concurrent.TimeUnit;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


public class Demo1 {
	
	private static final Logger logger  = LoggerFactory.getLogger(Demo1.class);
	
	O o = new O();

    public void test(){
        synchronized (o) {
            //这里无限执行
            while (true) {
                try {
                    TimeUnit.SECONDS.sleep(1);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                logger.debug("xxxxxxx");
            }
        }
    }

    public static void main(String[] args) {
        Demo1 demo = new Demo1();

        new Thread(demo :: test, "t1").start();

        try {
            TimeUnit.SECONDS.sleep(1);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        Thread t2 = new Thread(demo :: test, "t2");

        //锁对象改变
//        demo.o = new O();
        //锁对象的属性改变
        demo.o.num = 1;
        //t2能否执行？
        t2.start();
    }

    public static class O{
        int num = 0;
    }

}
