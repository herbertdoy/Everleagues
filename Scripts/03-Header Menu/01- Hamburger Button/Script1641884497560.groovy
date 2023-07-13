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
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW

WebUI.openBrowser('')

WebUI.navigateToUrl(GlobalVariable.app_url_login)

WebUI.maximizeWindow()

//WebUI.callTestCase(findTestCase('01-Login and Forgot Password/04-Login (Valid Credentials-Without Subscription)'), [:], 
//    FailureHandling.STOP_ON_FAILURE)
WebUI.setText(findTestObject('02-Side Icons(Organization)/Add Contact/Email Field'), GlobalVariable.email_without_subscription)

WebUI.setEncryptedText(findTestObject('02-Side Icons(Organization)/Add Contact/Password Field'), GlobalVariable.password)

WebUI.click(findTestObject('02-Side Icons(Organization)/Add Contact/button_Sign in'))

WebUI.delay(GlobalVariable.delay_2seconds)

WebUI.executeJavaScript('window.open();', [])

currentWindow = WebUI.getWindowIndex()

WebUI.delay(GlobalVariable.delay_3seconds)

WebUI.switchToWindowIndex(currentWindow + 1)

WebUI.navigateToUrl(GlobalVariable.app_mailinator)

WebUI.delay(GlobalVariable.delay_3seconds)

WebUI.setText(findTestObject('00-Signup and Activation/zMailinator/input_LOGIN_search'), GlobalVariable.email_for_searchmailinator_testuser01)

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

WebUI.click(findTestObject('03-Header Menu/Hamburger Button/button_menu'))

WebUI.delay(GlobalVariable.delay_5seconds)

WebUI.verifyElementNotVisible(findTestObject('03-Header Menu/Hamburger Button/div_Add My Organization'), FailureHandling.STOP_ON_FAILURE)

WebUI.verifyElementNotVisible(findTestObject('03-Header Menu/Hamburger Button/div_Dashboard'), FailureHandling.STOP_ON_FAILURE)

WebUI.verifyElementNotVisible(findTestObject('03-Header Menu/Hamburger Button/div_Chat'), FailureHandling.STOP_ON_FAILURE)

WebUI.verifyElementNotVisible(findTestObject('03-Header Menu/Hamburger Button/div_Teams'), FailureHandling.STOP_ON_FAILURE)

WebUI.verifyElementNotVisible(findTestObject('03-Header Menu/Hamburger Button/div_Directory'), FailureHandling.STOP_ON_FAILURE)

WebUI.verifyElementNotVisible(findTestObject('03-Header Menu/Hamburger Button/div_Operation'), FailureHandling.STOP_ON_FAILURE)

WebUI.verifyElementNotVisible(findTestObject('03-Header Menu/Hamburger Button/div_Settings'), FailureHandling.STOP_ON_FAILURE)

WebUI.verifyElementNotVisible(findTestObject('03-Header Menu/Hamburger Button/div_Open Video Conference'), FailureHandling.STOP_ON_FAILURE)

WebUI.verifyElementNotVisible(findTestObject('03-Header Menu/Hamburger Button/div_Cloud Files'), FailureHandling.STOP_ON_FAILURE)

WebUI.verifyElementNotVisible(findTestObject('03-Header Menu/Hamburger Button/div_ELSign'), FailureHandling.STOP_ON_FAILURE)

WebUI.verifyElementNotVisible(findTestObject('03-Header Menu/Hamburger Button/div_Income and Expense'), FailureHandling.STOP_ON_FAILURE)

WebUI.verifyElementNotVisible(findTestObject('03-Header Menu/Hamburger Button/div_ELNet'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyElementNotVisible(findTestObject('03-Header Menu/Hamburger Button/div_Help'), FailureHandling.STOP_ON_FAILURE)

WebUI.delay(GlobalVariable.delay_5seconds)

WebUI.click(findTestObject('03-Header Menu/Hamburger Button/button_menu'))

WebUI.verifyElementVisible(findTestObject('03-Header Menu/Hamburger Button/div_Add My Organization'), FailureHandling.STOP_ON_FAILURE)

WebUI.verifyElementVisible(findTestObject('03-Header Menu/Hamburger Button/div_Dashboard'), FailureHandling.STOP_ON_FAILURE)

WebUI.verifyElementVisible(findTestObject('03-Header Menu/Hamburger Button/div_Chat'), FailureHandling.STOP_ON_FAILURE)

WebUI.verifyElementVisible(findTestObject('03-Header Menu/Hamburger Button/div_Teams'), FailureHandling.STOP_ON_FAILURE)

WebUI.verifyElementVisible(findTestObject('03-Header Menu/Hamburger Button/div_Directory'), FailureHandling.STOP_ON_FAILURE)

WebUI.verifyElementVisible(findTestObject('03-Header Menu/Hamburger Button/div_Operation'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyElementVisible(findTestObject('03-Header Menu/Hamburger Button/div_Settings'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyElementVisible(findTestObject('03-Header Menu/Hamburger Button/div_Open Video Conference'), FailureHandling.STOP_ON_FAILURE)

WebUI.verifyElementVisible(findTestObject('03-Header Menu/Hamburger Button/div_Cloud Files'), FailureHandling.STOP_ON_FAILURE)

WebUI.scrollToElement(findTestObject('03-Header Menu/Hamburger Button/div_ELSign'), 0)

WebUI.verifyElementVisible(findTestObject('03-Header Menu/Hamburger Button/div_ELSign'), FailureHandling.STOP_ON_FAILURE)

WebUI.verifyElementVisible(findTestObject('03-Header Menu/Hamburger Button/div_Income and Expense'), FailureHandling.STOP_ON_FAILURE)

WebUI.verifyElementVisible(findTestObject('03-Header Menu/Hamburger Button/div_ELNet'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyElementVisible(findTestObject('03-Header Menu/Hamburger Button/div_Help'), FailureHandling.STOP_ON_FAILURE)

WebUI.scrollToElement(findTestObject('03-Header Menu/Hamburger Button/div_Dashboard'), 0)

WebUI.delay(GlobalVariable.delay_3seconds)

