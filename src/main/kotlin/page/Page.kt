package page

import com.codeborne.selenide.Configuration

abstract class Page {
    init {
        Configuration.browserSize = "1920x1080"
        Configuration.headless = true
    }
}
