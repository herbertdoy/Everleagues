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

WebUI.delay(GlobalVariable.delay_2s)

WebUI.click(findTestObject('09-Settings/Users/div_Users'))

WebUI.delay(GlobalVariable.delay_2s)

WebUI.click(findTestObject('09-Settings/Users/Active User/btn_Edit'))

WebUI.delay(GlobalVariable.delay_2s)

WebUI.verifyElementVisible(findTestObject('09-Settings/Users/Active User/h2_Edit User Org Unit'))

WebUI.click(findTestObject('09-Settings/Users/Active User/mat-icon_edit'))

WebUI.click(findTestObject('09-Settings/Users/Active User/toggle_arrowicon'))

WebUI.click(findTestObject('09-Settings/Users/Active User/span_automationOrgUnit'))

WebUI.delay(GlobalVariable.delay_2s)

WebUI.click(findTestObject('09-Settings/Users/Active User/btn_select'))

WebUI.delay(GlobalVariable.delay_2s)

WebUI.verifyElementVisible(findTestObject('09-Settings/Users/Active User/mat_hint_warning'))

WebUI.click(findTestObject('09-Settings/Users/Active User/btn_save'))

WebUI.waitForElementVisible(findTestObject('09-Settings/Users/Active User/snackbar_changeorg'), 0)

WebUI.verifyElementVisible(findTestObject('09-Settings/Users/Active User/snackbar_changeorg'))

WebUI.delay(GlobalVariable.delay_2s)

WebUI.click(findTestObject('09-Settings/Users/Active User/btn_Edit'))

WebUI.click(findTestObject('09-Settings/Users/Active User/mat-icon_edit'))

WebUI.delay(GlobalVariable.delay_2s)

WebUI.click(findTestObject('09-Settings/Users/Active User/span_GG utomation'))

WebUI.delay(GlobalVariable.delay_2s)

WebUI.click(findTestObject('09-Settings/Users/Active User/btn_select'))

WebUI.click(findTestObject('09-Settings/Users/Active User/btn_save'))

WebUI.delay(GlobalVariable.delay_2s)

