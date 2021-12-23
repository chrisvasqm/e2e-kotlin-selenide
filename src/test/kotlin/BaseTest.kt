import com.codeborne.selenide.Configuration
import org.testng.annotations.BeforeSuite

open class BaseTest {

    @BeforeSuite
    fun setUp() {
        Configuration.browserSize = "1920x1080"
        Configuration.headless = true
    }

}