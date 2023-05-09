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

WebUI.setText(findTestObject('07-Directory/Connections/input_Edit Address_street1'), 'Auto street 1')

WebUI.setText(findTestObject('07-Directory/Connections/input_Street 1_street2'), 'Auto street 2')

WebUI.setText(findTestObject('07-Directory/Connections/input_Street 2_postcode'), '54321')

WebUI.setText(findTestObject('07-Directory/Connections/input_Zip  Postal Code_city'), 'Auto city')

WebUI.setText(findTestObject('07-Directory/Connections/input_City_state'), 'Auto state')

WebUI.click(findTestObject('07-Directory/Connections/input_State_country'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('07-Directory/Connections/option_united states'), FailureHandling.STOP_ON_FAILURE)

WebUI.scrollToElement(findTestObject('07-Directory/Connections/input_Country_addressLabel'), 0)

WebUI.click(findTestObject('07-Directory/Connections/input_Country_addressLabel'), FailureHandling.STOP_ON_FAILURE)

WebUI.delay(GlobalVariable.delay_3seconds)

WebUI.click(findTestObject('07-Directory/Connections/span_Work'))

WebUI.click(findTestObject('07-Directory/Connections/address_Save'))

WebUI.delay(GlobalVariable.delay_3seconds)

WebUI.verifyElementVisible(findTestObject('07-Directory/Connections/added address'))

WebUI.click(findTestObject('07-Directory/Connections/button_Create'))

WebUI.delay(GlobalVariable.delay_3seconds)

WebUI.verifyElementVisible(findTestObject('07-Directory/Connections/div_added user'))

