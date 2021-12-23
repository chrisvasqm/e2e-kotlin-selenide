import org.testng.annotations.Test
import page.Home
import page.Search

class SearchGoogleTests : BaseTest() {

    @Test
    fun `Search for puppies`() {
        Home().apply {
            visit()
            searchFor("Puppies")
        }

        assert(Search().hasResults())
    }

}