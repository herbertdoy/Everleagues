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

WebUI.click(findTestObject('00-Signup and Activation/span_Sign up'))

WebUI.delay(GlobalVariable.delay_2s)

WebUI.verifyElementVisible(findTestObject('00-Signup and Activation/div_Already have an account Log In'))

WebUI.delay(GlobalVariable.delay_2s)

WebUI.verifyElementNotClickable(findTestObject('00-Signup and Activation/button_Sign up'))

WebUI.delay(GlobalVariable.delay_2s)

WebUI.click(findTestObject('00-Signup and Activation/input_Email'))

WebUI.click(findTestObject('00-Signup and Activation/input_firstName'))

WebUI.click(findTestObject('00-Signup and Activation/input_lastName'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('00-Signup and Activation/input_Email'))

WebUI.delay(GlobalVariable.delay_2s)

WebUI.verifyElementVisible(findTestObject('00-Signup and Activation/mat-error_Field is required_E'))

WebUI.verifyElementVisible(findTestObject('00-Signup and Activation/mat-error_Field is required_F'))

WebUI.verifyElementVisible(findTestObject('00-Signup and Activation/mat-error_Field is required_L'))

WebUI.delay(GlobalVariable.delay_2s)

