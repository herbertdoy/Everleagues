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

WebUI.verifyElementVisible(findTestObject('15-EL HealthCheck/Activated information tracker/Active_forms_Self_report'))

WebUI.click(findTestObject('15-EL HealthCheck/Activated information tracker/Active_forms_Self_report'))

WebUI.click(findTestObject('15-EL HealthCheck/Activated information tracker/Self_report_X_button'))

WebUI.click(findTestObject('15-EL HealthCheck/Activated information tracker/Active_forms_Self_report'))

WebUI.click(findTestObject('15-EL HealthCheck/Activated information tracker/Self_report_q1_NO'))

WebUI.click(findTestObject('15-EL HealthCheck/Activated information tracker/Self_report_q2_NO'))

WebUI.click(findTestObject('15-EL HealthCheck/Activated information tracker/Self_report_q3_NO'))

WebUI.click(findTestObject('15-EL HealthCheck/Activated information tracker/Self_report_q4_NO'))

WebUI.click(findTestObject('15-EL HealthCheck/Activated information tracker/Self_report_Submit_button'))

WebUI.click(findTestObject('15-EL HealthCheck/Activated information tracker/Self_report_submit_YES'))

WebUI.verifyElementVisible(findTestObject('15-EL HealthCheck/Activated information tracker/Health_Check_Summary_modal'))

WebUI.click(findTestObject('15-EL HealthCheck/Activated information tracker/Health_check_summary_OK_button'))

