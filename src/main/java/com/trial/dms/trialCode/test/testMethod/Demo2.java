package com.trial.dms.trialCode.test.testMethod;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Demo2 {
	
	private static final Logger logger  = LoggerFactory.getLogger(Demo2.class);
	
	public static void main(String[] args){
        int a = 1;
        int b = 0;
        //假设要捕获多个异常，则需要异常的类型从小到大写
        try{//try监控区域
            new Demo2().a();
            System.out.println(a/b);
        }catch (ArithmeticException e){//catch要捕获异常
            System.out.println("程序出现异常，除数不能为0！");
            logger.error("错误信息1：{}",e.getMessage(),e);
        }catch (Throwable e){
            System.out.println("程序出现异常");
            logger.error("错误信息2：{}",e.getMessage(),e);
        }finally {//处理善后的工作
            System.out.println("finally");
        }
        //可以不要finally，  但是finally一般用来关闭一些资源
    }

    public void a(){
        b();
    }
    public void b(){
        a();
    }
    //假设在方法中，处理不了这个异常，则方法上抛出异常
    public void test(int a,int b) throws Exception {
        if (b==0){
            throw new ArithmeticException();//主动抛出异常，一般用在方法中
        }
    }

}
