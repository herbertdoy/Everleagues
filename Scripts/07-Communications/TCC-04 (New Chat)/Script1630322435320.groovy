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
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable

WebUI.delay(2)

WebUI.click(findTestObject('07-Communications/NewChat/mat-icon_NewChat'))

WebUI.delay(3)

WebUI.click(findTestObject('07-Communications/NewChat/span_New Group Chat'))

WebUI.delay(2)

WebUI.setText(findTestObject('07-Communications/NewChat/GroupName'), 'NewGroup')

WebUI.setText(findTestObject('07-Communications/NewChat/Participant'), 'NewParticipant')

WebUI.delay(3)

WebUI.verifyElementClickable(findTestObject('07-Communications/NewChat/mat-icon_arrow_forward'))

WebUI.click(findTestObject('07-Communications/NewChat/mat-icon_arrow_forward'))

WebUI.delay(2)

WebUI.click(findTestObject('07-Communications/NewChat/mat-icon_arrow_back'))

WebUI.delay(2)

WebUI.click(findTestObject('07-Communications/NewChat/mat-icon_arrow_back2'))

WebUI.delay(2)

