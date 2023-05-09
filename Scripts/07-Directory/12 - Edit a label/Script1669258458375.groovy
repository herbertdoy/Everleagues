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

WebUI.delay(GlobalVariable.delay_3seconds)

WebUI.click(findTestObject('07-Directory/Labels/button_create'))

WebUI.verifyElementVisible(findTestObject('07-Directory/Labels/Edit Label modal'))

WebUI.verifyElementNotClickable(findTestObject('07-Directory/Labels/button_Edit Label'))

WebUI.delay(GlobalVariable.delay_3seconds)

WebUI.setText(findTestObject('07-Directory/Labels/input_Add New Label Name'), 'Label QA Edit')

WebUI.click(findTestObject('07-Directory/Labels/button_Edit Label'))

WebUI.verifyElementVisible(findTestObject('07-Directory/Labels/edit success msg'))

WebUI.verifyElementVisible(findTestObject('07-Directory/Labels/div_Label QA Edited'))

