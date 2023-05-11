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

//WebUI.openBrowser('')
//WebUI.navigateToUrl('https://lab.everleagues.com/')
//WebUI.maximizeWindow()
//WebUI.setText(findTestObject('02-Side Icons(Organization)/Add Contact/Email Field'), 'testuser02@mailinator.com')
//WebUI.setEncryptedText(findTestObject('02-Side Icons(Organization)/Add Contact/Password Field'), '8yFRyszE6U6jvsCn51OQbg==')
//WebUI.click(findTestObject('02-Side Icons(Organization)/Add Contact/button_Sign in'))
//WebUI.delay(2)
//WebUI.click(findTestObject('06-Teams/For 2FA/button_Confirm_2FA'))
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
//WebUI.click(findTestObject('06-Teams/button_doublearrow'))
//WebUI.click(findTestObject('06-Teams/button_My Organizations'))
//WebUI.click(findTestObject('02-Side Icons(Organization)/Add Contact/button_Automation Test Org'))
//WebUI.delay(4)
//WebUI.verifyElementVisible(findTestObject('02-Side Icons(Organization)/Add Contact/span_Automation Test Org'))
//WebUI.delay(10)
//WebUI.click(findTestObject('03-Header Menu/Hamburger Button/div_Cloud Files'))
//WebUI.verifyElementVisible(findTestObject('11-Cloud Files/h4_MY FILES'))
//WebUI.click(findTestObject('11-Cloud Files/a_My Drive'))
//WebUI.delay(3)
WebUI.rightClick(findTestObject('11-Cloud Files/td_Automation folder EDIT'))

WebUI.click(findTestObject('11-Cloud Files/button_Share'))

WebUI.verifyElementVisible(findTestObject('11-Cloud Files/mat-dialog-container_ShareFiles Modal'))

WebUI.click(findTestObject('11-Cloud Files/mat-icon_close'))

WebUI.delay(GlobalVariable.delay_3seconds)

WebUI.rightClick(findTestObject('11-Cloud Files/td_Automation folder EDIT'))

WebUI.click(findTestObject('11-Cloud Files/button_Share'))

WebUI.verifyElementVisible(findTestObject('11-Cloud Files/mat-dialog-container_ShareFiles Modal'))

WebUI.click(findTestObject('11-Cloud Files/input_Add Users'))

WebUI.click(findTestObject('11-Cloud Files/mat-option_GTGG tester'))

WebUI.click(findTestObject('10-Open Video Conference/mat-icon_cancel'))

WebUI.delay(GlobalVariable.delay_3seconds)

WebUI.click(findTestObject('11-Cloud Files/input_Add Users'))

WebUI.click(findTestObject('11-Cloud Files/mat-option_GTGG tester 2'))

WebUI.click(findTestObject('11-Cloud Files/mat-option_GTGG tester'))

WebUI.clickOffset(findTestObject('11-Cloud Files/button_Copy Share Link'), 10, 10)

WebUI.click(findTestObject('11-Cloud Files/div_mat-checkbox-notify-user'))

WebUI.click(findTestObject('11-Cloud Files/div_mat-checkbox-notify-user'))

WebUI.click(findTestObject('11-Cloud Files/div_dropdown'))

WebUI.click(findTestObject('11-Cloud Files/span_Viewer'))

WebUI.click(findTestObject('11-Cloud Files/button_done'))

//WebUI.verifyElementVisible(findTestObject('11-Cloud Files/snack-bar-container_Shared folder access updated successfully.OK'))
WebUI.delay(GlobalVariable.delay_3seconds)

