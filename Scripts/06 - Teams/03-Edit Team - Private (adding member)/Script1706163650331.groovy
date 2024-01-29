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

WebUI.callTestCase(findTestCase('01 - Login and Forgot Password/04 - Login(Valid Credentials-With Subscription)'), [:], FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('06-Teams/button_doublearrow'))

WebUI.click(findTestObject('06-Teams/button_My Organizations'))

WebUI.click(findTestObject('06-Teams/button_GG Automation'))

WebUI.delay(GlobalVariable.delay_3s)

WebUI.verifyElementVisible(findTestObject('06-Teams/span_GG Automation'))

WebUI.delay(GlobalVariable.delay_2s)

WebUI.click(findTestObject('03-Header Menu/div_Teams'))

WebUI.delay(GlobalVariable.delay_2s)

WebUI.verifyElementVisible(findTestObject('06-Teams/h4_TEAMS'))

WebUI.delay(GlobalVariable.delay_3s)

WebUI.click(findTestObject('06-Teams/03-Edit Team - Private/button_edit Auto Team Private'))

WebUI.delay(GlobalVariable.delay_3s)

WebUI.verifyElementVisible(findTestObject('06-Teams/03-Edit Team - Private/h4_Edit Auto Team Private'))

WebUI.verifyElementVisible(findTestObject('06-Teams/03-Edit Team - Private/div_Members'))

WebUI.verifyElementVisible(findTestObject('06-Teams/03-Edit Team - Private/div_Channels'))

WebUI.verifyElementVisible(findTestObject('06-Teams/03-Edit Team - Private/div_Settings'))

WebUI.delay(GlobalVariable.delay_2s)

WebUI.click(findTestObject('06-Teams/03-Edit Team - Private/input_name or group'))

WebUI.click(findTestObject('06-Teams/03-Edit Team - Private/select_GG tester 2'))

WebUI.verifyElementVisible(findTestObject('06-Teams/03-Edit Team - Private/selected_GG tester 2'))

WebUI.delay(GlobalVariable.delay_2s)

WebUI.click(findTestObject('06-Teams/03-Edit Team - Private/div_INVITE'))

WebUI.verifyElementVisible(findTestObject('06-Teams/03-Edit Team - Private/added_GTGG tester 2'))

WebUI.delay(GlobalVariable.delay_2s)

