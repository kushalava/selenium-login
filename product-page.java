package com.myselenium.tutorials;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckBox {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver",
				"C:\\Selenium\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		// Browser based commands
		driver.get("http://toolsqa.com/automation-practice-form/");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		List<WebElement> CheckBox = driver.findElements(By.name("tool"));

		// This will tell you the number of checkboxes are present

		int iSize = CheckBox.size();

		System.out.println(iSize);

		// Start the loop from first checkbox to last checkboxe

		for (int i = 0; i < iSize; i++) {

			// Store the checkbox name to the string variable, using 'Value'
			// attribute

			String sValue = (String) CheckBox.get(i).getAttribute("value");

			System.out.println(sValue);

			// Select the checkbox it the value of the checkbox is same what you
			// are looking for

			if (sValue.equalsIgnoreCase("selenium webdriver")) {
				CheckBox.get(i).click();

				// This will take the execution out of for loop

				break;

			}

		}
	}
}
