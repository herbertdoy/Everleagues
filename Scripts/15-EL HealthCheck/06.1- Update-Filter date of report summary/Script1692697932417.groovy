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

WebUI.click(findTestObject('15-EL HealthCheck/Activated information tracker/Active_forms_update'))

WebUI.setText(findTestObject('15-EL HealthCheck/Activated information tracker/UPDATE/Update_Start Date_Input field'), '7/2/2023')

WebUI.setText(findTestObject('15-EL HealthCheck/Activated information tracker/UPDATE/Update_End Date Input field'), '8/23/2023')

WebUI.click(findTestObject('15-EL HealthCheck/Activated information tracker/UPDATE/Update_Refresh button'))

WebUI.click(findTestObject('15-EL HealthCheck/Activated information tracker/UPDATE/Update_Start Date_Calendar button'))

WebUI.click(findTestObject('15-EL HealthCheck/Activated information tracker/UPDATE/Update_Start Date_Calendar button_July 3, 2023'))

WebUI.click(findTestObject('15-EL HealthCheck/Activated information tracker/UPDATE/Update_End Date_Calendar button'))

WebUI.click(findTestObject('15-EL HealthCheck/Activated information tracker/UPDATE/Update_End Date_Calendar button_August 23, 2023'))

WebUI.click(findTestObject('15-EL HealthCheck/Activated information tracker/UPDATE/Update_Refresh button'))

