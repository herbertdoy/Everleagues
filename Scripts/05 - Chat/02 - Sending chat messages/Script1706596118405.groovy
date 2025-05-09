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

WebUI.click(findTestObject('05-Chat/02-Sending chat messages/div_AC'))

WebUI.verifyElementVisible(findTestObject('05-Chat/01- Creating a Chat group/span_a_Chat'))

WebUI.click(findTestObject('05-Chat/02-Sending chat messages/button_chat'))

WebUI.setText(findTestObject('05-Chat/02-Sending chat messages/textarea__msg'), text_message)

WebUI.click(findTestObject('05-Chat/02-Sending chat messages/button_send'))

WebUI.verifyElementVisible(findTestObject('05-Chat/02-Sending chat messages/verify_Testing automation msg'))

WebUI.delay(GlobalVariable.delay_1s)

WebUI.click(findTestObject('05-Chat/02-Sending chat messages/button_insert_emoticon'))

WebUI.verifyElementVisible(findTestObject('05-Chat/02-Sending chat messages/Frequently used'))

WebUI.verifyElementVisible(findTestObject('05-Chat/02-Sending chat messages/smiley and people'))

WebUI.verifyElementVisible(findTestObject('05-Chat/02-Sending chat messages/Animals and nature'))

WebUI.verifyElementVisible(findTestObject('05-Chat/02-Sending chat messages/Food and drink'))

WebUI.verifyElementVisible(findTestObject('05-Chat/02-Sending chat messages/Activity'))

WebUI.verifyElementVisible(findTestObject('05-Chat/02-Sending chat messages/Travel and places'))

WebUI.verifyElementVisible(findTestObject('05-Chat/02-Sending chat messages/Objects'))

WebUI.verifyElementVisible(findTestObject('05-Chat/02-Sending chat messages/Symbols'))

WebUI.delay(GlobalVariable.delay_1s)

WebUI.mouseOver(findTestObject('05-Chat/02-Sending chat messages/textarea__msg'))

WebUI.delay(GlobalVariable.delay_1s)

WebUI.click(findTestObject('05-Chat/02-Sending chat messages/Money Face'))

WebUI.click(findTestObject('05-Chat/02-Sending chat messages/button_send'))

WebUI.delay(GlobalVariable.delay_1s)

WebUI.verifyElementVisible(findTestObject('05-Chat/02-Sending chat messages/money face in chat'))

WebUI.delay(GlobalVariable.delay_1s)

WebUI.setText(findTestObject('05-Chat/02-Sending chat messages/textarea__msg'), starredMessage)

WebUI.click(findTestObject('05-Chat/02-Sending chat messages/button_send'))

WebUI.delay(GlobalVariable.delay_2s)

