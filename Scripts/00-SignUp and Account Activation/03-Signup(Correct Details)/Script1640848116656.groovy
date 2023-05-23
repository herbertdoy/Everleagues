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

WebUI.delay(GlobalVariable.delay_2seconds)

def domainName = '@mailinator.com'

def random = new Random()

def randomString = Long.toHexString(random.nextLong())

def emailAddress = ('autotestuser' + randomString) + domainName

KeywordUtil.logInfo('Generated email address: ' + emailAddress)

WebUI.setText(findTestObject('00-Signup and Activation/input_Email'), emailAddress)

WebUI.setText(findTestObject('00-Signup and Activation/input_firstName'), GlobalVariable.first_name1)

WebUI.setText(findTestObject('00-Signup and Activation/input_lastName'), GlobalVariable.last_name1)

WebUI.delay(GlobalVariable.delay_2seconds)

WebUI.click(findTestObject('Object Repository/00-Signup and Activation/button_Sign up'))

WebUI.delay(GlobalVariable.delay_2seconds)

WebUI.executeJavaScript('window.open();', [])

currentWindow = WebUI.getWindowIndex()

WebUI.delay(GlobalVariable.delay_3seconds)

WebUI.switchToWindowIndex(currentWindow + 1)

WebUI.navigateToUrl(GlobalVariable.app_mailinator)

WebUI.delay(GlobalVariable.delay_3seconds)

WebUI.setText(findTestObject('00-Signup and Activation/zMailinator/input_LOGIN_search'), emailAddress)

WebUI.click(findTestObject('00-Signup and Activation/zMailinator/gobutton'), FailureHandling.STOP_ON_FAILURE)

WebUI.delay(GlobalVariable.delay_3seconds)

WebUI.click(findTestObject('00-Signup and Activation/zMailinator/Email - everleagues'))

WebUI.delay(GlobalVariable.delay_3seconds)

String code = WebUI.getText(findTestObject('Object Repository/06-Teams/For 2FA/2FA code'))

WebUI.delay(GlobalVariable.delay_3seconds)

WebUI.closeWindowTitle('Mailinator')

WebUI.delay(GlobalVariable.delay_3seconds)

WebUI.switchToWindowIndex(0)

WebUI.delay(GlobalVariable.delay_3seconds)

WebUI.setText(findTestObject('Object Repository/06-Teams/For 2FA/input_Enter verification code_code'), code)

WebUI.delay(GlobalVariable.delay_3seconds)

WebUI.click(findTestObject('06-Teams/For 2FA/button_Verify_2FA'))

WebUI.delay(GlobalVariable.delay_3seconds)

