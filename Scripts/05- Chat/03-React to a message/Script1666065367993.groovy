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

//WebUI.openBrowser('')
//WebUI.navigateToUrl('https://lab.everleagues.com/')
//WebUI.maximizeWindow()
//WebUI.setText(findTestObject('02-Side Icons(Organization)/input_Email Field'), 'testuser02@mailinator.com')
//WebUI.setEncryptedText(findTestObject('02-Side Icons(Organization)/input_Password Field'), '8yFRyszE6U6jvsCn51OQbg==')
//WebUI.click(findTestObject('02-Side Icons(Organization)/button_Sign in'))
//WebUI.delay(2)
//WebUI.click(findTestObject('06-Teams/For 2FA/button_Confirm_2FA'))
//WebUI.executeJavaScript('window.open();', [])
//currentWindow = WebUI.getWindowIndex()
//WebUI.delay(3)
//WebUI.switchToWindowIndex(currentWindow + 1)
//WebUI.navigateToUrl('https://www.mailinator.com/')
//WebUI.delay(3)
//WebUI.setText(findTestObject('Mailinator/input_LOGIN_search'), 'testuser02@mailinator.com')
//WebUI.click(findTestObject('Mailinator/gobutton'), FailureHandling.STOP_ON_FAILURE)
//WebUI.delay(3)
//WebUI.click(findTestObject('Mailinator/Email - everleagues'))
//WebUI.delay(3)
//String code = WebUI.getText(findTestObject('Object Repository/06-Teams/For 2FA/2FA code'))
//WebUI.delay(3)
//WebUI.closeWindowTitle('Mailinator')
//WebUI.delay(3)
//WebUI.switchToWindowIndex(0)
//WebUI.delay(3)
//WebUI.setText(findTestObject('Object Repository/06-Teams/For 2FA/input_Enter verification code'), code)
//WebUI.delay(3)
//WebUI.click(findTestObject('06-Teams/For 2FA/button_Verify_2FA'))
//WebUI.delay(5)
//WebUI.click(findTestObject('02-Side Icons(Organization)/mat-icon_Side Menu double arrow icon'))
//WebUI.delay(2)
//WebUI.click(findTestObject('02-Side Icons(Organization)/button_My Organizations'))
//WebUI.delay(2)
//WebUI.click(findTestObject('02-Side Icons(Organization)/button_Automation Test Org'))
//WebUI.delay(2)
//WebUI.verifyElementVisible(findTestObject('02-Side Icons(Organization)/span_Automation Test Org (1)'))
//WebUI.click(findTestObject('05-Chat/01- Creating a Chat group/div_Chat'))
//WebUI.delay(1)
//WebUI.verifyElementVisible(findTestObject('05-Chat/01- Creating a Chat group/h4_CHAT'))
//WebUI.verifyElementVisible(findTestObject('05-Chat/01- Creating a Chat group/div_No chat available'))
//WebUI.verifyElementVisible(findTestObject('05-Chat/01- Creating a Chat group/h5_Chat securely with your contacts here'))
//WebUI.delay(3)
//WebUI.click(findTestObject('05-Chat/01- Creating a Chat group/new chat icon'))
//WebUI.delay(5)
//WebUI.click(findTestObject('05-Chat/01- Creating a Chat group/div_New Group Chat'))
//WebUI.delay(1)
//WebUI.verifyElementVisible(findTestObject('05-Chat/01- Creating a Chat group/span_Add group participant'))
//WebUI.verifyElementNotPresent(findTestObject('05-Chat/01- Creating a Chat group/button_arrow_forward'), 0)
//WebUI.delay(1)
//WebUI.setText(findTestObject('05-Chat/01- Creating a Chat group/input_newGroupName'), 'Automation Chat')
//WebUI.click(findTestObject('05-Chat/01- Creating a Chat group/div_GTGG tester'))
//WebUI.verifyElementVisible(findTestObject('05-Chat/01- Creating a Chat group/GG tester added'))
//WebUI.delay(1)
//WebUI.click(findTestObject('05-Chat/01- Creating a Chat group/div_GTGG tester 2'))
//WebUI.verifyElementVisible(findTestObject('05-Chat/01- Creating a Chat group/GG tester 2 added'))
//WebUI.delay(1)
//WebUI.click(findTestObject('05-Chat/01- Creating a Chat group/button_arrow_forward'))
//WebUI.verifyElementVisible(findTestObject('05-Chat/01- Creating a Chat group/div_Creating Chat'))
//WebUI.delay(3)
//WebUI.verifyElementVisible(findTestObject('05-Chat/01- Creating a Chat group/div_Automation Chat'))
//WebUI.delay(3)
//WebUI.click(findTestObject('05-Chat/02-Sending chat messages/div_AC'))
//WebUI.setText(findTestObject('05-Chat/02-Sending chat messages/textarea__msg'), 'Testing automation')
//WebUI.click(findTestObject('05-Chat/02-Sending chat messages/button_send'))
//WebUI.verifyElementVisible(findTestObject('05-Chat/02-Sending chat messages/verify_Testing automation msg'))
//WebUI.delay(3)
//WebUI.click(findTestObject('05-Chat/02-Sending chat messages/button_insert_emoticon'))
//WebUI.verifyElementVisible(findTestObject('05-Chat/02-Sending chat messages/Frequently used'))
//WebUI.verifyElementVisible(findTestObject('05-Chat/02-Sending chat messages/smiley and people'))
//WebUI.verifyElementVisible(findTestObject('05-Chat/02-Sending chat messages/Animals and nature'))
//WebUI.verifyElementVisible(findTestObject('05-Chat/02-Sending chat messages/Food and drink'))
//WebUI.verifyElementVisible(findTestObject('05-Chat/02-Sending chat messages/Activity'))
//WebUI.verifyElementVisible(findTestObject('05-Chat/02-Sending chat messages/Travel and places'))
//WebUI.verifyElementVisible(findTestObject('05-Chat/02-Sending chat messages/Objects'))
//WebUI.verifyElementVisible(findTestObject('05-Chat/02-Sending chat messages/Symbols'))
//WebUI.delay(2)
//WebUI.click(findTestObject('05-Chat/02-Sending chat messages/Money Face'))
//WebUI.click(findTestObject('05-Chat/02-Sending chat messages/button_send'))
//WebUI.delay(2)
//WebUI.verifyElementVisible(findTestObject('05-Chat/02-Sending chat messages/money face in chat'))
//WebUI.delay(2)
WebUI.mouseOver(findTestObject('05-Chat/03-05 - React and Reply/div_chat'))

WebUI.click(findTestObject('05-Chat/03-05 - React and Reply/mat-icon_mood'))

WebUI.click(findTestObject('05-Chat/03-05 - React and Reply/button_react_like'))

WebUI.delay(GlobalVariable.delay_2s)

WebUI.mouseOver(findTestObject('05-Chat/03-05 - React and Reply/div_chat'))

WebUI.click(findTestObject('05-Chat/03-05 - React and Reply/mat-icon_mood'))

WebUI.click(findTestObject('05-Chat/03-05 - React and Reply/button_react_heart'))

WebUI.delay(GlobalVariable.delay_2s)

WebUI.click(findTestObject('05-Chat/03-05 - React and Reply/div_react_heart'))

WebUI.verifyElementVisible(findTestObject('05-Chat/03-05 - React and Reply/h4_Message Reactions'))

WebUI.click(findTestObject('05-Chat/03-05 - React and Reply/div_react_All'))

WebUI.verifyElementVisible(findTestObject('05-Chat/03-05 - React and Reply/div_GG TESTER Click to remove'))

WebUI.delay(GlobalVariable.delay_2s)

WebUI.click(findTestObject('05-Chat/03-05 - React and Reply/div_react'))

WebUI.verifyElementVisible(findTestObject('05-Chat/03-05 - React and Reply/div_GG TESTER Click to remove'))

WebUI.clickOffset(findTestObject('05-Chat/03-05 - React and Reply/div_react_heart'), 10, 0)

//WebUI.refresh()
WebUI.delay(GlobalVariable.delay_3s)

