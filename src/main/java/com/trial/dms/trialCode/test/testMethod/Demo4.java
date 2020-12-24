package com.trial.dms.trialCode.test.testMethod;

import java.util.ArrayList;
import java.util.Iterator;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Demo4 {
	
//	private static final Logger logger  = LoggerFactory.getLogger(Demo4.class);
	
	@SuppressWarnings("rawtypes")
	public static void main(String[] args) {
        ArrayList list = new ArrayList();
        list.add("唐三藏");
        list.add("孙悟空");
        for(int i=0;i<list.size();i++){
            if(list.get(i).equals("孙悟空")){
                list.add("猪八戒");
            }
        }
        System.out.println(list);
        for (Object i : list) {
            if (i.equals("孙悟空")) {
                list.add("猪八戒");
            }
        }
        System.out.println(list);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            if (it.next().equals("孙悟空")) {
                list.add("猪八戒");
            }
        }
        System.out.println(list);
    }

}
