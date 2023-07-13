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

WebUI.scrollToElement(findTestObject('09-Settings/Organization/div_Profile'), 0)

WebUI.click(findTestObject('09-Settings/Organization/div_Profile'))

WebUI.delay(GlobalVariable.delay_3seconds)

WebUI.verifyElementVisible(findTestObject('09-Settings/Organization/mat-card_Profile'))

WebUI.verifyElementVisible(findTestObject('09-Settings/Organization/mat-card_Address'))

WebUI.verifyElementVisible(findTestObject('09-Settings/Organization/mat-card_Contact'))

WebUI.delay(GlobalVariable.delay_4seconds)

WebUI.click(findTestObject('09-Settings/Organization/button_Delete Organization'))

WebUI.delay(GlobalVariable.delay_3seconds)

WebUI.verifyElementVisible(findTestObject('09-Settings/Organization/mat-dialog-container_Delete Organization Unit'))

WebUI.click(findTestObject('09-Settings/Organization/button_Delete'))

WebUI.delay(GlobalVariable.delay_3seconds)

WebUI.closeBrowser()

