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
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW

WebUI.openBrowser('')

WebUI.navigateToUrl(GlobalVariable.URL_login)

WebUI.maximizeWindow()

WebUI.callTestCase(findTestCase('01 - Login and Forgot Password/04 - Login(Valid Credentials-testuser01)'), [:], FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('03-Header Menu/button_menu'))

WebUI.delay(GlobalVariable.delay_2s)

WebUI.verifyElementNotVisible(findTestObject('03-Header Menu/div_Add My Organization'), FailureHandling.STOP_ON_FAILURE)

WebUI.verifyElementNotVisible(findTestObject('03-Header Menu/div_Dashboard'), FailureHandling.STOP_ON_FAILURE)

WebUI.verifyElementNotVisible(findTestObject('03-Header Menu/div_Chat'), FailureHandling.STOP_ON_FAILURE)

WebUI.verifyElementNotVisible(findTestObject('03-Header Menu/div_Teams'), FailureHandling.STOP_ON_FAILURE)

WebUI.verifyElementNotVisible(findTestObject('03-Header Menu/div_Directory'), FailureHandling.STOP_ON_FAILURE)

WebUI.verifyElementNotVisible(findTestObject('03-Header Menu/div_Operation'), FailureHandling.STOP_ON_FAILURE)

WebUI.verifyElementNotVisible(findTestObject('03-Header Menu/div_Settings'), FailureHandling.STOP_ON_FAILURE)

WebUI.verifyElementNotVisible(findTestObject('03-Header Menu/div_Open Video Conference'), FailureHandling.STOP_ON_FAILURE)

WebUI.verifyElementNotVisible(findTestObject('03-Header Menu/div_Cloud Files'), FailureHandling.STOP_ON_FAILURE)

WebUI.verifyElementNotVisible(findTestObject('12-AI Assistant(beta)/AI asst button-Side panel'))

WebUI.verifyElementNotVisible(findTestObject('03-Header Menu/div_ELSign'), FailureHandling.STOP_ON_FAILURE)

WebUI.verifyElementNotVisible(findTestObject('03-Header Menu/div_Income and Expense'), FailureHandling.STOP_ON_FAILURE)

WebUI.verifyElementNotVisible(findTestObject('03-Header Menu/div_ELNet'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyElementNotVisible(findTestObject('03-Header Menu/div_Help'), FailureHandling.STOP_ON_FAILURE)

WebUI.delay(GlobalVariable.delay_2s)

WebUI.click(findTestObject('03-Header Menu/button_menu'))

WebUI.verifyElementVisible(findTestObject('03-Header Menu/div_Add My Organization'), FailureHandling.STOP_ON_FAILURE)

WebUI.verifyElementVisible(findTestObject('03-Header Menu/div_Dashboard'), FailureHandling.STOP_ON_FAILURE)

WebUI.verifyElementVisible(findTestObject('03-Header Menu/div_Chat'), FailureHandling.STOP_ON_FAILURE)

WebUI.verifyElementVisible(findTestObject('03-Header Menu/div_Teams'), FailureHandling.STOP_ON_FAILURE)

WebUI.verifyElementVisible(findTestObject('03-Header Menu/div_Directory'), FailureHandling.STOP_ON_FAILURE)

WebUI.verifyElementVisible(findTestObject('03-Header Menu/div_Operation'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyElementVisible(findTestObject('03-Header Menu/div_Settings'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyElementVisible(findTestObject('03-Header Menu/div_Open Video Conference'), FailureHandling.STOP_ON_FAILURE)

WebUI.verifyElementVisible(findTestObject('03-Header Menu/div_Cloud Files'), FailureHandling.STOP_ON_FAILURE)

WebUI.scrollToElement(findTestObject('03-Header Menu/div_ELSign'), 0)

WebUI.verifyElementVisible(findTestObject('12-AI Assistant(beta)/AI asst button-Side panel'))

WebUI.verifyElementVisible(findTestObject('03-Header Menu/div_ELSign'), FailureHandling.STOP_ON_FAILURE)

WebUI.verifyElementVisible(findTestObject('03-Header Menu/div_Income and Expense'), FailureHandling.STOP_ON_FAILURE)

WebUI.verifyElementVisible(findTestObject('03-Header Menu/div_ELNet'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyElementVisible(findTestObject('03-Header Menu/div_Help'), FailureHandling.STOP_ON_FAILURE)

WebUI.scrollToElement(findTestObject('03-Header Menu/div_Dashboard'), 0)

WebUI.delay(GlobalVariable.delay_2s)

