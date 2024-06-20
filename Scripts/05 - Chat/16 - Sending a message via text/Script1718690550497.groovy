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

WebUI.refresh()

WebUI.click(findTestObject('05-Chat/send a sms/button_sms'))

WebUI.delay(GlobalVariable.delay_3s)

WebUI.verifyElementVisible(findTestObject('05-Chat/send a sms/modal_send_sms'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('05-Chat/send a sms/code_num'))

WebUI.setText(findTestObject('05-Chat/send a sms/search_country'), 'PH')

WebUI.click(findTestObject('05-Chat/send a sms/button_Philippines 63'))

WebUI.click(findTestObject('05-Chat/send a sms/input_Send SMS_mat-input-8'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('05-Chat/send a sms/textarea_Phone Number_smsMessage'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyElementVisible(findTestObject('05-Chat/send a sms/mat-error_Enter a valid phone number'))

WebUI.setText(findTestObject('05-Chat/send a sms/input_Send SMS_mat-input-8'), '9213456743')

WebUI.setText(findTestObject('05-Chat/send a sms/textarea_Phone Number_smsMessage'), 'send test via sms')

WebUI.click(findTestObject('05-Chat/send a sms/button_Send'))

WebUI.closeBrowser()

