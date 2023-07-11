package com.tutorialsninja.myaccount;

import com.tutorialsninja.pages.MyAccountPage;
import com.tutorialsninja.testbase.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;

public class MyAccountTest extends BaseTest {

    MyAccountPage myAccountPage = new MyAccountPage();

    @Test
    public void verifyUserShouldNavigateToRegisterPageSuccessfully() {
        //1.1 Click on My Account Link.
        myAccountPage.clickOnMyAccount();

        //1.2 Call the method “selectMyAccountOptions” method and pass the parameter “Register”
        myAccountPage.selectMyAccountOptions("Register");

        //1.3 Verify the text “Register Account”.
        String actualRegisterAccountText = myAccountPage.verifyTheRegisterAccountText();
        Assert.assertEquals(actualRegisterAccountText, "Register Account", "Text is not match");
    }

    @Test
    public void verifyUserShouldNavigateToLoginPageSuccessfully() {
        //2.1 Click on My Account Link.
        myAccountPage.clickOnMyAccount();

        //2.2 Call the method “selectMyAccountOptions” method and pass the parameter “Login”
        myAccountPage.selectMyAccountOptions("Login");

        //2.3 Verify the text “Returning Customer”.
        String actualLoginText = myAccountPage.verifyTheLoginText();
        Assert.assertEquals(actualLoginText, "Returning Customer", "Text is not match");
    }

    @Test
    public void verifyThatUserRegisterAccountSuccessfully() throws InterruptedException {
        //3.1 Click on My Account Link.
        myAccountPage.clickOnMyAccount();

        //3.2 Call the method “selectMyAccountOptions” method and pass the parameter “Register”
        myAccountPage.selectMyAccountOptions("Register");

        //3.3 Enter First Name
        myAccountPage.enterFirstName("Prime");

        //3.4 Enter Last Name
        myAccountPage.enterLastName("Testing");

        //3.5 Enter Email
        myAccountPage.enterEmail("prime1231@gmail.com");

        //3.6 Enter Telephone
        myAccountPage.enterTelephone("01234567890");

        //3.7 Enter Password
        myAccountPage.enterPassword("prime123");

        //3.8 Enter Password Confirm
        myAccountPage.enterPasswordConfirm("prime123");

        //3.9 Select Subscribe Yes radio button
        myAccountPage.clickOnSubscribeRadioButtonField();

        //3.10 Click on Privacy Policy check box
        myAccountPage.clickOnPrivacyPolicyBox();

        //3.11 Click on Continue button
        myAccountPage.clickOnContinueButton();

        //3.12 Verify the message “Your Account Has Been Created!”
        Thread.sleep(2000);
        String actualAccountCreateText = myAccountPage.verifyTheAccountCreateText();
        Assert.assertEquals(actualAccountCreateText, "Your Account Has Been Created!", "Message is not match");

        //3.13 Click on Continue button
        myAccountPage.clickOnContinueButton1();

        //3.14 Click on My Account Link.
        myAccountPage.clickOnMyAccount();

        //3.15 Call the method “selectMyAccountOptions” method and pass the parameter“Logout”
        myAccountPage.selectMyAccountOptions("Logout");

        //3.16 Verify the text “Account Logout”
        String actualLogoutText = myAccountPage.verifyTheLogOutText();
        Assert.assertEquals(actualLogoutText, "Account Logout", "Text not match");

        //3.17 Click on Continue button
        myAccountPage.clickOnContinueButton2();
    }

    @Test
    public void verifyThatUserShouldLoginAndLogoutSuccessfully() {
        //4.1 Click on My Account Link.
        myAccountPage.clickOnMyAccount();

        //4.2 Call the method “selectMyAccountOptions” method and pass the parameter “Login”
        myAccountPage.selectMyAccountOptions("Login");

        //4.3 Enter Email address
        myAccountPage.enterEmail1("prime1231@gmail.com");

        //4.4 Enter Last Name

        //4.5 Enter Password
        myAccountPage.enterPassword1("prime123");

        //4.6 Click on Login button
        myAccountPage.clickOnLoginButton();

        //4.7 Verify text “My Account”
        String actualMyAccountText = myAccountPage.verifyMyAccountText();
        Assert.assertEquals(actualMyAccountText, "My Account", "Text not match");

        //4.8 Click on My Account Link.
        myAccountPage.clickOnLink();

        //4.9 Call the method “selectMyAccountOptions” method and pass the parameter“Logout”
        myAccountPage.selectMyAccountOptions("Logout");

        //4.10 Verify the text “Account Logout”
        String actualLogoutText = myAccountPage.verifyTheLogOutText();
        Assert.assertEquals(actualLogoutText, "Account Logout", "Text not match");

        //4.11 Click on Continue button
        myAccountPage.clickOnContinue3();
    }

}
