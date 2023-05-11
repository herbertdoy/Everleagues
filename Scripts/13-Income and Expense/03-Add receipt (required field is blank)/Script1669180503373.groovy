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

WebUI.click(findTestObject('13-Income and Expense/button_addReceipt'))

WebUI.click(findTestObject('13-Income and Expense/mat-icon_clear'))

WebUI.delay(GlobalVariable.delay_3seconds)

WebUI.click(findTestObject('13-Income and Expense/button_addReceipt'))

WebUI.verifyElementVisible(findTestObject('13-Income and Expense/mat-dialog-container_Add ReceiptModal'))

WebUI.click(findTestObject('13-Income and Expense/input_VendorName'))

WebUI.sendKeys(findTestObject('13-Income and Expense/input_VendorName'), Keys.chord(Keys.ESCAPE))

WebUI.click(findTestObject('13-Income and Expense/input_AccountType'))

WebUI.doubleClick(findTestObject('13-Income and Expense/input_VendorName'))

WebUI.click(findTestObject('13-Income and Expense/input_Amount'))

WebUI.click(findTestObject('13-Income and Expense/input_VendorName'))

WebUI.sendKeys(findTestObject('13-Income and Expense/input_VendorName'), Keys.chord(Keys.ESCAPE))

WebUI.verifyElementVisible(findTestObject('13-Income and Expense/mat-error_Vendor name is required'))

WebUI.verifyElementVisible(findTestObject('13-Income and Expense/mat-error_account type is required'))

WebUI.verifyElementVisible(findTestObject('13-Income and Expense/mat-error_Receipt amount is required'))

WebUI.verifyElementVisible(findTestObject('13-Income and Expense/mat-hint_Required'))

WebUI.scrollToElement(findTestObject('13-Income and Expense/button_Done'), 0)

WebUI.verifyElementNotClickable(findTestObject('13-Income and Expense/button_Done'))

WebUI.delay(GlobalVariable.delay_3seconds)

