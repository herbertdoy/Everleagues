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

WebUI.click(findTestObject('09-Settings/Users/Active User/filter_icon'))

WebUI.verifyElementVisible(findTestObject('09-Settings/Users/Active User/h6_Filter'))

WebUI.verifyElementVisible(findTestObject('09-Settings/Users/Active User/span_Show deleted user'))

WebUI.click(findTestObject('09-Settings/Users/Active User/div_show-deleted-user-toggle-bar'))

WebUI.delay(GlobalVariable.delay_3seconds)

WebUI.click(findTestObject('09-Settings/Users/Active User/filter_icon'))

WebUI.verifyElementVisible(findTestObject('09-Settings/Users/Active User/div_GTGG tester 2'))

WebUI.click(findTestObject('09-Settings/Users/Active User/button_replay'))

WebUI.verifyElementVisible(findTestObject('09-Settings/Users/Active User/h4_Restore User'))

WebUI.click(findTestObject('09-Settings/Users/Active User/button_Restore'))

WebUI.verifyElementVisible(findTestObject('09-Settings/Users/Active User/span_Successfully restored user'))

WebUI.delay(GlobalVariable.delay_3seconds)

WebUI.click(findTestObject('09-Settings/Users/Active User/filter_icon'))

WebUI.delay(GlobalVariable.delay_4seconds)

