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

WebUI.click(findTestObject('15-EL HealthCheck/Activated information tracker/UPDATE/Update_Config Columns'))

WebUI.click(findTestObject('15-EL HealthCheck/Activated information tracker/UPDATE/Update_Config Columns_User Name checkbox'))

WebUI.click(findTestObject('15-EL HealthCheck/Activated information tracker/UPDATE/Update_Config Columns_Reported date checkbox'))

WebUI.click(findTestObject('15-EL HealthCheck/Activated information tracker/UPDATE/Update_Config Columns_Status checkbox'))

WebUI.click(findTestObject('15-EL HealthCheck/Activated information tracker/UPDATE/Update_Config Columns_Last critical report date checkbox'))

WebUI.click(findTestObject('15-EL HealthCheck/Activated information tracker/UPDATE/Update_Config Columns_Tracker ID checkbox'))

WebUI.click(findTestObject('15-EL HealthCheck/Activated information tracker/UPDATE/Update_Config Columns_View summary checkbox'))

WebUI.click(findTestObject('15-EL HealthCheck/Activated information tracker/UPDATE/Update_Config Columns_Close button'))

WebUI.verifyElementNotVisible(findTestObject('15-EL HealthCheck/Activated information tracker/UPDATE/Update_Column header_User Name'))

WebUI.verifyElementNotVisible(findTestObject('15-EL HealthCheck/Activated information tracker/UPDATE/Update_Column header_Reported Date'))

WebUI.verifyElementNotVisible(findTestObject('15-EL HealthCheck/Activated information tracker/UPDATE/Update_Column header_Status'))

WebUI.verifyElementNotVisible(findTestObject('15-EL HealthCheck/Activated information tracker/UPDATE/Update_Column header_Last Critical Report Date'))

WebUI.verifyElementNotVisible(findTestObject('15-EL HealthCheck/Activated information tracker/UPDATE/Update_Column header_Tracker ID'))

WebUI.verifyElementNotVisible(findTestObject('15-EL HealthCheck/Activated information tracker/UPDATE/Update_Column header_View Summary'))

WebUI.click(findTestObject('15-EL HealthCheck/Activated information tracker/UPDATE/Update_Config Columns'))

WebUI.click(findTestObject('15-EL HealthCheck/Activated information tracker/UPDATE/Update_Config Columns_User Name checkbox'))

WebUI.click(findTestObject('15-EL HealthCheck/Activated information tracker/UPDATE/Update_Config Columns_Reported date checkbox'))

WebUI.click(findTestObject('15-EL HealthCheck/Activated information tracker/UPDATE/Update_Config Columns_Status checkbox'))

WebUI.click(findTestObject('15-EL HealthCheck/Activated information tracker/UPDATE/Update_Config Columns_Last critical report date checkbox'))

WebUI.click(findTestObject('15-EL HealthCheck/Activated information tracker/UPDATE/Update_Config Columns_Tracker ID checkbox'))

WebUI.click(findTestObject('15-EL HealthCheck/Activated information tracker/UPDATE/Update_Config Columns_View summary checkbox'))

WebUI.click(findTestObject('15-EL HealthCheck/Activated information tracker/UPDATE/Update_Config Columns_Close button'))

WebUI.verifyElementVisible(findTestObject('15-EL HealthCheck/Activated information tracker/UPDATE/Update_Column header_User Name'))

WebUI.verifyElementVisible(findTestObject('15-EL HealthCheck/Activated information tracker/UPDATE/Update_Column header_Reported Date'))

WebUI.verifyElementVisible(findTestObject('15-EL HealthCheck/Activated information tracker/UPDATE/Update_Column header_Status'))

WebUI.verifyElementVisible(findTestObject('15-EL HealthCheck/Activated information tracker/UPDATE/Update_Column header_Last Critical Report Date'))

WebUI.verifyElementVisible(findTestObject('15-EL HealthCheck/Activated information tracker/UPDATE/Update_Column header_Tracker ID'))

WebUI.verifyElementVisible(findTestObject('15-EL HealthCheck/Activated information tracker/UPDATE/Update_Column header_View Summary'))

