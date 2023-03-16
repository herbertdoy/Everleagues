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

WebUI.delay(3)

WebUI.verifyElementVisible(findTestObject('10-Open Video Conference/h5_Meeting Title'))

WebUI.click(findTestObject('10-Open Video Conference/div_Schedule'))

WebUI.setText(findTestObject('10-Open Video Conference/input_Meeting Title'), 'Automation Meeting')

WebUI.delay(3)

WebUI.click(findTestObject('10-Open Video Conference/button_Start Date'))

WebUI.verifyElementVisible(findTestObject('05-Chat/08-Schedule a meeting/calendar modal'))

//WebUI.clickOffset(findTestObject('10-Open Video Conference/div_Schedule'), 10, 10)
WebUI.delay(3)

WebUI.doubleClick(findTestObject('10-Open Video Conference/button_End Date'))

WebUI.verifyElementVisible(findTestObject('05-Chat/08-Schedule a meeting/calendar modal'))

//WebUI.clickOffset(findTestObject('10-Open Video Conference/div_Schedule'), 10, 10)
WebUI.delay(3)

WebUI.doubleClick(findTestObject('10-Open Video Conference/div_recurrence_dropdown'))

WebUI.click(findTestObject('10-Open Video Conference/span_Does not repeat'))

WebUI.delay(3)

WebUI.scrollToElement(findTestObject('10-Open Video Conference/h5_New Guests'), 0)

WebUI.verifyElementVisible(findTestObject('10-Open Video Conference/h5_Current Contacts'))

WebUI.click(findTestObject('10-Open Video Conference/input_Current Contacts_inputSearchContacts'))

WebUI.click(findTestObject('10-Open Video Conference/span_GG tester 2'))

WebUI.clickOffset(findTestObject('10-Open Video Conference/h5_Current Contacts'), 10, 10)

WebUI.delay(3)

WebUI.verifyElementVisible(findTestObject('10-Open Video Conference/h5_New Guests'))

WebUI.setText(findTestObject('10-Open Video Conference/input_Firstname'), 'Automation')

WebUI.setText(findTestObject('10-Open Video Conference/input_Lastname'), 'Tester')

WebUI.setText(findTestObject('10-Open Video Conference/input_emailPhonenumber'), '+1234567890')

WebUI.delay(3)

WebUI.scrollToElement(findTestObject('10-Open Video Conference/h5_Meeting Title'), 0)

WebUI.click(findTestObject('10-Open Video Conference/button_Create meeting'))

WebUI.delay(3)

WebUI.verifyElementVisible(findTestObject('10-Open Video Conference/div_link_meetingroom'))

WebUI.delay(2)

WebUI.click(findTestObject('10-Open Video Conference/button_Create another meeting'))

WebUI.delay(4)

WebUI.closeBrowser()

