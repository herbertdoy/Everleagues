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

WebUI.openBrowser('')

WebUI.navigateToUrl(GlobalVariable.URL_lab)

WebUI.maximizeWindow()

WebUI.callTestCase(findTestCase('01 - Login and Forgot Password/04 - Login(Valid Credentials-testuser00005)'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('06-Teams/button_doublearrow'))

WebUI.click(findTestObject('06-Teams/button_My Organizations'))

WebUI.click(findTestObject('06-Teams/button_GG Automation'))

WebUI.delay(GlobalVariable.delay_2s)

WebUI.verifyElementVisible(findTestObject('06-Teams/span_GG Automation'))

WebUI.delay(GlobalVariable.delay_2s)

WebUI.click(findTestObject('03-Header Menu/div_Teams'))

WebUI.delay(GlobalVariable.delay_2s)

WebUI.verifyElementVisible(findTestObject('06-Teams/h4_TEAMS'))

WebUI.delay(GlobalVariable.delay_2s)

WebUI.click(findTestObject('06-Teams/Add Team'))

WebUI.delay(GlobalVariable.delay_2s)

WebUI.verifyElementVisible(findTestObject('06-Teams/button_Public'))

WebUI.verifyElementVisible(findTestObject('06-Teams/button_Private'))

WebUI.delay(GlobalVariable.delay_2s)

WebUI.click(findTestObject('06-Teams/button_Public'))

WebUI.verifyElementVisible(findTestObject('06-Teams/01-Add Team-Public/Add Team_Public'))

WebUI.scrollToElement(findTestObject('06-Teams/01-Add Team-Public/button_Create'), 0)

WebUI.verifyElementNotClickable(findTestObject('06-Teams/01-Add Team-Public/button_Create'))

WebUI.delay(GlobalVariable.delay_2s)

WebUI.click(findTestObject('06-Teams/01-Add Team-Public/input_teamName'))

WebUI.delay(GlobalVariable.delay_2s)

WebUI.click(findTestObject('06-Teams/01-Add Team-Public/Org unit'))

WebUI.click(findTestObject('06-Teams/01-Add Team-Public/Org unit'))

WebUI.verifyElementVisible(findTestObject('06-Teams/01-Add Team-Public/h4_Select an organization unit'))

WebUI.delay(GlobalVariable.delay_2s)

WebUI.click(findTestObject('06-Teams/01-Add Team-Public/div_GG Automation'))

WebUI.click(findTestObject('06-Teams/01-Add Team-Public/button_Select'))

WebUI.verifyElementVisible(findTestObject('06-Teams/01-Add Team-Public/Error Team name'))

WebUI.delay(GlobalVariable.delay_2s)

WebUI.setText(findTestObject('06-Teams/01-Add Team-Public/input_teamName'), 'Auto Team Public')

WebUI.scrollToElement(findTestObject('06-Teams/01-Add Team-Public/button_Create'), 0)

WebUI.click(findTestObject('06-Teams/01-Add Team-Public/button_Create'))

WebUI.verifyElementVisible(findTestObject('06-Teams/01-Add Team-Public/span_Successfully added new team'))

WebUI.delay(GlobalVariable.delay_2s)

WebUI.verifyElementVisible(findTestObject('06-Teams/01-Add Team-Public/span_Auto Team Public'))

WebUI.delay(GlobalVariable.delay_2s)

