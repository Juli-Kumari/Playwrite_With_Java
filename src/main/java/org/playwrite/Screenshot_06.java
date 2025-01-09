package org.playwrite;

import com.microsoft.playwright.BrowserType;
import com.microsoft.playwright.Locator;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.Playwright;
import com.microsoft.playwright.options.ScreenshotCaret;

import java.lang.reflect.Array;
import java.nio.file.Paths;
import java.util.Arrays;

public class Screenshot_06 {
    public static void main(String[] args) {
        // launch browser
        Page page = Playwright.create()
                .chromium().launch(
                        new BrowserType.LaunchOptions().setHeadless(false))
                .newPage();
/*
        page.navigate("https://www.lambdatest.com/selenium-playground/jquery-dropdown-search-demo");

        // 1. screenshot
       Page.ScreenshotOptions screenshotOptions = new Page.ScreenshotOptions();
       page.screenshot(screenshotOptions.setPath(Paths.get("./snap/site.png")));
        // 2. full page screenshot
        page.screenshot(screenshotOptions.setFullPage(true).setPath(Paths.get("./snap/fullSc.jpg")));
        // 3. locator screenshot
        Locator bookAdemoButton = page.locator("//button[contains(text(), 'Book a Demo')]");
        bookAdemoButton.screenshot(new Locator.ScreenshotOptions().setPath(Paths.get("./snap/locatorSc.png")));

        // take screenshot of a region
        Locator header = page.locator("#header");
        header.screenshot(new Locator.ScreenshotOptions().setPath(Paths.get("./snap/headerSc.png")));
*/
        // 4. masking locator -> hiding the credentials.
        page.navigate("https://the-internet.herokuapp.com/");
      page.locator("a[href='/inputs']").click();
      Locator inputFiled = page.locator("input[type='number']");
      /*
      inputFiled.type("7875465979");
      inputFiled.scrollIntoViewIfNeeded();

      Page.ScreenshotOptions screenshotOptions = new Page.ScreenshotOptions();
      page.screenshot( screenshotOptions.setPath(Paths.get("./snap/masking.png"))
              .setMask(Arrays.asList(inputFiled)));
*/
        inputFiled.click();
        // 5. Caret Hide --> cursor on  the filed is not visible in SC.
        page.screenshot(new Page.ScreenshotOptions()
                .setCaret(ScreenshotCaret.HIDE)
                .setPath(Paths.get("./snap/caretHIDE.png")));
        // Caret Show --> cursor on  the filed is visible in SC.
        page.screenshot(new Page.ScreenshotOptions()
                .setCaret(ScreenshotCaret.INITIAL)
                .setPath(Paths.get("./snap/caretSHOW.png")));


page.close();
    }

}
