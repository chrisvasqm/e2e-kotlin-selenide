import org.testng.annotations.Test
import page.Home
import page.Search

class SearchGoogleTests {

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