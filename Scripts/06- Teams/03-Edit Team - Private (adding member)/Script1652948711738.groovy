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

//WebUI.setText(findTestObject('02-Side Icons(Organization)/Add Contact/Email Field'), 'testuser02@mailinator.com')
WebUI.setText(findTestObject('02-Side Icons(Organization)/Add Contact/Email Field'), GlobalVariable.email_with_subscription)

WebUI.setEncryptedText(findTestObject('02-Side Icons(Organization)/Add Contact/Password Field'), GlobalVariable.password)

WebUI.click(findTestObject('02-Side Icons(Organization)/Add Contact/button_Sign in'))

WebUI.delay(GlobalVariable.delay_3seconds)

WebUI.click(findTestObject('06-Teams/For 2FA/button_Confirm_2FA'))

WebUI.executeJavaScript('window.open();', [])

currentWindow = WebUI.getWindowIndex()

WebUI.delay(GlobalVariable.delay_3seconds)

WebUI.switchToWindowIndex(currentWindow + 1)

WebUI.navigateToUrl(GlobalVariable.app_mailinator)

WebUI.delay(GlobalVariable.delay_3seconds)

//WebUI.setText(findTestObject('00-Signup and Activation/zMailinator/input_LOGIN_search'), 'testuser02@mailinator.com')
WebUI.setText(findTestObject('00-Signup and Activation/zMailinator/input_LOGIN_search'), GlobalVariable.email_for_searchmailinator_testuser05)

WebUI.click(findTestObject('00-Signup and Activation/zMailinator/gobutton'), FailureHandling.STOP_ON_FAILURE)

WebUI.delay(GlobalVariable.delay_3seconds)

WebUI.click(findTestObject('00-Signup and Activation/zMailinator/Email - everleagues'))

WebUI.delay(GlobalVariable.delay_3seconds)

String code = WebUI.getText(findTestObject('Object Repository/06-Teams/For 2FA/2FA code'))

WebUI.delay(GlobalVariable.delay_3seconds)

WebUI.closeWindowTitle('Mailinator')

WebUI.delay(GlobalVariable.delay_3seconds)

WebUI.switchToWindowIndex(0)

WebUI.delay(GlobalVariable.delay_3seconds)

WebUI.setText(findTestObject('Object Repository/06-Teams/For 2FA/input_Enter verification code_code'), code)

WebUI.delay(GlobalVariable.delay_3seconds)

WebUI.click(findTestObject('06-Teams/For 2FA/button_Verify_2FA'))

WebUI.delay(GlobalVariable.delay_5seconds)

WebUI.click(findTestObject('06-Teams/button_doublearrow'))

WebUI.click(findTestObject('06-Teams/button_My Organizations'))

WebUI.click(findTestObject('06-Teams/button_GG Automation'))

WebUI.delay(GlobalVariable.delay_4seconds)

WebUI.verifyElementVisible(findTestObject('06-Teams/span_GG Automation'))

WebUI.delay(GlobalVariable.delay_2seconds)

WebUI.click(findTestObject('03-Header Menu/Hamburger Button/div_Teams'))

WebUI.delay(GlobalVariable.delay_2seconds)

WebUI.verifyElementVisible(findTestObject('06-Teams/h4_TEAMS'))

WebUI.delay(GlobalVariable.delay_3seconds)

WebUI.click(findTestObject('06-Teams/03-Edit Team - Private/button_edit Auto Team Private'))

WebUI.delay(GlobalVariable.delay_3seconds)

WebUI.verifyElementVisible(findTestObject('06-Teams/03-Edit Team - Private/h4_Edit Auto Team Private'))

WebUI.verifyElementVisible(findTestObject('06-Teams/03-Edit Team - Private/div_Members'))

WebUI.verifyElementVisible(findTestObject('06-Teams/03-Edit Team - Private/div_Channels'))

WebUI.verifyElementVisible(findTestObject('06-Teams/03-Edit Team - Private/div_Settings'))

WebUI.delay(GlobalVariable.delay_3seconds)

WebUI.click(findTestObject('06-Teams/03-Edit Team - Private/input_name or group'))

WebUI.click(findTestObject('06-Teams/03-Edit Team - Private/select_GG tester 2'))

WebUI.verifyElementVisible(findTestObject('06-Teams/03-Edit Team - Private/selected_GG tester 2'))

WebUI.delay(GlobalVariable.delay_3seconds)

WebUI.click(findTestObject('06-Teams/03-Edit Team - Private/div_INVITE'))

WebUI.verifyElementVisible(findTestObject('06-Teams/03-Edit Team - Private/added_GTGG tester 2'))

WebUI.delay(GlobalVariable.delay_3seconds)

