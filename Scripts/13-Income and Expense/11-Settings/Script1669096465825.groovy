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

WebUI.click(findTestObject('13-Income and Expense/button_settings'))

WebUI.verifyElementVisible(findTestObject('13-Income and Expense/mat-dialog-container_Edit CompanyModal'))

WebUI.click(findTestObject('13-Income and Expense/button_CANCEL'))

WebUI.delay(GlobalVariable.delay_2seconds)

WebUI.click(findTestObject('13-Income and Expense/button_settings'))

WebUI.delay(GlobalVariable.delay_2seconds)

WebUI.verifyElementVisible(findTestObject('13-Income and Expense/mat-dialog-container_Edit CompanyModal'))

WebUI.setText(findTestObject('13-Income and Expense/input_CompanyName'), GlobalVariable.edit_company_name)

WebUI.click(findTestObject('13-Income and Expense/dropdown_CompanyType'))

WebUI.scrollToElement(findTestObject('13-Income and Expense/mat-option_Other General Business'), 0)

WebUI.click(findTestObject('13-Income and Expense/mat-option_Other General Business'))

WebUI.click(findTestObject('13-Income and Expense/dropdown_ChoosingDate'))

WebUI.click(findTestObject('13-Income and Expense/mat-option_End of December'))

WebUI.delay(GlobalVariable.delay_3seconds)

WebUI.click(findTestObject('13-Income and Expense/button_UPDATE3'))

WebUI.delay(GlobalVariable.delay_3seconds)

