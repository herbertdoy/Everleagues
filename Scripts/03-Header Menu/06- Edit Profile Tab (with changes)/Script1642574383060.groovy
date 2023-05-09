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

WebUI.setText(findTestObject('03-Header Menu/User Profile/View Profile/Profile Tab/input_FirstName'), GlobalVariable.first_name)

WebUI.setText(findTestObject('03-Header Menu/User Profile/View Profile/Profile Tab/input_LastName'), GlobalVariable.last_name)

WebUI.delay(GlobalVariable.delay_2seconds)

WebUI.click(findTestObject('03-Header Menu/User Profile/View Profile/Profile Tab/button_Save'))

WebUI.verifyElementVisible(findTestObject('03-Header Menu/User Profile/View Profile/Profile Tab/success msg'))

WebUI.delay(GlobalVariable.delay_2seconds)

WebUI.setText(findTestObject('03-Header Menu/User Profile/View Profile/Profile Tab/input_FirstName'), GlobalVariable.first_name1)

WebUI.setText(findTestObject('03-Header Menu/User Profile/View Profile/Profile Tab/input_LastName'), GlobalVariable.last_name1)

WebUI.delay(GlobalVariable.delay_2seconds)

WebUI.click(findTestObject('03-Header Menu/User Profile/View Profile/Profile Tab/button_Save'))

WebUI.verifyElementVisible(findTestObject('03-Header Menu/User Profile/View Profile/Profile Tab/success msg'))

WebUI.delay(GlobalVariable.delay_2seconds)

WebUI.mouseOver(findTestObject('03-Header Menu/User Profile/View Profile/Profile Tab/img tray'))

WebUI.click(findTestObject('03-Header Menu/User Profile/View Profile/Profile Tab/Upload Icon'))

CustomKeywords.'uploadpackage.Upload.uploadFile'(findTestObject('Object Repository/03-Header Menu/User Profile/View Profile/Profile Tab/button_folderBrowse'), 
    GlobalVariable.upload_file)

WebUI.delay(GlobalVariable.delay_2seconds)

WebUI.click(findTestObject('03-Header Menu/User Profile/View Profile/Profile Tab/button_Upload Image'))

WebUI.verifyElementVisible(findTestObject('03-Header Menu/User Profile/View Profile/Contact Info/Successfully changed profile image'))

WebUI.delay(GlobalVariable.delay_3seconds)

