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

//WebUI.setText(findTestObject('01-Login and Forgot Password/input_email'), 'testuser02@mailinator.com')
WebUI.setText(findTestObject('01-Login and Forgot Password/input_email'), GlobalVariable.Y_email_withSubscription_testuser00005)

WebUI.setEncryptedText(findTestObject('01-Login and Forgot Password/input_password'), GlobalVariable.password)

WebUI.delay(GlobalVariable.delay_2s)

WebUI.click(findTestObject('01-Login and Forgot Password/button_show pass button'))

WebUI.delay(GlobalVariable.delay_3s)

WebUI.click(findTestObject('01-Login and Forgot Password/button_Sign in'))

WebUI.delay(GlobalVariable.delay_3s)

WebUI.executeJavaScript('window.open();', [])

currentWindow = WebUI.getWindowIndex()

WebUI.delay(GlobalVariable.delay_3s)

WebUI.switchToWindowIndex(currentWindow + 1)

WebUI.navigateToUrl(GlobalVariable.URL_yopmail)

//WebUI.navigateToUrl(GlobalVariable.URL_mailinator)
WebUI.delay(GlobalVariable.delay_2s)

WebUI.setText(findTestObject('Yopmail/input_Enter your inbox here'), GlobalVariable.Y_email_withSubscription_testuser00005)

//WebUI.setText(findTestObject('Mailinator/input_LOGIN_search'), 'testuser02@mailinator.com')
//WebUI.setText(findTestObject('Mailinator/input_LOGIN_search'), GlobalVariable.email_for_searchmailinator_testuser05)
//WebUI.click(findTestObject('Mailinator/gobutton'), FailureHandling.STOP_ON_FAILURE)
WebUI.delay(GlobalVariable.delay_2s)

WebUI.click(findTestObject('Yopmail/button_Next'))

//WebUI.click(findTestObject('Mailinator/Email - everleagues'))
WebUI.delay(GlobalVariable.delay_3s)

WebUI.click(findTestObject('Yopmail/span_Everleagues Team'))

WebUI.delay(GlobalVariable.delay_3s)

//String code = WebUI.getText(findTestObject('Object Repository/06-Teams/For 2FA/2FA code'))
String code = WebUI.getText(findTestObject('Yopmail/2FA code-Yopmail'))

WebUI.delay(GlobalVariable.delay_3s)

//WebUI.closeWindowTitle('Mailinator')
WebUI.closeWindowTitle(GlobalVariable.Y_windowTitle)

WebUI.delay(GlobalVariable.delay_3s)

WebUI.switchToWindowIndex(0)

WebUI.delay(GlobalVariable.delay_2s)

//WebUI.click(findTestObject('06-Teams/For 2FA/button_Confirm_2FA'))
WebUI.setText(findTestObject('Object Repository/06-Teams/For 2FA/input_Enter verification code'), code)

WebUI.delay(GlobalVariable.delay_2s)

WebUI.click(findTestObject('06-Teams/For 2FA/button_Verify_2FA'))

//WebUI.verifyElementPresent(findTestObject('01-Login and Forgot Password/h4_EVERLEAGUES (v0.11.16 build 324)'), 0) 
WebUI.delay(GlobalVariable.delay_3s)

