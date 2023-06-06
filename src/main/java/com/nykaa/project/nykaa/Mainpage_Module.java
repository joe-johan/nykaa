package com.nykaa.project.nykaa;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Mainpage_Module extends Base_Class {
public static WebDriver driver;
public Mainpage_Module(WebDriver lodriver) {
	this.driver = lodriver;
	PageFactory.initElements(lodriver, this);
}
@FindBy(xpath = "//a[@class='logo css-1bk0o9p']")
private WebElement skin;

@FindBy(xpath = "(//a[@target='_blank'])[215]")
private WebElement facewash;
public WebElement getSkin() {
	return skin;
}

public WebElement getFacewash() {
	return facewash;
}

	
	
}
