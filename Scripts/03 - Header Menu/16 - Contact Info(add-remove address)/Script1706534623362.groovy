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

WebUI.click(findTestObject('03-Header Menu/User Profile/View Profile/Contact Info/mat-icon_add address'))

WebUI.verifyElementVisible(findTestObject('03-Header Menu/User Profile/View Profile/Contact Info/h4_Edit Address'))

WebUI.delay(GlobalVariable.delay_2s)

WebUI.click(findTestObject('03-Header Menu/User Profile/View Profile/Contact Info/input_street1'))

WebUI.click(findTestObject('03-Header Menu/User Profile/View Profile/Contact Info/input_street2'))

WebUI.click(findTestObject('03-Header Menu/User Profile/View Profile/Contact Info/input_postcode'))

WebUI.click(findTestObject('03-Header Menu/User Profile/View Profile/Contact Info/input_city'))

WebUI.click(findTestObject('03-Header Menu/User Profile/View Profile/Contact Info/input_state'))

WebUI.click(findTestObject('03-Header Menu/User Profile/View Profile/Contact Info/input_country'))

WebUI.doubleClick(findTestObject('03-Header Menu/User Profile/View Profile/Contact Info/input_state'))

WebUI.scrollToElement(findTestObject('03-Header Menu/User Profile/View Profile/Contact Info/input_address type'), 0)

WebUI.click(findTestObject('03-Header Menu/User Profile/View Profile/Contact Info/input_address type'))

WebUI.verifyElementVisible(findTestObject('03-Header Menu/User Profile/View Profile/Contact Info/span_Work'))

WebUI.verifyElementVisible(findTestObject('03-Header Menu/User Profile/View Profile/Contact Info/span_Personal'))

WebUI.verifyElementVisible(findTestObject('03-Header Menu/User Profile/View Profile/Contact Info/span_Other'))

WebUI.scrollToElement(findTestObject('03-Header Menu/User Profile/View Profile/Contact Info/input_street1'), 0)

WebUI.doubleClick(findTestObject('03-Header Menu/User Profile/View Profile/Contact Info/input_street1'))

WebUI.verifyElementVisible(findTestObject('03-Header Menu/User Profile/View Profile/Contact Info/invalid street 1'))

WebUI.verifyElementVisible(findTestObject('03-Header Menu/User Profile/View Profile/Contact Info/invalid ZIP'))

WebUI.verifyElementVisible(findTestObject('03-Header Menu/User Profile/View Profile/Contact Info/invalid City'))

WebUI.verifyElementVisible(findTestObject('03-Header Menu/User Profile/View Profile/Contact Info/invalid state'))

WebUI.delay(GlobalVariable.delay_2s)

WebUI.click(findTestObject('03-Header Menu/User Profile/View Profile/Contact Info/input_street1'))

WebUI.verifyElementNotClickable(findTestObject('03-Header Menu/User Profile/View Profile/Contact Info/button_Save_address'))

WebUI.scrollToElement(findTestObject('03-Header Menu/User Profile/View Profile/Contact Info/button_Cancel'), 0)

WebUI.click(findTestObject('03-Header Menu/User Profile/View Profile/Contact Info/button_Cancel'))

WebUI.delay(GlobalVariable.delay_2s)

WebUI.click(findTestObject('03-Header Menu/User Profile/View Profile/Contact Info/mat-icon_add address'))

WebUI.verifyElementVisible(findTestObject('03-Header Menu/User Profile/View Profile/Contact Info/h4_Edit Address'))

WebUI.setText(findTestObject('03-Header Menu/User Profile/View Profile/Contact Info/input_street1'), street1)

WebUI.setText(findTestObject('03-Header Menu/User Profile/View Profile/Contact Info/input_street2'), street2)

WebUI.setText(findTestObject('03-Header Menu/User Profile/View Profile/Contact Info/input_postcode'), postcode)

WebUI.setText(findTestObject('03-Header Menu/User Profile/View Profile/Contact Info/input_city'), city)

WebUI.setText(findTestObject('03-Header Menu/User Profile/View Profile/Contact Info/input_state'), state)

WebUI.click(findTestObject('03-Header Menu/User Profile/View Profile/Contact Info/input_country'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('03-Header Menu/User Profile/View Profile/Contact Info/span_United States'), FailureHandling.STOP_ON_FAILURE)

WebUI.scrollToElement(findTestObject('03-Header Menu/User Profile/View Profile/Contact Info/input_address type'), 0)

WebUI.click(findTestObject('03-Header Menu/User Profile/View Profile/Contact Info/input_address type'))

WebUI.click(findTestObject('03-Header Menu/User Profile/View Profile/Contact Info/span_Work'))

WebUI.delay(GlobalVariable.delay_2s)

WebUI.click(findTestObject('03-Header Menu/User Profile/View Profile/Contact Info/button_Save_address'))

WebUI.delay(GlobalVariable.delay_2s)

WebUI.verifyElementVisible(findTestObject('03-Header Menu/User Profile/View Profile/Contact Info/mat-list_Address Added'))

WebUI.delay(GlobalVariable.delay_2s)

WebUI.click(findTestObject('03-Header Menu/User Profile/View Profile/Contact Info/button_Save'))

WebUI.verifyElementVisible(findTestObject('03-Header Menu/User Profile/View Profile/Contact Info/Success Msg'))

WebUI.delay(GlobalVariable.delay_2s)

WebUI.mouseOver(findTestObject('03-Header Menu/User Profile/View Profile/Contact Info/Mouse over target'))

WebUI.click(findTestObject('03-Header Menu/User Profile/View Profile/Contact Info/button_remove_address'))

WebUI.click(findTestObject('03-Header Menu/User Profile/View Profile/Contact Info/button_Save'))

WebUI.verifyElementVisible(findTestObject('03-Header Menu/User Profile/View Profile/Contact Info/Success Msg'))

WebUI.delay(GlobalVariable.delay_3s)

WebUI.click(findTestObject('03-Header Menu/User Profile/View Profile/div_Security'))

WebUI.click(findTestObject('03-Header Menu/User Profile/View Profile/Security Tab (2FA)/2FA_toggle'))

WebUI.closeBrowser()

