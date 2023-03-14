package keyWordDrivenTest;

import org.testng.annotations.Test;

import keywordDrivenTest.CarHomeLoanEMI_PageObj;

import org.testng.annotations.BeforeTest;

import java.util.Scanner;

import org.testng.annotations.AfterTest;

public class CarHomeLoanEMI_Test
{
	CarHomeLoanEMI_PageObj carhome_loan=new CarHomeLoanEMI_PageObj();  
    Scanner sc=new Scanner(System.in);

@BeforeTest
public void beforeTest() throws Exception
{
	  
	carhome_loan.openBrowser(carhome_loan.readDataFromPropertiesFile("browser"));
	carhome_loan.call_CarHomeLoanEMI_PageObj();
	  
}

@Test
public void carHomeLoanEMI_Test1() throws Exception
{
	  
	carhome_loan.openApplicationURL(carhome_loan.readDataFromPropertiesFile("baseURL")+"/emi-calculator.html");	
	  
	carhome_loan.waitForSeconds(2);
	  
	carhome_loan.clickEvent(carhome_loan.no_Thanks_Message);
	  
	  carhome_loan.waitForSeconds(2);
	  
	  carhome_loan.pageScrollDown();
	  
	 // System.out.print("Enter Principle Amount : ");
	 // String principleAmt=sc.nextLine();
	  
	  carhome_loan.inputValueEvent(carhome_loan.carhome_loan_textBox, "400000");
	  carhome_loan.inputValueEvent(carhome_loan.loan_period_textBox, "10");
	  carhome_loan.handleDropDownList(carhome_loan.emi_start_from_DropDown, "At the time of loan disbursement");
	  carhome_loan.inputValueEvent(carhome_loan.interest_rate_textBox, "7");
	  carhome_loan.inputValueEvent(carhome_loan.upfront_charges_textbox, "10000");
	  carhome_loan.clickEvent(carhome_loan.submitBtn);
	  
	  carhome_loan.waitForSeconds(2);
	  
	  System.out.println("EMI Value is : "+carhome_loan.emi_Value.getText());
}

@AfterTest
public void afterTest() 
{
	//carhome_loan.closeBrowser();
}

}
