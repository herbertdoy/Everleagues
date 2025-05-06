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

WebUI.click(findTestObject('08-Operations/Private Circle/Select User dropdown'))

WebUI.delay(GlobalVariable.delay_2s)

WebUI.verifyElementVisible(findTestObject('08-Operations/Private Circle/span_New Contact'))

WebUI.verifyElementVisible(findTestObject('08-Operations/Private Circle/mat-option_GG TESTER'))

WebUI.verifyElementVisible(findTestObject('08-Operations/Private Circle/mat-option_GG tester 2'))

WebUI.delay(GlobalVariable.delay_2s)

WebUI.click(findTestObject('08-Operations/Private Circle/mat-option_GG TESTER'))

WebUI.delay(GlobalVariable.delay_2s)

WebUI.click(findTestObject('08-Operations/Private Circle/Relationship dropdown'))

WebUI.delay(GlobalVariable.delay_2s)

WebUI.verifyElementVisible(findTestObject('08-Operations/Private Circle/mat-option_Spouse'))

WebUI.verifyElementVisible(findTestObject('08-Operations/Private Circle/mat-option_Child'))

WebUI.verifyElementVisible(findTestObject('08-Operations/Private Circle/mat-option_Friend'))

WebUI.verifyElementVisible(findTestObject('08-Operations/Private Circle/mat-option_Colleague'))

WebUI.verifyElementVisible(findTestObject('08-Operations/Private Circle/mat-option_Others'))

WebUI.click(findTestObject('08-Operations/Private Circle/mat-option_Others'))

WebUI.delay(GlobalVariable.delay_2s)

WebUI.click(findTestObject('08-Operations/Private Circle/button_Add modal'))

WebUI.waitForElementVisible(findTestObject('08-Operations/Private Circle/Successfully added association'), 0)

WebUI.verifyElementVisible(findTestObject('08-Operations/Private Circle/Successfully added association'))

WebUI.delay(GlobalVariable.delay_3s)

WebUI.verifyElementVisible(findTestObject('08-Operations/Private Circle/td_GG TESTER'))

WebUI.delay(GlobalVariable.delay_2s)

