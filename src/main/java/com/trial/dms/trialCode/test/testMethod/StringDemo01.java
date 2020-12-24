package com.trial.dms.trialCode.test.testMethod;

public class StringDemo01 {
	
	public static void main(String args[]){
        String str1 = "hello" ;                 // 直接赋值
        String str2 = new String("hello") ;     // 通过new赋值
        String str3 = str2 ;                    // 传递引用
        System.out.println("str1 == str2 --> " + (str1==str2)) ;    // false
        System.out.println("str1 == str3 --> " + (str1==str3)) ;    // false
        System.out.println("str2 == str3 --> " + (str2==str3)) ;    // true
        System.out.println("--------------------------------------------------------------------");
        System.out.println("str1 equals str2 --> " + (str1.equals(str2))) ; // true
        System.out.println("str1 equals str3 --> " + (str1.equals(str3))) ; // true
        System.out.println("str2 equals str3 --> " + (str2.equals(str3))) ; // true
        System.out.println("--------------------------------------------------------------------");
        System.out.println("str1-hashCode == str2-hashCode --> " + (str1.hashCode()==str2.hashCode())) ;    // false
        System.out.println("str1-hashCode == str3-hashCode --> " + (str1.hashCode()==str3.hashCode())) ;    // false
        System.out.println("str2-hashCode == str3-hashCode --> " + (str2.hashCode()==str3.hashCode())) ;    // true
        
    }

}
