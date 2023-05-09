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

WebUI.delay(GlobalVariable.delay_3seconds)

WebUI.click(findTestObject('07-Directory/Connections/button_delete invitation'))

WebUI.verifyElementVisible(findTestObject('07-Directory/Connections/mat-dialog-container_deleteInvitationConfirmationModal'))

WebUI.delay(GlobalVariable.delay_2seconds)

WebUI.click(findTestObject('07-Directory/Connections/button_Cancel'))

WebUI.delay(GlobalVariable.delay_2seconds)

WebUI.click(findTestObject('07-Directory/Connections/button_delete invitation'))

WebUI.verifyElementVisible(findTestObject('07-Directory/Connections/mat-dialog-container_deleteInvitationConfirmationModal'))

WebUI.delay(GlobalVariable.delay_3seconds)

WebUI.click(findTestObject('07-Directory/Connections/button_Confirm'))

WebUI.verifyElementVisible(findTestObject('07-Directory/Connections/snack-bar-container_Successfully delete invitation requestOK'))

WebUI.delay(GlobalVariable.delay_3seconds)

WebUI.click(findTestObject('07-Directory/Connections/zContact Profile/button_invite'))

WebUI.click(findTestObject('07-Directory/Connections/zContact Profile/Role'))

WebUI.click(findTestObject('07-Directory/Connections/zContact Profile/span_CoWorker'))

WebUI.delay(GlobalVariable.delay_3seconds)

WebUI.click(findTestObject('07-Directory/Connections/zContact Profile/button_Send Invitation'))

