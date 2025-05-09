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

WebUI.navigateToUrl(GlobalVariable.URL_lab)

WebUI.maximizeWindow()

WebUI.callTestCase(findTestCase('01 - Login and Forgot Password/04 - Login(Valid Credentials-testuser00005)'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('06-Teams/button_doublearrow'))

WebUI.click(findTestObject('06-Teams/button_My Organizations'))

WebUI.click(findTestObject('06-Teams/button_GG Automation'))

WebUI.delay(GlobalVariable.delay_2s)

WebUI.verifyElementVisible(findTestObject('06-Teams/span_GG Automation'))

WebUI.delay(GlobalVariable.delay_2s)

WebUI.click(findTestObject('03-Header Menu/div_Settings'))

WebUI.verifyElementVisible(findTestObject('09-Settings/Users/div_Organization'))

WebUI.verifyElementVisible(findTestObject('09-Settings/Users/div_Organization Units'))

WebUI.scrollToElement(findTestObject('09-Settings/Users/div_Subscriptions'), 0)

WebUI.verifyElementVisible(findTestObject('09-Settings/Users/div_Subscriptions'))

WebUI.verifyElementVisible(findTestObject('09-Settings/Users/div_Users'))

WebUI.delay(GlobalVariable.delay_2s)

WebUI.click(findTestObject('09-Settings/Users/div_Users'))

WebUI.verifyElementVisible(findTestObject('09-Settings/Users/h4_USERS'))

//WebUI.verifyElementVisible(findTestObject('09-Settings/Users/Users Page'))
WebUI.delay(GlobalVariable.delay_2s)

WebUI.click(findTestObject('09-Settings/Users/button_add'))

WebUI.delay(GlobalVariable.delay_2s)

WebUI.verifyElementVisible(findTestObject('02-Side Icons/modal_User Invitation_withSub'))

WebUI.delay(GlobalVariable.delay_2s)

WebUI.click(findTestObject('09-Settings/Users/add Invite a single user'))

WebUI.delay(GlobalVariable.delay_2s)

WebUI.verifyElementVisible(findTestObject('09-Settings/Users/h2_Invite New User'))

WebUI.verifyElementVisible(findTestObject('09-Settings/Users/modal_Invite new user'))

WebUI.click(findTestObject('09-Settings/Users/input_email'))

WebUI.click(findTestObject('09-Settings/Users/input_firstName'))

WebUI.click(findTestObject('09-Settings/Users/input_lastName'))

WebUI.click(findTestObject('09-Settings/Users/span_Role'))

WebUI.doubleClick(findTestObject('09-Settings/Users/input_email'))

WebUI.verifyElementVisible(findTestObject('09-Settings/Users/Email required'))

WebUI.verifyElementVisible(findTestObject('09-Settings/Users/Firstname required'))

WebUI.verifyElementVisible(findTestObject('09-Settings/Users/last name required'))

WebUI.verifyElementVisible(findTestObject('09-Settings/Users/error_Select a role'))

