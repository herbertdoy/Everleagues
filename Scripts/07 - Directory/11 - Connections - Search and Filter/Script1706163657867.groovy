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

WebUI.click(findTestObject('07-Directory/Connections/input-Search'))

WebUI.setText(findTestObject('07-Directory/Connections/input-Search'), searchUser)

WebUI.delay(2)

WebUI.click(findTestObject('07-Directory/Connections/button_Filter'))

WebUI.verifyElementVisible(findTestObject('07-Directory/Connections/div_Filter'))

WebUI.verifyElementVisible(findTestObject('07-Directory/Connections/span_All'))

WebUI.verifyElementVisible(findTestObject('07-Directory/Connections/span_External contact'))

WebUI.verifyElementVisible(findTestObject('07-Directory/Connections/span_Co-Worker'))

WebUI.verifyElementVisible(findTestObject('07-Directory/Connections/span_Client'))

WebUI.verifyElementVisible(findTestObject('07-Directory/Connections/span_Admin'))

WebUI.verifyElementVisible(findTestObject('07-Directory/Connections/span_Guest contact'))

WebUI.verifyElementVisible(findTestObject('07-Directory/Connections/span_By labels'))

WebUI.delay(2)

WebUI.click(findTestObject('07-Directory/Connections/span_Co-Worker'))

WebUI.delay(2)

WebUI.click(findTestObject('07-Directory/Connections/button_Filter2'))

WebUI.delay(2)

WebUI.click(findTestObject('07-Directory/Connections/button_Filter3'))

WebUI.delay(2)

WebUI.click(findTestObject('07-Directory/Connections/span_Client'))

WebUI.delay(2)

WebUI.click(findTestObject('07-Directory/Connections/button_Filter2'))

WebUI.delay(2)

