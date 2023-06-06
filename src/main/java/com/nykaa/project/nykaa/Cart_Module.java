package com.nykaa.project.nykaa;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Cart_Module extends Base_Class {
	public static WebDriver driver;
	public Cart_Module(WebDriver lodriver) {
		this.driver = lodriver;
		PageFactory.initElements(lodriver, this);
	}

@FindBy(xpath = "\"//select[@class='css-2t5nwu']")
private WebElement natural;

@FindBy(xpath = "(//span[@class='btn-text'])[1]")
private WebElement add;

@FindBy(xpath = "//button[@class='css-g4vs13']")
private WebElement addtocart;

@FindBy(xpath = "//iframe[@class='css-acpm4k']")
private WebElement frame10;

@FindBy(xpath = "\"//button[text()='Login / Register']")
private WebElement login;

@FindBy(xpath = "//input[@placeholder='Enter Mobile Number or Email']")
private WebElement number;

@FindBy(xpath = "//input[@class='input text-center']")
private WebElement email;

@FindBy( id = "submitVerification")
private WebElement submit;

@FindBy(name = "password")
private WebElement pass;

@FindBy(xpath = "//button[@class='button big fill full small-button-seperator ']")
private WebElement button1;

@FindBy(xpath = "//button[@class='css-g4vs13']")
private WebElement button2;

@FindBy(xpath = "iframe[@class='css-acpm4k']")
private WebElement frame11;

@FindBy(xpath = "//div[@class='css-15vhhhd e25lf6d4']")
private WebElement button3;

@FindBy(xpath = "//div[@class='css-rkaii4 e1gecm6x0']")
private WebElement button4;

@FindBy(xpath = "//input[@placeholder='Pincode']")
private WebElement pin;

@FindBy(xpath = "//input[@placeholder='Email ID (Optional)']")
private WebElement email1;

@FindBy(xpath = "//input[@placeholder='House/ Flat/ Office No.']")
private WebElement house;

@FindBy(xpath = "//textarea[@placeholder='Road Name/ Area /Colony']")
private WebElement road;
@FindBy(xpath = "//input[@placeholder='Name']")
private WebElement name;

@FindBy(xpath = "//input[@placeholder='Phone']")
private WebElement phone;

@FindBy(xpath = "//button[text()='Ship to this address']")
private WebElement button5;
@FindBy(xpath = "//input[@placeholder='Expiry (MM/YY)']")
private WebElement expiry;

@FindBy(xpath = "//input[@placeholder='CVV']")
private WebElement cvv;

@FindBy(xpath = "//input[@label='Card Number']")
private WebElement card;

@FindBy(xpath = "//button[@class='css-v61n2j e8tshxd0']")
private WebElement button6;
public WebElement getNatural() {
	return natural;
}

public WebElement getAdd() {
	return add;
}

public WebElement getAddtocart() {
	return addtocart;
}

public WebElement getFrame10() {
	return frame10;
}

public WebElement getLogin() {
	return login;
}

public WebElement getNumber() {
	return number;
}

public WebElement getEmail() {
	return email;
}

public WebElement getSubmit() {
	return submit;
}

public WebElement getPass() {
	return pass;
}

public WebElement getButton1() {
	return button1;
}

public WebElement getButton2() {
	return button2;
}

public WebElement getFrame11() {
	return frame11;
}

public WebElement getButton3() {
	return button3;
}

public WebElement getButton4() {
	return button4;
}

public WebElement getPin() {
	return pin;
}

public WebElement getEmail1() {
	return email1;
}

public WebElement getHouse() {
	return house;
}

public WebElement getRoad() {
	return road;
}

public WebElement getName() {
	return name;
}

public WebElement getPhone() {
	return phone;
}

public WebElement getButton5() {
	return button5;
}

public WebElement getExpiry() {
	return expiry;
}

public WebElement getCvv() {
	return cvv;
}

public WebElement getCard() {
	return card;
}

public WebElement getButton6() {
	return button6;
}
}

