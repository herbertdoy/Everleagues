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

WebUI.click(findTestObject('09-Connections/div_Connections'))

WebUI.delay(2)

WebUI.verifyElementVisible(findTestObject('09-Connections/Connections Verifications/span_User Two'))

WebUI.verifyElementVisible(findTestObject('09-Connections/Connections Verifications/span_User Three'))

WebUI.verifyElementVisible(findTestObject('09-Connections/Connections Verifications/span_User  One'))

WebUI.verifyElementVisible(findTestObject('09-Connections/Connections Verifications/mat-icon_search(Connections)'))

WebUI.verifyElementVisible(findTestObject('09-Connections/Connections Verifications/mat-icon_plus(Connections)'))

WebUI.verifyElementVisible(findTestObject('09-Connections/Connections Verifications/mat-icon_filtercontact(Connections)'))

WebUI.delay(2)

