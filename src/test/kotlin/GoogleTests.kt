import org.testng.annotations.Test
import page.Home
import page.Search

class GoogleTests : BaseTest() {

    @Test
    fun `Search for puppies`() {
        Home().apply {
            visit()
            searchFor("Puppies")
        }

        assert(Search().hasResults())
    }

    @Test
    fun `Search for kitties`() {
        Home().apply {
            visit()
            searchFor("Kitties")
        }

        assert(Search().hasResults())
    }

}