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

WebUI.callTestCase(findTestCase('01 - Login and Forgot Password/04 - Login(Valid Credentials-testuser01)'), [:], FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('06-Teams/button_doublearrow'))

WebUI.click(findTestObject('06-Teams/button_My Organizations'))

WebUI.click(findTestObject('02-Side Icons/button_Automation Test Org'))

WebUI.delay(GlobalVariable.delay_3s)

WebUI.verifyElementVisible(findTestObject('02-Side Icons/span_Automation Test Org (1)'))

WebUI.delay(GlobalVariable.delay_2s)

WebUI.click(findTestObject('03-Header Menu/div_Open Video Conference'))

WebUI.verifyElementVisible(findTestObject('10-Open Video Conference/h4_OPEN VIDEO CONFERENCE'))

WebUI.verifyElementVisible(findTestObject('10-Open Video Conference/span_warning'))

WebUI.click(findTestObject('10-Open Video Conference/a_chat'))

WebUI.delay(GlobalVariable.delay_2s)

WebUI.click(findTestObject('03-Header Menu/div_Open Video Conference'))

WebUI.delay(GlobalVariable.delay_3s)

WebUI.verifyElementVisible(findTestObject('10-Open Video Conference/h5_Meeting Title'))

WebUI.click(findTestObject('10-Open Video Conference/input_Meeting Title'))

WebUI.click(findTestObject('10-Open Video Conference/div_Now'))

WebUI.delay(GlobalVariable.delay_3s)

WebUI.verifyElementVisible(findTestObject('10-Open Video Conference/h5_Current Contacts'))

WebUI.click(findTestObject('10-Open Video Conference/input_Current Contacts_inputSearchContacts'))

WebUI.click(findTestObject('10-Open Video Conference/div_Now'))

WebUI.delay(GlobalVariable.delay_2s)

WebUI.scrollToElement(findTestObject('10-Open Video Conference/h5_New Guests'), 0)

WebUI.verifyElementVisible(findTestObject('10-Open Video Conference/h5_New Guests'))

WebUI.click(findTestObject('10-Open Video Conference/mat-checkbox-Save all to contacts'))

WebUI.click(findTestObject('10-Open Video Conference/mat-checkbox-Save all to contacts'))

WebUI.click(findTestObject('10-Open Video Conference/div_Enter a valid phone number'))

WebUI.click(findTestObject('10-Open Video Conference/div_Enter a valid phone number'))

WebUI.delay(GlobalVariable.delay_2s)

WebUI.click(findTestObject('10-Open Video Conference/input_Firstname'))

WebUI.click(findTestObject('10-Open Video Conference/input_Lastname'))

WebUI.click(findTestObject('10-Open Video Conference/input_emailPhonenumber'))

WebUI.verifyElementVisible(findTestObject('10-Open Video Conference/mat-error_Field is required'))

WebUI.clickOffset(findTestObject('10-Open Video Conference/input_Meeting Title'), 10, 10)

WebUI.clickOffset(findTestObject('10-Open Video Conference/input_Lastname'), 10, 10)

WebUI.delay(GlobalVariable.delay_2s)

WebUI.click(findTestObject('10-Open Video Conference/div_Schedule'))

WebUI.verifyElementVisible(findTestObject('10-Open Video Conference/button_Start Date'))

WebUI.clickOffset(findTestObject('10-Open Video Conference/input_Meeting Title'), 10, 10)

WebUI.verifyElementVisible(findTestObject('10-Open Video Conference/button_End Date'))

WebUI.verifyElementNotClickable(findTestObject('10-Open Video Conference/button_Create meeting'))

WebUI.clickOffset(findTestObject('10-Open Video Conference/input_Meeting Title'), 10, 10)

WebUI.verifyElementVisible(findTestObject('10-Open Video Conference/div_recurrence_dropdown'))

