package org.playwrite;

import com.microsoft.playwright.Browser;
import com.microsoft.playwright.BrowserType;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.Playwright;

public class Code_01 {
    public static void main(String[] args){

        Playwright playwright = Playwright.create();
//1.
//        Browser browser = playwright.chromium().launch();
//        Browser browser = playwright.firefox().launch();
// Headless mode - OFF
//        Browser browser = playwright.chromium().launch( new BrowserType.LaunchOptions().setHeadless(false));
        // Headless mode - ON
//        Browser browser = playwright.chromium().launch( new BrowserType.LaunchOptions().setHeadless(true));
// 2.
        BrowserType.LaunchOptions lp = new BrowserType.LaunchOptions();
//        lp.setChannel("chrome");
//        lp.setChannel("msedge");
        lp.setChannel("firefox");
        lp.setHeadless(false);
//        Browser browser =playwright.chromium().launch(lp);
        Browser browser =playwright.firefox().launch(lp);
        Page page = browser.newPage();

        page.navigate("https://www.flipkart.com/");

        String title = page.title();
        System.out.println("Page title: "+ title);

        String url = page.url();
        System.out.println("Page URL: "+ url);

        browser.close();
        playwright.close();
    }

}
