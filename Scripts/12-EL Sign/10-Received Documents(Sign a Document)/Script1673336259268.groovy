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
import org.openqa.selenium.WebDriver as WebDriver
import com.kms.katalon.core.webui.driver.DriverFactory as DriverFactory

WebUI.openBrowser('')

WebUI.navigateToUrl(GlobalVariable.appURL)

WebUI.maximizeWindow()

WebUI.callTestCase(findTestCase('01-Login and Forgot Password/04-Login(Valid Credentials-With Subscription)'), [:], FailureHandling.STOP_ON_FAILURE)

//WebUI.setText(findTestObject('02-Side Icons(Organization)/Add Contact/Email Field'), 'testuser02@mailinator.com')
//WebUI.setEncryptedText(findTestObject('02-Side Icons(Organization)/Add Contact/Password Field'), '8yFRyszE6U6jvsCn51OQbg==')
//WebUI.click(findTestObject('02-Side Icons(Organization)/Add Contact/button_Sign in'))
//WebUI.delay(2)
//WebUI.click(findTestObject('06-Teams/For 2FA/button_Confirm_2FA'))
//WebUI.delay(2)
//WebUI.executeJavaScript('window.open();', [])
//currentWindow = WebUI.getWindowIndex()
//WebUI.delay(3)
//WebUI.switchToWindowIndex(currentWindow + 1)
//WebUI.navigateToUrl('https://www.mailinator.com/')
//WebUI.delay(3)
//WebUI.setText(findTestObject('00-Signup and Activation/zMailinator/input_LOGIN_search'), 'testuser02@mailinator.com')
//WebUI.click(findTestObject('00-Signup and Activation/zMailinator/gobutton'), FailureHandling.STOP_ON_FAILURE)
//WebUI.delay(3)
//WebUI.click(findTestObject('00-Signup and Activation/zMailinator/Email - everleagues'))
//WebUI.delay(3)
//String code = WebUI.getText(findTestObject('Object Repository/06-Teams/For 2FA/2FA code'))
//WebUI.delay(3)
//WebUI.closeWindowTitle('Mailinator')
//WebUI.delay(3)
//WebUI.switchToWindowIndex(0)
//WebUI.delay(3)
//WebUI.setText(findTestObject('Object Repository/06-Teams/For 2FA/input_Enter verification code_code'), code)
//WebUI.delay(3)
//WebUI.click(findTestObject('06-Teams/For 2FA/button_Verify_2FA'))
//WebUI.delay(5)
WebUI.click(findTestObject('06-Teams/button_doublearrow'))

WebUI.click(findTestObject('06-Teams/button_My Organizations'))

WebUI.click(findTestObject('02-Side Icons(Organization)/Add Contact/button_Automation Test Org'))

WebUI.delay(GlobalVariable.delay_4seconds)

WebUI.verifyElementVisible(findTestObject('02-Side Icons(Organization)/Add Contact/span_Automation Test Org'))

WebUI.delay(GlobalVariable.delay_5seconds)

WebUI.scrollToElement(findTestObject('03-Header Menu/Hamburger Button/div_ELSign'), 0)

WebUI.click(findTestObject('03-Header Menu/Hamburger Button/div_ELSign'))

WebUI.verifyElementVisible(findTestObject('03-Header Menu/Hamburger Button/div_ELSign'))

WebUI.verifyElementVisible(findTestObject('12-EL Sign/h4_ELSign'))

WebUI.delay(GlobalVariable.delay_3seconds)

WebUI.click(findTestObject('12-EL Sign/div_Received Documents'))

WebUI.delay(GlobalVariable.delay_3seconds)

WebUI.click(findTestObject('12-EL Sign/button_create'))

WebUI.delay(GlobalVariable.delay_3seconds)

WebUI.verifyElementVisible(findTestObject('12-EL Sign/div_EL Sign Consent'))

WebUI.delay(GlobalVariable.delay_3seconds)

WebUI.click(findTestObject('12-EL Sign/checkbox_I have read and agree to the above'))

WebUI.delay(GlobalVariable.delay_3seconds)

WebUI.click(findTestObject('12-EL Sign/button_BEGIN'))

WebUI.delay(GlobalVariable.delay_3seconds)

WebUI.click(findTestObject('12-EL Sign/div_date'))

WebUI.click(findTestObject('12-EL Sign/div_date'))

WebUI.delay(GlobalVariable.delay_3seconds)

WebUI.click(findTestObject('12-EL Sign/div_initial'))

WebUI.verifyElementVisible(findTestObject('12-EL Sign/mat-dialog-container_InitialModal'))

WebUI.click(findTestObject('12-EL Sign/button_Save3'))

WebUI.delay(GlobalVariable.delay_3seconds)

WebUI.click(findTestObject('12-EL Sign/div_signature'))

WebUI.verifyElementVisible(findTestObject('12-EL Sign/mat-dialog-container_SignatureSettingsModal'))

WebUI.click(findTestObject('12-EL Sign/checkbox_type'))

WebUI.setAlertText('GG TESTER Signature')

//WebDriver driver = DriverFactory.getWebDriver()
//driver.switchTo().alert().sendKeys('GG TESTER-')
WebUI.acceptAlert()

WebUI.click(findTestObject('12-EL Sign/button_save Save Settings'))

WebUI.delay(GlobalVariable.delay_3seconds)

WebUI.click(findTestObject('12-EL Sign/div_signature2'))

CustomKeywords.'uploadpackage.Upload.uploadFile'(findTestObject('12-EL Sign/div_upload_mat-checkbox'), GlobalVariable.upload_file)

WebUI.delay(GlobalVariable.delay_3seconds)

WebUI.click(findTestObject('12-EL Sign/button_save Save Settings'))

WebUI.delay(GlobalVariable.delay_3seconds)

WebUI.click(findTestObject('12-EL Sign/button_completenavigate_next'))

WebUI.delay(GlobalVariable.delay_3seconds)

WebUI.verifyElementVisible(findTestObject('12-EL Sign/font_Please review and press the submit button to finish signing'))

WebUI.click(findTestObject('12-EL Sign/button_REVIEW'))

WebUI.switchToWindowIndex(1)

WebUI.closeWindowIndex(1)

WebUI.switchToWindowIndex(0)

WebUI.click(findTestObject('12-EL Sign/button_EDIT'))

WebUI.delay(GlobalVariable.delay_3seconds)

WebUI.click(findTestObject('12-EL Sign/button_completenavigate_next'))

WebUI.delay(GlobalVariable.delay_3seconds)

WebUI.click(findTestObject('12-EL Sign/button_SUBMIT'))

