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

WebUI.doubleClick(findTestObject('11-Cloud Files/td_specialCharac'))

WebUI.delay(GlobalVariable.delay_2s)

WebUI.click(findTestObject('11-Cloud Files/btn_cloud'))

String path1 = GlobalVariable.upload_file

String path2 = GlobalVariable.upload_pdf_file

String finalPath = (path1 + '\n') + path2

WebUI.uploadFile(findTestObject('11-Cloud Files/btn_uploadLocalfile2'), finalPath)

WebUI.click(findTestObject('11-Cloud Files/button_Confirm'))

WebUI.delay(GlobalVariable.delay_2s)

WebUI.click(findTestObject('11-Cloud Files/div_My Drive'))

WebUI.delay(GlobalVariable.delay_2s)

WebUI.setText(findTestObject('11-Cloud Files/input_Search cloudfiles'), search_folder)

WebUI.sendKeys(findTestObject('11-Cloud Files/input_Search cloudfiles'), Keys.chord(Keys.ENTER))

WebUI.delay(GlobalVariable.delay_3s)

WebUI.clearText(findTestObject('11-Cloud Files/input_Search cloudfiles'))

WebUI.click(findTestObject('11-Cloud Files/button_back'))

WebUI.refresh()

