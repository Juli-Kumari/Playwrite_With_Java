package org.playwrite;

import com.microsoft.playwright.*;
import com.microsoft.playwright.options.SelectOption;

import java.util.ArrayList;
import java.util.List;

import static com.microsoft.playwright.assertions.PlaywrightAssertions.*;

public class Dropdown_05 {
    public static void main(String[] args) {
        // launch browser
        Page page = Playwright.create()
                .chromium().launch(
                        new BrowserType.LaunchOptions().setHeadless(false))
                .newPage();
/*
        page.navigate("https://www.lambdatest.com/selenium-playground/select-dropdown-demo");
        // 1. select by value
        Locator daySelectOption = page.locator("#select-demo");
        daySelectOption.selectOption("Thursday");

        assertThat(page.locator(".selected-value")).containsText("Thursday");
        // 2. select by label

        daySelectOption.selectOption(new SelectOption().setLabel("Monday"));
        assertThat(page.locator(".selected-value")).containsText("Monday");
        // 3. select by index
        daySelectOption.selectOption(new SelectOption().setIndex(3));
        assertThat(page.locator(".selected-value")).containsText("Tuesday");
        // 4. select by multiple -> Multi Select Option
Locator multipleSelect = page.locator("#multi-select");
multipleSelect.selectOption(new String[] {"New Jersey", "Texas"});

Locator options = page.locator("#multi-select option");
        System.out.println(options.count());

        // print all the country name one by one using LAMDA expression
        List<String> allInnerText = options.allInnerTexts();
        allInnerText.forEach(option -> System.out.println(option));
*/
                // 5. select by jquery
page.navigate("https://www.lambdatest.com/selenium-playground/jquery-dropdown-search-demo");

// return 3 locator, but from PW we can select 1st locator using below method.
        Locator countryLocator = page.locator(".select2-selection").first();
        countryLocator.click();

        // go to parent element then child element
        Locator result = page.locator(".select2-results ul li",
                new Page.LocatorOptions().setHasText("India"));
result.click();

// 6. jgroup
        Locator filesDropdown = page.locator("#files");
filesDropdown.selectOption("Ruby");

//     page.close();
    }
}
