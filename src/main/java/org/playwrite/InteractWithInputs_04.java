package org.playwrite;

import com.microsoft.playwright.*;
import com.microsoft.playwright.assertions.PlaywrightAssertions;

import  static com.microsoft.playwright.assertions.PlaywrightAssertions.*;

public class InteractWithInputs_04 {
    public static void main(String[] args){
        Playwright playwright =  Playwright.create();
        Browser browser = playwright.chromium().launch(new BrowserType.LaunchOptions().setHeadless(false));
        Page page = browser.newPage();

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
       playwright.close();
    }

}
