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

WebUI.scrollToElement(findTestObject('03-Header Menu/User Profile/View Profile/Settings/Email Frequency selector'), 0)

WebUI.click(findTestObject('03-Header Menu/User Profile/View Profile/Settings/Email Frequency selector'))

WebUI.click(findTestObject('03-Header Menu/User Profile/View Profile/Settings/span_None'))

WebUI.click(findTestObject('03-Header Menu/User Profile/View Profile/Settings/button_Save'))

WebUI.verifyElementVisible(findTestObject('03-Header Menu/User Profile/View Profile/Settings/Successfully msg'))

WebUI.delay(GlobalVariable.delay_2seconds)

WebUI.click(findTestObject('03-Header Menu/User Profile/View Profile/Settings/Email Frequency selector'))

WebUI.click(findTestObject('03-Header Menu/User Profile/View Profile/Settings/span_Every 2 hours'))

WebUI.click(findTestObject('03-Header Menu/User Profile/View Profile/Settings/button_Save'))

WebUI.verifyElementVisible(findTestObject('03-Header Menu/User Profile/View Profile/Settings/Successfully msg'))

WebUI.delay(GlobalVariable.delay_2seconds)

WebUI.click(findTestObject('03-Header Menu/User Profile/View Profile/Settings/Email Frequency selector'))

WebUI.click(findTestObject('03-Header Menu/User Profile/View Profile/Settings/span_Every 6 hours'))

WebUI.click(findTestObject('03-Header Menu/User Profile/View Profile/Settings/button_Save'))

WebUI.verifyElementVisible(findTestObject('03-Header Menu/User Profile/View Profile/Settings/Successfully msg'))

WebUI.delay(GlobalVariable.delay_2seconds)

WebUI.click(findTestObject('03-Header Menu/User Profile/View Profile/Settings/Email Frequency selector'))

WebUI.click(findTestObject('03-Header Menu/User Profile/View Profile/Settings/span_Every 12 hours'))

WebUI.click(findTestObject('03-Header Menu/User Profile/View Profile/Settings/button_Save'))

WebUI.verifyElementVisible(findTestObject('03-Header Menu/User Profile/View Profile/Settings/Successfully msg'))

WebUI.delay(GlobalVariable.delay_2seconds)

WebUI.click(findTestObject('03-Header Menu/User Profile/View Profile/Settings/Email Frequency selector'))

WebUI.click(findTestObject('03-Header Menu/User Profile/View Profile/Settings/span_Once a day (9pm local time)'))

WebUI.click(findTestObject('03-Header Menu/User Profile/View Profile/Settings/button_Save'))

WebUI.verifyElementVisible(findTestObject('03-Header Menu/User Profile/View Profile/Settings/Successfully msg'))

WebUI.delay(GlobalVariable.delay_2seconds)

WebUI.click(findTestObject('03-Header Menu/User Profile/View Profile/Settings/Email Frequency selector'))

WebUI.click(findTestObject('03-Header Menu/User Profile/View Profile/Settings/span_Every 4 hours'))

WebUI.click(findTestObject('03-Header Menu/User Profile/View Profile/Settings/button_Save'))

WebUI.verifyElementVisible(findTestObject('03-Header Menu/User Profile/View Profile/Settings/Successfully msg'))

WebUI.delay(GlobalVariable.delay_2seconds)

WebUI.scrollToElement(findTestObject('03-Header Menu/User Profile/View Profile/Settings/Dashboard Card'), 0)

WebUI.scrollToElement(findTestObject('03-Header Menu/User Profile/View Profile/div_Contact Info'), 0)

WebUI.delay(GlobalVariable.delay_2seconds)

