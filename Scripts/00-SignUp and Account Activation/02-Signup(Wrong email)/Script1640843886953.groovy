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

WebUI.setText(findTestObject('00-Signup and Activation/input_Email'), GlobalVariable.invalid_email)

WebUI.delay(GlobalVariable.delay_2seconds)

WebUI.click(findTestObject('00-Signup and Activation/input_firstName'))

WebUI.verifyElementPresent(findTestObject('00-Signup and Activation/error_valid email is required'), 0)

WebUI.delay(GlobalVariable.delay_2seconds)

WebUI.setText(findTestObject('00-Signup and Activation/input_Email'), GlobalVariable.email_without_subscription)

WebUI.delay(GlobalVariable.delay_2seconds)

WebUI.click(findTestObject('00-Signup and Activation/input_firstName'))

WebUI.verifyElementVisible(findTestObject('00-Signup and Activation/error_email already exists'))

WebUI.delay(GlobalVariable.delay_2seconds)

