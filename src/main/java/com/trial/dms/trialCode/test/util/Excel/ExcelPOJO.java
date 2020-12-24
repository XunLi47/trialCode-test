package com.trial.dms.trialCode.test.util.Excel;

public class ExcelPOJO {
	
	 public String getName() {
	        return name;
	    }
	    public void setName(String name) {
	        this.name = name;
	    }
	    public String getPasswork() {
	        return passwork;
	    }
	    public void setPasswork(String passwork) {
	        this.passwork = passwork;
	    }
	    public String getLook() {
	        return look;
	    }
	    public void setLook(String look) {
	        this.look = look;
	    }
	    
	   @excelRescoure(value = "XM")
	   private  String name;
	   @excelRescoure(value = "SFZH")
	   private  String passwork;
	   @excelRescoure()
	   private  String look;
	 
	   @Override
	   public String toString(){
	        return "name:"+this.getName()+",passwork:"+this.getPasswork()+",look:"+this.getLook();
	    }
	   public ExcelPOJO() {}

}
