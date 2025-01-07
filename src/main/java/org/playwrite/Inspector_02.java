package org.playwrite;
import com.microsoft.playwright.*;
import com.microsoft.playwright.options.*;

public class Inspector_02 {
    public static void main(String[] args) {
        try (Playwright playwright = Playwright.create()) {
            Browser browser = playwright.chromium().launch(new BrowserType.LaunchOptions()
                    .setHeadless(false));
            BrowserContext context = browser.newContext();
            Page page = context.newPage();
            page.navigate("https://www.flipkart.com/");
            page.getByPlaceholder("Search for Products, Brands").click();
            page.getByPlaceholder("Search for Products, Brands").fill("phone");
            page.getByRole(AriaRole.LINK, new Page.GetByRoleOptions().setName("phone under 7000 in Mobiles")).click();
            Page page1 = page.waitForPopup(() -> {
                page.getByRole(AriaRole.LINK, new Page.GetByRoleOptions().setName("SAMSUNG Galaxy S23 5G (Cream")).click();
            });
            page1.getByText("₹4,223/month", new Page.GetByTextOptions().setExact(true)).click();
            page1.getByRole(AriaRole.LINK, new Page.GetByRoleOptions().setName("Cart")).click();
            page1.close();
        }
    }
}
