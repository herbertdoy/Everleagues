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

WebUI.click(findTestObject('09-Settings/Users/Active User/button_ellipses'))

WebUI.delay(GlobalVariable.delay_2s)

WebUI.click(findTestObject('09-Settings/Users/Active User/button_Delete User'))

WebUI.delay(GlobalVariable.delay_2s)

WebUI.verifyElementPresent(findTestObject('09-Settings/Users/Active User/h4_Delete User'), 0)

WebUI.delay(GlobalVariable.delay_2s)

WebUI.click(findTestObject('09-Settings/Users/Active User/button_Delete'))

WebUI.delay(GlobalVariable.delay_3s)

WebUI.verifyElementPresent(findTestObject('08-Operations/Vendor Assignment/div_GVGG Vendor'), 0)

WebUI.click(findTestObject('09-Settings/Users/Active User/button_ellipses'))

WebUI.delay(GlobalVariable.delay_2s)

WebUI.click(findTestObject('09-Settings/Users/Active User/button_Delete User'))

WebUI.delay(GlobalVariable.delay_2s)

WebUI.click(findTestObject('09-Settings/Users/Active User/button_Delete'))

WebUI.delay(GlobalVariable.delay_3s)

WebUI.verifyElementPresent(findTestObject('09-Settings/Users/Active User/div_GTGG Tester 3'), 0)

WebUI.click(findTestObject('09-Settings/Users/Active User/button_ellipses'))

WebUI.delay(GlobalVariable.delay_2s)

WebUI.click(findTestObject('09-Settings/Users/Active User/button_Delete User'))

WebUI.delay(GlobalVariable.delay_2s)

WebUI.click(findTestObject('09-Settings/Users/Active User/button_Delete'))

WebUI.delay(GlobalVariable.delay_3s)

WebUI.verifyElementPresent(findTestObject('09-Settings/Users/Active User/span_GG Tester 009'), 0)

WebUI.click(findTestObject('09-Settings/Users/Active User/button_ellipses'))

WebUI.delay(GlobalVariable.delay_2s)

WebUI.click(findTestObject('09-Settings/Users/Active User/button_Delete User'), FailureHandling.STOP_ON_FAILURE)

WebUI.delay(GlobalVariable.delay_2s)

WebUI.click(findTestObject('09-Settings/Users/Active User/button_Delete'))

WebUI.delay(GlobalVariable.delay_3s)

WebUI.verifyElementPresent(findTestObject('09-Settings/Users/Active User/div_GPGG Partner'), 0)

WebUI.click(findTestObject('09-Settings/Users/Active User/button_ellipses'))

WebUI.delay(GlobalVariable.delay_2s)

WebUI.click(findTestObject('09-Settings/Users/Active User/button_Delete User'))

WebUI.delay(GlobalVariable.delay_2s)

WebUI.click(findTestObject('09-Settings/Users/Active User/button_Delete'))

WebUI.delay(GlobalVariable.delay_3s)

WebUI.delay(GlobalVariable.delay_3s)

WebUI.verifyElementPresent(findTestObject('09-Settings/Users/Active User/div_GTGG tester'), 0)

WebUI.click(findTestObject('09-Settings/Users/Active User/button_ellipses'))

WebUI.delay(GlobalVariable.delay_2s)

WebUI.click(findTestObject('09-Settings/Users/Active User/button_Delete User'))

WebUI.delay(GlobalVariable.delay_2s)

WebUI.click(findTestObject('09-Settings/Users/Active User/button_Delete'))

WebUI.delay(GlobalVariable.delay_3s)

WebUI.closeBrowser()

