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

WebUI.navigateToUrl('https://lab.everleagues.com/')

WebUI.maximizeWindow()

WebUI.setText(findTestObject('02-Side Icons(Organization)/Add Contact/Email Field'), 'testuser02@mailinator.com')

WebUI.setEncryptedText(findTestObject('02-Side Icons(Organization)/Add Contact/Password Field'), '8yFRyszE6U6jvsCn51OQbg==')

WebUI.click(findTestObject('02-Side Icons(Organization)/Add Contact/button_Sign in'))

WebUI.delay(2)

WebUI.click(findTestObject('04-Add my Organizations/Free limited Plan/span_Add My Organization'))

WebUI.verifyElementVisible(findTestObject('04-Add my Organizations/Free limited Plan/Add my org modal'))

WebUI.delay(2)

WebUI.click(findTestObject('04-Add my Organizations/Pay as you go Plan/Pay as you go radio button'))

WebUI.delay(1)

WebUI.verifyElementVisible(findTestObject('04-Add my Organizations/Pay as you go Plan/input_card-name'))

WebUI.verifyElementVisible(findTestObject('04-Add my Organizations/Pay as you go Plan/input_cardnumber'))

WebUI.verifyElementVisible(findTestObject('04-Add my Organizations/Pay as you go Plan/input_exp-date'))

WebUI.verifyElementVisible(findTestObject('04-Add my Organizations/Pay as you go Plan/input_cvc'))

WebUI.verifyElementVisible(findTestObject('04-Add my Organizations/Pay as you go Plan/input_zip'))

WebUI.delay(1)

WebUI.click(findTestObject('04-Add my Organizations/Free limited Plan/button_Create'))

WebUI.delay(1)

WebUI.verifyElementVisible(findTestObject('04-Add my Organizations/Pay as you go Plan/div_Name is required error'))

WebUI.verifyElementVisible(findTestObject('04-Add my Organizations/Pay as you go Plan/div_ Postal Code is required error'))

WebUI.delay(2)

WebUI.setText(findTestObject('04-Add my Organizations/Pay as you go Plan/input_cardnumber (1)'), '12345678901114')

WebUI.click(findTestObject('04-Add my Organizations/Pay as you go Plan/input_exp-date'))

WebUI.delay(2)

WebUI.setText(findTestObject('04-Add my Organizations/Pay as you go Plan/input_exp-date'), '02/21')

WebUI.click(findTestObject('04-Add my Organizations/Pay as you go Plan/input_card-name'))

WebUI.delay(1)

WebUI.verifyElementVisible(findTestObject('04-Add my Organizations/Pay as you go Plan/div_invalid card number'))

WebUI.verifyElementVisible(findTestObject('04-Add my Organizations/Pay as you go Plan/div_invalid expiry'))

WebUI.delay(1)

WebUI.closeBrowser()

