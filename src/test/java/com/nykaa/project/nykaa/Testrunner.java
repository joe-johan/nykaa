package com.nykaa.project.nykaa;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import io.cucumber.messages.internal.com.google.protobuf.TimestampProto;

public class Testrunner extends Base_Class {
	public static PageObjectManager pom = new PageObjectManager(driver);
	
	@Test
	public static void nykaa() {
		Launch_Browser("chrome");
		getUrl("https://www.nykaa.com/");
		pom.getMpp().getSkin().click();
	}
}
