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

WebUI.mouseOver(findTestObject('05-Chat/03-05 - React and Reply/div_chat'))

WebUI.click(findTestObject('05-Chat/03-05 - React and Reply/btn_expandless'))

WebUI.click(findTestObject('05-Chat/03-05 - React and Reply/button_Reply'))

WebUI.delay(GlobalVariable.delay_2s)

WebUI.verifyElementVisible(findTestObject('05-Chat/03-05 - React and Reply/div_reply'))

WebUI.click(findTestObject('05-Chat/03-05 - React and Reply/mat-icon_cancel'), FailureHandling.STOP_ON_FAILURE)

WebUI.delay(GlobalVariable.delay_2s)

WebUI.mouseOver(findTestObject('05-Chat/03-05 - React and Reply/div_chat'))

WebUI.click(findTestObject('05-Chat/03-05 - React and Reply/btn_expandless'))

WebUI.click(findTestObject('05-Chat/03-05 - React and Reply/button_Reply'))

WebUI.delay(GlobalVariable.delay_2s)

WebUI.verifyElementVisible(findTestObject('05-Chat/03-05 - React and Reply/div_reply'))

WebUI.setText(findTestObject('05-Chat/02-Sending chat messages/textarea__msg'), text_message)

WebUI.click(findTestObject('05-Chat/02-Sending chat messages/button_send'))

WebUI.verifyElementVisible(findTestObject('05-Chat/03-05 - React and Reply/div_reply_chat'))

WebUI.delay(GlobalVariable.delay_3s)

