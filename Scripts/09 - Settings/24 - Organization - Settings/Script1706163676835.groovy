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

WebUI.scrollToElement(findTestObject('09-Settings/Organization/div_Settings'), 0)

WebUI.delay(GlobalVariable.delay_2s)

WebUI.click(findTestObject('09-Settings/Organization/div_Settings'))

WebUI.verifyElementVisible(findTestObject('09-Settings/Organization/div_Settings page'))

WebUI.delay(GlobalVariable.delay_3s)

WebUI.verifyElementVisible(findTestObject('09-Settings/Organization/mat-card-title_Chat Message Settings'))

WebUI.click(findTestObject('09-Settings/Organization/toggle_Enable chat message editing'))

WebUI.click(findTestObject('09-Settings/Organization/toggle_Enable chat message deletion'))

WebUI.delay(GlobalVariable.delay_2s)

WebUI.click(findTestObject('09-Settings/Organization/toggle_Enable chat message editing'))

WebUI.click(findTestObject('09-Settings/Organization/toggle_Enable chat message deletion'))

WebUI.delay(GlobalVariable.delay_2s)

WebUI.verifyElementVisible(findTestObject('09-Settings/Organization/mat-card-title_Membership'))

WebUI.verifyElementVisible(findTestObject('09-Settings/Organization/div_By enabling this option, all join requests via URL will be automatically approved'))

WebUI.click(findTestObject('09-Settings/Organization/toggle_Enable auto approve'))

WebUI.delay(GlobalVariable.delay_2s)

WebUI.scrollToElement(findTestObject('09-Settings/Organization/mat-card-title_Cloud files'), 0)

WebUI.verifyElementVisible(findTestObject('09-Settings/Organization/mat-card-title_Cloud files'))

WebUI.click(findTestObject('09-Settings/Organization/toggle_My Drive for employees'))

WebUI.click(findTestObject('09-Settings/Organization/toggle_My Drive for clients'))

WebUI.click(findTestObject('09-Settings/Organization/toggle_My Drive for external'))

WebUI.delay(GlobalVariable.delay_2s)

WebUI.click(findTestObject('09-Settings/Organization/toggle_My Drive for employees'))

WebUI.click(findTestObject('09-Settings/Organization/toggle_My Drive for clients'))

WebUI.click(findTestObject('09-Settings/Organization/toggle_My Drive for external'))

WebUI.delay(GlobalVariable.delay_2s)

WebUI.verifyElementVisible(findTestObject('09-Settings/Organization/mat-card-title_Tools'))

WebUI.verifyElementVisible(findTestObject('09-Settings/Organization/div_Enable or disable tools by clicking on the toggle'))

WebUI.click(findTestObject('09-Settings/Organization/toggle_EL Net'))

WebUI.delay(GlobalVariable.delay_2s)

WebUI.click(findTestObject('09-Settings/Organization/toggle_EL Sign'))

WebUI.delay(GlobalVariable.delay_2s)

WebUI.click(findTestObject('09-Settings/Organization/toggle_Income and expense'))

WebUI.delay(GlobalVariable.delay_2s)

WebUI.click(findTestObject('09-Settings/Organization/toggle_AI assistant'))

WebUI.delay(GlobalVariable.delay_2s)

WebUI.click(findTestObject('09-Settings/Organization/toogle_PDF converter1'))

WebUI.delay(GlobalVariable.delay_2s)

WebUI.click(findTestObject('09-Settings/Organization/toggle_EL Net'))

WebUI.delay(GlobalVariable.delay_2s)

WebUI.click(findTestObject('09-Settings/Organization/toggle_EL Sign'))

WebUI.delay(GlobalVariable.delay_2s)

WebUI.click(findTestObject('09-Settings/Organization/toggle_Income and expense'))

WebUI.delay(GlobalVariable.delay_2s)

WebUI.click(findTestObject('09-Settings/Organization/toggle_AI assistant'))

WebUI.delay(GlobalVariable.delay_2s)

WebUI.click(findTestObject('09-Settings/Organization/toogle_PDF converter1'))

WebUI.delay(GlobalVariable.delay_2s)

WebUI.verifyElementVisible(findTestObject('09-Settings/Organization/div_Retention'))

WebUI.verifyElementVisible(findTestObject('09-Settings/Organization/table_Rentention content'))

WebUI.delay(GlobalVariable.delay_2s)

WebUI.click(findTestObject('09-Settings/Organization/toggle_enable retention'))

WebUI.delay(GlobalVariable.delay_2s)

WebUI.click(findTestObject('09-Settings/Organization/toggle_enable retention'))

WebUI.delay(GlobalVariable.delay_3s)

