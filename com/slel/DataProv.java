package com.slel;


import org.testng.annotations.Test;
import com.slel.Ndpr;

public class DataProv {
	
	@Test(dataProvider="dp",dataProviderClass=Ndpr.class)
	public void fun(int tid,String tname,String tdes){
		
		System.out.println(tid+"Owner name:"+tname+"Tdesc"+tdes);
	}
	
//	@DataProvider
//	public Object[][] dp(){
//		return new Object[][]{
//			
//			{1,"Dheeraj","VodafoneIN"},{3,"Kundan","AmdocsIN"},{6,"Amir","EricssonIN"}	
//			
//			
//		};
//		
//	}

}
