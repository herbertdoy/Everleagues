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

WebUI.click(findTestObject('06-Teams/Add Team'))

WebUI.delay(GlobalVariable.delay_2s)

WebUI.verifyElementVisible(findTestObject('06-Teams/button_Public'))

WebUI.verifyElementVisible(findTestObject('06-Teams/button_Private'))

WebUI.delay(GlobalVariable.delay_2s)

WebUI.click(findTestObject('06-Teams/button_Private'))

WebUI.delay(GlobalVariable.delay_2s)

WebUI.verifyElementVisible(findTestObject('06-Teams/02-Add Team-Private/Add team- Private'))

WebUI.verifyElementVisible(findTestObject('06-Teams/02-Add Team-Private/div_Settings'))

WebUI.verifyElementVisible(findTestObject('06-Teams/02-Add Team-Private/div_Members'))

WebUI.scrollToElement(findTestObject('06-Teams/01-Add Team-Public/button_Create'), 0)

WebUI.verifyElementNotClickable(findTestObject('06-Teams/01-Add Team-Public/button_Create'))

WebUI.delay(GlobalVariable.delay_2s)

WebUI.setText(findTestObject('06-Teams/01-Add Team-Public/input_teamName'), '')

WebUI.clickOffset(findTestObject('06-Teams/01-Add Team-Public/input_teamName'), 100, 100)

WebUI.waitForElementVisible(findTestObject('06-Teams/01-Add Team-Public/Error Team name'), 0)

WebUI.delay(GlobalVariable.delay_2s)


