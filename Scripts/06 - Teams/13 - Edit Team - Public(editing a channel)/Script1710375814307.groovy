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

WebUI.click(findTestObject('06-Teams/03-Edit Team - Private/button_edit channel'))

WebUI.verifyElementVisible(findTestObject('06-Teams/03-Edit Team - Private/Edit channel modal'))

WebUI.verifyElementNotClickable(findTestObject('06-Teams/03-Edit Team - Private/button_Save'))

WebUI.delay(GlobalVariable.delay_2s)

WebUI.setText(findTestObject('06-Teams/03-Edit Team - Private/input_Edit Channel name'), GlobalVariable.editChannelName)

WebUI.click(findTestObject('06-Teams/03-Edit Team - Private/button_Save'))

WebUI.waitForElementVisible(findTestObject('06-Teams/03-Edit Team - Private/Successfully edited channel'), 0)

WebUI.verifyElementVisible(findTestObject('06-Teams/03-Edit Team - Private/Successfully edited channel'))

WebUI.delay(GlobalVariable.delay_2s)

