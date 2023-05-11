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

//WebUI.setText(findTestObject('02-Side Icons(Organization)/Add Contact/Email Field'), 'testuser02@mailinator.com')
//
//WebUI.setEncryptedText(findTestObject('02-Side Icons(Organization)/Add Contact/Password Field'), '8yFRyszE6U6jvsCn51OQbg==')
//
//WebUI.click(findTestObject('02-Side Icons(Organization)/Add Contact/button_Sign in'))
//
//WebUI.delay(2)
//
//WebUI.click(findTestObject('06-Teams/For 2FA/button_Confirm_2FA'))
//
//WebUI.executeJavaScript('window.open();', [])
//
//currentWindow = WebUI.getWindowIndex()
//
//WebUI.delay(3)
//
//WebUI.switchToWindowIndex(currentWindow + 1)
//
//WebUI.navigateToUrl('https://www.mailinator.com/')
//
//WebUI.delay(3)
//
//WebUI.setText(findTestObject('00-Signup and Activation/zMailinator/input_LOGIN_search'), 'testuser02@mailinator.com')
//
//WebUI.click(findTestObject('00-Signup and Activation/zMailinator/gobutton'), FailureHandling.STOP_ON_FAILURE)
//
//WebUI.delay(3)
//
//WebUI.click(findTestObject('00-Signup and Activation/zMailinator/Email - everleagues'))
//
//WebUI.delay(3)
//
//String code = WebUI.getText(findTestObject('Object Repository/06-Teams/For 2FA/2FA code'))
//
//WebUI.delay(3)
//
//WebUI.closeWindowTitle('Mailinator')
//
//WebUI.delay(3)
//
//WebUI.switchToWindowIndex(0)
//
//WebUI.delay(3)
//
//WebUI.setText(findTestObject('Object Repository/06-Teams/For 2FA/input_Enter verification code_code'), code)
//
//WebUI.delay(3)
//
//WebUI.click(findTestObject('06-Teams/For 2FA/button_Verify_2FA'))
//
//WebUI.delay(5)
WebUI.click(findTestObject('06-Teams/button_doublearrow'))

WebUI.click(findTestObject('06-Teams/button_My Organizations'))

WebUI.click(findTestObject('06-Teams/button_GG Automation'))

WebUI.delay(GlobalVariable.delay_3seconds)

WebUI.verifyElementVisible(findTestObject('06-Teams/span_GG Automation'))

WebUI.delay(GlobalVariable.delay_4seconds)

WebUI.click(findTestObject('03-Header Menu/Hamburger Button/div_Settings'))

//WebUI.verifyElementVisible(findTestObject('09-Settings/Users/div_Organization'))
//
//WebUI.verifyElementVisible(findTestObject('09-Settings/Users/div_Organization Units'))
//
//WebUI.scrollToElement(findTestObject('09-Settings/Users/div_Subscriptions'), 0)
//
//WebUI.verifyElementVisible(findTestObject('09-Settings/Users/div_Subscriptions'))
//
//WebUI.verifyElementVisible(findTestObject('09-Settings/Users/div_Users'))
WebUI.delay(GlobalVariable.delay_3seconds)

WebUI.scrollToElement(findTestObject('09-Settings/Users/div_Organization Units'), 0)

WebUI.click(findTestObject('09-Settings/Users/div_Organization Units'))

WebUI.verifyElementVisible(findTestObject('09-Settings/Organization unit/h4_ORGANIZATION STRUCTURE SETUP'))

//WebUI.verifyElementVisible(findTestObject('09-Settings/Users/User Page'))
WebUI.delay(GlobalVariable.delay_3seconds)

WebUI.click(findTestObject('09-Settings/Organization unit/button_add'))

WebUI.verifyElementPresent(findTestObject('09-Settings/Organization unit/mat-dialog-container_Add organization unit modal'), 
    0)

WebUI.verifyElementPresent(findTestObject('09-Settings/Organization unit/h4_Name'), 0)

WebUI.click(findTestObject('09-Settings/Organization unit/mat-icon_create'))

WebUI.verifyElementPresent(findTestObject('09-Settings/Organization unit/mat-dialog-container_Select an organization unit modal'), 
    0)

WebUI.verifyElementPresent(findTestObject('09-Settings/Organization unit/h4_Select an organization unit'), 0)

WebUI.delay(GlobalVariable.delay_3seconds)

WebUI.click(findTestObject('09-Settings/Organization unit/Cancel button for select an organization unit'))

WebUI.delay(GlobalVariable.delay_3seconds)

//WebUI.verifyElementPresent(findTestObject('09-Settings/Organization unit/h4_Name'), 0)
WebUI.click(findTestObject('09-Settings/Organization unit/input_Parent Organization Unit Name_orgName'))

WebUI.click(findTestObject('09-Settings/Organization unit/mat-dialog-container_Add organization unit modal'))

WebUI.verifyElementPresent(findTestObject('09-Settings/Organization unit/mat-error_Field is required'), 0)

WebUI.delay(GlobalVariable.delay_3seconds)

WebUI.click(findTestObject('09-Settings/Users/Active User/button_Cancel_restore'))

WebUI.delay(GlobalVariable.delay_3seconds)

WebUI.click(findTestObject('09-Settings/Organization unit/button_add'))

WebUI.verifyElementPresent(findTestObject('09-Settings/Organization unit/mat-dialog-container_Add organization unit modal'), 
    0)

//WebUI.verifyElementPresent(findTestObject('09-Settings/Organization unit/h4_Name'), 0)
WebUI.click(findTestObject('09-Settings/Organization unit/mat-icon_create'))

WebUI.verifyElementPresent(findTestObject('09-Settings/Organization unit/mat-dialog-container_Select an organization unit modal'), 
    0)

WebUI.verifyElementPresent(findTestObject('09-Settings/Organization unit/h4_Select an organization unit'), 0)

WebUI.click(findTestObject('09-Settings/Organization unit/div_GG Automation'))

WebUI.delay(GlobalVariable.delay_3seconds)

WebUI.click(findTestObject('09-Settings/Organization unit/button_Select organization'))

WebUI.setText(findTestObject('09-Settings/Organization unit/input_Parent Organization Unit Name_orgName'), GlobalVariable.org_unit)

WebUI.delay(GlobalVariable.delay_3seconds)

WebUI.click(findTestObject('09-Settings/Users/Active User/button_Save'))

WebUI.verifyElementPresent(findTestObject('09-Settings/Organization unit/span_Successfully added organization unit'), 0)

WebUI.delay(GlobalVariable.delay_3seconds)

