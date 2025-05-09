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

WebUI.click(findTestObject('09-Settings/Users/Active User/button_ellipses'))

WebUI.click(findTestObject('09-Settings/Users/Active User/button_Edit Role'))

WebUI.delay(GlobalVariable.delay_2s)

WebUI.verifyElementPresent(findTestObject('09-Settings/Users/Active User/h4_Edit User Role'), 0)

WebUI.click(findTestObject('09-Settings/Users/Active User/div_roleDropdown'))

WebUI.click(findTestObject('09-Settings/Users/Active User/mat-option_External Contact'))

WebUI.verifyElementPresent(findTestObject('09-Settings/Users/Active User/warning_when_changing_role'), 0)

WebUI.delay(GlobalVariable.delay_2s)

WebUI.click(findTestObject('09-Settings/Users/Active User/div_roleTypeDropdown'))

WebUI.click(findTestObject('09-Settings/Users/Active User/mat-option_None'))

WebUI.delay(GlobalVariable.delay_2s)

WebUI.click(findTestObject('09-Settings/Users/Active User/button_Save'))

WebUI.delay(GlobalVariable.delay_3s)

WebUI.click(findTestObject('09-Settings/Users/Active User/button_ellipses'))

WebUI.click(findTestObject('09-Settings/Users/Active User/button_Edit Role'))

WebUI.click(findTestObject('09-Settings/Users/Active User/div_roleDropdown'))

WebUI.click(findTestObject('09-Settings/Users/Active User/mat-option_CoWorker'))

WebUI.delay(GlobalVariable.delay_2s)

WebUI.click(findTestObject('09-Settings/Users/Active User/div_roleTypeDropdown'))

WebUI.click(findTestObject('09-Settings/Users/Active User/mat-option_None'))

WebUI.delay(GlobalVariable.delay_2s)

WebUI.click(findTestObject('09-Settings/Users/Active User/button_Save'))

WebUI.waitForElementVisible(findTestObject('09-Settings/Users/Active User/span_Successfully changed user role'), 0)

WebUI.verifyElementPresent(findTestObject('09-Settings/Users/Active User/span_Successfully changed user role'), 0)

WebUI.delay(GlobalVariable.delay_3s)

