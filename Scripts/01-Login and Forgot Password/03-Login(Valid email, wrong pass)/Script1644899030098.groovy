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

WebUI.setText(findTestObject('01-Login and Forgot Password/input_email'), GlobalVariable.Y_email_withoutSubscription_testuser01)

WebUI.setEncryptedText(findTestObject('01-Login and Forgot Password/input_password'), 'OxgQgnWTiECE3BxjMAl2ng==')

WebUI.delay(GlobalVariable.delay_2s)

WebUI.click(findTestObject('01-Login and Forgot Password/button_show pass button'))

WebUI.delay(GlobalVariable.delay_3s)

WebUI.click(findTestObject('01-Login and Forgot Password/button_Sign in'))

WebUI.delay(GlobalVariable.delay_3s)

WebUI.verifyElementPresent(findTestObject('01-Login and Forgot Password/div_Invalid user name or password'), 0)

WebUI.delay(GlobalVariable.delay_2s)

