# PlaywrightWithJava

Playwrite: By microsoft 

Puppetter: Chromium -- by GOOGLE

Pre Install:- Java (java --version), Maven (mvn --version)

URL  = https://playwright.dev/java/
1. Playwright supports all modern rendering engines including Chromium, WebKit(by safari), and Firefox.
2. Test on Windows, Linux, and macOS, locally or on CI, headless or headed with native mobile emulation.
3. We can execute our test case before the stable version release i.e. beta version of any browser.
4. API testing
5. language uses: Java,javascript, typescript, python etc.
6. CLI command directly generate & record the code in any language we want. 
7. Always needs binaries to run the scripts. Path of binaries : Users\Username\AppData\Local\ms-playwrite\chrominum-100.40
8. If system having no binaries present then it will auto download the respective binary .

| Feature                         | Cypress                                                                                                                                                              | Playwrite                                                                                                                                                                                                                  |
|---------------------------------|----------------------------------------------------------------------------------------------------------------------------------------------------------------------|----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------|
| iFrame                          | Limited                                                                                                                                                              | Very well supported                                                                                                                                                                                                        |
| Cross-Origin/ Third party login | NA                                                                                                                                                                   | Very well supported                                                                                                                                                                                                        |
| Multiple window / tab suport    | NA                                                                                                                                                                   | Very well supported                                                                                                                                                                                                        |
| Multi Language support          | java script, type script                                                                                                                                             | java script, type script, java, python, .NET                                                                                                                                                                               |
| Browser support                 | Chrome, firefox(dev, nightly), chromium based browser, edge, beta & canery releases                                                                                  | chrome, chromium, firefox, webkit(safari)                                                                                                                                                                                  |
| Webkit (Safari)                 | NA                                                                                                                                                                   | very well support                                                                                                                                                                                                          |
| Fast                            | Slow (Runs inside the browser, uses CDP APIs)                                                                                                                        | much faster (uses BROWSER CONTEXT)                                                                                                                                                                                         |
| Page object pattern             | Not recommended by cypress                                                                                                                                           | very well support                                                                                                                                                                                                          |
| Parallel browser testing        | needs license                                                                                                                                                        | very well support using workers on single machine and on CI (Remote) - No License                                                                                                                                          |
| Parallel support for Tests      | needs individual test files, split test into different files                                                                                                         | supports parallel tests within a single test files                                                                                                                                                                         |
| Async/Await issue               | overhead, complex method chaining, difficult to understand code, no awaits                                                                                           | playwrite fully supports asyn/await syntax for clean, redable code.                                                                                                                                                        |
| Edge case scenarios             | needs third party plugin                                                                                                                                             | in built features                                                                                                                                                                                                          |
| Test grouping & test suites     | NA                                                                                                                                                                   | supported                                                                                                                                                                                                                  |
| Xpath                           | rely ib Xpath plugin                                                                                                                                                 | in built support                                                                                                                                                                                                           |
| Dependency                      | depends on more & more third party plugins,<br/>overhead<br/>not sure long term support<br/>version upgrade<br/>maintanaces<br/>for almost everything there is a plugin | most of the fetaures supported in built. <br/> Less dependencies                                                                                                                                                           |
| Debugging                       | removed VSC debugging, need to debug in developer tool or own debugger                                                                                               | playwrite inspector<br/>playwrite tace viewer<br/>run in headed mode<br/>browser developer tools<br/>run in debug mode<br/>selectors in developer tool console<br/>visual studio code debugger (Node.js)<br/>verbose API Logs |
| automatic waits                 | doesn't support in many scenarios                                                                                                                                    | claims in built auto wait and event-based mechannism                                                                                                                                                                       |
| upload & download files         | needs third part plugin                                                                                                                                              | in build features                                                                                                                                                                                                          |
| user authentication             | NA                                                                                                                                                                   | supports reuse of authentication features                                                                                                                                                                                  |
| take detection                  | Dashboard (Pricing)                                                                                                                                                  | configure test retry stragey, capture execution trace, videos, screenshot, element flakes.                                                                                                                                 |
| pricing                         |         Dashboard (Pricing)/ License                        |    free                            |
| comminity                       |     mature & has good community support     | new & smaller community |

## why playwrite?
1. CodeGen : https://playwright.dev/java/docs/codegen-intro
   => It will open two windows, a browser window where you interact with the website you wish to test and the Playwright Inspector window where you can record your tests, copy the tests, clear your tests as well as change the language of your tests.
2. multi language support
3. testing safari on windows
4. emulate devices
5. test retries
6. aggressive releases
7. fixing issues
8. allure report
9. generates PDF

## Common features between both (cypress & playwrite)
1. good documentation
2. API testing
3. point & click test recording
4. test retries
5. automatic waiting 
6. video & screen capture
7. mobile emulation
8. regularly updated and well maintained
9. run only a subset of tests
10. network monitoring

## generate code from inspector
From terminal we can run 
mvn exec:java -e -D exec.mainClass=com.microsoft.playwright.CLI -D exec.args="codegen https://www.flipkart.com/"

=> By default the inspector window gives class name as 'Example'

## Terms in playwrites
1. newPage() => playwrite assumed every new tab as a new page.
2. In playwrite we have multiple configuration(multiple browser) --> multiple context --> multiple pages.
3. By default tests will run in headless mode.
4. Set headed mode ON ----> Browser browser = playwright.chromium().launch( new BrowserType.LaunchOptions().setHeadless(false));
5. .locator() --> used to locate the elements on a web page. we can pass parameter as 'CSS' or 'XPATH' both.
6. page.getByPlaceholder("Username");  --> get locator directly from the placeholder value.
6. for assertion ---> import static com.microsoft.playwright.assertions.PlaywrightAssertions.assertThat;
7. Close all the event
    page.close();
    browser.close();
    playwright.close();
8. 

