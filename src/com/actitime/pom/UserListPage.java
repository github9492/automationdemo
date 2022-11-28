package com.actitime.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class UserListPage {
	
	@FindBy(xpath="//div[@id='container_users']")
	private WebElement userBtn;
	
	@FindBy(xpath="//div[text()='New User' and @class='components_button_label']")
	private WebElement newUser;
	
	
	@FindBy(xpath="//input[@id='createUserPanel_firstNameField']")
	private WebElement firstName;
	
	@FindBy(xpath="//input[@id='createUserPanel_middleNameField']")
	private WebElement middleName;
	
	@FindBy(xpath="//input[@id='createUserPanel_emailField']")
	private WebElement emailField;
	
	@FindBy(xpath="//div[text()='Save & Send Invitation']")
	private WebElement saveNext;
	
	public UserListPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	public WebElement getUserBtn() {
		return userBtn;
	}

	public WebElement getNewUser() {
		return newUser;
	}

	public WebElement getFirstName() {
		return firstName;
	}

	public WebElement getMiddleName() {
		return middleName;
	}

	public WebElement getEmailField() {
		return emailField;
	}
	public WebElement getSaveNext() {
		return saveNext;
	}

}
