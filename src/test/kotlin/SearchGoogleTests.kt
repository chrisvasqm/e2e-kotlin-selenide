import org.testng.annotations.Test
import page.Home
import page.Search
import kotlin.test.assertTrue

class SearchGoogleTests {
    private lateinit var search: Search

    @Test
    fun `Can search for puppies`() {
        val query = "Puppies"
        Home().apply {
            visit()
            searchFor(query)
        }
        search = Search()
        assertTrue(search.hasFoundResult(query))
    }
}