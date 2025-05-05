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

WebUI.click(findTestObject('06-Teams/btn_reply'))

WebUI.delay(GlobalVariable.delay_2s)

WebUI.setText(findTestObject('06-Teams/textarea_comment'), comment_Private)

WebUI.scrollToElement(findTestObject('06-Teams/btn_send'), 0)

WebUI.click(findTestObject('06-Teams/btn_send'))

WebUI.delay(GlobalVariable.delay_2s)

WebUI.verifyElementVisible(findTestObject('06-Teams/span_AutomationComment'))

WebUI.delay(GlobalVariable.delay_2s)

WebUI.uploadFile(findTestObject('06-Teams/btn_uploadFile'), GlobalVariable.upload_pdf_file)

WebUI.scrollToElement(findTestObject('06-Teams/btn_send'), 0)

WebUI.click(findTestObject('06-Teams/btn_send'))

WebUI.delay(GlobalVariable.delay_2s)

WebUI.uploadFile(findTestObject('06-Teams/btn_uploadImage'), GlobalVariable.upload_file)

WebUI.click(findTestObject('06-Teams/btn_send'))

WebUI.delay(GlobalVariable.delay_2s)

WebUI.scrollToElement(findTestObject('06-Teams/btn_SeeMoreCom'), 0)

WebUI.click(findTestObject('06-Teams/btn_SeeMoreCom'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.delay(GlobalVariable.delay_2s)

