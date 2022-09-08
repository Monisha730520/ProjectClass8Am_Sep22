package org.test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import java.util.TreeSet;

import javax.swing.plaf.basic.BasicInternalFrameTitlePane.MaximizeAction;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.server.handler.MaximizeWindow;
import org.openqa.selenium.remote.server.handler.SendKeys;
import org.testng.annotations.Test;
import org.utility.BaseClass;

public class FlipkartTask1  extends BaseClass{

	@Test
	private void test1() throws InterruptedException {

		browsers("Chrome");
		urlLaunch("https://www.flipkart.com/");
		impWait(10);
		
		driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']")).click();
		
		WebElement txtbox = driver.findElement(By.xpath("//input[@name='q']"));
		sendKeys(txtbox, "apple watch");
		
	   WebElement btnclick = driver.findElement(By.xpath("//button[@type='submit']"));
	   btnclick.click();
	   
	   List<WebElement> prdname = driver.findElements(By.xpath("//div[@class='_4rR01T']"));
	   List<String> prlist = new ArrayList<>();
	   for(WebElement x:prdname) {
		   prlist.add(x.getText());
		   System.out.println(prlist);	  
	  
	   }
	    
	   List<WebElement> pricelist = driver.findElements(By.xpath("//div[@class='_30jeq3 _1_WHN1']"));
	   List<String> prvalue = new ArrayList<>();
	   for(WebElement x:pricelist) {
		   prvalue.add(x.getText()); 

	   }
//	   System.out.print(prvalue);

	   	List<String>string2 = new ArrayList<>();
		  	for(int i=0;i<prvalue.size();i++) {
		  		string2.add(prvalue.get(i).replaceAll("₹", ""));	
		  	}
			  List<String>string3 = new ArrayList<>();
				  for(int i=0;i<prvalue.size();i++) {
					  string3.add(string2.get(i).replaceAll(",", ""));
	  
				  }
//					System.out.println(string3);

			List<Integer>price =new ArrayList<Integer>();
			for(String integer1:string3) {
				price.add(Integer.parseInt(integer1));
			}
//			System.out.println(price);
			
//			Collections.sort(price);
//			System.out.println(price);

			Integer max = Collections.max(price);
			System.out.println(max);
			
			Integer min = Collections.min(price);
			System.out.println(min);
			
			Map<String , Integer> mapproduct = new LinkedHashMap<>();
			for(int i=0;i<price.size();i++) {
				mapproduct.put(prlist.get(i), price.get(i));
			}
			
			System.out.println(mapproduct);
			
			
			
			
			
	}  
				  
}			  
				  
					  
	
			  
	
	
//		   
//			String text = prdlist.get(i).getText();
//			String text2 = pricelist.get(i).getText();
//			for(int j=0;j<pricelist.size();j++) {
//				   String priceValue = getAttributeText(pricelist.get(j));
//				 if(priceValue.contains("₹")) {
//					 priceValue=priceValue.replace("₹", "Rs");
//			System.out.println(count+"- "+text+"-"+priceValue);
//		
//			count++;
//				 }}
//			
//		}
//     
//	   
//	   }
	
	   
	   
	   
	   
   
	   
	   
	   
			 
	   
	   
	   
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	   
