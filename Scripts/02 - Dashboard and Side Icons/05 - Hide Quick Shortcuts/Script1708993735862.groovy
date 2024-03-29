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
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable

WebUI.click(findTestObject('02-Side Icons/button_hide quick shortcuts'))

WebUI.delay(GlobalVariable.delay_2s)

WebUI.verifyElementNotPresent(findTestObject('02-Side Icons/button_2FA'), 0)

WebUI.verifyElementNotPresent(findTestObject('02-Side Icons/button_add new user'), 0)

WebUI.verifyElementNotPresent(findTestObject('02-Side Icons/button_Client assignment'), 0)

WebUI.delay(GlobalVariable.delay_2s)

WebUI.click(findTestObject('02-Side Icons/button_Show quick shortcuts'))

WebUI.verifyElementVisible(findTestObject('02-Side Icons/button_2FA'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyElementVisible(findTestObject('02-Side Icons/button_add new user'))

WebUI.verifyElementVisible(findTestObject('02-Side Icons/button_Client assignment'))

WebUI.delay(GlobalVariable.delay_2s)

WebUI.closeBrowser()

