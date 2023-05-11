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

WebUI.verifyElementPresent(findTestObject('09-Settings/Users/Active User/div_GTGG tester 2'), 0)

WebUI.click(findTestObject('09-Settings/Users/Active User/button_suspendUser'))

WebUI.verifyElementPresent(findTestObject('09-Settings/Users/Active User/h4_Suspend User'), 0)

WebUI.delay(GlobalVariable.delay_3seconds)

WebUI.click(findTestObject('09-Settings/Users/Active User/button_Suspend'))

WebUI.verifyElementPresent(findTestObject('09-Settings/Users/Active User/span_Successfully suspended user'), 0)

WebUI.delay(GlobalVariable.delay_3seconds)

WebUI.verifyElementPresent(findTestObject('09-Settings/Users/Active User/div_GTGG tester 2'), 0)

WebUI.click(findTestObject('09-Settings/Users/Active User/button_xDeleteuser'))

WebUI.verifyElementPresent(findTestObject('09-Settings/Users/Active User/h4_Delete User'), 0)

WebUI.delay(GlobalVariable.delay_3seconds)

WebUI.click(findTestObject('09-Settings/Users/Active User/button_Delete'))

WebUI.verifyElementPresent(findTestObject('09-Settings/Users/Active User/span_Successfully deleted user'), 0)

WebUI.delay(GlobalVariable.delay_5seconds)

