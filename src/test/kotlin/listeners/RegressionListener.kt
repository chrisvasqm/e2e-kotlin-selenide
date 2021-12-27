package listeners

import org.testng.ITestListener
import org.testng.ITestResult

class RegressionListener : ITestListener {
    override fun onTestStart(result: ITestResult?) {
        println("Starting: ${result?.name}")
    }

    override fun onTestSuccess(result: ITestResult?) {
        println("Succeeded: ${result?.name}")
    }

    override fun onTestFailure(result: ITestResult?) {
        println("Failed: ${result?.name}")
    }

    override fun onTestSkipped(result: ITestResult?) {
        println("Skipped: ${result?.name}")
    }
}