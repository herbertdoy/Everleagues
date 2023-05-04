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

WebUI.delay(GlobalVariable.delay_2seconds)

WebUI.setText(findTestObject('04-Add my Organizations/Free limited Plan/input_orgName'), GlobalVariable.org_name)

WebUI.setText(findTestObject('04-Add my Organizations/Free limited Plan/input_org alias'), GlobalVariable.org_alias)

WebUI.click(findTestObject('04-Add my Organizations/Free limited Plan/div_Service Industry_select-arrow'), FailureHandling.STOP_ON_FAILURE)

WebUI.delay(GlobalVariable.delay_1second)

WebUI.verifyElementVisible(findTestObject('04-Add my Organizations/Free limited Plan/span_CPA_EA_Accounting Firms'))

WebUI.verifyElementVisible(findTestObject('04-Add my Organizations/Free limited Plan/span_Law Firms'))

WebUI.verifyElementVisible(findTestObject('04-Add my Organizations/Free limited Plan/span_Medical Service_Physian_Dentist Office'))

WebUI.verifyElementVisible(findTestObject('04-Add my Organizations/Free limited Plan/span_Education'))

WebUI.verifyElementVisible(findTestObject('04-Add my Organizations/Free limited Plan/span_Real Estate'))

WebUI.verifyElementVisible(findTestObject('04-Add my Organizations/Free limited Plan/span_Other Service Business'))

WebUI.verifyElementVisible(findTestObject('04-Add my Organizations/Free limited Plan/span_Product Business'))

WebUI.verifyElementVisible(findTestObject('04-Add my Organizations/Free limited Plan/span_Community'))

WebUI.verifyElementVisible(findTestObject('04-Add my Organizations/Free limited Plan/span_Non Profit Organizations'))

WebUI.delay(GlobalVariable.delay_1second)

WebUI.click(findTestObject('04-Add my Organizations/Free limited Plan/span_Other Service Business'))

WebUI.click(findTestObject('04-Add my Organizations/Free limited Plan/button_Next'))

WebUI.delay(GlobalVariable.delay_1second)

WebUI.verifyElementVisible(findTestObject('04-Add my Organizations/Free limited Plan/add my org modal 2'))

WebUI.click(findTestObject('04-Add my Organizations/Free limited Plan/Free limited plan radio button'))

WebUI.delay(GlobalVariable.delay_1second)

WebUI.click(findTestObject('04-Add my Organizations/Free limited Plan/span_Usage limit'))

WebUI.switchToWindowIndex(1)

WebUI.delay(GlobalVariable.delay_5seconds)

assert WebUI.getUrl() == 'https://www.everleagues.com/pricing'

WebUI.closeWindowUrl('https://www.everleagues.com/pricing')

WebUI.switchToWindowIndex(0)

WebUI.delay(GlobalVariable.delay_1second)

WebUI.click(findTestObject('04-Add my Organizations/Free limited Plan/a_open_in_newPricing detail'))

WebUI.switchToWindowIndex(1)

WebUI.delay(GlobalVariable.delay_5seconds)

assert WebUI.getUrl() == 'https://www.everleagues.com/pricing'

WebUI.closeWindowUrl('https://www.everleagues.com/pricing')

WebUI.switchToWindowIndex(0)

WebUI.delay(GlobalVariable.delay_1second)

WebUI.click(findTestObject('04-Add my Organizations/Free limited Plan/button_Next2'))

WebUI.delay(GlobalVariable.delay_1second)

WebUI.verifyElementVisible(findTestObject('04-Add my Organizations/Free limited Plan/add my org modal 3'))

WebUI.delay(GlobalVariable.delay_1second)

WebUI.click(findTestObject('04-Add my Organizations/Free limited Plan/SaaS checkbox'))

WebUI.click(findTestObject('04-Add my Organizations/Free limited Plan/a_Software as a service (SaaS) subscription agreement'))

WebUI.switchToWindowIndex(1)

WebUI.delay(GlobalVariable.delay_5seconds)

assert WebUI.getUrl() == 'https://www.everleagues.com/saas-agreement/'

WebUI.closeWindowUrl('https://www.everleagues.com/saas-agreement/')

WebUI.switchToWindowIndex(0)

WebUI.delay(GlobalVariable.delay_1second)

WebUI.click(findTestObject('04-Add my Organizations/Free limited Plan/button_Create'))

WebUI.delay(GlobalVariable.delay_1second)

WebUI.verifyElementVisible(findTestObject('04-Add my Organizations/Free limited Plan/Congratulations msg'))

WebUI.verifyElementVisible(findTestObject('04-Add my Organizations/Free limited Plan/button_SET UP'))

WebUI.verifyElementVisible(findTestObject('04-Add my Organizations/Free limited Plan/button_INVITE EMPLOYEES etc'))

WebUI.verifyElementVisible(findTestObject('04-Add my Organizations/Free limited Plan/button_SET UP TEAM'))

WebUI.verifyElementVisible(findTestObject('04-Add my Organizations/Free limited Plan/button_LEARN MORE'))

WebUI.delay(GlobalVariable.delay_5seconds)

WebUI.click(findTestObject('04-Add my Organizations/Free limited Plan/button_DO THIS LATER'))

WebUI.delay(GlobalVariable.delay_1second)

WebUI.verifyElementVisible(findTestObject('04-Add my Organizations/Free limited Plan/span_GG Automation'))

WebUI.delay(GlobalVariable.delay_1second)

WebUI.closeBrowser()

