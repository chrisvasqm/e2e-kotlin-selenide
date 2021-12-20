import com.codeborne.selenide.Configuration
import org.testng.annotations.BeforeClass
import org.testng.annotations.Test
import page.Home
import page.Search

class SearchGoogleTests {

    @BeforeClass
    fun setup() {
        Configuration.browserSize = "1920x1080"
        Configuration.headless = true
    }

    @Test
    fun `Search for puppies`() {
        val query = "Puppies"

        Home().apply {
            visit()
            searchFor(query)
        }

        assert(Search().hasResults())
    }

}