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

WebUI.click(findTestObject('08-Operations/Vendor Assignment/div_Vendor Assignment'))

WebUI.verifyElementVisible(findTestObject('08-Operations/Vendor Assignment/text_VENDOR ASSIGNMENT'))

WebUI.delay(GlobalVariable.delay_2s)

WebUI.click(findTestObject('08-Operations/Client Assignment/div_GG TESTER 2'))

WebUI.verifyElementVisible(findTestObject('08-Operations/Vendor Assignment/div_Assigned Vendors_empty'))

WebUI.delay(GlobalVariable.delay_2s)

WebUI.click(findTestObject('08-Operations/Vendor Assignment/div_GVGG Vendor'))

WebUI.verifyElementClickable(findTestObject('08-Operations/Client Assignment/button_ Assign'))

WebUI.click(findTestObject('08-Operations/Client Assignment/button_ Assign'))

WebUI.waitForElementVisible(findTestObject('08-Operations/Client Assignment/snack-bar-container_Updated assignmentOK'), 
    0)

WebUI.verifyElementVisible(findTestObject('08-Operations/Client Assignment/snack-bar-container_Updated assignmentOK'))

WebUI.delay(GlobalVariable.delay_2s)

WebUI.verifyElementVisible(findTestObject('08-Operations/Vendor Assignment/div_Vendors_empty'))

WebUI.delay(GlobalVariable.delay_2s)

WebUI.click(findTestObject('08-Operations/Vendor Assignment/div_GVGG Vendor'))

WebUI.verifyElementVisible(findTestObject('08-Operations/Client Assignment/button_Unassign'))

WebUI.click(findTestObject('08-Operations/Client Assignment/button_Unassign'))

WebUI.waitForElementVisible(findTestObject('08-Operations/Client Assignment/snack-bar-container_Updated assignmentOK'), 
    0)

WebUI.verifyElementVisible(findTestObject('08-Operations/Client Assignment/snack-bar-container_Updated assignmentOK'))

WebUI.delay(GlobalVariable.delay_2s)

WebUI.verifyElementVisible(findTestObject('08-Operations/Vendor Assignment/div_Assigned Vendors_empty'))

