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

WebUI.click(findTestObject('03-Header Menu/User Profile/View Profile/div_Security'))

WebUI.click(findTestObject('03-Header Menu/User Profile/View Profile/Security Tab (2FA)/2FA_toggle'))

WebUI.verifyElementVisible(findTestObject('03-Header Menu/User Profile/View Profile/Security Tab (2FA)/Success enable'))

WebUI.delay(GlobalVariable.delay_1s)

WebUI.click(findTestObject('03-Header Menu/User Profile/View Profile/Security Tab (2FA)/2FA_toggle'))

WebUI.click(findTestObject('03-Header Menu/User Profile/View Profile/Security Tab (2FA)/button_edit'))

WebUI.verifyElementVisible(findTestObject('03-Header Menu/User Profile/View Profile/Security Tab (2FA)/2FA Phone Number modal'))

WebUI.delay(GlobalVariable.delay_1s)

WebUI.click(findTestObject('03-Header Menu/User Profile/View Profile/Security Tab (2FA)/button_areacode_default'))

WebUI.verifyElementVisible(findTestObject('03-Header Menu/User Profile/View Profile/Security Tab (2FA)/Area code modal'))

WebUI.setText(findTestObject('03-Header Menu/User Profile/View Profile/Security Tab (2FA)/area code search'), GlobalVariable.area_Code)

WebUI.click(findTestObject('03-Header Menu/User Profile/View Profile/Security Tab (2FA)/button_Philippines 63'))

WebUI.setText(findTestObject('03-Header Menu/User Profile/View Profile/Security Tab (2FA)/input_phone number'), CphoneNumber)

WebUI.delay(GlobalVariable.delay_2s)

WebUI.click(findTestObject('03-Header Menu/User Profile/View Profile/Security Tab (2FA)/button_Next'))

WebUI.delay(GlobalVariable.delay_1s)

WebUI.verifyElementVisible(findTestObject('03-Header Menu/User Profile/View Profile/Security Tab (2FA)/ver_code_success'))

WebUI.delay(GlobalVariable.delay_2s)

WebUI.click(findTestObject('03-Header Menu/User Profile/View Profile/Security Tab (2FA)/button_Cancel'))

//WebUI.click(findTestObject('03-Header Menu/User Profile/View Profile/Security Tab (2FA)/2FA_toggle'))
//
//WebUI.verifyElementVisible(findTestObject('03-Header Menu/User Profile/View Profile/Security Tab (2FA)/Success disable'))
WebUI.delay(GlobalVariable.delay_2s)

