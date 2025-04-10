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

WebUI.click(findTestObject('11-Cloud Files/button_cloud_upload Upload Files  Create Folders'))

CustomKeywords.'uploadpackage.Upload.uploadFile'(findTestObject('11-Cloud Files/button_cloud_uploadUpload Local File'), 
    GlobalVariable.upload_file)

WebUI.delay(GlobalVariable.delay_2s)

WebUI.verifyElementVisible(findTestObject('11-Cloud Files/mat-dialog-container_Upload local file modal'))

WebUI.click(findTestObject('11-Cloud Files/button_Confirm'))

WebUI.delay(GlobalVariable.delay_2s)

WebUI.closeBrowser()

WebUI.openBrowser('')

WebUI.navigateToUrl(GlobalVariable.URL_lab)

WebUI.maximizeWindow()

WebUI.callTestCase(findTestCase('01 - Login and Forgot Password/04 - Login(Valid Credentials-testusercloudfiles)'), [:],
	FailureHandling.CONTINUE_ON_FAILURE)
WebUI.delay(GlobalVariable.delay_2s)

WebUI.click(findTestObject('06-Teams/button_doublearrow'))

WebUI.click(findTestObject('06-Teams/button_My Organizations'))

WebUI.click(findTestObject('11-Cloud Files/button_Automation Test Org I'))

WebUI.delay(GlobalVariable.delay_3s)

WebUI.verifyElementVisible(findTestObject('02-Side Icons/span_Automation Test Org (1)'))

WebUI.delay(GlobalVariable.delay_2s)

WebUI.click(findTestObject('03-Header Menu/div_Cloud Files'))

WebUI.scrollToElement(findTestObject('11-Cloud Files/a_My Drive'), 0)

WebUI.click(findTestObject('11-Cloud Files/a_My Drive'))

//WebUI.delay(GlobalVariable.delay_2s)

WebUI.delay(GlobalVariable.delay_2s)

WebUI.doubleClick(findTestObject('11-Cloud Files/td_specialCharac'))

WebUI.delay(GlobalVariable.delay_2s)

WebUI.click(findTestObject('11-Cloud Files/btn_cloud'))

CustomKeywords.'uploadpackage.Upload.uploadFile'(findTestObject('11-Cloud Files/btn_UploadLocalFolder'), GlobalVariable.upload_file)

//WebUI.rightClick(findTestObject('11-Cloud Files/div_coudFilesTable'))
//
//CustomKeywords.'com.kms.katalon.keyword.uploadfile.UploadFile.uploadFile'(findTestObject('11-Cloud Files/btn_UploadLocalFolder'), 
//    GlobalVariable.subFolder)
WebUI.delay(GlobalVariable.delay_2s)

WebUI.verifyAlertPresent(1)

WebUI.delay(GlobalVariable.delay_2s)

WebUI.acceptAlert()

WebUI.delay(GlobalVariable.delay_2s)

WebUI.setText(findTestObject('11-Cloud Files/input_Search cloudfiles'), search_folder)

WebUI.sendKeys(findTestObject('11-Cloud Files/input_Search cloudfiles'), Keys.chord(Keys.ENTER))

WebUI.delay(GlobalVariable.delay_3s)

WebUI.clearText(findTestObject('11-Cloud Files/input_Search cloudfiles'))

WebUI.click(findTestObject('11-Cloud Files/button_back'))

WebUI.refresh()

