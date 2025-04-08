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

WebUI.click(findTestObject('00-Signup and Activation/input_password'))

WebUI.click(findTestObject('00-Signup and Activation/input_ConfirmPassword'))

WebUI.click(findTestObject('00-Signup and Activation/input_lastName'))

WebUI.verifyElementVisible(findTestObject('00-Signup and Activation/mat-error_forPasswordField'))

WebUI.verifyElementVisible(findTestObject('00-Signup and Activation/confirmpass_required field'))

WebUI.delay(GlobalVariable.delay_3s)

WebUI.setEncryptedText(findTestObject('00-Signup and Activation/input_password'), GlobalVariable.password, FailureHandling.STOP_ON_FAILURE)

WebUI.setText(findTestObject('00-Signup and Activation/input_ConfirmPassword'), MissmatchPass)

WebUI.click(findTestObject('00-Signup and Activation/input_lastName'))

WebUI.scrollToElement(findTestObject('00-Signup and Activation/div_Passnotmatch'), 0)

WebUI.verifyElementVisible(findTestObject('00-Signup and Activation/div_Passnotmatch'))

WebUI.delay(GlobalVariable.delay_3s)

