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

WebUI.click(findTestObject('03-Header Menu/div_Operation'))

WebUI.verifyElementVisible(findTestObject('08-Operations/Client_Assignment'))

WebUI.verifyElementVisible(findTestObject('08-Operations/Private_Circle'))

WebUI.delay(GlobalVariable.delay_2s)

WebUI.click(findTestObject('08-Operations/Client_Assignment'))

WebUI.verifyElementVisible(findTestObject('08-Operations/Client Assignment/div_Client Assignment'))

WebUI.verifyElementVisible(findTestObject('08-Operations/Client Assignment/Client Assignment Page 2'))

WebUI.delay(GlobalVariable.delay_2s)

WebUI.click(findTestObject('08-Operations/Client Assignment/Org unit edit'))

WebUI.verifyElementVisible(findTestObject('08-Operations/Client Assignment/Select org unit modal'))

WebUI.click(findTestObject('08-Operations/Client Assignment/button_Select_org unit select'))

