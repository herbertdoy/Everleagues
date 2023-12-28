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

WebUI.click(findTestObject('15-EL HealthCheck/Inactive information tracker/button_ACTIVATE'))

WebUI.verifyElementVisible(findTestObject('15-EL HealthCheck/Activated information tracker/Covid-19 Information Tracker Activation Modal'))

WebUI.delay(GlobalVariable.delay_2s)

WebUI.mouseOver(findTestObject('15-EL HealthCheck/Activated information tracker/Help_icon'))

WebUI.delay(GlobalVariable.delay_2s)

WebUI.verifyElementVisible(findTestObject('15-EL HealthCheck/Activated information tracker/div_Help_icon_tooltip_text'))

WebUI.scrollToElement(findTestObject('15-EL HealthCheck/Activated information tracker/InfoTracker_activation_SourceLink'), 
    10)

WebUI.click(findTestObject('15-EL HealthCheck/Activated information tracker/InfoTracker_activation_SourceLink'))

String url = WebUI.getUrl()

url.contains('https://www.nyc.gov/assets/doh/downloads/pdf/imm/covid-19-symptom-screening-businesses.pdf')

WebUI.closeWindowIndex(1)

WebUI.switchToWindowIndex(0)

WebUI.click(findTestObject('15-EL HealthCheck/Activated information tracker/Eye_Icon'))

WebUI.delay(GlobalVariable.delay_5s)

WebUI.verifyElementVisible(findTestObject('15-EL HealthCheck/Activated information tracker/Eye_Info_Tracker_pdf_form'))

WebUI.click(findTestObject('15-EL HealthCheck/Activated information tracker/Eye_Info_Tracker_Cancel_button'))

WebUI.click(findTestObject('15-EL HealthCheck/Activated information tracker/InfoTracker_activation_Activate_button'))

