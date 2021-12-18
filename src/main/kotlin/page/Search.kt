package page

import com.codeborne.selenide.Condition
import com.codeborne.selenide.Selenide.`$`
import org.openqa.selenium.By

class Search : Page() {

    fun hasFoundResult(text: String): Boolean {
        return `$`(By.xpath("//*[@id=\"rso\"]/div[1]/div/div/div/div/div[1]/div/div[1]/div/div"))
                .shouldHave(Condition.exactText(text)).exists()
    }

}