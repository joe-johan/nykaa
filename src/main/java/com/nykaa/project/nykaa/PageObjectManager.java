package com.nykaa.project.nykaa;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import io.cucumber.messages.internal.com.google.protobuf.TimestampProto;

public class PageObjectManager extends Base_Class {
	
	public static WebDriver driver;
	public PageObjectManager(WebDriver lodriver) {
		this.driver = lodriver;
		PageFactory.initElements(lodriver, this);
	}
private Mainpage_Module mpp;
private Fashwash_Module fwp;
private Cart_Module cp;

public Mainpage_Module getMpp() {
mpp = new Mainpage_Module(driver);
	return mpp;
}
public Fashwash_Module getFwp() {
	fwp = new Fashwash_Module(driver);
	return fwp;
}
public Cart_Module getCp() {
	cp=new Cart_Module(driver);
	return cp;
}


}
