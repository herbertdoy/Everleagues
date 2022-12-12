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

WebUI.delay(2)

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

WebUI.click(findTestObject('02-Side Icons(Organization)/Add Contact/button_Automation Test Org'))

WebUI.delay(4)

WebUI.verifyElementVisible(findTestObject('02-Side Icons(Organization)/Add Contact/span_Automation Test Org'))

WebUI.delay(5)

WebUI.click(findTestObject('03-Header Menu/Hamburger Button/div_ELSign'))

WebUI.verifyElementVisible(findTestObject('03-Header Menu/Hamburger Button/div_ELSign'))

WebUI.verifyElementVisible(findTestObject('12-EL Sign/h4_ELSign'))

WebUI.delay(3)

//WebUI.click(findTestObject('12-EL Sign/button_homeELSIGN DOCUMENTS'))
//WebUI.delay(1)
WebUI.click(findTestObject('12-EL Sign/button_addELSIGN DOCUMENTS'))

WebUI.delay(1)

WebUI.click(findTestObject('12-EL Sign/button_homeELSIGN DOCUMENTS'))

WebUI.click(findTestObject('12-EL Sign/mat-icon_refresh'))

WebUI.delay(3)

WebUI.click(findTestObject('12-EL Sign/mat-icon_configureColumns'))

WebUI.click(findTestObject('12-EL Sign/mat-dialog-container_configureColumnModal'))

//WebUI.click(findTestObject('12-EL Sign/span_Download'))

WebUI.click(findTestObject('12-EL Sign/span_ELSign Tracking Id'))

WebUI.click(findTestObject('12-EL Sign/span_Document Name'))

WebUI.click(findTestObject('12-EL Sign/span_Status'))

WebUI.click(findTestObject('12-EL Sign/span_Signer Status'))

WebUI.click(findTestObject('12-EL Sign/span_View'))

WebUI.click(findTestObject('12-EL Sign/span_Certificate'))

WebUI.click(findTestObject('12-EL Sign/span_Delete'))

WebUI.click(findTestObject('12-EL Sign/span_History'))

WebUI.click(findTestObject('12-EL Sign/span_Reminder'))

WebUI.click(findTestObject('12-EL Sign/span_Last Modified'))

WebUI.delay(3)

WebUI.click(findTestObject('12-EL Sign/span_ELSign Tracking Id'))

WebUI.click(findTestObject('12-EL Sign/span_Document Name'))

WebUI.click(findTestObject('12-EL Sign/span_Status'))

WebUI.click(findTestObject('12-EL Sign/span_Signer Status'))

WebUI.click(findTestObject('12-EL Sign/span_View'))

WebUI.click(findTestObject('12-EL Sign/span_Download'))

WebUI.click(findTestObject('12-EL Sign/span_Certificate'))

WebUI.click(findTestObject('12-EL Sign/span_Delete'))

WebUI.click(findTestObject('12-EL Sign/span_History'))

WebUI.click(findTestObject('12-EL Sign/span_Reminder'))

WebUI.click(findTestObject('12-EL Sign/span_Last Modified'))

WebUI.delay(3)

WebUI.click(findTestObject('12-EL Sign/button_CLOSE'))

WebUI.delay(3)

WebUI.click(findTestObject('12-EL Sign/mat-icon_exportCSV'))

WebUI.delay(3)

WebUI.click(findTestObject('12-EL Sign/mat-icon_expandAll'))

WebUI.delay(3)

WebUI.click(findTestObject('12-EL Sign/mat-icon_refit'))

WebUI.delay(3)

