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

WebUI.setText(findTestObject('13-Income and Expense/input_CompanyName'), GlobalVariable.company_name)

WebUI.click(findTestObject('13-Income and Expense/dropdown_CompanyType'))

WebUI.click(findTestObject('13-Income and Expense/mat-option_Consulting'))

WebUI.click(findTestObject('13-Income and Expense/dropdown_ChoosingDate'))

WebUI.click(findTestObject('13-Income and Expense/mat-option_End of September'))

WebUI.click(findTestObject('13-Income and Expense/mat-icon_account'))

//WebUI.click(findTestObject('13-Income and Expense/mat-option_GG tester 2'))
WebUI.click(findTestObject('13-Income and Expense/mat-option_GG TESTER'))

WebUI.delay(GlobalVariable.delay_1second)

WebUI.click(findTestObject('13-Income and Expense/button_BEGIN'))

WebUI.delay(GlobalVariable.delay_3seconds)

