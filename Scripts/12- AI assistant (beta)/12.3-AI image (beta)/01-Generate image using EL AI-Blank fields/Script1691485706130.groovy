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

WebUI.openBrowser('')

WebUI.navigateToUrl(GlobalVariable.URL_login)

WebUI.maximizeWindow()

WebUI.callTestCase(findTestCase('01-Login and Forgot Password/04-Login(Valid Credentials-With Subscription)'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('06-Teams/button_doublearrow'))

WebUI.click(findTestObject('06-Teams/button_My Organizations'))

WebUI.click(findTestObject('02-Side Icons(Organization)/button_Automation Test Org'))

WebUI.delay(GlobalVariable.delay_3s)

WebUI.verifyElementVisible(findTestObject('02-Side Icons(Organization)/span_Automation Test Org (1)'))

WebUI.delay(GlobalVariable.delay_2s)

WebUI.scrollToElement(findTestObject('12-AI Assistant(beta)/AI asst button-Side panel'), 30)

WebUI.click(findTestObject('12-AI Assistant(beta)/AI asst button-Side panel'))

WebUI.verifyElementVisible(findTestObject('12-AI Assistant(beta)/AI asst button-Side panel'))

WebUI.delay(GlobalVariable.delay_2s)

WebUI.click(findTestObject('12-AI Assistant(beta)/12.2-AI Edit(beta)/button_Use my own ChatGPT account'))

WebUI.delay(GlobalVariable.delay_2s)

//WebUI.getUrl() == 'https://chat.openai.com/auth/login'

//def url = WebUI.getUrl()

//WebUI.verifyEqual(url, 'https://chat.openai.com/auth/login')

//WebUI.delay(GlobalVariable.delay_2s)

WebUI.click(findTestObject('12-AI Assistant(beta)/12.3- AI Image(beta)/AI Image (beta)'))

WebUI.setText(findTestObject('12-AI Assistant(beta)/12.3- AI Image(beta)/Input content'), '')

WebUI.click(findTestObject('12-AI Assistant(beta)/12.3- AI Image(beta)/Generate Image button'))

WebUI.verifyElementVisible(findTestObject('12-AI Assistant(beta)/12.3- AI Image(beta)/InputContent_emptyfield'))

WebUI.verifyElementNotClickable(findTestObject('12-AI Assistant(beta)/12.3- AI Image(beta)/generate_image_button_disabled'))

