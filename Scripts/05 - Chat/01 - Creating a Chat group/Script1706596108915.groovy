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

WebUI.callTestCase(findTestCase('01 - Login and Forgot Password/04 - Login(Valid Credentials-testuser01)'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.delay(GlobalVariable.delay_2s)

WebUI.click(findTestObject('02-Side Icons/mat-icon_Side Menu double arrow icon'))

WebUI.delay(GlobalVariable.delay_2s)

WebUI.click(findTestObject('02-Side Icons/button_My Organizations'))

WebUI.delay(GlobalVariable.delay_2s)

WebUI.click(findTestObject('02-Side Icons/button_Automation Test Org'))

WebUI.delay(GlobalVariable.delay_2s)

WebUI.verifyElementVisible(findTestObject('02-Side Icons/span_Automation Test Org (1)'))

WebUI.click(findTestObject('05-Chat/01- Creating a Chat group/div_Chat'))

WebUI.delay(GlobalVariable.delay_2s)

WebUI.verifyElementVisible(findTestObject('05-Chat/01- Creating a Chat group/h4_CHAT'))

WebUI.verifyElementVisible(findTestObject('05-Chat/01- Creating a Chat group/div_No chat available'))

WebUI.verifyElementVisible(findTestObject('05-Chat/01- Creating a Chat group/h5_Chat securely with your contacts here'))

WebUI.delay(GlobalVariable.delay_2s)

WebUI.click(findTestObject('05-Chat/01- Creating a Chat group/new chat icon'))

WebUI.delay(GlobalVariable.delay_2s)

WebUI.click(findTestObject('05-Chat/01- Creating a Chat group/div_New Group Chat'))

WebUI.delay(GlobalVariable.delay_1s)

WebUI.verifyElementVisible(findTestObject('05-Chat/01- Creating a Chat group/span_Add group participant'))

WebUI.delay(GlobalVariable.delay_1s)

WebUI.setText(findTestObject('05-Chat/01- Creating a Chat group/input_newGroupName'), 'Automation Chat')

WebUI.click(findTestObject('05-Chat/01- Creating a Chat group/div_GTGG tester'))

WebUI.verifyElementVisible(findTestObject('05-Chat/01- Creating a Chat group/GG tester added'))

WebUI.delay(GlobalVariable.delay_1s)

WebUI.click(findTestObject('05-Chat/01- Creating a Chat group/div_GTGG tester 2'))

WebUI.verifyElementVisible(findTestObject('05-Chat/01- Creating a Chat group/GG tester 2 added'))

WebUI.delay(GlobalVariable.delay_1s)

WebUI.click(findTestObject('05-Chat/01- Creating a Chat group/button_arrow_forward'))

WebUI.delay(GlobalVariable.delay_2s)

WebUI.verifyElementVisible(findTestObject('05-Chat/01- Creating a Chat group/div_Automation Chat'))

WebUI.delay(GlobalVariable.delay_2s)

