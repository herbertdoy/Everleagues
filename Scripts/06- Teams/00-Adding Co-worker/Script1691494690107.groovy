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

WebUI.navigateToUrl(GlobalVariable.appURL)

WebUI.maximizeWindow()

WebUI.callTestCase(findTestCase('01-Login and Forgot Password/04-Login(Valid Credentials-With Subscription)'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('06-Teams/button_doublearrow'))

WebUI.click(findTestObject('06-Teams/button_My Organizations'))

WebUI.click(findTestObject('06-Teams/button_GG Automation'))

WebUI.delay(GlobalVariable.delay_4seconds)

WebUI.verifyElementVisible(findTestObject('06-Teams/span_GG Automation'))

WebUI.delay(GlobalVariable.delay_5seconds)

WebUI.click(findTestObject('03-Header Menu/Hamburger Button/div_Settings'))

WebUI.delay(GlobalVariable.delay_3seconds)

WebUI.click(findTestObject('09-Settings/Users/div_Users'))

WebUI.click(findTestObject('09-Settings/Users/button_add'))

WebUI.verifyElementVisible(findTestObject('09-Settings/Users/User Invitation modal'))

WebUI.delay(GlobalVariable.delay_3seconds)

WebUI.click(findTestObject('09-Settings/Users/add Invite a single user'))

WebUI.verifyElementVisible(findTestObject('09-Settings/Users/Invite new user modal'))

WebUI.delay(GlobalVariable.delay_3seconds)

WebUI.setText(findTestObject('09-Settings/Users/input_email'), GlobalVariable.email_for_autotester00)

WebUI.setText(findTestObject('09-Settings/Users/input_firstName'), 'GG')

WebUI.setText(findTestObject('09-Settings/Users/input_lastName'), 'autotester00')

WebUI.click(findTestObject('09-Settings/Users/span_Role'))

WebUI.click(findTestObject('09-Settings/Users/span_CoWorker'))

WebUI.click(findTestObject('09-Settings/Users/button_Send Invitation'))

WebUI.delay(GlobalVariable.delay_2seconds)

WebUI.verifyElementVisible(findTestObject('07-Directory/Connections/zContact Profile/Successfully invited user'))

WebUI.delay(GlobalVariable.delay_2seconds)

WebUI.executeJavaScript('window.open();', [])

currentWindow = WebUI.getWindowIndex()

WebUI.delay(GlobalVariable.delay_3seconds)

WebUI.switchToWindowIndex(currentWindow + 1)

WebUI.navigateToUrl('https://www.mailinator.com/')

WebUI.delay(GlobalVariable.delay_3seconds)

WebUI.setText(findTestObject('00-Signup and Activation/zMailinator/input_LOGIN_search'), GlobalVariable.email_for_autotester00)

WebUI.click(findTestObject('00-Signup and Activation/zMailinator/gobutton'), FailureHandling.STOP_ON_FAILURE)

WebUI.delay(GlobalVariable.delay_3seconds)

WebUI.closeWindowTitle('Everleagues')

WebUI.switchToWindowIndex(0)

WebUI.click(findTestObject('09-Settings/Users/Co worker/td_Invitation from GG Automation'))

WebUI.click(findTestObject('09-Settings/Users/Co worker/a_Click here to join GG Automation on EverLeagues'))

WebUI.closeWindowTitle('Mailinator')

WebUI.switchToWindowIndex(0)

WebUI.verifyElementVisible(findTestObject('09-Settings/Users/Co worker/Logout before proceed modal'))

WebUI.click(findTestObject('09-Settings/Users/Co worker/button_Yes'))

WebUI.delay(GlobalVariable.delay_3seconds)

WebUI.setText(findTestObject('09-Settings/Users/input_email'), GlobalVariable.email_for_autotester00)

WebUI.setEncryptedText(findTestObject('09-Settings/Users/Co worker/input_password'), GlobalVariable.password)

WebUI.click(findTestObject('02-Side Icons(Organization)/Add Contact/button_Sign in'))

WebUI.delay(GlobalVariable.delay_2seconds)

//WebUI.click(findTestObject('06-Teams/For 2FA/button_Confirm_2FA'))

WebUI.executeJavaScript('window.open();', [])

currentWindow = WebUI.getWindowIndex()

WebUI.delay(GlobalVariable.delay_3seconds)

WebUI.switchToWindowIndex(currentWindow + 1)

WebUI.navigateToUrl(GlobalVariable.app_mailinator)

WebUI.delay(GlobalVariable.delay_3seconds)

WebUI.setText(findTestObject('00-Signup and Activation/zMailinator/input_LOGIN_search'), GlobalVariable.email_for_autotester00)

WebUI.click(findTestObject('00-Signup and Activation/zMailinator/gobutton'), FailureHandling.STOP_ON_FAILURE)

WebUI.delay(GlobalVariable.delay_3seconds)

WebUI.click(findTestObject('00-Signup and Activation/zMailinator/Email - everleagues'))

WebUI.delay(GlobalVariable.delay_3seconds)

String codetwo = WebUI.getText(findTestObject('Object Repository/06-Teams/For 2FA/2FA code'))

WebUI.delay(GlobalVariable.delay_3seconds)

WebUI.closeWindowTitle('Mailinator')

WebUI.delay(GlobalVariable.delay_3seconds)

WebUI.switchToWindowIndex(0)

WebUI.delay(GlobalVariable.delay_3seconds)

WebUI.setText(findTestObject('Object Repository/06-Teams/For 2FA/input_Enter verification code_code'), codetwo)

WebUI.delay(GlobalVariable.delay_3seconds)

WebUI.click(findTestObject('06-Teams/For 2FA/button_Verify_2FA'))

WebUI.delay(GlobalVariable.delay_5seconds)

WebUI.executeJavaScript('window.open();', [])

currentWindow = WebUI.getWindowIndex()

WebUI.delay(GlobalVariable.delay_3seconds)

WebUI.switchToWindowIndex(currentWindow + 1)

WebUI.navigateToUrl(GlobalVariable.app_mailinator)

WebUI.delay(GlobalVariable.delay_3seconds)

WebUI.setText(findTestObject('00-Signup and Activation/zMailinator/input_LOGIN_search'), GlobalVariable.email_for_autotester00)

WebUI.click(findTestObject('00-Signup and Activation/zMailinator/gobutton'), FailureHandling.STOP_ON_FAILURE)

WebUI.delay(GlobalVariable.delay_3seconds)

WebUI.closeWindowTitle('Everleagues')

WebUI.switchToWindowIndex(0)

WebUI.click(findTestObject('09-Settings/Users/Co worker/td_Invitation from GG Automation'))

WebUI.click(findTestObject('09-Settings/Users/Co worker/a_Click here to join GG Automation on EverLeagues'))

WebUI.delay(GlobalVariable.delay_3seconds)

WebUI.closeWindowTitle('Mailinator')

WebUI.switchToWindowIndex(0)

WebUI.verifyElementVisible(findTestObject('09-Settings/Users/Co worker/Invite modal'))

WebUI.click(findTestObject('09-Settings/Users/Co worker/button_Accept'))

WebUI.delay(GlobalVariable.delay_5seconds)

WebUI.verifyElementVisible(findTestObject('09-Settings/Users/Co worker/div_Joined as CoWorker'))

WebUI.closeBrowser()
