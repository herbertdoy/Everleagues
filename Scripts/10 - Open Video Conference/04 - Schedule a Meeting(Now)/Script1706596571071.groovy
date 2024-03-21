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

WebUI.verifyElementVisible(findTestObject('10-Open Video Conference/h5_Meeting Title'))

WebUI.setText(findTestObject('10-Open Video Conference/input_Meeting Title'), meeting_title)

WebUI.click(findTestObject('10-Open Video Conference/div_Now'))

WebUI.delay(GlobalVariable.delay_3s)

WebUI.verifyElementVisible(findTestObject('10-Open Video Conference/h5_Current Contacts'))

WebUI.click(findTestObject('10-Open Video Conference/input_Current Contacts_inputSearchContacts'))

WebUI.click(findTestObject('10-Open Video Conference/span_GG tester'))

WebUI.delay(GlobalVariable.delay_2s)

WebUI.clickOffset(findTestObject('10-Open Video Conference/h5_Meeting Title'), 10, 10)

WebUI.delay(GlobalVariable.delay_3s)

WebUI.scrollToElement(findTestObject('10-Open Video Conference/h5_New Guests'), 0)

WebUI.verifyElementVisible(findTestObject('10-Open Video Conference/h5_New Guests'))

WebUI.delay(GlobalVariable.delay_2s)

WebUI.setText(findTestObject('10-Open Video Conference/input_Firstname'), firstname)

WebUI.setText(findTestObject('10-Open Video Conference/input_Lastname'), lastname)

WebUI.setText(findTestObject('10-Open Video Conference/input_emailPhonenumber'), phone_number)

WebUI.click(findTestObject('10-Open Video Conference/button_remove_new guests'))

WebUI.delay(GlobalVariable.delay_2s)

WebUI.setText(findTestObject('10-Open Video Conference/input_Firstname'), firstname)

WebUI.setText(findTestObject('10-Open Video Conference/input_Lastname'), lastname)

WebUI.setText(findTestObject('10-Open Video Conference/input_emailPhonenumber'), phone_number)

WebUI.delay(GlobalVariable.delay_2s)

WebUI.click(findTestObject('10-Open Video Conference/button_add_new guests'))

WebUI.delay(GlobalVariable.delay_3s)

WebUI.scrollToElement(findTestObject('10-Open Video Conference/h5_Meeting Title'), 0)

WebUI.click(findTestObject('10-Open Video Conference/button_Create meeting'))

WebUI.verifyElementVisible(findTestObject('10-Open Video Conference/span_successfully created meeting'))

WebUI.delay(GlobalVariable.delay_3s)

WebUI.verifyElementVisible(findTestObject('10-Open Video Conference/section_created VC page'))

WebUI.delay(GlobalVariable.delay_2s)

WebUI.click(findTestObject('10-Open Video Conference/button_Create another meeting'))

WebUI.delay(GlobalVariable.delay_2s)

