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

WebUI.click(findTestObject('03-Header Menu/User Profile/View Profile/div_Contact Info'))

WebUI.delay(1)

WebUI.verifyElementVisible(findTestObject('03-Header Menu/User Profile/View Profile/Contact Info/div_Email'))

WebUI.verifyElementVisible(findTestObject('03-Header Menu/User Profile/View Profile/Contact Info/div_Phone'))

WebUI.verifyElementVisible(findTestObject('03-Header Menu/User Profile/View Profile/Contact Info/div_Address'))

WebUI.delay(1)

WebUI.setText(findTestObject('03-Header Menu/User Profile/View Profile/Contact Info/Positon Field'), 'Auto')

WebUI.click(findTestObject('03-Header Menu/User Profile/View Profile/Contact Info/div_Email Type'))

WebUI.verifyElementVisible(findTestObject('03-Header Menu/User Profile/View Profile/Contact Info/span_Work'))

WebUI.verifyElementVisible(findTestObject('03-Header Menu/User Profile/View Profile/Contact Info/span_Personal'))

WebUI.verifyElementVisible(findTestObject('03-Header Menu/User Profile/View Profile/Contact Info/span_Other'))

WebUI.delay(1)

WebUI.click(findTestObject('03-Header Menu/User Profile/View Profile/Contact Info/div_Email'))

WebUI.click(findTestObject('03-Header Menu/User Profile/View Profile/Contact Info/add email button'))

WebUI.setText(findTestObject('03-Header Menu/User Profile/View Profile/Contact Info/email field'), 'auto@automation.com')

WebUI.sendKeys(findTestObject('03-Header Menu/User Profile/View Profile/Contact Info/email field'), Keys.chord(Keys.ENTER))

WebUI.click(findTestObject('03-Header Menu/User Profile/View Profile/Contact Info/button_Save'))

WebUI.verifyElementVisible(findTestObject('03-Header Menu/User Profile/View Profile/Contact Info/Success Msg'))

WebUI.delay(2)

WebUI.mouseOver(findTestObject('03-Header Menu/User Profile/View Profile/Contact Info/email field'))

WebUI.click(findTestObject('03-Header Menu/User Profile/View Profile/Contact Info/remove email'))

WebUI.sendKeys(findTestObject('03-Header Menu/User Profile/View Profile/Contact Info/Positon Field'), Keys.chord(Keys.ENTER))

WebUI.delay(2)

WebUI.click(findTestObject('03-Header Menu/User Profile/View Profile/Contact Info/button_Save'))

WebUI.verifyElementVisible(findTestObject('03-Header Menu/User Profile/View Profile/Contact Info/Success Msg'))

WebUI.delay(2)

WebUI.click(findTestObject('03-Header Menu/User Profile/View Profile/Contact Info/phone field'))

WebUI.click(findTestObject('03-Header Menu/User Profile/View Profile/Contact Info/area code selector'))

WebUI.verifyElementVisible(findTestObject('03-Header Menu/User Profile/View Profile/Contact Info/area code modal'))

WebUI.click(findTestObject('03-Header Menu/User Profile/View Profile/Contact Info/button_Philippines 63'))

WebUI.setText(findTestObject('03-Header Menu/User Profile/View Profile/Contact Info/phone field'), '9211234567')

WebUI.sendKeys(findTestObject('03-Header Menu/User Profile/View Profile/Contact Info/Positon Field'), Keys.chord(Keys.ENTER))

WebUI.click(findTestObject('03-Header Menu/User Profile/View Profile/Contact Info/button_Save'))

WebUI.verifyElementVisible(findTestObject('03-Header Menu/User Profile/View Profile/Contact Info/Success Msg'))

WebUI.delay(2)

WebUI.mouseOver(findTestObject('03-Header Menu/User Profile/View Profile/Contact Info/phone field'))

WebUI.delay(1)

WebUI.click(findTestObject('03-Header Menu/User Profile/View Profile/Contact Info/phone remove button'))

WebUI.sendKeys(findTestObject('03-Header Menu/User Profile/View Profile/Contact Info/Positon Field'), Keys.chord(Keys.ENTER))

WebUI.click(findTestObject('03-Header Menu/User Profile/View Profile/Contact Info/button_Save'))

WebUI.verifyElementVisible(findTestObject('03-Header Menu/User Profile/View Profile/Contact Info/Success Msg'))

WebUI.delay(2)

WebUI.click(findTestObject('03-Header Menu/User Profile/View Profile/Contact Info/add address button'))

WebUI.verifyElementVisible(findTestObject('03-Header Menu/User Profile/View Profile/Contact Info/h4_Edit Address'))

WebUI.click(findTestObject('03-Header Menu/User Profile/View Profile/Contact Info/input_street1'))

WebUI.click(findTestObject('03-Header Menu/User Profile/View Profile/Contact Info/input_street2'))

WebUI.click(findTestObject('03-Header Menu/User Profile/View Profile/Contact Info/input_postcode'))

WebUI.click(findTestObject('03-Header Menu/User Profile/View Profile/Contact Info/input_city'))

WebUI.click(findTestObject('03-Header Menu/User Profile/View Profile/Contact Info/input_state'))

WebUI.click(findTestObject('03-Header Menu/User Profile/View Profile/Contact Info/input_country'))

WebUI.click(findTestObject('03-Header Menu/User Profile/View Profile/Contact Info/input_address type'))

WebUI.verifyElementVisible(findTestObject('03-Header Menu/User Profile/View Profile/Contact Info/span_Work'))

WebUI.verifyElementVisible(findTestObject('03-Header Menu/User Profile/View Profile/Contact Info/span_Personal'))

WebUI.verifyElementVisible(findTestObject('03-Header Menu/User Profile/View Profile/Contact Info/span_Other'))

WebUI.verifyElementVisible(findTestObject('03-Header Menu/User Profile/View Profile/Contact Info/invalid street 1'))

WebUI.verifyElementVisible(findTestObject('03-Header Menu/User Profile/View Profile/Contact Info/invalid ZIP'))

WebUI.verifyElementVisible(findTestObject('03-Header Menu/User Profile/View Profile/Contact Info/invalid City'))

WebUI.verifyElementVisible(findTestObject('03-Header Menu/User Profile/View Profile/Contact Info/invalid state'))

WebUI.verifyElementVisible(findTestObject('03-Header Menu/User Profile/View Profile/Contact Info/invalid country'))

WebUI.delay(2)

WebUI.click(findTestObject('03-Header Menu/User Profile/View Profile/Contact Info/input_street1'))

WebUI.verifyElementNotClickable(findTestObject('03-Header Menu/User Profile/View Profile/Contact Info/button_Save_address'))

WebUI.click(findTestObject('03-Header Menu/User Profile/View Profile/Contact Info/button_Cancel'))

WebUI.delay(2)

WebUI.closeBrowser()

