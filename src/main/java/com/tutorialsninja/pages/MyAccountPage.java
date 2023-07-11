package com.tutorialsninja.pages;

import com.tutorialsninja.utilities.Utility;
import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebElement;

import java.util.List;

public class MyAccountPage extends Utility {

    By accountOption = By.xpath("//div[@id='top-links']//li[contains(@class,'open')]/ul/li");//1.2
    By muAccountLink = By.xpath("//span[contains(text(),'My Account')]");//1.1
    By registerAccountText = By.xpath("//h1[normalize-space()='Register Account']");//1.3
    By loginLink = By.xpath("//h2[contains(text(),'Returning Customer')]");//2.3
    By firstNameField = By.xpath("//input[@id='input-firstname']");//3.3
    By lastNameField = By.xpath("//input[@id='input-lastname']");//3.4
    By emailField = By.xpath("//input[@id='input-email']");//3.5
    By telephoneField = By.xpath("//input[@id='input-telephone']");//3.6
    By passwordField = By.xpath("//input[@id='input-password']");//3.7
    By passwordConfirmField = By.xpath("//input[@id='input-confirm']");//3.8
    By subscribeRadioButtonField = By.xpath("//label[normalize-space()='Yes']");//3.9
    By privacyPolicyBox = By.xpath("//input[@name='agree']");//3.10
    By continueButton = By.xpath("//input[@value='Continue']");//3.11
    By accountCreateText = By.xpath("//h1[contains(text(),'Your Account Has Been Created!')]");//3.12
    By continueButton1 = By.xpath("//a[contains(text(),'Continue')]");//3.13
    By logOutText = By.xpath("//h1[contains(text(),'Account Logout')]");//3.16
    By continueButton2 = By.xpath("//a[contains(text(),'Continue')]");//3.17
    By emailField1 = By.id("input-email");//4.3
    By passwordField1 = By.id("input-password");//4.5
    By loginLink1 = By.xpath("//form[contains(@action,'login')]//input[@type='submit']");//4.6
    By myAccountText = By.xpath("//h2[normalize-space()='My Account']");//4.7
    By myAccountLink = By.linkText("//a[@class='list-group-item'][normalize-space()='Login']");//4.8
    By continueButton3 = By.xpath("//a[@class= 'btn btn-primary']");


    /*
    1.1 create method with name "selectMyAccountOptions" it has one parameter name"option" of type string
    1.2 This method should click on the options whatever name is passed as parameter.
             (Hint: Handle List of Element and Select options)

     */
    public void selectMyAccountOptions(String option) {
        List<WebElement> myAccountList = getListOfElements(accountOption);
        try {
            for (WebElement options : myAccountList) {
                if (options.getText().equalsIgnoreCase(option)) {
                    options.click();
                }
            }
        } catch (StaleElementReferenceException e) {
            myAccountList = getListOfElements(accountOption);
        }
    }//1.2

    public void clickOnMyAccount() {
        clickOnElement(muAccountLink);
    }//1.1

    public String verifyTheRegisterAccountText() {
        return getTextFromElement(registerAccountText);
    }//1.3

    public String verifyTheLoginText() {
        return getTextFromElement(loginLink);
    }//2.3

    public void enterFirstName(String firstName) {
        sendTextToElement(firstNameField, firstName);
    }//3.3

    public void enterLastName(String lastName) {
        sendTextToElement(lastNameField, lastName);
    }//3.4

    public void enterEmail(String email) {
        sendTextToElement(emailField, email);
    }//3.5

    public void enterTelephone(String telephone) {
        sendTextToElement(telephoneField, telephone);
    }//3.6

    public void enterPassword(String password) {
        sendTextToElement(passwordField, password);
    }//3.7

    public void enterPasswordConfirm(String passwordConfirm) {
        sendTextToElement(passwordConfirmField, passwordConfirm);
    }//3.8

    public void clickOnSubscribeRadioButtonField() {
        clickOnElement(subscribeRadioButtonField);
    }//3.9

    public void clickOnPrivacyPolicyBox() {
        clickOnElement(privacyPolicyBox);
    }//3.10

    public void clickOnContinueButton() {
        clickOnElement(continueButton);
    }//3.11

    public String verifyTheAccountCreateText() {
        return getTextFromElement(accountCreateText);
    }//3.12

    public void clickOnContinueButton1() {
        clickOnElement(continueButton1);
    }//3.13

    public String verifyTheLogOutText() {
        return getTextFromElement(logOutText);
    }//3.16


    public void clickOnContinueButton2() {
        clickOnElement(continueButton2);
    }//3.17

    public void enterEmail1(String email1) {
        sendTextToElement(emailField1, email1);
    }//4.3

    public void enterPassword1(String password1) {
        sendTextToElement(passwordField1, password1);
    }//4.4

    public void clickOnLoginButton() {
        clickOnElement(loginLink1);
    }//4.6

    public String verifyMyAccountText() {
        return getTextFromElement(myAccountText);
    }//4.7

    public void clickOnLink() {
        clickOnElement(myAccountLink);
    }

    public void clickOnContinue3() {
        clickOnElement(continueButton3);
    }

}
