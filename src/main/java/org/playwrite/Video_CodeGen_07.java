package org.playwrite;

import com.microsoft.playwright.*;
import com.microsoft.playwright.options.*;
import static com.microsoft.playwright.assertions.PlaywrightAssertions.assertThat;

public class Video_CodeGen_07 {
    public static void main(String[] args) {
        try (Playwright playwright = Playwright.create()) {
            Browser browser = playwright.chromium().launch(new BrowserType.LaunchOptions()
                    .setHeadless(false));
            BrowserContext context = browser.newContext();
            Page page = context.newPage();
            page.navigate("https://the-internet.herokuapp.com/");
            page.getByRole(AriaRole.LINK, new Page.GetByRoleOptions().setName("Challenging DOM")).click();
            page.getByRole(AriaRole.LINK, new Page.GetByRoleOptions().setName("qux")).click();
            page.getByRole(AriaRole.ROW, new Page.GetByRoleOptions().setName("Iuvaret5 Apeirian5 Adipisci5")).getByRole(AriaRole.LINK).nth(1).click();
            page.getByRole(AriaRole.ROW, new Page.GetByRoleOptions().setName("Iuvaret5 Apeirian5 Adipisci5")).getByRole(AriaRole.LINK).first().click();
            page.locator("#canvas").click(new Locator.ClickOptions()
                    .setPosition(216, 96));
//            assertThat(page.locator("#canvas")).isVisible();
page.close();
browser.close();
        }
    }
}
