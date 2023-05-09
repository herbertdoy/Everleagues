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

WebUI.click(findTestObject('12-EL Sign/mat-icon_refresh'))

WebUI.delay(GlobalVariable.delay_3seconds)

WebUI.click(findTestObject('12-EL Sign/mat-icon_configureColumns'))

WebUI.verifyElementVisible(findTestObject('12-EL Sign/mat-dialog-container_configureColumnModal'))

WebUI.delay(GlobalVariable.delay_3seconds)

//WebUI.click(findTestObject('12-EL Sign/span_Download'))
WebUI.click(findTestObject('12-EL Sign/span_ELSign Tracking Id'))

WebUI.click(findTestObject('12-EL Sign/span_Document Name'))

WebUI.click(findTestObject('12-EL Sign/span_Status'))

WebUI.click(findTestObject('12-EL Sign/span_Signer Status'))

WebUI.click(findTestObject('12-EL Sign/span_View'))

WebUI.click(findTestObject('12-EL Sign/span_Certificate'))

WebUI.click(findTestObject('12-EL Sign/span_Delete'))

WebUI.click(findTestObject('12-EL Sign/span_History'))

WebUI.click(findTestObject('12-EL Sign/span_Reminder'))

WebUI.click(findTestObject('12-EL Sign/span_Last Modified'))

WebUI.delay(GlobalVariable.delay_3seconds)

WebUI.click(findTestObject('12-EL Sign/span_ELSign Tracking Id'))

WebUI.click(findTestObject('12-EL Sign/span_Document Name'))

WebUI.click(findTestObject('12-EL Sign/span_Status'))

WebUI.click(findTestObject('12-EL Sign/span_Signer Status'))

WebUI.click(findTestObject('12-EL Sign/span_View'))

WebUI.click(findTestObject('12-EL Sign/span_Download'))

WebUI.click(findTestObject('12-EL Sign/span_Certificate'))

WebUI.click(findTestObject('12-EL Sign/span_Delete'))

WebUI.click(findTestObject('12-EL Sign/span_History'))

WebUI.click(findTestObject('12-EL Sign/span_Reminder'))

WebUI.click(findTestObject('12-EL Sign/span_Last Modified'))

WebUI.delay(GlobalVariable.delay_3seconds)

WebUI.click(findTestObject('12-EL Sign/button_CLOSE'))

WebUI.delay(GlobalVariable.delay_3seconds)

WebUI.click(findTestObject('12-EL Sign/mat-icon_exportCSV'))

WebUI.delay(GlobalVariable.delay_3seconds)

WebUI.click(findTestObject('12-EL Sign/mat-icon_expandAll'))

WebUI.delay(GlobalVariable.delay_3seconds)

WebUI.click(findTestObject('12-EL Sign/mat-icon_refit'))

WebUI.delay(GlobalVariable.delay_3seconds)

