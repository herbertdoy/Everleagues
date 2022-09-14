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

WebUI.navigateToUrl('https://lab.everleagues.com/')

WebUI.maximizeWindow()

WebUI.setText(findTestObject('02-Side Icons(Organization)/Add Contact/Email Field'), 'testuser02@mailinator.com')

WebUI.setEncryptedText(findTestObject('02-Side Icons(Organization)/Add Contact/Password Field'), '8yFRyszE6U6jvsCn51OQbg==')

WebUI.click(findTestObject('02-Side Icons(Organization)/Add Contact/button_Sign in'))

WebUI.delay(2)

WebUI.click(findTestObject('06-Teams/For 2FA/button_Confirm_2FA'))

WebUI.executeJavaScript('window.open();', [])

currentWindow = WebUI.getWindowIndex()

WebUI.delay(3)

WebUI.switchToWindowIndex(currentWindow + 1)

WebUI.navigateToUrl('https://www.mailinator.com/')

WebUI.delay(3)

WebUI.setText(findTestObject('00-Signup and Activation/zMailinator/input_LOGIN_search'), 'testuser02@mailinator.com')

WebUI.click(findTestObject('00-Signup and Activation/zMailinator/gobutton'), FailureHandling.STOP_ON_FAILURE)

WebUI.delay(3)

WebUI.click(findTestObject('00-Signup and Activation/zMailinator/Email - everleagues'))

WebUI.delay(3)

String code = WebUI.getText(findTestObject('Object Repository/06-Teams/For 2FA/2FA code'))

WebUI.delay(3)

WebUI.closeWindowTitle('Mailinator')

WebUI.delay(3)

WebUI.switchToWindowIndex(0)

WebUI.delay(3)

WebUI.setText(findTestObject('Object Repository/06-Teams/For 2FA/input_Enter verification code_code'), code)

WebUI.delay(3)

WebUI.click(findTestObject('06-Teams/For 2FA/button_Verify_2FA'))

WebUI.delay(5)

WebUI.click(findTestObject('06-Teams/button_doublearrow'))

WebUI.click(findTestObject('06-Teams/button_My Organizations'))

WebUI.click(findTestObject('06-Teams/button_GG Automation'))

WebUI.delay(4)

WebUI.verifyElementVisible(findTestObject('06-Teams/span_GG Automation'))

WebUI.delay(10)

WebUI.click(findTestObject('03-Header Menu/Hamburger Button/div_Settings'))

WebUI.delay(3)

WebUI.click(findTestObject('09-Settings/Users/div_Users'))

WebUI.delay(3)

WebUI.click(findTestObject('09-Settings/Users/button_add'))

WebUI.delay(3)

WebUI.click(findTestObject('09-Settings/Users/add Invite a single user'))

WebUI.delay(3)

WebUI.setText(findTestObject('09-Settings/Users/input_email'), 'autotester09@mailinator.com')

WebUI.setText(findTestObject('09-Settings/Users/input_firstName'), 'GG')

WebUI.setText(findTestObject('09-Settings/Users/input_lastName'), 'Client')

WebUI.click(findTestObject('09-Settings/Users/span_Role'))

WebUI.click(findTestObject('09-Settings/Users/span_Client'))

WebUI.click(findTestObject('09-Settings/Users/button_Send Invitation'))

WebUI.delay(2)

WebUI.verifyElementVisible(findTestObject('07-Directory/Connections/zContact Profile/Successfully invited user'))

WebUI.delay(2)

WebUI.click(findTestObject('01-Login and Forgot Password/User menu drop'))

WebUI.delay(2)

WebUI.click(findTestObject('01-Login and Forgot Password/h4_Sign Out'), FailureHandling.STOP_ON_FAILURE)

WebUI.delay(2)

WebUI.verifyElementPresent(findTestObject('01-Login and Forgot Password/Login_Card'), 0)

WebUI.delay(3)

WebUI.closeBrowser()

WebUI.openBrowser('')

WebUI.navigateToUrl('https://lab.everleagues.com/')

WebUI.maximizeWindow()

WebUI.setText(findTestObject('02-Side Icons(Organization)/Add Contact/Email Field'), 'autotester09@mailinator.com')

WebUI.setEncryptedText(findTestObject('02-Side Icons(Organization)/Add Contact/Password Field'), '8yFRyszE6U6jvsCn51OQbg==')

WebUI.click(findTestObject('02-Side Icons(Organization)/Add Contact/button_Sign in'))

WebUI.delay(2)

WebUI.click(findTestObject('06-Teams/For 2FA/button_Confirm_2FA'))

WebUI.executeJavaScript('window.open();', [])

currentWindow = WebUI.getWindowIndex()

WebUI.delay(3)

WebUI.switchToWindowIndex(currentWindow + 1)

WebUI.navigateToUrl('https://www.mailinator.com/')

WebUI.delay(3)

WebUI.setText(findTestObject('00-Signup and Activation/zMailinator/input_LOGIN_search'), 'autotester09@mailinator.com')

WebUI.click(findTestObject('00-Signup and Activation/zMailinator/gobutton'), FailureHandling.STOP_ON_FAILURE)

WebUI.delay(3)

WebUI.click(findTestObject('00-Signup and Activation/zMailinator/Email - everleagues'))

WebUI.delay(3)

String codetwo = WebUI.getText(findTestObject('Object Repository/06-Teams/For 2FA/2FA code'))

WebUI.delay(3)

WebUI.closeWindowTitle('Mailinator')

WebUI.delay(3)

WebUI.switchToWindowIndex(0)

WebUI.delay(3)

WebUI.setText(findTestObject('Object Repository/06-Teams/For 2FA/input_Enter verification code_code'), codetwo)

WebUI.delay(3)

WebUI.click(findTestObject('06-Teams/For 2FA/button_Verify_2FA'))

WebUI.delay(5)

WebUI.executeJavaScript('window.open();', [])

currentWindow = WebUI.getWindowIndex()

WebUI.delay(3)

WebUI.switchToWindowIndex(currentWindow + 1)

WebUI.navigateToUrl('https://www.mailinator.com/')

WebUI.delay(3)

WebUI.setText(findTestObject('00-Signup and Activation/zMailinator/input_LOGIN_search'), 'autotester09@mailinator.com')

WebUI.click(findTestObject('00-Signup and Activation/zMailinator/gobutton'), FailureHandling.STOP_ON_FAILURE)

WebUI.delay(3)

WebUI.closeWindowTitle('Everleagues')

WebUI.switchToWindowIndex(0)

WebUI.click(findTestObject('09-Settings/Users/Co worker/td_Invitation from GG Automation'))

WebUI.click(findTestObject('09-Settings/Users/Co worker/a_Click here to join GG Automation on EverLeagues'))

WebUI.closeWindowTitle('Mailinator')

WebUI.switchToWindowIndex(0)

WebUI.verifyElementVisible(findTestObject('09-Settings/Users/Client/Invite modal'))

WebUI.setText(findTestObject('09-Settings/Users/Client/Company field'), 'QA Company')

WebUI.click(findTestObject('09-Settings/Users/Client/button_Accept'))

WebUI.delay(10)

WebUI.verifyElementVisible(findTestObject('09-Settings/Users/Client/div_Joined as CLIENT'))

WebUI.delay(3)

WebUI.closeBrowser()

