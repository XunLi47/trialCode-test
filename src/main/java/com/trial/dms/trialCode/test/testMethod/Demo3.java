package com.trial.dms.trialCode.test.testMethod;

import java.util.Scanner;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Demo3 {
	
//	private static final Logger logger  = LoggerFactory.getLogger(Demo3.class);
	
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("请输入一个数");
		int n=scanner.nextInt();
		int sum=0;
		for (int i = 1; i <=n; i++) {//确定第几个数
			int a=1;
			for (int j = 1; j <=i; j++) {//数的阶乘
				
				a=a*j;
			}
				sum=sum+a;
		}

		System.out.println(sum);
	}

}
