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

WebUI.setEncryptedText(findTestObject('03-Header Menu/User Profile/Change Password/input_Old password'), GlobalVariable.password)

WebUI.setEncryptedText(findTestObject('03-Header Menu/User Profile/Change Password/input_new password'), GlobalVariable.new_password)

WebUI.setEncryptedText(findTestObject('03-Header Menu/User Profile/Change Password/input_Confirm password'), GlobalVariable.confirm_password)

WebUI.click(findTestObject('03-Header Menu/User Profile/Change Password/button_Change Password'))

WebUI.verifyElementVisible(findTestObject('03-Header Menu/User Profile/Change Password/Successfully changed password'))

WebUI.delay(GlobalVariable.delay_2s)

WebUI.click(findTestObject('03-Header Menu/User Profile/Users Profile menu and notification button/div_User drop down menu button'))

WebUI.delay(GlobalVariable.delay_2s)

WebUI.click(findTestObject('03-Header Menu/Header Menu Verifications/h4_Sign Out'))

WebUI.delay(GlobalVariable.delay_2s)

WebUI.closeBrowser()

WebUI.openBrowser('')

WebUI.navigateToUrl(GlobalVariable.URL_lab)

WebUI.maximizeWindow()

//WebUI.setText(findTestObject('02-Side Icons(Organization)/Add Contact/Email Field'), 'testuser02@mailinator.com')
WebUI.setText(findTestObject('02-Side Icons(Organization)/Add Contact/Email Field'), GlobalVariable.Y_email_withSubscription_testuser00005)

WebUI.setEncryptedText(findTestObject('02-Side Icons(Organization)/Add Contact/Password Field'), GlobalVariable.new_password)

WebUI.click(findTestObject('02-Side Icons(Organization)/Add Contact/button_Sign in'))

WebUI.delay(GlobalVariable.delay_2s)

//WebUI.click(findTestObject('06-Teams/For 2FA/button_Confirm_2FA'))//
WebUI.executeJavaScript('window.open();', [])

currentWindow = WebUI.getWindowIndex()

WebUI.delay(GlobalVariable.delay_3s)

WebUI.switchToWindowIndex(currentWindow + 1)

WebUI.navigateToUrl(GlobalVariable.URL_yopmail)

WebUI.delay(GlobalVariable.delay_3s)

//WebUI.setText(findTestObject('00-Signup and Activation/zMailinator/input_LOGIN_search'), 'testuser02@mailinator.com')
//WebUI.setText(findTestObject('00-Signup and Activation/zMailinator/input_LOGIN_search'), GlobalVariable.email_for_searchmailinator_testuser05)
WebUI.setText(findTestObject('Yopmail/input_Enter your inbox here'), GlobalVariable.Y_email_withSubscription_testuser00005)

//WebUI.click(findTestObject('00-Signup and Activation/zMailinator/gobutton'), FailureHandling.STOP_ON_FAILURE)
WebUI.click(findTestObject('Yopmail/button_Next'), FailureHandling.STOP_ON_FAILURE)

WebUI.delay(GlobalVariable.delay_3s)

WebUI.click(findTestObject('Yopmail/span_Everleagues Team'), FailureHandling.STOP_ON_FAILURE)

WebUI.delay(GlobalVariable.delay_3s)

//WebUI.click(findTestObject('00-Signup and Activation/zMailinator/Email - everleagues'))
//WebUI.delay(GlobalVariable.delay_3s)
//String code = WebUI.getText(findTestObject('Object Repository/06-Teams/For 2FA/2FA code'))
String code = WebUI.getText(findTestObject('Yopmail/2FA code-Yopmail'))

WebUI.delay(GlobalVariable.delay_3s)

//WebUI.closeWindowTitle(GlobalVariable.mailinator)
WebUI.closeWindowTitle('Inbox')

WebUI.delay(GlobalVariable.delay_3s)

WebUI.switchToWindowIndex(0)

WebUI.delay(GlobalVariable.delay_2s)

WebUI.setText(findTestObject('Object Repository/06-Teams/For 2FA/input_Enter verification code_code'), code)

WebUI.delay(GlobalVariable.delay_3s)

WebUI.click(findTestObject('06-Teams/For 2FA/button_Verify_2FA'))

WebUI.delay(GlobalVariable.delay_3s)

WebUI.click(findTestObject('03-Header Menu/User Profile/Users Profile menu and notification button/div_User drop down menu button'))

WebUI.delay(GlobalVariable.delay_2s)

WebUI.click(findTestObject('03-Header Menu/User Profile/Change Password/button_Change password_userDropdown'))

WebUI.verifyElementVisible(findTestObject('03-Header Menu/User Profile/Change Password/h4_Change Password'))

WebUI.delay(GlobalVariable.delay_2s)

WebUI.setEncryptedText(findTestObject('03-Header Menu/User Profile/Change Password/input_Old password'), GlobalVariable.new_password)

WebUI.setEncryptedText(findTestObject('03-Header Menu/User Profile/Change Password/input_new password'), GlobalVariable.password)

WebUI.setEncryptedText(findTestObject('03-Header Menu/User Profile/Change Password/input_Confirm password'), GlobalVariable.password)

WebUI.click(findTestObject('03-Header Menu/User Profile/Change Password/button_Change Password'))

WebUI.verifyElementVisible(findTestObject('03-Header Menu/User Profile/Change Password/Successfully changed password'))

WebUI.delay(GlobalVariable.delay_2s)

WebUI.closeBrowser()

