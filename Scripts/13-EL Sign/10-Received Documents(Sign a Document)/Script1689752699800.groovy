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

WebUI.navigateToUrl(GlobalVariable.URL_lab)

WebUI.maximizeWindow()

WebUI.callTestCase(findTestCase('01-Login and Forgot Password/04-Login(Valid Credentials-With Subscription)'), [:], FailureHandling.STOP_ON_FAILURE)

//WebUI.setText(findTestObject('02-Side Icons(Organization)/input_Email Field'), 'testuser02@mailinator.com')
//WebUI.setEncryptedText(findTestObject('02-Side Icons(Organization)/input_Password Field'), '8yFRyszE6U6jvsCn51OQbg==')
//WebUI.click(findTestObject('02-Side Icons(Organization)/button_Sign in'))
//WebUI.delay(2)
//WebUI.click(findTestObject('06-Teams/For 2FA/button_Confirm_2FA'))
//WebUI.delay(2)
//WebUI.executeJavaScript('window.open();', [])
//currentWindow = WebUI.getWindowIndex()
//WebUI.delay(3)
//WebUI.switchToWindowIndex(currentWindow + 1)
//WebUI.navigateToUrl('https://www.mailinator.com/')
//WebUI.delay(3)
//WebUI.setText(findTestObject('Mailinator/input_LOGIN_search'), 'testuser02@mailinator.com')
//WebUI.click(findTestObject('Mailinator/gobutton'), FailureHandling.STOP_ON_FAILURE)
//WebUI.delay(3)
//WebUI.click(findTestObject('Mailinator/Email - everleagues'))
//WebUI.delay(3)
//String code = WebUI.getText(findTestObject('Object Repository/06-Teams/For 2FA/2FA code'))
//WebUI.delay(3)
//WebUI.closeWindowTitle('Mailinator')
//WebUI.delay(3)
//WebUI.switchToWindowIndex(0)
//WebUI.delay(3)
//WebUI.setText(findTestObject('Object Repository/06-Teams/For 2FA/input_Enter verification code'), code)
//WebUI.delay(3)
//WebUI.click(findTestObject('06-Teams/For 2FA/button_Verify_2FA'))
//WebUI.delay(5)
WebUI.click(findTestObject('06-Teams/button_doublearrow'))

WebUI.click(findTestObject('06-Teams/button_My Organizations'))

WebUI.click(findTestObject('02-Side Icons(Organization)/button_Automation Test Org'))

WebUI.delay(GlobalVariable.delay_3s)

WebUI.verifyElementVisible(findTestObject('02-Side Icons(Organization)/span_Automation Test Org (1)'))

WebUI.delay(GlobalVariable.delay_2s)

WebUI.scrollToElement(findTestObject('03-Header Menu/div_ELSign'), 0)

WebUI.click(findTestObject('03-Header Menu/div_ELSign'))

WebUI.verifyElementVisible(findTestObject('03-Header Menu/div_ELSign'))

WebUI.verifyElementVisible(findTestObject('13-EL Sign/h4_ELSign'))

WebUI.delay(GlobalVariable.delay_2s)

WebUI.click(findTestObject('13-EL Sign/div_Received Documents'))

WebUI.delay(GlobalVariable.delay_2s)

WebUI.click(findTestObject('13-EL Sign/button_create'))

WebUI.delay(GlobalVariable.delay_3s)

WebUI.verifyElementVisible(findTestObject('13-EL Sign/div_EL Sign Consent'))

WebUI.delay(GlobalVariable.delay_2s)

WebUI.click(findTestObject('13-EL Sign/checkbox_I have read and agree to the above'))

WebUI.delay(GlobalVariable.delay_2s)

WebUI.click(findTestObject('13-EL Sign/button_BEGIN'))

WebUI.delay(GlobalVariable.delay_2s)

WebUI.click(findTestObject('13-EL Sign/div_date'))

WebUI.delay(GlobalVariable.delay_2s)

WebUI.click(findTestObject('13-EL Sign/div_date'))

WebUI.click(findTestObject('13-EL Sign/div_initial'))

WebUI.verifyElementVisible(findTestObject('13-EL Sign/mat-dialog-container_InitialModal'))

WebUI.delay(GlobalVariable.delay_2s)

WebUI.setText(findTestObject('13-EL Sign/input_Initial'), 'GT Initial')

WebUI.delay(GlobalVariable.delay_2s)

WebUI.click(findTestObject('13-EL Sign/button_Save3'))

WebUI.delay(GlobalVariable.delay_2s)

WebUI.click(findTestObject('13-EL Sign/div_signature'))

WebUI.verifyElementVisible(findTestObject('13-EL Sign/mat-dialog-container_SignatureSettingsModal'))

//WebUI.click(findTestObject('13-EL Sign/checkbox_type2'))
WebUI.click(findTestObject('13-EL Sign/checkbox_type'))

WebUI.setAlertText('GG TESTER Signature')

//WebDriver driver = DriverFactory.getWebDriver()
//driver.switchTo().alert().sendKeys('GG TESTER-')
WebUI.acceptAlert()

WebUI.click(findTestObject('13-EL Sign/button_save Save Settings'))

WebUI.delay(GlobalVariable.delay_2s)

WebUI.click(findTestObject('13-EL Sign/div_signature2'))

CustomKeywords.'com.kms.katalon.keyword.uploadfile.UploadFile.uploadFile'(findTestObject('13-EL Sign/div_upload_mat-checkbox'), 
    GlobalVariable.upload_file)

WebUI.delay(GlobalVariable.delay_2s)

WebUI.click(findTestObject('13-EL Sign/button_save Save Settings'))

WebUI.delay(GlobalVariable.delay_2s)

WebUI.click(findTestObject('13-EL Sign/button_completenavigate_next'))

WebUI.delay(GlobalVariable.delay_2s)

WebUI.verifyElementVisible(findTestObject('13-EL Sign/font_Please review and press the submit button to finish signing'))

WebUI.click(findTestObject('13-EL Sign/button_REVIEW'))

WebUI.delay(GlobalVariable.delay_2s)

WebUI.switchToWindowIndex(1)

WebUI.delay(GlobalVariable.delay_2s)

WebUI.closeWindowIndex(1)

WebUI.delay(GlobalVariable.delay_2s)

WebUI.switchToWindowIndex(0)

WebUI.click(findTestObject('13-EL Sign/button_EDIT'))

WebUI.delay(GlobalVariable.delay_2s)

WebUI.click(findTestObject('13-EL Sign/button_completenavigate_next'))

WebUI.delay(GlobalVariable.delay_2s)

WebUI.click(findTestObject('13-EL Sign/button_SUBMIT'))

