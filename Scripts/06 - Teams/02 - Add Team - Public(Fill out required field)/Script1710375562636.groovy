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

WebUI.click(findTestObject('06-Teams/01-Add Team-Public/Org unit'))

WebUI.verifyElementVisible(findTestObject('06-Teams/01-Add Team-Public/h4_Select an organization unit'))

WebUI.delay(GlobalVariable.delay_2s)

WebUI.click(findTestObject('06-Teams/01-Add Team-Public/div_GG Automation'))

WebUI.click(findTestObject('06-Teams/01-Add Team-Public/button_Select'))

WebUI.delay(GlobalVariable.delay_2s)

WebUI.verifyElementVisible(findTestObject('06-Teams/01-Add Team-Public/span_Member Visibility in Connections'))

WebUI.verifyElementVisible(findTestObject('06-Teams/01-Add Team-Public/span_Allow members to create channels'))

WebUI.verifyElementVisible(findTestObject('06-Teams/01-Add Team-Public/span_Allow members to do post creation'))

WebUI.verifyElementVisible(findTestObject('06-Teams/01-Add Team-Public/span_Allow members to comment'))

WebUI.delay(GlobalVariable.delay_2s)

WebUI.setText(findTestObject('06-Teams/01-Add Team-Public/input_teamName'), input_teamPublic)

WebUI.scrollToElement(findTestObject('06-Teams/01-Add Team-Public/button_Create'), 0)

WebUI.click(findTestObject('06-Teams/01-Add Team-Public/button_Create'))

WebUI.verifyElementVisible(findTestObject('06-Teams/01-Add Team-Public/span_Successfully added new team'))

WebUI.delay(GlobalVariable.delay_2s)

WebUI.verifyElementVisible(findTestObject('06-Teams/01-Add Team-Public/span_Auto Team Public'))

WebUI.delay(GlobalVariable.delay_2s)

