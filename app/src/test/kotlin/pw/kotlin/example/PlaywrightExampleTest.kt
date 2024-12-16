// package pw.kotlin.example

// import com.microsoft.playwright.*
// import org.junit.jupiter.api.BeforeAll
// import org.junit.jupiter.api.Test
// import kotlin.test.assertEquals

// class PlaywrightExampleTest {

//     companion object {
//         private lateinit var playwright: Playwright
//         private lateinit var browser: Browser
//         private lateinit var page: Page

//         @BeforeAll
//         @JvmStatic
//         fun setup() {
//             playwright = Playwright.create()
//             browser = playwright.chromium().launch(BrowserType.LaunchOptions().setHeadless(false))
//             page = browser.newPage()
//         }
//     }

//     @Test
//     fun `doing something`() {
//         page.navigate("http://google.com")
//         val title = page.title()
//         println("Page Title: $title")
//         assertEquals("Googlse", title, "The page title is not as expected.")
//     }
// }
