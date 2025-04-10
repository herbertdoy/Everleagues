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

WebUI.navigateToUrl(GlobalVariable.URL_lab)

WebUI.maximizeWindow()

WebUI.callTestCase(findTestCase('01 - Login and Forgot Password/04 - Login(Valid Credentials-testuser00005)'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('06-Teams/button_doublearrow'))

WebUI.click(findTestObject('06-Teams/button_My Organizations'))

WebUI.click(findTestObject('06-Teams/button_GG Automation'))

WebUI.delay(GlobalVariable.delay_3s)

WebUI.verifyElementVisible(findTestObject('06-Teams/span_GG Automation'))

WebUI.delay(GlobalVariable.delay_2s)

WebUI.click(findTestObject('03-Header Menu/div_Settings'))

WebUI.delay(GlobalVariable.delay_2s)

WebUI.click(findTestObject('09-Settings/Users/div_Organization'))

WebUI.verifyElementVisible(findTestObject('09-Settings/Organization/h4_ORGANIZATION SETTINGS'))

WebUI.click(findTestObject('09-Settings/Organization/div_Profile'))

WebUI.delay(GlobalVariable.delay_3s)

WebUI.verifyElementVisible(findTestObject('09-Settings/Organization/mat-card-title_Profile'))

WebUI.verifyElementVisible(findTestObject('09-Settings/Organization/input_Industry'))

WebUI.verifyElementVisible(findTestObject('09-Settings/Organization/input_Organization number'))

WebUI.delay(GlobalVariable.delay_2s)

WebUI.click(findTestObject('03-Header Menu/User Profile/View Profile/Profile Tab/Upload Icon'))

WebUI.delay(GlobalVariable.delay_2s)

WebUI.verifyElementVisible(findTestObject('09-Settings/Organization/Upload Org image'))

WebUI.verifyElementNotClickable(findTestObject('03-Header Menu/User Profile/View Profile/Profile Tab/button_Upload Image'))

WebUI.delay(GlobalVariable.delay_1s)

WebUI.click(findTestObject('03-Header Menu/User Profile/View Profile/Profile Tab/button_Cancel'))

WebUI.delay(GlobalVariable.delay_2s)

WebUI.click(findTestObject('03-Header Menu/User Profile/View Profile/Profile Tab/Upload Icon'))

CustomKeywords.'uploadpackage.Upload.uploadFile'(findTestObject('Object Repository/03-Header Menu/User Profile/View Profile/Profile Tab/button_folderBrowse'), 
    GlobalVariable.upload_file)

WebUI.delay(GlobalVariable.delay_2s)

WebUI.click(findTestObject('03-Header Menu/User Profile/View Profile/Profile Tab/button_Upload Image'))

WebUI.verifyElementVisible(findTestObject('09-Settings/Organization/snack-bar-container_Successfully changed organization imageOK'))

WebUI.click(findTestObject('09-Settings/Organization/input_name'))

WebUI.setText(findTestObject('09-Settings/Organization/input_name'), name)

WebUI.delay(GlobalVariable.delay_2s)

WebUI.click(findTestObject('09-Settings/Users/Active User/button_Save'))

WebUI.delay(GlobalVariable.delay_1s)

WebUI.verifyElementVisible(findTestObject('09-Settings/Organization/snack-bar-container_Settings savedOK'))

WebUI.delay(GlobalVariable.delay_2s)

WebUI.scrollToElement(findTestObject('09-Settings/Organization/input_name'), 0)

WebUI.setText(findTestObject('09-Settings/Organization/input_name'), name_org)

WebUI.delay(GlobalVariable.delay_2s)

WebUI.scrollToElement(findTestObject('09-Settings/Users/Active User/button_Save'), 0)

WebUI.click(findTestObject('09-Settings/Users/Active User/button_Save'))

WebUI.delay(GlobalVariable.delay_2s)

WebUI.verifyElementVisible(findTestObject('09-Settings/Organization/mat-card-title_Address'))

WebUI.scrollToElement(findTestObject('09-Settings/Organization/mat-card_Address'), 0)

WebUI.verifyElementVisible(findTestObject('09-Settings/Organization/mat-card_Address'))

WebUI.setText(findTestObject('09-Settings/Organization/input_Street'), street_name)

WebUI.setText(findTestObject('09-Settings/Organization/input_City'), city_name)

WebUI.setText(findTestObject('09-Settings/Organization/input_Zip'), zip_name)

WebUI.setText(findTestObject('09-Settings/Organization/input_State'), state_name)

WebUI.click(findTestObject('09-Settings/Organization/input_Country'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('09-Settings/Organization/mat-option_united states'), FailureHandling.STOP_ON_FAILURE)

WebUI.delay(GlobalVariable.delay_2s)

WebUI.scrollToElement(findTestObject('09-Settings/Users/Active User/button_Save'), 0)

WebUI.click(findTestObject('09-Settings/Users/Active User/button_Save'))

WebUI.delay(GlobalVariable.delay_1s)

WebUI.verifyElementVisible(findTestObject('09-Settings/Organization/snack-bar-container_Settings savedOK'))

WebUI.delay(GlobalVariable.delay_2s)

WebUI.setText(findTestObject('09-Settings/Organization/input_Street'), street_nameEdit)

WebUI.setText(findTestObject('09-Settings/Organization/input_City'), city_nameEdit)

WebUI.setText(findTestObject('09-Settings/Organization/input_Zip'), zip_nameEdit)

WebUI.setText(findTestObject('09-Settings/Organization/input_State'), state_nameEdit)

WebUI.delay(GlobalVariable.delay_2s)

WebUI.scrollToElement(findTestObject('09-Settings/Users/Active User/button_Save'), 0)

WebUI.click(findTestObject('09-Settings/Users/Active User/button_Save'))

WebUI.delay(GlobalVariable.delay_3s)

WebUI.verifyElementVisible(findTestObject('09-Settings/Organization/mat-card-title_Contact'))

WebUI.verifyElementVisible(findTestObject('09-Settings/Organization/mat-card_Contact'))

WebUI.setText(findTestObject('09-Settings/Organization/input_Email'), GlobalVariable.Y_email_withoutSubscription_testuser01)

WebUI.setText(findTestObject('09-Settings/Organization/input_Web'), web_link)

WebUI.click(findTestObject('09-Settings/Organization/button_Phone'))

WebUI.click(findTestObject('09-Settings/Organization/button_93'))

WebUI.setText(findTestObject('09-Settings/Organization/input_phone search'), phone_code)

WebUI.click(findTestObject('09-Settings/Organization/button_Philippines 63'))

WebUI.setText(findTestObject('09-Settings/Organization/input_phone'), phone_number)

WebUI.click(findTestObject('09-Settings/Organization/button_fax'))

WebUI.click(findTestObject('09-Settings/Organization/button_93'))

WebUI.setText(findTestObject('09-Settings/Organization/input_phone search'), phone_code)

WebUI.click(findTestObject('09-Settings/Organization/button_Philippines 63'))

WebUI.setText(findTestObject('09-Settings/Organization/input_fax'), fax_number)

WebUI.delay(GlobalVariable.delay_2s)

WebUI.click(findTestObject('09-Settings/Users/Active User/button_Save'))

WebUI.delay(GlobalVariable.delay_1s)

WebUI.verifyElementVisible(findTestObject('09-Settings/Organization/snack-bar-container_Settings savedOK'))

WebUI.delay(GlobalVariable.delay_2s)

WebUI.setText(findTestObject('09-Settings/Organization/input_Email'), emailEdit)

WebUI.setText(findTestObject('09-Settings/Organization/input_Web'), web_linkEdit)

WebUI.setText(findTestObject('09-Settings/Organization/input_phone'), phoneNumberEdit)

WebUI.setText(findTestObject('09-Settings/Organization/input_fax'), faxEdit)

WebUI.delay(GlobalVariable.delay_2s)

WebUI.click(findTestObject('09-Settings/Users/Active User/button_Save'))

WebUI.delay(GlobalVariable.delay_2s)

WebUI.scrollToElement(findTestObject('09-Settings/Organization/div_Profile'), 0)

