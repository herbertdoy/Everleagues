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

WebUI.click(findTestObject('03-Header Menu/div_Cloud Files'))

WebUI.click(findTestObject('11-Cloud Files/div_Recent'))

WebUI.verifyElementVisible(findTestObject('11-Cloud Files/qa_file'))

WebUI.rightClick(findTestObject('11-Cloud Files/qa_file'))

WebUI.verifyElementVisible(findTestObject('11-Cloud Files/button_Open'))

WebUI.verifyElementVisible(findTestObject('11-Cloud Files/button_folder  Open file location'))

WebUI.verifyElementVisible(findTestObject('11-Cloud Files/button_delete  Remove'))

WebUI.click(findTestObject('11-Cloud Files/button_Open'))

WebUI.delay(GlobalVariable.delay_2s)

WebUI.switchToWindowIndex(1)

WebUI.delay(GlobalVariable.delay_2s)

WebUI.closeWindowIndex(1)

WebUI.delay(GlobalVariable.delay_2s)

WebUI.switchToWindowIndex(0)

WebUI.delay(GlobalVariable.delay_2s)

WebUI.rightClick(findTestObject('11-Cloud Files/qa_file'))

WebUI.click(findTestObject('11-Cloud Files/button_folder  Open file location'))

WebUI.delay(GlobalVariable.delay_2s)

WebUI.switchToWindowIndex(1)

WebUI.delay(GlobalVariable.delay_2s)

WebUI.closeWindowIndex(1)

WebUI.delay(GlobalVariable.delay_2s)

WebUI.switchToWindowIndex(0)

WebUI.delay(GlobalVariable.delay_2s)
