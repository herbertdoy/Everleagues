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
import org.openqa.selenium.Keys as Keys
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW
import com.kms.katalon.core.util.KeywordUtil as KeywordUtil
import java.util.Random as Random

def domainName = '@yopmail.com'

def random = new Random()

def randomString = Long.toHexString(random.nextLong())

def emailAddress = ('autotestuser' + randomString) + domainName

KeywordUtil.logInfo('Generated email address: ' + emailAddress)

WebUI.setText(findTestObject('00-Signup and Activation/input_Email'), emailAddress)

WebUI.setText(findTestObject('00-Signup and Activation/input_firstName'), GlobalVariable.first_name1)

WebUI.setText(findTestObject('00-Signup and Activation/input_lastName'), GlobalVariable.last_name1)

WebUI.delay(GlobalVariable.delay_2s)

WebUI.click(findTestObject('Object Repository/00-Signup and Activation/button_Sign up'))

WebUI.delay(GlobalVariable.delay_2s)

WebUI.executeJavaScript('window.open();', [])

currentWindow = WebUI.getWindowIndex()

WebUI.delay(GlobalVariable.delay_2s)

WebUI.switchToWindowIndex(currentWindow + 1)

WebUI.navigateToUrl(GlobalVariable.URL_yopmail)

WebUI.delay(GlobalVariable.delay_2s)

WebUI.setText(findTestObject('Yopmail/input_Enter your inbox here'), emailAddress)

WebUI.delay(GlobalVariable.delay_2s)

WebUI.click(findTestObject('Yopmail/button_Next'))

WebUI.delay(GlobalVariable.delay_3s)

WebUI.click(findTestObject('Yopmail/span_Everleagues Team'))

WebUI.delay(GlobalVariable.delay_2s)

String code = WebUI.getText(findTestObject('Yopmail/2FA code-Yopmail'))

WebUI.delay(GlobalVariable.delay_2s)

WebUI.closeWindowTitle(GlobalVariable.Y_windowTitle)

WebUI.delay(GlobalVariable.delay_2s)

WebUI.switchToWindowIndex(0)

WebUI.delay(GlobalVariable.delay_2s)

WebUI.setText(findTestObject('Object Repository/06-Teams/For 2FA/input_Enter verification code'), code)

WebUI.delay(GlobalVariable.delay_2s)

WebUI.click(findTestObject('06-Teams/For 2FA/button_Verify_2FA'))

WebUI.delay(GlobalVariable.delay_2s)

