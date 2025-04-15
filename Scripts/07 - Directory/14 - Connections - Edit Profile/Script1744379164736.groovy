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
//
//WebUI.navigateToUrl(GlobalVariable.URL_lab)
//
//WebUI.maximizeWindow()
//
//WebUI.callTestCase(findTestCase('01 - Login and Forgot Password/04 - Login(Valid Credentials-testuser00005)'), [:], FailureHandling.STOP_ON_FAILURE)
//
//WebUI.click(findTestObject('03-Header Menu/div_Directory'))
//
//WebUI.delay(GlobalVariable.delay_2s)
//WebUI.click(findTestObject('07-Directory/Connections/div_added user'))
WebUI.delay(GlobalVariable.delay_2s)

WebUI.click(findTestObject('07-Directory/Connections/zContact Profile/btn_close'))

WebUI.delay(GlobalVariable.delay_2s)

WebUI.click(findTestObject('07-Directory/Connections/div_added user'))

WebUI.delay(GlobalVariable.delay_2s)

WebUI.click(findTestObject('07-Directory/Connections/zContact Profile/button_edit profile'))

WebUI.verifyElementVisible(findTestObject('07-Directory/Connections/zContact Profile/connection profile modal'))

WebUI.delay(GlobalVariable.delay_2s)

CustomKeywords.'uploadpackage.Upload.uploadFile'(findTestObject('07-Directory/Connections/upload'), GlobalVariable.upload_file)

WebUI.delay(GlobalVariable.delay_10s)

WebUI.click(findTestObject('07-Directory/Connections/btn_uploadImage'))

WebUI.verifyElementVisible(findTestObject('07-Directory/Connections/successMessage_changeContactProfile'))

WebUI.delay(GlobalVariable.delay_2s)

WebUI.setText(findTestObject('07-Directory/Connections/zContact Profile/input_firstName'), firstName)

WebUI.setText(findTestObject('07-Directory/Connections/zContact Profile/input_lastName'), lastName)

WebUI.delay(GlobalVariable.delay_2s)

WebUI.scrollToElement(findTestObject('07-Directory/Connections/input_phone_number'), 0)

WebUI.doubleClick(findTestObject('07-Directory/Connections/input_phone_number'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.clearText(findTestObject('07-Directory/Connections/input_phone_number'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.doubleClick(findTestObject('07-Directory/Connections/input_phone_number'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.delay(GlobalVariable.delay_2s)

WebUI.waitForElementPresent(findTestObject('07-Directory/Connections/input_phone_number'), 0)

WebUI.setText(findTestObject('07-Directory/Connections/input_phone_number'), xNumber)

WebUI.verifyElementVisible(findTestObject('07-Directory/Connections/mat-error_selectCorrectcountrycode'))

WebUI.delay(GlobalVariable.delay_2s)

WebUI.setText(findTestObject('07-Directory/Connections/input_phone_number'), cNumber)

WebUI.delay(GlobalVariable.delay_2s)

WebUI.scrollToElement(findTestObject('07-Directory/Connections/input_Type_email'), 0)

WebUI.setText(findTestObject('07-Directory/Connections/input_Type_email'), GlobalVariable.unregistered_email)

WebUI.delay(GlobalVariable.delay_2s)

WebUI.scrollToElement(findTestObject('07-Directory/Connections/zContact Profile/button_save changes'), 0)

WebUI.click(findTestObject('07-Directory/Connections/zContact Profile/button_save changes'))

WebUI.delay(GlobalVariable.delay_2s)

WebUI.click(findTestObject('07-Directory/Connections/zContact Profile/button_edit profile'))

WebUI.delay(GlobalVariable.delay_2s)

WebUI.scrollToElement(findTestObject('07-Directory/Connections/input_Type_email'), 0)

WebUI.setText(findTestObject('07-Directory/Connections/input_Type_email'), GlobalVariable.invalid_email)

WebUI.delay(GlobalVariable.delay_2s)

WebUI.scrollToElement(findTestObject('07-Directory/Connections/zContact Profile/button_save changes'), 0)

WebUI.click(findTestObject('07-Directory/Connections/zContact Profile/button_save changes'))

WebUI.verifyElementVisible(findTestObject('07-Directory/Connections/snack_invalidEmailformat'))

WebUI.delay(GlobalVariable.delay_2s)

WebUI.setText(findTestObject('07-Directory/Connections/input_Type_email'), GlobalVariable.Y_autotester02)

WebUI.delay(GlobalVariable.delay_2s)

WebUI.scrollToElement(findTestObject('07-Directory/Connections/zContact Profile/button_save changes'), 0)

WebUI.click(findTestObject('07-Directory/Connections/zContact Profile/button_save changes'))

WebUI.delay(GlobalVariable.delay_2s)

WebUI.click(findTestObject('07-Directory/Connections/zContact Profile/button_edit profile'))

WebUI.delay(GlobalVariable.delay_2s)

WebUI.setText(findTestObject('07-Directory/Connections/input_position'), position_Edit)

WebUI.delay(GlobalVariable.delay_2s)

WebUI.scrollToElement(findTestObject('07-Directory/Connections/zContact Profile/button_save changes'), 0)

WebUI.click(findTestObject('07-Directory/Connections/zContact Profile/button_save changes'))

WebUI.delay(GlobalVariable.delay_2s)

WebUI.click(findTestObject('07-Directory/Connections/zContact Profile/button_edit profile'))

WebUI.delay(GlobalVariable.delay_2s)

WebUI.scrollToElement(findTestObject('07-Directory/Connections/input_Edit Address_street1'), 0)

WebUI.setText(findTestObject('07-Directory/Connections/input_Edit Address_street1'), street1Edit)

WebUI.setText(findTestObject('07-Directory/Connections/input_Street 1_street2'), street2Edit)

WebUI.delay(GlobalVariable.delay_2s)

WebUI.scrollToElement(findTestObject('07-Directory/Connections/zContact Profile/button_save changes'), 0)

WebUI.click(findTestObject('07-Directory/Connections/zContact Profile/button_save changes'))

WebUI.delay(GlobalVariable.delay_2s)

WebUI.click(findTestObject('07-Directory/Connections/zContact Profile/button_edit profile'))

WebUI.delay(GlobalVariable.delay_2s)

WebUI.click(findTestObject('07-Directory/Connections/btn_XdeleteLabel'))

WebUI.delay(GlobalVariable.delay_2s)

WebUI.click(findTestObject('07-Directory/Connections/btn_addLabels'))

WebUI.delay(GlobalVariable.delay_2s)

WebUI.setText(findTestObject('07-Directory/Connections/input_selectLabels'), labelSearch)

WebUI.click(findTestObject('07-Directory/Connections/div_optionQALabel'))

WebUI.delay(GlobalVariable.delay_2s)

WebUI.click(findTestObject('07-Directory/Connections/btn_editLabel'))

WebUI.delay(GlobalVariable.delay_2s)

WebUI.click(findTestObject('07-Directory/Connections/btn_deleteLabelinConnection'))

WebUI.delay(GlobalVariable.delay_2s)

WebUI.click(findTestObject('07-Directory/Connections/btn_check'))

WebUI.delay(GlobalVariable.delay_2s)

WebUI.doubleClick(findTestObject('07-Directory/Connections/input_firstName'))

WebUI.delay(GlobalVariable.delay_2s)

WebUI.click(findTestObject('07-Directory/Connections/zContact Profile/button_save changes'))

WebUI.delay(GlobalVariable.delay_2s)

WebUI.click(findTestObject('07-Directory/Connections/zContact Profile/button_edit profile'))

WebUI.delay(GlobalVariable.delay_2s)

WebUI.scrollToElement(findTestObject('07-Directory/Connections/zContact Profile/notes'), 0)

WebUI.setText(findTestObject('07-Directory/Connections/zContact Profile/notes'), notes)

WebUI.scrollToElement(findTestObject('07-Directory/Connections/zContact Profile/button_save changes'), 0)

WebUI.click(findTestObject('07-Directory/Connections/zContact Profile/button_save changes'))

WebUI.verifyElementVisible(findTestObject('07-Directory/Connections/zContact Profile/success msg'))

