import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

WebUI.openBrowser('')

WebUI.navigateToUrl(GlobalVariable.app_url_login)

WebUI.maximizeWindow()

WebUI.callTestCase(findTestCase('01-Login and Forgot Password/04-Login(Valid Credentials-With Subscription)'), [:], FailureHandling.CONTINUE_ON_FAILURE)


//WebUI.verifyElementPresent(findTestObject('01-Login and Forgot Password/h4_EVERLEAGUES (v0.11.16 build 324)'), 0)
WebUI.delay(GlobalVariable.delay_3seconds)

WebUI.click(findTestObject('06-Teams/button_doublearrow'))

WebUI.click(findTestObject('06-Teams/button_My Organizations'))

WebUI.click(findTestObject('02-Side Icons(Organization)/Add Contact/button_Automation Test Org'))

WebUI.delay(GlobalVariable.delay_4seconds)

WebUI.verifyElementVisible(findTestObject('02-Side Icons(Organization)/Add Contact/span_Automation Test Org'))

WebUI.delay(GlobalVariable.delay_3seconds)

WebUI.scrollToElement(findTestObject('15-EL HealthCheck/Inactive information tracker/button_EL HealthCheck'), 0)

WebUI.click(findTestObject('15-EL HealthCheck/Inactive information tracker/button_EL HealthCheck'))

WebUI.verifyElementVisible(findTestObject('15-EL HealthCheck/Inactive information tracker/h4_INFO TRACKER'))

WebUI.verifyElementVisible(findTestObject('15-EL HealthCheck/Inactive information tracker/button_ACTIVATE'))

WebUI.verifyElementVisible(findTestObject('15-EL HealthCheck/Inactive information tracker/Activate message'))

WebUI.delay(GlobalVariable.delay_3seconds)

