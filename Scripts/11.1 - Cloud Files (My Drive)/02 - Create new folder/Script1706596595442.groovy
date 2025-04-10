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

WebUI.setText(findTestObject('11-Cloud Files/input_folderName'), new_folder_1)

WebUI.click(findTestObject('11-Cloud Files/button_Create'))

WebUI.delay(GlobalVariable.delay_2s)

WebUI.click(findTestObject('11-Cloud Files/button_create_new_folderNew Folder'))

WebUI.verifyElementVisible(findTestObject('11-Cloud Files/mat-dialog-container_CreateNewFolder modal'))

WebUI.verifyElementVisible(findTestObject('11-Cloud Files/h4_New folder'))

WebUI.setText(findTestObject('11-Cloud Files/input_folderName'), new_folder_2)

WebUI.click(findTestObject('11-Cloud Files/button_Create'))

WebUI.delay(GlobalVariable.delay_2s)

WebUI.click(findTestObject('11-Cloud Files/mat-icon_refresh'))

WebUI.verifyElementVisible(findTestObject('11-Cloud Files/td_Automation folder'))

WebUI.verifyElementVisible(findTestObject('11-Cloud Files/td_Automation folder 2'))

WebUI.delay(GlobalVariable.delay_2s)

WebUI.rightClick(findTestObject('11-Cloud Files/div_coudFilesTable'))

WebUI.delay(GlobalVariable.delay_2s)

WebUI.click(findTestObject('11-Cloud Files/btn_NewFolder'))

WebUI.delay(GlobalVariable.delay_2s)

WebUI.setText(findTestObject('11-Cloud Files/input_folderName'), folder_withSpecialCharac)

WebUI.click(findTestObject('11-Cloud Files/button_Create'))

WebUI.delay(GlobalVariable.delay_2s)

WebUI.verifyElementVisible(findTestObject('11-Cloud Files/td_specialCharac'))

WebUI.delay(GlobalVariable.delay_2s)

