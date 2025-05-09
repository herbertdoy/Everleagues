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

WebUI.setText(findTestObject('07-Directory/Connections/input_firstName'), GlobalVariable.first_name1)

WebUI.setText(findTestObject('07-Directory/Connections/input_lastName'), GlobalVariable.last_name2)

WebUI.click(findTestObject('07-Directory/Connections/button_plusIcon'))

WebUI.doubleClick(findTestObject('07-Directory/Connections/input_Type_email'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.setText(findTestObject('07-Directory/Connections/input_Type_email'), GlobalVariable.Y_autotester02)

WebUI.click(findTestObject('07-Directory/Connections/zContact Profile/div_93'))

WebUI.delay(GlobalVariable.delay_3s)

WebUI.click(findTestObject('07-Directory/Connections/input_Type_phone'))

WebUI.click(findTestObject('07-Directory/Connections/button_area code'))

WebUI.delay(GlobalVariable.delay_2s)

WebUI.doubleClick(findTestObject('07-Directory/Connections/input_Type_email'))

WebUI.scrollToElement(findTestObject('07-Directory/Connections/input_company'), 0)

WebUI.doubleClick(findTestObject('07-Directory/Connections/input_company'))

WebUI.setText(findTestObject('07-Directory/Connections/input_company'), company)

WebUI.setText(findTestObject('07-Directory/Connections/input_position'), position)

WebUI.click(findTestObject('07-Directory/Connections/input_Labels'))

WebUI.click(findTestObject('07-Directory/Connections/span_LabelTwo'))

WebUI.delay(GlobalVariable.delay_2s)

WebUI.click(findTestObject('07-Directory/Connections/btn_createNewLabel'))

WebUI.setText(findTestObject('07-Directory/Labels/input_Add New Label Name'), qalabel)

WebUI.click(findTestObject('07-Directory/Labels/button_Add Label'))

WebUI.click(findTestObject('07-Directory/Connections/input_Labels'))

WebUI.verifyElementPresent(findTestObject('07-Directory/Connections/span_LabelQA'), 0)

WebUI.delay(GlobalVariable.delay_2s)

WebUI.setText(findTestObject('07-Directory/Connections/zContact Profile/notes'), notes)

WebUI.delay(GlobalVariable.delay_2s)

