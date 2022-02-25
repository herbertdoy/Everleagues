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

WebUI.verifyElementVisible(findTestObject('02-Side Icons(Organization)/Add Contact/span_Automation Test Org'))

WebUI.click(findTestObject('05-Chat/01- Creating a Chat group/div_Chat'))

WebUI.delay(1)

WebUI.verifyElementVisible(findTestObject('05-Chat/01- Creating a Chat group/h4_CHAT'))

WebUI.verifyElementVisible(findTestObject('05-Chat/01- Creating a Chat group/div_No chat available'))

WebUI.verifyElementVisible(findTestObject('05-Chat/01- Creating a Chat group/h5_Chat securely with your contacts here'))

WebUI.delay(1)

WebUI.click(findTestObject('05-Chat/01- Creating a Chat group/new chat icon'))

WebUI.delay(1)

WebUI.click(findTestObject('05-Chat/01- Creating a Chat group/div_New Group Chat'))

WebUI.delay(1)

WebUI.verifyElementVisible(findTestObject('05-Chat/01- Creating a Chat group/span_Add group participant'))

WebUI.verifyElementNotPresent(findTestObject('05-Chat/01- Creating a Chat group/button_arrow_forward'), 0)

WebUI.delay(1)

WebUI.setText(findTestObject('05-Chat/01- Creating a Chat group/input_newGroupName'), 'Automation Chat')

WebUI.click(findTestObject('05-Chat/01- Creating a Chat group/div_GTGG tester'))

WebUI.verifyElementVisible(findTestObject('05-Chat/01- Creating a Chat group/GG tester added'))

WebUI.delay(1)

WebUI.click(findTestObject('05-Chat/01- Creating a Chat group/div_GTGG tester 2'))

WebUI.verifyElementVisible(findTestObject('05-Chat/01- Creating a Chat group/GG tester 2 added'))

WebUI.delay(1)

WebUI.click(findTestObject('05-Chat/01- Creating a Chat group/button_arrow_forward'))

WebUI.verifyElementVisible(findTestObject('05-Chat/01- Creating a Chat group/div_Creating Chat'))

WebUI.delay(3)

WebUI.verifyElementVisible(findTestObject('05-Chat/01- Creating a Chat group/div_Automation Chat'))

WebUI.delay(1)

WebUI.closeBrowser()

