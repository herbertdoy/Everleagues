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

WebUI.setText(findTestObject('14-Income and Expense/input_VendorName'), vendor_name)

WebUI.click(findTestObject('14-Income and Expense/input_Amount'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.delay(GlobalVariable.delay_2s)

WebUI.click(findTestObject('14-Income and Expense/input_AccountType'))

WebUI.click(findTestObject('14-Income and Expense/mat-option_5090-Other income'))

WebUI.click(findTestObject('14-Income and Expense/button_Receipt Date'))

WebUI.clickOffset(findTestObject('14-Income and Expense/button_Receipt Date'), 10, 10)

WebUI.setText(findTestObject('14-Income and Expense/input_Amount'), add_amount)

WebUI.setText(findTestObject('14-Income and Expense/input_AddANote'), add_note)

CustomKeywords.'uploadpackage.Upload.uploadFile'(findTestObject('Object Repository/14-Income and Expense/div_Required_uploadfilecontainer'), 
    GlobalVariable.upload_pdf_file)

WebUI.delay(GlobalVariable.delay_2s)

WebUI.click(findTestObject('14-Income and Expense/button_Done'))

WebUI.delay(GlobalVariable.delay_2s)

