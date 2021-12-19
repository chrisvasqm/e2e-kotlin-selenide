package page

import com.codeborne.selenide.Selenide.`$`
import com.codeborne.selenide.Selenide.open
import org.openqa.selenium.By

class Home : Page() {

    fun visit() {
        open("https://www.google.com")
    }

    fun searchFor(query: String) {
        val searchBox = By.name("q")
        `$`(searchBox)
            .setValue(query)
            .pressEnter()
    }

}
