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

WebUI.click(findTestObject('03-Header Menu/User Profile/View Profile/div_Contact Info1'))

WebUI.delay(GlobalVariable.delay_1s)

WebUI.verifyElementVisible(findTestObject('03-Header Menu/User Profile/View Profile/Contact Info/div_Position'))

WebUI.verifyElementVisible(findTestObject('03-Header Menu/User Profile/View Profile/Contact Info/div_Email'))

WebUI.verifyElementVisible(findTestObject('03-Header Menu/User Profile/View Profile/Contact Info/div_Phone'))

WebUI.verifyElementVisible(findTestObject('03-Header Menu/User Profile/View Profile/Contact Info/div_Address'))

WebUI.delay(GlobalVariable.delay_1s)

WebUI.setText(findTestObject('03-Header Menu/User Profile/View Profile/Contact Info/Positon Field'), position)

WebUI.click(findTestObject('03-Header Menu/User Profile/View Profile/Contact Info/div_Email Type'))

WebUI.verifyElementVisible(findTestObject('03-Header Menu/User Profile/View Profile/Contact Info/mat-option_Work'))

WebUI.verifyElementVisible(findTestObject('03-Header Menu/User Profile/View Profile/Contact Info/span_Personal'))

WebUI.verifyElementVisible(findTestObject('03-Header Menu/User Profile/View Profile/Contact Info/span_Other'))

WebUI.delay(GlobalVariable.delay_1s)

WebUI.click(findTestObject('03-Header Menu/User Profile/View Profile/Contact Info/div_Email'))

WebUI.click(findTestObject('03-Header Menu/User Profile/View Profile/Contact Info/mat-icon_add email button'))

WebUI.setText(findTestObject('03-Header Menu/User Profile/View Profile/Contact Info/email field'), autoEmail)

WebUI.sendKeys(findTestObject('03-Header Menu/User Profile/View Profile/Contact Info/email field'), Keys.chord(Keys.ENTER))

WebUI.delay(GlobalVariable.delay_2s)

WebUI.click(findTestObject('03-Header Menu/User Profile/View Profile/Contact Info/button_Save'))

WebUI.verifyElementVisible(findTestObject('03-Header Menu/User Profile/View Profile/Contact Info/Success Msg'))

WebUI.delay(GlobalVariable.delay_2s)

WebUI.mouseOver(findTestObject('03-Header Menu/User Profile/View Profile/Contact Info/email field'))

WebUI.click(findTestObject('03-Header Menu/User Profile/View Profile/Contact Info/remove email'))

WebUI.sendKeys(findTestObject('03-Header Menu/User Profile/View Profile/Contact Info/Positon Field'), Keys.chord(Keys.ENTER))

WebUI.delay(GlobalVariable.delay_2s)

WebUI.click(findTestObject('03-Header Menu/User Profile/View Profile/Contact Info/button_Save'))

WebUI.verifyElementVisible(findTestObject('03-Header Menu/User Profile/View Profile/Contact Info/Success Msg'))

WebUI.delay(GlobalVariable.delay_2s)

WebUI.scrollToElement(findTestObject('03-Header Menu/User Profile/View Profile/div_Contact Info1'), 5)

WebUI.delay(GlobalVariable.delay_2s)

