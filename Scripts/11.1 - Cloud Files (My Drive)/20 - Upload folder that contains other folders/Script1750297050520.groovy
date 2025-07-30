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

//WebUI.click(findTestObject('11-Cloud Files/div_My Drive'))
//
//WebUI.delay(GlobalVariable.delay_2s)
//
//WebUI.click(findTestObject('11-Cloud Files/btn_clearNotif'))
//
//WebUI.delay(GlobalVariable.delay_2s)
//
//WebUI.click(findTestObject('11-Cloud Files/button_create_new_folderNew Folder'))
//
//WebUI.setText(findTestObject('11-Cloud Files/input_folderName'), new_folder_1)
//
//WebUI.click(findTestObject('11-Cloud Files/button_Create'))
//
//WebUI.delay(GlobalVariable.delay_2s)
//
//WebUI.doubleClick(findTestObject('11-Cloud Files/td_subFolder2'))
//
//WebUI.delay(GlobalVariable.delay_2s)
//
////WebUI.doubleClick(findTestObject('11-Cloud Files/td_automationFolderEdit2'))
////
////WebUI.delay(GlobalVariable.delay_2s)
WebUI.delay(GlobalVariable.delay_2s)

//WebUI.doubleClick(findTestObject('13-EL Sign/span_Folder'))
//
//WebUI.delay(GlobalVariable.delay_2s)
WebUI.rightClick(findTestObject('11-Cloud Files/div_table2'))

WebUI.delay(GlobalVariable.delay_2s)

WebUI.uploadFile(findTestObject('11-Cloud Files/btn_UploadLocalFolder'), GlobalVariable.subFolder)

//WebUI.rightClick(findTestObject('11-Cloud Files/div_table2'))
//WebUI.uploadFile(findTestObject('11-Cloud Files/btn_UploadLocalFolder'), GlobalVariable.subFolder)
//WebUI.rightClick(findTestObject('11-Cloud Files/div_coudFilesTable'))
//
//CustomKeywords.'com.kms.katalon.keyword.uploadfile.UploadFile.uploadFile'(findTestObject('11-Cloud Files/btn_UploadLocalFolder'), 
//    GlobalVariable.subFolder)
WebUI.delay(GlobalVariable.delay_2s)

WebUI.waitForElementPresent(findTestObject('11-Cloud Files/td_subFolder'), 0)

WebUI.verifyElementVisible(findTestObject('11-Cloud Files/td_subFolder'))

WebUI.delay(GlobalVariable.delay_2s)

WebUI.click(findTestObject('11-Cloud Files/right_arrow'))

WebUI.waitForElementPresent(findTestObject('11-Cloud Files/spanTree_automationFolder'), 0)

WebUI.verifyElementVisible(findTestObject('11-Cloud Files/spanTree_automationFolder'))

WebUI.delay(GlobalVariable.delay_2s)

