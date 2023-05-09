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

WebUI.click(findTestObject('12-EL Sign/button_reminder'))

WebUI.verifyElementVisible(findTestObject('12-EL Sign/mat-dialog-container-reminderModal'))

WebUI.verifyElementVisible(findTestObject('12-EL Sign/h6_Schedule ELSign receiver reminder'))

WebUI.doubleClick(findTestObject('12-EL Sign/button_CANCEL3'))

WebUI.delay(GlobalVariable.delay_3seconds)

WebUI.click(findTestObject('12-EL Sign/button_reminder'))

WebUI.click(findTestObject('12-EL Sign/checkbox_recipients'))

WebUI.click(findTestObject('12-EL Sign/checkbox_SendReminderNow'))

WebUI.click(findTestObject('12-EL Sign/div_daysDropdown'))

WebUI.delay(GlobalVariable.delay_3seconds)

WebUI.click(findTestObject('12-EL Sign/mat-option_2'))

WebUI.delay(GlobalVariable.delay_3seconds)

WebUI.click(findTestObject('12-EL Sign/button_Save Schedule'))

WebUI.delay(GlobalVariable.delay_3seconds)

WebUI.click(findTestObject('12-EL Sign/button_reminder'))

WebUI.delay(GlobalVariable.delay_3seconds)

WebUI.click(findTestObject('12-EL Sign/button_Delete Schedule'))

WebUI.delay(GlobalVariable.delay_3seconds)

