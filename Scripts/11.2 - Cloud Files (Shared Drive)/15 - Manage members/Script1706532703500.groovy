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

//WebUI.openBrowser('')
//
//WebUI.navigateToUrl(GlobalVariable.URL_lab)
//
//WebUI.maximizeWindow()
//
//WebUI.callTestCase(findTestCase('01 - Login and Forgot Password/04 - Login(Valid Credentials-Without Subscription)'), [:], 
//    FailureHandling.CONTINUE_ON_FAILURE)
//
//WebUI.delay(15)
WebUI.doubleClick(findTestObject('11-Cloud Files/span_shared drive'))

WebUI.refresh()

WebUI.delay(GlobalVariable.delay_2s)

WebUI.rightClick(findTestObject('11-Cloud Files/td_Automation Driver EDIT'))

WebUI.click(findTestObject('11-Cloud Files/button_person_add  Manage Members'))

WebUI.click(findTestObject('11-Cloud Files/input_Add Users'))

WebUI.click(findTestObject('11-Cloud Files/mat-option_GG tester 2 (norvs26yopmail.com)2'))

WebUI.delay(GlobalVariable.delay_2s)

WebUI.click(findTestObject('11-Cloud Files/div_dropdown'))

WebUI.click(findTestObject('11-Cloud Files/mat-option_manager'))

WebUI.click(findTestObject('11-Cloud Files/button_Save  Add Users'))

WebUI.verifyElementVisible(findTestObject('11-Cloud Files/snack-bar-container_Shared file access updated successfully.OK'))

WebUI.delay(GlobalVariable.delay_2s)

WebUI.click(findTestObject('11-Cloud Files/mat-icon_close'))

WebUI.delay(GlobalVariable.delay_3s)

WebUI.closeBrowser()

