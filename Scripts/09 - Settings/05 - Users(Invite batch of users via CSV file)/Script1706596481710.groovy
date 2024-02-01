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

WebUI.callTestCase(findTestCase('01 - Login and Forgot Password/04 - Login(Valid Credentials-testuser00005)'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('06-Teams/button_doublearrow'))

WebUI.click(findTestObject('06-Teams/button_My Organizations'))

WebUI.click(findTestObject('06-Teams/button_GG Automation'))

WebUI.delay(GlobalVariable.delay_3s)

WebUI.verifyElementVisible(findTestObject('06-Teams/span_GG Automation'))

WebUI.delay(GlobalVariable.delay_2s)

WebUI.click(findTestObject('03-Header Menu/div_Settings'))

WebUI.delay(GlobalVariable.delay_2s)

WebUI.scrollToElement(findTestObject('09-Settings/Users/div_Users'), 0)

WebUI.click(findTestObject('09-Settings/Users/div_Users'))

WebUI.delay(GlobalVariable.delay_2s)

WebUI.click(findTestObject('09-Settings/Users/button_add'))

WebUI.delay(GlobalVariable.delay_2s)

WebUI.click(findTestObject('09-Settings/Users/Invite batch of users via CSV file'))

WebUI.verifyElementVisible(findTestObject('09-Settings/Users/CSV Invite/modal_Import CSV File'))

WebUI.verifyElementNotClickable(findTestObject('09-Settings/Users/CSV Invite/button_Import'))

WebUI.delay(GlobalVariable.delay_3s)

CustomKeywords.'com.kms.katalon.keyword.uploadfile.UploadFile.uploadFile'(findTestObject('Object Repository/09-Settings/Users/CSV Invite/button_Choose File'), 
    GlobalVariable.upload_csv_file)

WebUI.delay(GlobalVariable.delay_3s)

WebUI.verifyElementVisible(findTestObject('09-Settings/Users/CSV Invite/div_Sample csv.csv'))

WebUI.click(findTestObject('09-Settings/Users/CSV Invite/button_Import'))

WebUI.delay(GlobalVariable.delay_3s)

WebUI.verifyElementVisible(findTestObject('09-Settings/Users/CSV Invite/Success import modal'))

WebUI.click(findTestObject('09-Settings/Users/CSV Invite/button_Close'))

WebUI.click(findTestObject('09-Settings/Users/CSV Invite/Invited Users tab'))

WebUI.delay(GlobalVariable.delay_3s)

WebUI.verifyElementVisible(findTestObject('09-Settings/Users/CSV Invite/div_CTCSV test3'))

WebUI.verifyElementVisible(findTestObject('09-Settings/Users/CSV Invite/div_autotester08mailinator.com'))

WebUI.verifyElementVisible(findTestObject('09-Settings/Users/CSV Invite/div_Partner'))

WebUI.verifyElementVisible(findTestObject('09-Settings/Users/CSV Invite/div_CTCSV test2'))

WebUI.verifyElementVisible(findTestObject('09-Settings/Users/CSV Invite/div_autotester07mailinator.com'))

WebUI.verifyElementVisible(findTestObject('09-Settings/Users/CSV Invite/div_Client'))

WebUI.verifyElementVisible(findTestObject('09-Settings/Users/CSV Invite/div_CTCSV test1'))

WebUI.verifyElementVisible(findTestObject('09-Settings/Users/CSV Invite/div_autotester06mailinator.com'))

WebUI.verifyElementVisible(findTestObject('09-Settings/Users/CSV Invite/div_Coworker'))

WebUI.delay(GlobalVariable.delay_3s)

WebUI.closeBrowser()

