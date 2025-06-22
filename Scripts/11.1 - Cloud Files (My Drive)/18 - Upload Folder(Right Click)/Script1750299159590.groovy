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

WebUI.doubleClick(findTestObject('11-Cloud Files/td_specialCharac'))

WebUI.delay(GlobalVariable.delay_2s)

WebUI.rightClick(findTestObject('11-Cloud Files/div_table'))

WebUI.delay(GlobalVariable.delay_3s)

WebUI.uploadFile(findTestObject('11-Cloud Files/btn_UploadLocalFolder'), GlobalVariable.Folder)

WebUI.waitForElementPresent(findTestObject('11-Cloud Files/span_folderIsBeingUploaded'), 0)

WebUI.verifyElementPresent(findTestObject('11-Cloud Files/span_folderIsBeingUploaded'), 0)

WebUI.waitForElementPresent(findTestObject('11-Cloud Files/b_successfullyUpload'), 0)

WebUI.verifyElementPresent(findTestObject('11-Cloud Files/b_successfullyUpload'), 0)

WebUI.waitForElementPresent(findTestObject('11-Cloud Files/span_Folder'), 0)

WebUI.verifyElementPresent(findTestObject('11-Cloud Files/span_Folder'), 0)

WebUI.delay(GlobalVariable.delay_2s)

WebUI.click(findTestObject('11-Cloud Files/div_My Drive'))

WebUI.delay(GlobalVariable.delay_2s)

