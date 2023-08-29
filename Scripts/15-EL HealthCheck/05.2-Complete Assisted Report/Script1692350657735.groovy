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

WebUI.click(findTestObject('15-EL HealthCheck/Activated information tracker/Active_forms_assisted_report'))

WebUI.click(findTestObject('15-EL HealthCheck/Activated information tracker/Assisted_report_Select_User'))

WebUI.click(findTestObject('15-EL HealthCheck/Activated information tracker/Assisted_report_Select_User_GGTESTER'))

WebUI.click(findTestObject('15-EL HealthCheck/Activated information tracker/Assisted_report_q1_No'))

WebUI.click(findTestObject('15-EL HealthCheck/Activated information tracker/Assisted_report_q2_No'))

WebUI.click(findTestObject('15-EL HealthCheck/Activated information tracker/Assisted_report_q3_No'))

WebUI.click(findTestObject('15-EL HealthCheck/Activated information tracker/Assisted_report_q4_No'))

WebUI.click(findTestObject('15-EL HealthCheck/Activated information tracker/Assisted_report_Submit_button'))

WebUI.click(findTestObject('15-EL HealthCheck/Activated information tracker/Assisted_report_Submit_Confirmation_YES'))

WebUI.click(findTestObject('15-EL HealthCheck/Activated information tracker/UPDATE/Update_View summary button'))

WebUI.verifyElementVisible(findTestObject('15-EL HealthCheck/Activated information tracker/Assisted_report_Submit_Health check summary modal'))

WebUI.click(findTestObject('15-EL HealthCheck/Activated information tracker/Assisted_report_Submit_Health check summary_OK'))

