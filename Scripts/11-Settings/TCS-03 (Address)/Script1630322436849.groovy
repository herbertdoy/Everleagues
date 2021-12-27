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
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable

WebUI.delay(5)

WebUI.clearText(findTestObject('11-Settings/Organization/Address/Address_Street'))

WebUI.setText(findTestObject('11-Settings/Organization/Address/Address_Street'), 'Fondren Rd')

WebUI.clearText(findTestObject('11-Settings/Organization/Address/Address_City'))

WebUI.setText(findTestObject('11-Settings/Organization/Address/Address_City'), 'Houston')

WebUI.clearText(findTestObject('11-Settings/Organization/Address/Address_Postal'))

WebUI.setText(findTestObject('11-Settings/Organization/Address/Address_Postal'), '11281')

WebUI.clearText(findTestObject('11-Settings/Organization/Address/Address_State'))

WebUI.setText(findTestObject('11-Settings/Organization/Address/Address_State'), 'TX')

WebUI.clearText(findTestObject('11-Settings/Organization/Address/Address_Country'))

WebUI.setText(findTestObject('11-Settings/Organization/Address/Address_Country'), 'United States')

