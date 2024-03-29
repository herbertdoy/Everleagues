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

WebUI.click(findTestObject('14-Income and Expense/button_visibility'))

WebUI.delay(GlobalVariable.delay_2s)

WebUI.scrollToElement(findTestObject('14-Income and Expense/label_Receipt'), 0)

WebUI.verifyElementVisible(findTestObject('14-Income and Expense/label_Receipt'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.delay(GlobalVariable.delay_3s)

WebUI.scrollToElement(findTestObject('14-Income and Expense/button_CANCEL3'), 0)

WebUI.click(findTestObject('14-Income and Expense/button_CANCEL3'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.delay(GlobalVariable.delay_2s)

WebUI.scrollToElement(findTestObject('03-Header Menu/div_Income and Expense'), 0)

WebUI.click(findTestObject('03-Header Menu/div_Income and Expense'))

WebUI.delay(GlobalVariable.delay_2s)

WebUI.click(findTestObject('14-Income and Expense/button_UPDATE'))

WebUI.delay(GlobalVariable.delay_2s)

WebUI.scrollToElement(findTestObject('14-Income and Expense/label_Income and Expense Report'), 0)

WebUI.click(findTestObject('14-Income and Expense/button_download2'))

WebUI.delay(GlobalVariable.delay_2s)

