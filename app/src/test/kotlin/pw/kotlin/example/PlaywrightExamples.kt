package pw.kotlin.example

import com.microsoft.playwright.*;
import org.junit.jupiter.api.BeforeAll
import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

public class PlaywrightExamples{

    companion object {
        private lateinit var page: Page;
        private lateinit var browser: Browser;
        private lateinit var playwright: Playwright;

        @BeforeAll
        @JvmStatic
        fun setup(){
            playwright = Playwright.create()
            browser = playwright.chromium().launch(BrowserType.LaunchOptions().setHeadless(false))
            page = browser.newPage();
        }
    }


        @Test
        fun `leo aqui`(){
            page.navigate("http://google.com")
            val title = page.title()
            assertEquals("Google", title, "error");
        }
    
}