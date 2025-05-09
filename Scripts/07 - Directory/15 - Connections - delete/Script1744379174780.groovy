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

WebUI.click(findTestObject('07-Directory/Connections/zContact Profile/button_delete'))

WebUI.verifyElementVisible(findTestObject('07-Directory/Connections/zContact Profile/delete modal'))

WebUI.click(findTestObject('07-Directory/Connections/zContact Profile/button_Deletemsg'))

WebUI.waitForElementVisible(findTestObject('07-Directory/Connections/zContact Profile/success delete msg'), 0)

WebUI.verifyElementVisible(findTestObject('07-Directory/Connections/zContact Profile/success delete msg'))

WebUI.delay(GlobalVariable.delay_2s)

WebUI.click(findTestObject('07-Directory/Connections/div_Labels'))

WebUI.delay(GlobalVariable.delay_2s)

WebUI.click(findTestObject('07-Directory/Connections/button_deleteLabel2'))

WebUI.click(findTestObject('07-Directory/Connections/btn_deleteLabel3'))

WebUI.delay(GlobalVariable.delay_2s)

//WebUI.click(findTestObject('07-Directory/Connections/btn_deleteLabel4'))
//
//WebUI.click(findTestObject('07-Directory/Connections/btn_deleteLabel3'))
//
//WebUI.delay(GlobalVariable.delay_2s)
WebUI.closeBrowser()

