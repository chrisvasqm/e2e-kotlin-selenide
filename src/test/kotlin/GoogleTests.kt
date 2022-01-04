import org.testng.annotations.Test
import page.Home
import page.Search

class GoogleTests : BaseTest() {

    @Test(groups = ["sanity"])
    fun `Search for puppies`() {
        Home().apply {
            visit()
            searchFor("Puppies")
        }

        assert(Search().hasResults())
    }

    @Test(groups = ["sanity", "regression"])
    fun `Search for kitties`() {
        Home().apply {
            visit()
            searchFor("Kitties")
        }

        assert(Search().hasResults())
    }

}