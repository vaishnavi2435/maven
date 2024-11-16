package com.TestnNG;

import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Assrataion_Hard_Soft {
	@Test
	 /* public void HardAsseration()
	  {
		  String exp="I am learning testng ";
		  String act="I am learning testng ";
		  
		  Assert.assertEquals(act, exp, "Test fail: not same my string ");
		  System.out.println("pass the current statement ");
	  }
	  */
	 /* public void hardtrue ()
	  {
		  String s="i am sid ";
		  String s1="i am vaishu";
		  Assert.assertTrue(s.contains("vaishu"),"faill test:not matching string");
		  System.out.println("matching the string ");
	  }
	  */
	  
	  public void hardfalse()
	  {
		  String act="testng is hard";
		  String exp="testng is easy";
		   
		  Assert.assertFalse(act.contains("easy")," not matching the string ");
		  System.out.println("matching the String");
		  
	  }
  
}
