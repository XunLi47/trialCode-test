package com.trial.dms.trialCode.test.testMethod;

import java.util.Random;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * 在登录注册页面中，除了用户名和密码外，通常也会包含验证码。
 * 1、验证码是用来区分用户是计算机还是人，防止恶意破解密码、刷票、灌水等行为。
 * 2、请查看Random、StringBuilder相关API，定义方法，获取一个包含4个字符的验证码，
 * 3、每一位字符是随机选择的字母和数字，可包含a-z,A-Z,0-9。例如：7Kt5
 * @author lx
 * @date 2020年12月24日
 */
public class Testo5 {
	
	private static final Logger logger  = LoggerFactory.getLogger(Testo5.class);
	
	public static void main(String[] args) {
        String str = getStr();
        System.out.println("生成的验证码为："+str);
        logger.info("生成的验证码为:{}",str);
    }

    public static char[] getCharArray(){
        // 定义一个字符数组，长度是62
        char[] chs = new char[62];
        // 定义一个变量，记录数组的索引
        int index = 0;
        // 将A-Z a - z 存储到chs数组中
        for (char c = 'A'; c <= 'Z'; c++) {
            chs[index++] = c;
            // index++;
        }
        for (char c = 'a'; c <= 'z'; c++) {
            chs[index++] = c;
            // index++;
        }
        for (char c = '0'; c <= '9'; c++) {
            chs[index++] = c;
            // index++;
        }
        return chs;
    }


    public static String getStr(){
        // 获取字符数组
        char[] chs = getCharArray();
        // 创建Random对象
        Random r = new Random();
        // 创建StringBuilder对象
        StringBuilder sb = new StringBuilder();

        // 循环5次，随机5个字符
        for (int i = 0; i < 5; i++) {
            // 0 ~ 数组长度-1
            // 随机获取索引的值
            int index = r.nextInt(chs.length);
            char c = chs[index];

            // 添加到sb中
            sb.append(c);
        }
        // 将sb转换成String并返回
        return sb.toString();
    }

}
