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
import org.openqa.selenium.Keys as Keys

WebUI.openBrowser('')

WebUI.navigateToUrl('https://lab.everleagues.com/login?returnUrl=%2Fmain%2Fdashboard')

WebUI.maximizeWindow()

WebUI.setText(findTestObject('04-Side Icons(Organization)/Add Contact/Email Field'), 'testuser01@mailinator.com')

WebUI.setEncryptedText(findTestObject('04-Side Icons(Organization)/Add Contact/Password Field'), '8yFRyszE6U6jvsCn51OQbg==')

WebUI.click(findTestObject('04-Side Icons(Organization)/Add Contact/button_Sign in'))

WebUI.click(findTestObject('04-Side Icons(Organization)/Add Contact/Side Menu double arrow icon'))

WebUI.click(findTestObject('04-Side Icons(Organization)/Add Contact/button_My Organizations'))

WebUI.click(findTestObject('04-Side Icons(Organization)/Add Contact/button_Automation Test Org'))

WebUI.verifyElementVisible(findTestObject('04-Side Icons(Organization)/Add Contact/span_Automation Test Org'))

WebUI.delay(3)

WebUI.click(findTestObject('04-Side Icons(Organization)/Add Contact/button_add new user'))

WebUI.delay(3)

WebUI.verifyElementVisible(findTestObject('04-Side Icons(Organization)/Add Contact/add new user modal'))

WebUI.delay(2)

WebUI.closeBrowser()

