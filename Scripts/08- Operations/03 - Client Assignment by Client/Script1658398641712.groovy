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

WebUI.delay(GlobalVariable.delay_3seconds)

WebUI.click(findTestObject('08-Operations/Client Assignment/div_By Client'))

WebUI.verifyElementVisible(findTestObject('08-Operations/Client Assignment/By Client modal'))

WebUI.verifyElementNotClickable(findTestObject('08-Operations/Client Assignment/button_ Assign'))

WebUI.verifyElementNotClickable(findTestObject('08-Operations/Client Assignment/button_Unassign'))

WebUI.delay(GlobalVariable.delay_3seconds)

WebUI.click(findTestObject('08-Operations/Client Assignment/div_GTGG Tester 3'))

//WebUI.verifyElementVisible(findTestObject('08-Operations/Client Assignment/Employees column'))
WebUI.verifyElementVisible(findTestObject('08-Operations/Client Assignment/Employees column 2'))

WebUI.verifyElementVisible(findTestObject('08-Operations/Client Assignment/Assigned Employees empty'))

WebUI.delay(GlobalVariable.delay_3seconds)

WebUI.click(findTestObject('08-Operations/Client Assignment/div_GG TESTER'))

WebUI.click(findTestObject('08-Operations/Client Assignment/button_ Assign'))

WebUI.verifyElementVisible(findTestObject('08-Operations/Client Assignment/Updated assignment msg'))

WebUI.delay(GlobalVariable.delay_3seconds)

WebUI.verifyElementVisible(findTestObject('08-Operations/Client Assignment/Employees column after assign'))

WebUI.verifyElementVisible(findTestObject('08-Operations/Client Assignment/Assigned Employees - GG TESTER'))

WebUI.delay(GlobalVariable.delay_3seconds)

WebUI.click(findTestObject('08-Operations/Client Assignment/div_GG TESTER'))

WebUI.click(findTestObject('08-Operations/Client Assignment/button_Unassign'))

WebUI.verifyElementVisible(findTestObject('08-Operations/Client Assignment/Updated assignment msg'))

WebUI.delay(GlobalVariable.delay_3seconds)

WebUI.verifyElementVisible(findTestObject('08-Operations/Client Assignment/Employees column'))

WebUI.verifyElementVisible(findTestObject('08-Operations/Client Assignment/Assigned Employees empty'))

WebUI.delay(GlobalVariable.delay_3seconds)

