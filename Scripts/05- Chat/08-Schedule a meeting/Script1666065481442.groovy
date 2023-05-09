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

WebUI.click(findTestObject('05-Chat/08-Schedule a meeting/button_schedule a meeting'))

WebUI.delay(GlobalVariable.delay_2seconds)

WebUI.verifyElementVisible(findTestObject('05-Chat/08-Schedule a meeting/Meeting title field'))

WebUI.verifyElementVisible(findTestObject('05-Chat/08-Schedule a meeting/div_Start Date'))

WebUI.verifyElementVisible(findTestObject('05-Chat/08-Schedule a meeting/div_End Date'))

WebUI.verifyElementVisible(findTestObject('05-Chat/08-Schedule a meeting/div_Recurrence'))

WebUI.delay(GlobalVariable.delay_2seconds)

WebUI.click(findTestObject('05-Chat/08-Schedule a meeting/button_Start Date_calendar'))

WebUI.verifyElementVisible(findTestObject('05-Chat/08-Schedule a meeting/calendar modal'))

WebUI.delay(GlobalVariable.delay_2seconds)

WebUI.doubleClick(findTestObject('05-Chat/08-Schedule a meeting/button_End Date_calendar'))

WebUI.verifyElementVisible(findTestObject('05-Chat/08-Schedule a meeting/calendar modal'))

WebUI.delay(GlobalVariable.delay_3seconds)

WebUI.doubleClick(findTestObject('05-Chat/08-Schedule a meeting/div_recurrence_selectarror'))

WebUI.verifyElementVisible(findTestObject('05-Chat/08-Schedule a meeting/span_Does not repeat'))

WebUI.verifyElementVisible(findTestObject('05-Chat/08-Schedule a meeting/span_Daily'))

WebUI.verifyElementVisible(findTestObject('05-Chat/08-Schedule a meeting/span_Weekly'))

WebUI.verifyElementVisible(findTestObject('05-Chat/08-Schedule a meeting/span_Monthly'))

WebUI.verifyElementVisible(findTestObject('05-Chat/08-Schedule a meeting/span_Every weekday'))

WebUI.click(findTestObject('05-Chat/08-Schedule a meeting/span_Daily'), FailureHandling.STOP_ON_FAILURE)

WebUI.delay(GlobalVariable.delay_2seconds)

//WebUI.click(findTestObject('05-Chat/08-Schedule a meeting/button_done'))
//WebUI.clickOffset(findTestObject('05-Chat/01- Creating a Chat group/div_Automation Chat'), 10, 10)
//WebUI.delay(3)
WebUI.setText(findTestObject('05-Chat/08-Schedule a meeting/input_meeting title'), GlobalVariable.meeting_title)

WebUI.delay(GlobalVariable.delay_2seconds)

WebUI.click(findTestObject('05-Chat/02-Sending chat messages/button_send'))

WebUI.delay(GlobalVariable.delay_3seconds)

WebUI.verifyElementVisible(findTestObject('05-Chat/08-Schedule a meeting/span_Automation Meeting'))

WebUI.delay(GlobalVariable.delay_3seconds)

