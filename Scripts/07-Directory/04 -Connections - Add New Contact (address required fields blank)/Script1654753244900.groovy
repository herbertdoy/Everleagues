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

WebUI.scrollToElement(findTestObject('07-Directory/Connections/button_add_address'), 0)

WebUI.click(findTestObject('07-Directory/Connections/button_add_address'))

WebUI.click(findTestObject('07-Directory/Connections/button_add_address'))

//WebUI.click(findTestObject('07-Directory/Connections/button_add_address'))
WebUI.verifyElementVisible(findTestObject('07-Directory/Connections/Edit address modal'))

WebUI.delay(GlobalVariable.delay_3seconds)

WebUI.click(findTestObject('07-Directory/Connections/input_Edit Address_street1'))

WebUI.click(findTestObject('07-Directory/Connections/input_Street 1_street2'))

WebUI.click(findTestObject('07-Directory/Connections/input_Street 2_postcode'))

WebUI.click(findTestObject('07-Directory/Connections/input_Zip  Postal Code_city'))

WebUI.click(findTestObject('07-Directory/Connections/input_City_state'))

WebUI.click(findTestObject('07-Directory/Connections/input_State_country'))

WebUI.doubleClick(findTestObject('07-Directory/Connections/input_Edit Address_street1'), FailureHandling.STOP_ON_FAILURE)

WebUI.scrollToElement(findTestObject('07-Directory/Connections/input_Country_addressLabel'), 0)

WebUI.click(findTestObject('07-Directory/Connections/input_Country_addressLabel'))

WebUI.delay(GlobalVariable.delay_3seconds)

WebUI.verifyElementVisible(findTestObject('07-Directory/Connections/span_Work'))

WebUI.verifyElementVisible(findTestObject('07-Directory/Connections/span_Personal'))

WebUI.verifyElementVisible(findTestObject('07-Directory/Connections/span_Other'))

WebUI.delay(GlobalVariable.delay_3seconds)

WebUI.click(findTestObject('07-Directory/Connections/h4_Edit Address'))

WebUI.delay(GlobalVariable.delay_3seconds)

WebUI.scrollToElement(findTestObject('07-Directory/Connections/street 1 error'), 0)

WebUI.verifyElementVisible(findTestObject('07-Directory/Connections/street 1 error'))

WebUI.verifyElementVisible(findTestObject('07-Directory/Connections/post code error'))

WebUI.verifyElementVisible(findTestObject('07-Directory/Connections/city error'))

WebUI.verifyElementVisible(findTestObject('07-Directory/Connections/state error'))

//WebUI.verifyElementVisible(findTestObject('07-Directory/Connections/country error'))
WebUI.delay(GlobalVariable.delay_3seconds)

