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

WebUI.callTestCase(findTestCase('01 - Login and Forgot Password/04 - Login(Valid Credentials-testuser01)'), [:], FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('06-Teams/button_doublearrow'))

WebUI.click(findTestObject('06-Teams/button_My Organizations'))

WebUI.click(findTestObject('02-Side Icons/button_Automation Test Org'))

WebUI.delay(GlobalVariable.delay_3s)

WebUI.verifyElementVisible(findTestObject('02-Side Icons/span_Automation Test Org (1)'))

WebUI.delay(GlobalVariable.delay_2s)

WebUI.scrollToElement(findTestObject('03-Header Menu/div_Income and Expense'), 0)

WebUI.click(findTestObject('03-Header Menu/div_Income and Expense'))

WebUI.delay(GlobalVariable.delay_2s)

WebUI.verifyElementVisible(findTestObject('14-Income and Expense/div_IncomeAndExpense'))

WebUI.verifyElementVisible(findTestObject('14-Income and Expense/label_Income Expense Tracker'))

WebUI.delay(GlobalVariable.delay_2s)

WebUI.click(findTestObject('14-Income and Expense/button_ADD COMPANY'))

WebUI.click(findTestObject('14-Income and Expense/mat-icon_clear'))

WebUI.delay(GlobalVariable.delay_2s)

WebUI.click(findTestObject('14-Income and Expense/button_ADD COMPANY'))

WebUI.delay(GlobalVariable.delay_2s)

WebUI.verifyElementVisible(findTestObject('14-Income and Expense/mat-dialog-container_Add CompanyModal'))

WebUI.click(findTestObject('14-Income and Expense/input_CompanyName'))

WebUI.click(findTestObject('14-Income and Expense/dropdown_CompanyType'))

WebUI.doubleClick(findTestObject('14-Income and Expense/input_CompanyName'))

WebUI.click(findTestObject('14-Income and Expense/dropdown_ChoosingDate'))

WebUI.doubleClick(findTestObject('14-Income and Expense/mat-icon_account'))

WebUI.click(findTestObject('14-Income and Expense/input_CompanyName'))

WebUI.verifyElementVisible(findTestObject('14-Income and Expense/mat-error_Company name is required'))

WebUI.verifyElementVisible(findTestObject('14-Income and Expense/mat-error_Company type is required'))

WebUI.verifyElementNotClickable(findTestObject('14-Income and Expense/button_BEGIN'))

WebUI.delay(GlobalVariable.delay_2s)

