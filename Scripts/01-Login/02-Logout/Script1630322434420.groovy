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

WebUI.openBrowser('')

WebUI.navigateToUrl('https://lab.everleagues.com/')

WebUI.maximizeWindow()

WebUI.setText(findTestObject('Object Repository/01-Login/input_Email_email'), 'norvs26@mailinator.com')

WebUI.setEncryptedText(findTestObject('Object Repository/01-Login/input_Email_password'), '8yFRyszE6U6jvsCn51OQbg==')

WebUI.click(findTestObject('Object Repository/01-Login/button_Sign in'))

WebUI.delay(2)

WebUI.click(findTestObject('01-Login/div_NT'))

WebUI.delay(1)

WebUI.click(findTestObject('01-Login/h4_Sign Out'))

WebUI.delay(3)

WebUI.verifyElementVisible(findTestObject('01-Login/Login_Card'))

