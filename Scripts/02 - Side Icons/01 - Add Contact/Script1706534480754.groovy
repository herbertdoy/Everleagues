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
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW
import org.openqa.selenium.Keys as Keys

WebUI.openBrowser('')

WebUI.navigateToUrl(GlobalVariable.URL_login)

WebUI.maximizeWindow()

WebUI.callTestCase(findTestCase('01 - Login and Forgot Password/04 - Login(Valid Credentials-testuser01)'), [:], FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('02-Side Icons(Organization)/mat-icon_Side Menu double arrow icon'))

WebUI.delay(GlobalVariable.delay_2s)

WebUI.click(findTestObject('02-Side Icons(Organization)/button_My Organizations'))

WebUI.delay(GlobalVariable.delay_2s)

WebUI.click(findTestObject('02-Side Icons(Organization)/button_Automation Test Org'))

WebUI.delay(GlobalVariable.delay_2s)

WebUI.verifyElementVisible(findTestObject('02-Side Icons(Organization)/span_Automation Test Org (1)'))

WebUI.delay(GlobalVariable.delay_2s)

WebUI.click(findTestObject('02-Side Icons(Organization)/button_add new user'))

//WebUI.delay(GlobalVariable.delay_3s)

//WebUI.verifyElementVisible(findTestObject('02-Side Icons(Organization)/modal_User Invitation_withoutSub'))

WebUI.delay(GlobalVariable.delay_2s)

WebUI.click(findTestObject('02-Side Icons(Organization)/div_Invite a single user option'))

WebUI.verifyElementVisible(findTestObject('02-Side Icons(Organization)/modal_Invite New user'))

WebUI.delay(GlobalVariable.delay_2s)

WebUI.click(findTestObject('02-Side Icons(Organization)/button_Cancel'))

WebUI.delay(GlobalVariable.delay_2s)

