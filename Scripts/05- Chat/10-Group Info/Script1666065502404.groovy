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

WebUI.delay(GlobalVariable.delay_2seconds)

WebUI.click(findTestObject('05-Chat/09-Hiding a chat/ellipsis_chat setting'))

WebUI.delay(GlobalVariable.delay_1second)

WebUI.click(findTestObject('05-Chat/09-Hiding a chat/button_Group info'))

WebUI.delay(GlobalVariable.delay_1second)

WebUI.verifyElementVisible(findTestObject('05-Chat/09-Hiding a chat/Group info'))

WebUI.delay(GlobalVariable.delay_1second)

WebUI.click(findTestObject('05-Chat/10-Group Info/button_EDIT'))

WebUI.setText(findTestObject('05-Chat/10-Group Info/input_groupName_edit'), GlobalVariable.edit_groupname)

WebUI.delay(GlobalVariable.delay_1second)

WebUI.click(findTestObject('05-Chat/10-Group Info/button_Save'))

WebUI.verifyElementVisible(findTestObject('05-Chat/10-Group Info/Successfully changed group name msg'))

WebUI.delay(GlobalVariable.delay_2seconds)

WebUI.click(findTestObject('05-Chat/10-Group Info/div_GTGG tester'))

WebUI.verifyElementVisible(findTestObject('05-Chat/10-Group Info/button_Message'))

WebUI.verifyElementVisible(findTestObject('05-Chat/10-Group Info/button_Kick from group'))

WebUI.delay(GlobalVariable.delay_2seconds)

WebUI.click(findTestObject('05-Chat/10-Group Info/button_Kick from group'))

WebUI.verifyElementVisible(findTestObject('05-Chat/10-Group Info/Successfully removed user from group msg'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.delay(GlobalVariable.delay_2seconds)

WebUI.click(findTestObject('05-Chat/10-Group Info/div_Remove group'))

WebUI.verifyElementVisible(findTestObject('05-Chat/10-Group Info/Successfully removed group msg'))

WebUI.delay(GlobalVariable.delay_2seconds)

WebUI.closeBrowser()

