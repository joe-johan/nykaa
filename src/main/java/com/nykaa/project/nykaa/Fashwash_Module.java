package com.nykaa.project.nykaa;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Fashwash_Module extends Base_Class {
	public static WebDriver driver;
	public Fashwash_Module(WebDriver lodriver) {
		this.driver = lodriver;
		PageFactory.initElements(lodriver, this);
	}
	@FindBy(xpath = "//div[text()='Nykaa Naturals Face Wash']")
	private WebElement nykaaface;
	public WebElement getNykaaface() {
		return nykaaface;
	}

	
}
