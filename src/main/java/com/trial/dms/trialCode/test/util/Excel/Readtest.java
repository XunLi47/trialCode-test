package com.trial.dms.trialCode.test.util.Excel;

import java.util.*;

public class Readtest {
	public static void main(String[] args) throws Exception {
	       /** 方法一
	       * fileName:Excel文件路径
	       * StatrRow：读取的开始行数（默认填0）
	       * EndRow：读取的结束行数（填-1为全部）
	       * ExistTop:是否存在头部（如存在则读取数据时会把头部拼接到对应数据作为KEY，若无则KEY为当前列数）
	       */
	        List<Map<String,Object>> result =excelRead.ReadExcelByRC("D:/trialCodes/test.xlsx",2,10,false);
	        System.out.println(result.size());
	        System.out.println(result);

	        /**
	        * 方法二
	        * ReadExcelByPOJO(String fileName, int StatrRow, int EndRow, Class t)
	        * fileName:Excel文件路径
	        * StatrRow：读取的开始行数（默认填0）
	        * EndRow：读取的结束行数（填-1为全部）
	        * Class<T>：传过来的实体类类型
	        */
	        List<Object> result2 = excelRead.ReadExcelByPOJO("D:/trialCodes/test.xlsx",2,10,ExcelPOJO.class);
	        System.out.println(result2.size());
	        System.out.println(result2);
	        }

}
