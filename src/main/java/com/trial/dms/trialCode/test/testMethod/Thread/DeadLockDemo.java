package com.trial.dms.trialCode.test.testMethod.Thread;

/**
 * 两个线程互相等待着对象释放锁，一直这样僵持下去，所以导致了死锁的产生，下面这个代码就会产生一个死锁
 * @author lx
 * @date 2020年12月24日
 */
public class DeadLockDemo {
	
	private static String A = "A";
    private static String B = "B";

    public static void main(String[] args) {
        new DeadLockDemo().deadLock();
    }

    private void deadLock() {
        Thread t1 = new Thread(() -> {
          synchronized (A){
              try {
                  Thread.sleep(2000);
              }catch (InterruptedException e){
                  e.printStackTrace();
              }
              synchronized (B){
                  System.out.println("1");
              }
          }
        });
        Thread t2 = new Thread(()->{
           synchronized (B){
               synchronized (A){
                   System.out.println("2");
               }
           }
        });
        t1.start();
        t2.start();
    }

}
