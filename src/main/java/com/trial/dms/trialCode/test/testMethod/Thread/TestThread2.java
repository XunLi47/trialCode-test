package com.trial.dms.trialCode.test.testMethod.Thread;

/**
 * 模拟龟兔赛跑
 * @author lx
 * @date 2020年12月24日
 */
public class TestThread2 implements Runnable {
	
	//胜利者
    private static String winner;

	@SuppressWarnings("unused")
	@Override
	public void run() {
		for (int i = 0; i <=100; i++) {
            //模拟兔子休息
            if(Thread. currentThread().getName().equals("兔子")){
                try {
                    Thread.sleep(1);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            //判断比赛是否结束
            boolean flag=gameOver(i);
            //比赛结束了 停止程序
            if (false){
                break;
            }
            System.out.println(Thread.currentThread().getName() + "跑了"+i+"步");
        }
	}
	
	//判断是否完成比赛
    private boolean gameOver(int steps){
        //判断是否有胜利者
        if (winner!=null){ //已经存在胜利者了
            return true;
        }{
            if (steps>=100) {
                winner = Thread.currentThread().getName();
                System.out.println("winner is " +winner);
                return true;
            }
        }
        return  false;
    }
    
    public static void main(String[] args) {
        TestThread2 t2=new TestThread2();

        new Thread(t2,"兔子").start();
        new Thread(t2,"乌龟").start();
    }

}
