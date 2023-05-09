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

WebUI.delay(GlobalVariable.delay_2seconds)

WebUI.click(findTestObject('05-Chat/09-Hiding a chat/ellipsis_chat setting'))

WebUI.delay(GlobalVariable.delay_2seconds)

WebUI.verifyElementVisible(findTestObject('05-Chat/09-Hiding a chat/button_Group info'))

WebUI.verifyElementVisible(findTestObject('05-Chat/09-Hiding a chat/button_Hide chat'))

WebUI.delay(GlobalVariable.delay_2seconds)

WebUI.click(findTestObject('05-Chat/09-Hiding a chat/button_Hide chat'))

WebUI.delay(GlobalVariable.delay_2seconds)

WebUI.refresh()

WebUI.delay(GlobalVariable.delay_2seconds)

WebUI.verifyElementVisible(findTestObject('05-Chat/01- Creating a Chat group/div_No chat available'))

WebUI.delay(GlobalVariable.delay_1second)

WebUI.click(findTestObject('05-Chat/09-Hiding a chat/button_search'))

WebUI.setText(findTestObject('05-Chat/09-Hiding a chat/input_search'), 'Auto')

WebUI.delay(GlobalVariable.delay_2seconds)

WebUI.click(findTestObject('05-Chat/02-Sending chat messages/div_AC'))

WebUI.delay(GlobalVariable.delay_2seconds)

WebUI.setText(findTestObject('05-Chat/02-Sending chat messages/textarea__msg'), 'Test auto')

WebUI.click(findTestObject('05-Chat/02-Sending chat messages/button_send'))

WebUI.delay(GlobalVariable.delay_2seconds)

WebUI.refresh()

WebUI.delay(GlobalVariable.delay_2seconds)

