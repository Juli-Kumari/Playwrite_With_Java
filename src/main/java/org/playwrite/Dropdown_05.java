package org.playwrite;

import com.microsoft.playwright.*;
import com.microsoft.playwright.options.SelectOption;

import static com.microsoft.playwright.assertions.PlaywrightAssertions.*;

public class Dropdown_05 {
    public static void main(String[] args) {
        // launch browser
        Page page = Playwright.create()
                .chromium().launch(
                        new BrowserType.LaunchOptions().setHeadless(false))
                .newPage();

        page.navigate("https://www.lambdatest.com/selenium-playground/select-dropdown-demo");
        // select by value
        Locator daySelectOption = page.locator("#select-demo");
        daySelectOption.selectOption("Thursday");

        assertThat(page.locator(".selected-value")).containsText("Thursday");
        // select by label

        daySelectOption.selectOption(new SelectOption().setLabel("Monday"));
        assertThat(page.locator(".selected-value")).containsText("Monday");
        // select by index
        daySelectOption.selectOption(new SelectOption().setIndex(3));
        assertThat(page.locator(".selected-value")).containsText("Tuesday");
        // select by multiple -> Multi Select Option

                // select by jquery

     page.close();
    }
}
