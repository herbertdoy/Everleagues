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

WebUI.scrollToElement(findTestObject('09-Settings/Users/div_Organization Units'), 0)

WebUI.click(findTestObject('09-Settings/Users/div_Organization Units'))

WebUI.verifyElementVisible(findTestObject('09-Settings/Organization unit/h4_ORGANIZATION STRUCTURE SETUP'))

WebUI.delay(GlobalVariable.delay_2s)

WebUI.click(findTestObject('09-Settings/Organization unit/button_add'))

WebUI.verifyElementPresent(findTestObject('09-Settings/Organization unit/mat-dialog-container_Add organization unit modal'), 
    0)

WebUI.verifyElementPresent(findTestObject('09-Settings/Organization unit/h4_Name'), 0)

WebUI.click(findTestObject('09-Settings/Organization unit/mat-icon_create'))

WebUI.verifyElementPresent(findTestObject('09-Settings/Organization unit/h4_Select an organization unit'), 0)

WebUI.verifyElementPresent(findTestObject('09-Settings/Organization unit/mat-dialog-container_Select an organization unit modal'), 
    0)

WebUI.delay(GlobalVariable.delay_2s)

WebUI.click(findTestObject('09-Settings/Organization unit/Cancel button for select an organization unit'))

WebUI.delay(GlobalVariable.delay_2s)

WebUI.click(findTestObject('09-Settings/Organization unit/input_Parent Organization Unit Name_orgName'))

WebUI.click(findTestObject('09-Settings/Organization unit/h4_Name'))

WebUI.verifyElementPresent(findTestObject('09-Settings/Organization unit/mat-error_Field is required'), 0)

WebUI.delay(GlobalVariable.delay_2s)

WebUI.click(findTestObject('09-Settings/Users/Active User/button_Cancel_restore'), FailureHandling.STOP_ON_FAILURE)

WebUI.delay(GlobalVariable.delay_2s)

WebUI.click(findTestObject('09-Settings/Organization unit/button_add'))

WebUI.verifyElementPresent(findTestObject('09-Settings/Organization unit/mat-dialog-container_Add organization unit modal'), 
    0)

WebUI.click(findTestObject('09-Settings/Organization unit/mat-icon_create'))

WebUI.verifyElementPresent(findTestObject('09-Settings/Organization unit/mat-dialog-container_Select an organization unit modal'), 
    0)

WebUI.verifyElementPresent(findTestObject('09-Settings/Organization unit/h4_Select an organization unit'), 0)

WebUI.click(findTestObject('09-Settings/Organization unit/div_GG Automation'))

WebUI.delay(GlobalVariable.delay_2s)

WebUI.click(findTestObject('09-Settings/Organization unit/button_Select'))

WebUI.setText(findTestObject('09-Settings/Organization unit/input_Parent Organization Unit Name_orgName'), 'Automation Organization unit')

WebUI.delay(GlobalVariable.delay_2s)

WebUI.click(findTestObject('09-Settings/Users/Active User/button_Save'))

WebUI.verifyElementPresent(findTestObject('09-Settings/Organization unit/span_Successfully added organization unit'), 0)

WebUI.delay(GlobalVariable.delay_2s)

