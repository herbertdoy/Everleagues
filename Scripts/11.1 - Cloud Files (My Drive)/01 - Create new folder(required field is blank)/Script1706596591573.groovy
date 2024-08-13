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

WebUI.callTestCase(findTestCase('01 - Login and Forgot Password/04 - Login(Valid Credentials-testusercloudfiles)'), [:], 
    FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('11-Cloud Files/Arrow_btn'))

WebUI.click(findTestObject('06-Teams/button_My Organizations'))

WebUI.click(findTestObject('11-Cloud Files/button_Automation Test Org I'))

WebUI.delay(GlobalVariable.delay_3s)

WebUI.verifyElementVisible(findTestObject('02-Side Icons/span_Automation Test Org (1)'))

WebUI.delay(GlobalVariable.delay_2s)

WebUI.click(findTestObject('03-Header Menu/div_Cloud Files'))

WebUI.scrollToElement(findTestObject('11-Cloud Files/a_My Drive'), 0)

WebUI.verifyElementVisible(findTestObject('11-Cloud Files/a_My Drive'))

WebUI.verifyElementVisible(findTestObject('11-Cloud Files/a_Shared Drive'))

WebUI.verifyElementVisible(findTestObject('11-Cloud Files/a_Shared With Me'))

WebUI.click(findTestObject('11-Cloud Files/a_My Drive'))

WebUI.verifyElementVisible(findTestObject('11-Cloud Files/h4_CLOUD STORAGE'))

WebUI.verifyElementVisible(findTestObject('11-Cloud Files/h4_MY DRIVE'))

WebUI.delay(GlobalVariable.delay_2s)

WebUI.click(findTestObject('11-Cloud Files/button_create_new_folderNew Folder'))

WebUI.verifyElementVisible(findTestObject('11-Cloud Files/mat-dialog-container_CreateNewFolder modal'))

WebUI.verifyElementVisible(findTestObject('11-Cloud Files/h4_New folder'))

WebUI.click(findTestObject('11-Cloud Files/input_folderName'), FailureHandling.STOP_ON_FAILURE)

WebUI.clickOffset(findTestObject('11-Cloud Files/input_folderName'), 50, 50)

WebUI.verifyElementVisible(findTestObject('11-Cloud Files/mat-error_filename'))

WebUI.verifyElementNotClickable(findTestObject('11-Cloud Files/button_Create'))

WebUI.delay(GlobalVariable.delay_3s)

