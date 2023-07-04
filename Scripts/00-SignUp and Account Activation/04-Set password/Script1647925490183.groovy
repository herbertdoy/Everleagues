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

WebUI.delay(GlobalVariable.delay_2seconds)

WebUI.setEncryptedText(findTestObject('00-Signup and Activation/input_password'), GlobalVariable.password, FailureHandling.STOP_ON_FAILURE)

WebUI.setEncryptedText(findTestObject('00-Signup and Activation/input_ConfirmPassword'), GlobalVariable.password, FailureHandling.STOP_ON_FAILURE)

WebUI.delay(GlobalVariable.delay_2seconds)

WebUI.click(findTestObject('00-Signup and Activation/show pass'))

WebUI.click(findTestObject('00-Signup and Activation/show confirm pass'))

WebUI.delay(GlobalVariable.delay_2seconds)

WebUI.check(findTestObject('00-Signup and Activation/div_checkbox'))

WebUI.delay(GlobalVariable.delay_2seconds)

WebUI.click(findTestObject('00-Signup and Activation/button_Confirm'))

WebUI.delay(GlobalVariable.delay_5seconds)

WebUI.verifyElementVisible(findTestObject('00-Signup and Activation/h4_Welcome to Everleagues'))

WebUI.verifyElementVisible(findTestObject('00-Signup and Activation/span_CREATE A BUSINESS ORGANIZATION'))

WebUI.verifyElementVisible(findTestObject('00-Signup and Activation/span_INVITE YOUR FRIENDS  FAMILY'))

WebUI.delay(GlobalVariable.delay_3seconds)

WebUI.click(findTestObject('00-Signup and Activation/button_DO THIS LATER'))

WebUI.delay(GlobalVariable.delay_2seconds)

//WebUI.verifyElementVisible(findTestObject('00-Signup and Activation/Create your first organization Card'))
//WebUI.verifyElementVisible(findTestObject('00-Signup and Activation/Still not sure where to start Card'))
//WebUI.verifyElementVisible(findTestObject('00-Signup and Activation/Welcome to Everleagues Card'))
//WebUI.delay(2)
WebUI.closeBrowser()

