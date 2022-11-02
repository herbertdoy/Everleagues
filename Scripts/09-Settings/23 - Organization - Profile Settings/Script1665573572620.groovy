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

WebUI.verifyElementVisible(findTestObject('09-Settings/Users/div_Organization'))

WebUI.verifyElementVisible(findTestObject('09-Settings/Users/div_Organization Units'))

WebUI.verifyElementVisible(findTestObject('09-Settings/Users/div_Subscriptions'))

WebUI.verifyElementVisible(findTestObject('09-Settings/Users/div_Users'))

WebUI.delay(3)

WebUI.click(findTestObject('09-Settings/Users/div_Organization'))

WebUI.verifyElementVisible(findTestObject('09-Settings/Organization/h4_ORGANIZATION SETTINGS'))

WebUI.click(findTestObject('09-Settings/Organization/div_Profile'))

WebUI.verifyElementVisible(findTestObject('09-Settings/Organization/div_ProfileSettings page'))

//WebUI.verifyElementVisible(findTestObject('09-Settings/Users/User Page'))
WebUI.delay(3)

WebUI.verifyElementVisible(findTestObject('09-Settings/Organization/mat-card-title_Profile'))

WebUI.verifyElementVisible(findTestObject('09-Settings/Organization/input_Industry'))

WebUI.verifyElementVisible(findTestObject('09-Settings/Organization/input_Organization number'))

WebUI.delay(3)

WebUI.click(findTestObject('03-Header Menu/User Profile/View Profile/Profile Tab/Upload Icon'))

WebUI.delay(2)

WebUI.verifyElementVisible(findTestObject('03-Header Menu/User Profile/View Profile/Profile Tab/Upload User Image modal'))

WebUI.verifyElementNotClickable(findTestObject('03-Header Menu/User Profile/View Profile/Profile Tab/button_Upload Image'))

WebUI.delay(1)

WebUI.click(findTestObject('03-Header Menu/User Profile/View Profile/Profile Tab/button_Cancel'))

WebUI.delay(3)

WebUI.click(findTestObject('03-Header Menu/User Profile/View Profile/Profile Tab/Upload Icon'))

CustomKeywords.'uploadpackage.Upload.uploadFile'(findTestObject('Object Repository/03-Header Menu/User Profile/View Profile/Profile Tab/button_folderBrowse'), 
    'C:\\Users\\User\\Desktop\\EL automation\\qa.jpg')

WebUI.delay(2)

WebUI.click(findTestObject('03-Header Menu/User Profile/View Profile/Profile Tab/button_Upload Image'))

WebUI.verifyElementVisible(findTestObject('09-Settings/Organization/snack-bar-container_Successfully changed organization imageOK'))

WebUI.click(findTestObject('09-Settings/Organization/input_name'))

WebUI.setText(findTestObject('09-Settings/Organization/input_name'), 'THIS IS AUTOMATION')

WebUI.delay(3)

WebUI.click(findTestObject('09-Settings/Users/Active User/button_Save'))

WebUI.verifyElementVisible(findTestObject('09-Settings/Organization/snack-bar-container_Settings savedOK'))

WebUI.delay(3)

WebUI.click(findTestObject('09-Settings/Organization/input_name'))

WebUI.setText(findTestObject('09-Settings/Organization/input_name'), 'GG Automation')

WebUI.delay(3)

WebUI.click(findTestObject('09-Settings/Users/Active User/button_Save'))

WebUI.verifyElementVisible(findTestObject('09-Settings/Organization/snack-bar-container_Settings savedOK'))

WebUI.delay(3)

WebUI.verifyElementVisible(findTestObject('09-Settings/Organization/mat-card_Address'))

WebUI.verifyElementVisible(findTestObject('09-Settings/Organization/mat-card-title_Address'))

WebUI.setText(findTestObject('09-Settings/Organization/input_Street'), '4711 Hardy Street')

WebUI.setText(findTestObject('09-Settings/Organization/input_City'), 'Kelowna')

WebUI.setText(findTestObject('09-Settings/Organization/input_Zip'), 'V1Y 8H2')

WebUI.setText(findTestObject('09-Settings/Organization/input_State'), 'British Columbia')

WebUI.click(findTestObject('09-Settings/Organization/input_Country'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('09-Settings/Organization/mat-option_united states'), FailureHandling.STOP_ON_FAILURE)

WebUI.delay(3)

WebUI.click(findTestObject('09-Settings/Users/Active User/button_Save'))

WebUI.verifyElementVisible(findTestObject('09-Settings/Organization/snack-bar-container_Settings savedOK'))

WebUI.delay(3)

WebUI.verifyElementVisible(findTestObject('09-Settings/Organization/mat-card_Contact'))

WebUI.verifyElementVisible(findTestObject('09-Settings/Organization/mat-card-title_Contact'))

WebUI.setText(findTestObject('09-Settings/Organization/input_Email'), 'testuser02@mailinator.com')

WebUI.setText(findTestObject('09-Settings/Organization/input_Web'), 'https://lab.everleagues.com')

WebUI.click(findTestObject('09-Settings/Organization/button_Phone'))

WebUI.setText(findTestObject('09-Settings/Organization/input_phone search'), 'PH')

WebUI.click(findTestObject('09-Settings/Organization/button_Philippines 63'))

WebUI.setText(findTestObject('09-Settings/Organization/input_phone'), '9211234567')

WebUI.click(findTestObject('09-Settings/Organization/button_fax'))

WebUI.setText(findTestObject('09-Settings/Organization/input_phone search'), 'PH')

WebUI.click(findTestObject('09-Settings/Organization/button_Philippines 63'))

WebUI.setText(findTestObject('09-Settings/Organization/input_fax'), '9211234567')

WebUI.delay(3)

WebUI.click(findTestObject('09-Settings/Users/Active User/button_Save'))

WebUI.verifyElementVisible(findTestObject('09-Settings/Organization/snack-bar-container_Settings savedOK'))

WebUI.delay(4)

