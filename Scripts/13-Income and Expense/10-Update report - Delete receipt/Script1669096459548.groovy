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

WebUI.click(findTestObject('13-Income and Expense/button_delete_forever'))

WebUI.verifyElementVisible(findTestObject('13-Income and Expense/mat-dialog-container_ReceiptDeleteConfirmationModal'))

WebUI.click(findTestObject('13-Income and Expense/button_No'))

WebUI.delay(3)

WebUI.click(findTestObject('13-Income and Expense/button_delete_forever'))

WebUI.verifyElementVisible(findTestObject('13-Income and Expense/mat-dialog-container_ReceiptDeleteConfirmationModal'))

WebUI.delay(2)

WebUI.click(findTestObject('13-Income and Expense/button_Yes'))

WebUI.delay(2)

WebUI.click(findTestObject('13-Income and Expense/button_BACK'))

WebUI.delay(3)

