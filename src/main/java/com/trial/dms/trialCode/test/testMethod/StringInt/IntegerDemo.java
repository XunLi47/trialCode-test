package com.trial.dms.trialCode.test.testMethod.StringInt;

/**
 * 使用包装类提供的toString方法
 * @author lx
 * @date 2020年12月24日
 */
public class IntegerDemo {
	
	public static void main(String[] args) {
        // 如果在使用过程中，调用方法的时候，如果方法上画了删除线  则表示该方法不推荐使用，但是 依然可以使用
        Integer integer = new Integer("10");
        //使用Integer来获取最大的整数
        System.out.println(Integer.MAX_VALUE);
        System.out.println(Integer.MIN_VALUE);
        //推荐使用的 获取Integer对象的方法
        // 实现了将基本类型的数据转换为他的包装类对象
        Integer in = Integer.valueOf(100);
        // 将基本类型的String类型转换为基本 类型对应的包装类
        Integer in2 = Integer.valueOf("200");//字符串中的内容只能为数字  否则就会出现NumberFormatException
        Integer in3 = 120;// 自动装箱  始于jdk1.5
        int i = in;// 自动拆箱
        String s = 3 + "";
        System.out.println(s + 1);//31
        System.out.println(in2.toString() + 100);//200100
    }

}
