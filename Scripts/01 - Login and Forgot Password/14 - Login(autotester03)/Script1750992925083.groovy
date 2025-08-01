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

WebUI.refresh()

WebUI.delay(GlobalVariable.delay_3s)

WebUI.navigateToUrl(GlobalVariable.URL_lab)

WebUI.maximizeWindow()

WebUI.callTestCase(findTestCase('01 - Login and Forgot Password/04 - Login(Valid Credentials-testuser00005)'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('06-Teams/button_doublearrow'))

WebUI.click(findTestObject('06-Teams/button_My Organizations'))

WebUI.click(findTestObject('06-Teams/button_GG Automation'))

WebUI.delay(GlobalVariable.delay_2s)

WebUI.verifyElementVisible(findTestObject('06-Teams/span_GG Automation'))

WebUI.delay(GlobalVariable.delay_2s)

WebUI.click(findTestObject('03-Header Menu/div_Settings'))

WebUI.delay(GlobalVariable.delay_2s)

WebUI.scrollToElement(findTestObject('09-Settings/Users/div_Users'), 0)

WebUI.click(findTestObject('09-Settings/Users/div_Users'))

WebUI.delay(GlobalVariable.delay_2s)

WebUI.click(findTestObject('09-Settings/Users/button_add'))

WebUI.delay(GlobalVariable.delay_2s)

WebUI.click(findTestObject('09-Settings/Users/add Invite a single user'))

WebUI.delay(GlobalVariable.delay_2s)

WebUI.setText(findTestObject('09-Settings/Users/input_email'), autotester03)

WebUI.setText(findTestObject('09-Settings/Users/input_firstName'), firstname)

WebUI.setText(findTestObject('09-Settings/Users/input_lastName'), lastname)

WebUI.click(findTestObject('09-Settings/Users/span_Role'))

WebUI.click(findTestObject('09-Settings/Users/span_Client'))

WebUI.click(findTestObject('09-Settings/Users/button_Send Invitation'))

WebUI.delay(GlobalVariable.delay_2s)

WebUI.verifyElementVisible(findTestObject('07-Directory/Connections/zContact Profile/Successfully invited user'))

WebUI.delay(GlobalVariable.delay_2s)

WebUI.callTestCase(findTestCase('01 - Login and Forgot Password/05 - Logout'), [:], FailureHandling.CONTINUE_ON_FAILURE)

WebUI.closeBrowser()

WebUI.openBrowser('')

WebUI.refresh()

WebUI.delay(GlobalVariable.delay_3s)

WebUI.navigateToUrl(GlobalVariable.URL_lab)

WebUI.maximizeWindow()

WebUI.setText(findTestObject('02-Side Icons/input_Email Field'), autotester03)

WebUI.setEncryptedText(findTestObject('02-Side Icons/input_Password Field'), GlobalVariable.password)

WebUI.click(findTestObject('02-Side Icons/button_Sign in'))

WebUI.delay(GlobalVariable.delay_2s)

WebUI.click(findTestObject('06-Teams/For 2FA/button_Confirm_2FA_2'))

WebUI.executeJavaScript('window.open();', [])

currentWindow = WebUI.getWindowIndex()

WebUI.delay(GlobalVariable.delay_2s)

WebUI.switchToWindowIndex(currentWindow + 1)

WebUI.navigateToUrl(GlobalVariable.URL_yopmail)

WebUI.delay(GlobalVariable.delay_2s)

WebUI.setText(findTestObject('Yopmail/input_Enter your inbox here'), autotester03)

WebUI.click(findTestObject('Yopmail/button_Next'), FailureHandling.STOP_ON_FAILURE)

WebUI.delay(GlobalVariable.delay_3s)

WebUI.click(findTestObject('Yopmail/span_Everleagues Team'))

WebUI.delay(GlobalVariable.delay_2s)

String codetwo = WebUI.getText(findTestObject('Yopmail/2FA code-Yopmail'))

WebUI.delay(GlobalVariable.delay_2s)

WebUI.closeWindowTitle(GlobalVariable.Y_windowTitle)

WebUI.delay(GlobalVariable.delay_2s)

WebUI.switchToWindowIndex(0)

WebUI.delay(GlobalVariable.delay_2s)

WebUI.setText(findTestObject('Object Repository/06-Teams/For 2FA/input_Enter verification code'), codetwo)

WebUI.delay(GlobalVariable.delay_2s)

WebUI.click(findTestObject('06-Teams/For 2FA/button_Verify_2FA'))

WebUI.delay(GlobalVariable.delay_2s)

WebUI.executeJavaScript('window.open();', [])

currentWindow = WebUI.getWindowIndex()

WebUI.delay(GlobalVariable.delay_2s)

WebUI.switchToWindowIndex(currentWindow + 1)

WebUI.navigateToUrl(GlobalVariable.URL_yopmail)

WebUI.delay(GlobalVariable.delay_2s)

WebUI.setText(findTestObject('Yopmail/input_Enter your inbox here'), autotester03)

WebUI.click(findTestObject('Yopmail/button_Next'), FailureHandling.STOP_ON_FAILURE)

WebUI.delay(GlobalVariable.delay_2s)

WebUI.closeWindowTitle('Everleagues')

WebUI.switchToWindowIndex(0)

WebUI.click(findTestObject('Yopmail/div_Invitation from GG Automation'))

WebUI.click(findTestObject('Yopmail/a_Click here to join GG Automation on EverLeagues'))

WebUI.closeWindowTitle(GlobalVariable.Y_windowTitle)

WebUI.switchToWindowIndex(0)

WebUI.verifyElementVisible(findTestObject('09-Settings/Users/Client/Invite modal'))

WebUI.setText(findTestObject('09-Settings/Users/Client/Company field'), companyname)

WebUI.click(findTestObject('09-Settings/Users/Client/button_Accept'))

WebUI.delay(GlobalVariable.delay_2s)

WebUI.verifyElementVisible(findTestObject('09-Settings/Users/Client/div_Joined as CLIENT'))

WebUI.delay(GlobalVariable.delay_3s)

WebUI.closeBrowser()

