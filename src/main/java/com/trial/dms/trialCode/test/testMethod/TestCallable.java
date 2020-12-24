package com.trial.dms.trialCode.test.testMethod;

import java.util.concurrent.*;

public class TestCallable implements Callable<Boolean> {

	public Boolean call(){
        //call方法线程体
        for (int i = 0; i < 10; i++) {
            System.out.println("我在学习Java的多线程------"+i);
        }
        return  true;
    }
	
	public static void main(String[] args) throws ExecutionException, InterruptedException {
        //main线程， 主线程

        TestCallable t1 = new TestCallable();
        //创建执行服务
        ExecutorService ser= Executors.newFixedThreadPool(1);
        //提交执行
        Future<Boolean> r1=ser.submit(t1);
        //获取结果：
        boolean rs1=r1.get();
        //关闭服务
        ser.shutdownNow();

        for (int i = 0; i < 10; i++) {
            System.out.println("我在学习JS的方法-------"+i);
        }

    }

}
