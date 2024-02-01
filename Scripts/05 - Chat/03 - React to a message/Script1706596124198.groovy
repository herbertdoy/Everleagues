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

WebUI.click(findTestObject('05-Chat/03-05 - React and Reply/mat-icon_mood'))

WebUI.click(findTestObject('05-Chat/03-05 - React and Reply/button_react_like'))

WebUI.delay(GlobalVariable.delay_2s)

WebUI.mouseOver(findTestObject('05-Chat/03-05 - React and Reply/div_chat'))

WebUI.click(findTestObject('05-Chat/03-05 - React and Reply/mat-icon_mood'))

WebUI.click(findTestObject('05-Chat/03-05 - React and Reply/button_react_heart'))

WebUI.delay(GlobalVariable.delay_2s)

WebUI.click(findTestObject('05-Chat/03-05 - React and Reply/div_react_heart'))

WebUI.verifyElementVisible(findTestObject('05-Chat/03-05 - React and Reply/h4_Message Reactions'))

WebUI.click(findTestObject('05-Chat/03-05 - React and Reply/div_react_All'))

WebUI.verifyElementVisible(findTestObject('05-Chat/03-05 - React and Reply/div_GG TESTER Click to remove'))

WebUI.delay(GlobalVariable.delay_2s)

WebUI.click(findTestObject('05-Chat/03-05 - React and Reply/div_react'))

WebUI.verifyElementVisible(findTestObject('05-Chat/03-05 - React and Reply/div_GG TESTER Click to remove'))

WebUI.clickOffset(findTestObject('05-Chat/03-05 - React and Reply/div_react_heart'), 10, 0)

//WebUI.refresh()
WebUI.delay(GlobalVariable.delay_3s)

