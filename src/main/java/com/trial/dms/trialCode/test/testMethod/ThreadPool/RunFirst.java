package com.trial.dms.trialCode.test.testMethod.ThreadPool;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * 用线程池创建线程并且命名
 * @author lx
 * @date 2020年12月24日
 */
public class RunFirst {
	
	private static ExecutorService service;

    static {
        service = Executors.newFixedThreadPool(10, (r -> {
            Thread t = new Thread(r);
            t.setName("my-thread-fixed-worker");
            t.setDaemon(true);
            return t;
        }));
    }

    public static void main(String[] args) {
        System.out.println("开始执行");
        int len = 100;
        for (int i = 0; i < len; i++) {
            int finalI = i;
            service.execute(() -> {
                System.out.println("当前线程名=" + Thread.currentThread().getName() + "==>工作任务是打印:" + finalI);
            });
            System.out.println("```当前线程名=" + Thread.currentThread().getName() + "==>工作任务是打印:" + finalI);
        }
        System.out.println("执行完毕");
    }

}
