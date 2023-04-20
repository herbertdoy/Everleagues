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
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW

WebUI.setText(findTestObject('01-Login and Forgot Password/input_Email_email'), 'testuser01@mailinator.com')

WebUI.setEncryptedText(findTestObject('01-Login and Forgot Password/input_Email_password2'), '8yFRyszE6U6jvsCn51OQbg==')

WebUI.delay(2)

WebUI.click(findTestObject('01-Login and Forgot Password/show pass button'))

WebUI.delay(3)

WebUI.click(findTestObject('01-Login and Forgot Password/button_Sign in'))

WebUI.delay(3)

WebUI.click(findTestObject('06-Teams/For 2FA/button_Confirm_2FA'))

WebUI.executeJavaScript('window.open();', [])

currentWindow = WebUI.getWindowIndex()

WebUI.delay(5)

WebUI.switchToWindowIndex(currentWindow + 1)

WebUI.navigateToUrl('https://www.mailinator.com/')

WebUI.delay(5)

WebUI.setText(findTestObject('00-Signup and Activation/zMailinator/input_LOGIN_search'), 'testuser01@mailinator.com')

WebUI.click(findTestObject('00-Signup and Activation/zMailinator/gobutton'), FailureHandling.STOP_ON_FAILURE)

WebUI.delay(5)

WebUI.click(findTestObject('00-Signup and Activation/zMailinator/Email - everleagues'))

WebUI.delay(5)

String code = WebUI.getText(findTestObject('Object Repository/06-Teams/For 2FA/2FA code'))

WebUI.delay(5)

WebUI.closeWindowTitle('Mailinator')

WebUI.delay(5)

WebUI.switchToWindowIndex(0)

WebUI.delay(5)

WebUI.setText(findTestObject('Object Repository/06-Teams/For 2FA/input_Enter verification code_code'), code)

WebUI.delay(5)

WebUI.click(findTestObject('06-Teams/For 2FA/button_Verify_2FA'))

//WebUI.verifyElementPresent(findTestObject('01-Login and Forgot Password/h4_EVERLEAGUES (v0.11.16 build 324)'), 0) 
WebUI.delay(5)

