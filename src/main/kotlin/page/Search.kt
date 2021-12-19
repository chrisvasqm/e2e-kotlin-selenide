package page

import com.codeborne.selenide.Selenide.`$$`
import org.openqa.selenium.By

class Search : Page() {

    fun hasResults(): Boolean {
        val results = "#search > div > div > div"
        return `$$`(By.cssSelector(results)).isNotEmpty()
    }

}