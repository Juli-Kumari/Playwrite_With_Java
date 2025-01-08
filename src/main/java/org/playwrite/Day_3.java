package org.playwrite;

import com.microsoft.playwright.*;
import static com.microsoft.playwright.assertions.PlaywrightAssertions.assertThat;

public class Day_3 {
    public static void main(String[] args) {
        Playwright playwright = Playwright.create();
        Browser browser = playwright.firefox().launch( new BrowserType.LaunchOptions().setHeadless(false));
        Page page = browser.newPage();

        page.navigate("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
        // Assertion
        assertThat(page).hasTitle("OrangeHRM");
        // 1. Login
        // 1st way to work with locator
        Locator username = page.getByPlaceholder("Username");
        username.hover();
        username.type("Admin");
        // 2nd way to work with locator
        page.type("input[name='password']", "admin123");
        // 3rd way to work with locator
        page.locator("button[type='submit']").click();
        // Assertion
        assertThat(page).hasTitle("OrangeHRM");
        // Close all the event
        page.close();
        browser.close();
        playwright.close();

    }
}
