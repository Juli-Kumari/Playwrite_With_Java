package org.playwrite;

import com.microsoft.playwright.*;
import com.microsoft.playwright.assertions.PlaywrightAssertions;

import  static com.microsoft.playwright.assertions.PlaywrightAssertions.*;

public class InteractWithInputs_04 {
    public static void main(String[] args){
        Playwright playwright =  Playwright.create();
        Browser browser = playwright.chromium().launch(new BrowserType.LaunchOptions().setHeadless(false));
        Page page = browser.newPage();
/*
        page.navigate("https://www.lambdatest.com/selenium-playground/simple-form-demo");
        Locator singleInputField = page.locator("input#user-message");
        String name = "Juli";
        singleInputField.isEditable();
        singleInputField.type(name);
        // click on Get Checked Value button
        page.locator("#showInput").click();
        String messageText = page.locator("#message").textContent();
        System.out.println(messageText);
        assertThat(page.locator("#message")).hasText(name);

        // 2. type vs fill
        page.navigate("https://www.lambdatest.com/selenium-playground/generate-file-to-download-demo");
//        page.locator("#textbox").type("adasdfshfsd vhudhfirhfrv hrifhiwhfie");
        page.locator("#textbox").fill("adasdfshfsd vhudhfirhfrv hrifhiwhfie");

        // 3. get input value
        page.navigate("https://letcode.in/edit");
        String inputValue = page.locator("#clearMe").inputValue();
        System.out.println(inputValue);

        // 4. get placeholder value
        String placeholderValue = page.locator("#fullName").getAttribute("placeholder");
        System.out.println(placeholderValue);

        // assertion in PW
        Locator placeholder = page.locator("#fullName");
        assertThat(placeholder).hasAttribute("placeholder", "Enter first & last name");

        // 5. clear the value
        page.locator("#clearMe").clear();
        */

        // 6. checkbox
page.navigate("https://www.lambdatest.com/selenium-playground/checkbox-demo");
Locator isAgeCheckbox = page.locator("#isAgeSelected");
assertThat(isAgeCheckbox).not().isChecked();
isAgeCheckbox.check();
assertThat(isAgeCheckbox).isChecked();

       playwright.close();
    }

}
