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

WebUI.navigateToUrl(GlobalVariable.appURL)

WebUI.maximizeWindow()

WebUI.callTestCase(findTestCase('01-Login and Forgot Password/04-Login(Valid Credentials-With Subscription)'), [:], FailureHandling.STOP_ON_FAILURE)

//WebUI.setText(findTestObject('02-Side Icons(Organization)/Add Contact/Email Field'), 'testuser02@mailinator.com')
//WebUI.setEncryptedText(findTestObject('02-Side Icons(Organization)/Add Contact/Password Field'), '8yFRyszE6U6jvsCn51OQbg==')
//WebUI.click(findTestObject('02-Side Icons(Organization)/Add Contact/button_Sign in'))
//WebUI.delay(2)
//WebUI.click(findTestObject('06-Teams/For 2FA/button_Confirm_2FA'))
//WebUI.executeJavaScript('window.open();', [])
//currentWindow = WebUI.getWindowIndex()
//WebUI.delay(3)
//WebUI.switchToWindowIndex(currentWindow + 1)
//WebUI.navigateToUrl('https://www.mailinator.com/')
//WebUI.delay(3)
//WebUI.setText(findTestObject('00-Signup and Activation/zMailinator/input_LOGIN_search'), 'testuser02@mailinator.com')
//WebUI.click(findTestObject('00-Signup and Activation/zMailinator/gobutton'), FailureHandling.STOP_ON_FAILURE)
//WebUI.delay(3)
//WebUI.click(findTestObject('00-Signup and Activation/zMailinator/Email - everleagues'))
//WebUI.delay(3)
//String code = WebUI.getText(findTestObject('Object Repository/06-Teams/For 2FA/2FA code'))
//WebUI.delay(3)
//WebUI.closeWindowTitle('Mailinator')
//WebUI.delay(3)
//WebUI.switchToWindowIndex(0)
//WebUI.delay(3)
//WebUI.setText(findTestObject('Object Repository/06-Teams/For 2FA/input_Enter verification code_code'), code)
//WebUI.delay(3)
//WebUI.click(findTestObject('06-Teams/For 2FA/button_Verify_2FA'))
//WebUI.delay(5)
WebUI.click(findTestObject('02-Side Icons(Organization)/Add Contact/Side Menu double arrow icon'))

WebUI.delay(GlobalVariable.delay_2seconds)

WebUI.click(findTestObject('02-Side Icons(Organization)/Add Contact/button_My Organizations'))

WebUI.delay(GlobalVariable.delay_2seconds)

WebUI.click(findTestObject('02-Side Icons(Organization)/Add Contact/button_Automation Test Org'))

WebUI.delay(GlobalVariable.delay_2seconds)

WebUI.verifyElementVisible(findTestObject('02-Side Icons(Organization)/Add Contact/span_Automation Test Org'))

WebUI.click(findTestObject('05-Chat/01- Creating a Chat group/div_Chat'))

WebUI.delay(GlobalVariable.delay_1second)

WebUI.verifyElementVisible(findTestObject('05-Chat/01- Creating a Chat group/h4_CHAT'))

WebUI.verifyElementVisible(findTestObject('05-Chat/01- Creating a Chat group/div_No chat available'))

WebUI.verifyElementVisible(findTestObject('05-Chat/01- Creating a Chat group/h5_Chat securely with your contacts here'))

WebUI.delay(GlobalVariable.delay_2seconds)

WebUI.click(findTestObject('05-Chat/01- Creating a Chat group/new chat icon'))

WebUI.delay(GlobalVariable.delay_2seconds)

WebUI.click(findTestObject('05-Chat/01- Creating a Chat group/div_New Group Chat'))

WebUI.delay(GlobalVariable.delay_1second)

WebUI.verifyElementVisible(findTestObject('05-Chat/01- Creating a Chat group/span_Add group participant'))

WebUI.verifyElementNotPresent(findTestObject('05-Chat/01- Creating a Chat group/button_arrow_forward'), 0)

WebUI.delay(GlobalVariable.delay_1second)

WebUI.setText(findTestObject('05-Chat/01- Creating a Chat group/input_newGroupName'), GlobalVariable.create_groupname)

WebUI.click(findTestObject('05-Chat/01- Creating a Chat group/div_GTGG tester'))

WebUI.verifyElementVisible(findTestObject('05-Chat/01- Creating a Chat group/GG tester added'))

WebUI.delay(GlobalVariable.delay_1second)

WebUI.click(findTestObject('05-Chat/01- Creating a Chat group/div_GTGG tester 2'))

WebUI.verifyElementVisible(findTestObject('05-Chat/01- Creating a Chat group/GG tester 2 added'))

WebUI.delay(GlobalVariable.delay_1second)

WebUI.click(findTestObject('05-Chat/01- Creating a Chat group/button_arrow_forward'))

//WebUI.verifyElementVisible(findTestObject('05-Chat/01- Creating a Chat group/div_Creating Chat'))
WebUI.delay(GlobalVariable.delay_2seconds)

WebUI.verifyElementVisible(findTestObject('05-Chat/01- Creating a Chat group/div_Automation Chat'))

WebUI.delay(GlobalVariable.delay_2seconds)

