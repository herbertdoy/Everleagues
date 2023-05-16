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

//WebUI.click(findTestObject('11-Cloud Files/button_cloud_upload Upload Files  Create Folders'))
//CustomKeywords.'uploadpackage.Upload.uploadFile'(findTestObject('Object Repository/11-Cloud Files/button_cloud_uploadUpload Local File'), 
//    'C:\\Users\\User\\Desktop\\EL automation\\qa.jpg')
//WebUI.delay(2)
//WebUI.verifyElementVisible(findTestObject('11-Cloud Files/mat-dialog-container_Upload local file modal'))
//WebUI.click(findTestObject('09-Settings/Users/Active User/button_Cancel_restore'))
//WebUI.delay(3)
WebUI.click(findTestObject('11-Cloud Files/button_cloud_upload Upload Files  Create Folders'))

CustomKeywords.'uploadpackage.Upload.uploadFile'(findTestObject('Object Repository/11-Cloud Files/button_cloud_uploadUpload Local File'), 
    GlobalVariable.upload_file)

WebUI.delay(GlobalVariable.delay_2seconds)

WebUI.verifyElementVisible(findTestObject('11-Cloud Files/mat-dialog-container_Upload local file modal'))

WebUI.click(findTestObject('11-Cloud Files/button_Confirm'))

WebUI.delay(GlobalVariable.delay_3seconds)

WebUI.verifyElementVisible(findTestObject('11-Cloud Files/div_Upload completed clear'))

WebUI.delay(GlobalVariable.delay_3seconds)

WebUI.click(findTestObject('11-Cloud Files/button_shared_drive'))

WebUI.delay(GlobalVariable.delay_3seconds)

