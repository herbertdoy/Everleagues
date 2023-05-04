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

WebUI.click(findTestObject('03-Header Menu/User Profile/View Profile/Contact Info/phone field'))

WebUI.click(findTestObject('03-Header Menu/User Profile/View Profile/Contact Info/area code selector'))

WebUI.verifyElementVisible(findTestObject('03-Header Menu/User Profile/View Profile/Contact Info/area code modal'))

WebUI.click(findTestObject('03-Header Menu/User Profile/View Profile/Contact Info/button_Philippines 63'))

WebUI.setText(findTestObject('03-Header Menu/User Profile/View Profile/Contact Info/phone field'), '9211234567')

WebUI.sendKeys(findTestObject('03-Header Menu/User Profile/View Profile/Contact Info/Positon Field'), Keys.chord(Keys.ENTER))

WebUI.click(findTestObject('03-Header Menu/User Profile/View Profile/Contact Info/button_Save'))

WebUI.delay(GlobalVariable.delay_3seconds)

WebUI.verifyElementVisible(findTestObject('03-Header Menu/User Profile/View Profile/Contact Info/Success Msg'))

WebUI.delay(GlobalVariable.delay_3seconds)

WebUI.mouseOver(findTestObject('03-Header Menu/User Profile/View Profile/Contact Info/phone field'))

WebUI.delay(GlobalVariable.delay_3seconds)

WebUI.click(findTestObject('03-Header Menu/User Profile/View Profile/Contact Info/phone remove button'))

WebUI.sendKeys(findTestObject('03-Header Menu/User Profile/View Profile/Contact Info/Positon Field'), Keys.chord(Keys.ENTER))

WebUI.click(findTestObject('03-Header Menu/User Profile/View Profile/Contact Info/button_Save'))

WebUI.verifyElementVisible(findTestObject('03-Header Menu/User Profile/View Profile/Contact Info/Success Msg'))

WebUI.delay(GlobalVariable.delay_3seconds)

