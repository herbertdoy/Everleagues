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

WebUI.navigateToUrl('https://lab.everleagues.com/')

WebUI.maximizeWindow()

WebUI.setText(findTestObject('02-Side Icons(Organization)/Add Contact/Email Field'), 'testuser02@mailinator.com')

WebUI.setEncryptedText(findTestObject('02-Side Icons(Organization)/Add Contact/Password Field'), '8yFRyszE6U6jvsCn51OQbg==')

WebUI.click(findTestObject('02-Side Icons(Organization)/Add Contact/button_Sign in'))

WebUI.delay(3)

WebUI.click(findTestObject('06-Teams/For 2FA/button_Confirm_2FA'))

WebUI.executeJavaScript('window.open();', [])

currentWindow = WebUI.getWindowIndex()

WebUI.delay(3)

WebUI.switchToWindowIndex(currentWindow + 1)

WebUI.navigateToUrl('https://www.mailinator.com/')

WebUI.delay(3)

WebUI.setText(findTestObject('00-Signup and Activation/zMailinator/input_LOGIN_search'), 'testuser02@mailinator.com')

WebUI.click(findTestObject('00-Signup and Activation/zMailinator/gobutton'), FailureHandling.STOP_ON_FAILURE)

WebUI.delay(3)

WebUI.click(findTestObject('00-Signup and Activation/zMailinator/Email - everleagues'))

WebUI.delay(3)

String code = WebUI.getText(findTestObject('Object Repository/06-Teams/For 2FA/2FA code'))

WebUI.delay(3)

WebUI.closeWindowTitle('Mailinator')

WebUI.delay(3)

WebUI.switchToWindowIndex(0)

WebUI.delay(3)

WebUI.setText(findTestObject('Object Repository/06-Teams/For 2FA/input_Enter verification code_code'), code)

WebUI.delay(3)

WebUI.click(findTestObject('06-Teams/For 2FA/button_Verify_2FA'))

WebUI.delay(5)

WebUI.click(findTestObject('06-Teams/button_doublearrow'))

WebUI.click(findTestObject('06-Teams/button_My Organizations'))

WebUI.click(findTestObject('06-Teams/button_GG Automation'))

WebUI.delay(4)

WebUI.verifyElementVisible(findTestObject('06-Teams/span_GG Automation'))

WebUI.delay(2)

WebUI.click(findTestObject('03-Header Menu/Hamburger Button/div_Teams'))

WebUI.delay(2)

WebUI.verifyElementVisible(findTestObject('06-Teams/h4_TEAMS'))

WebUI.delay(3)

WebUI.click(findTestObject('06-Teams/05- Teams-General Channel/div_General'))

WebUI.delay(3)

WebUI.uploadFile(findTestObject('06-Teams/05- Teams-General Channel/button_attache_file'), 'C:\\Users\\User\\Desktop\\EL automation\\sample.pdf')

WebUI.verifyElementVisible(findTestObject('06-Teams/05- Teams-General Channel/added PDF'))

WebUI.click(findTestObject('06-Teams/05- Teams-General Channel/button_send'))

WebUI.verifyElementVisible(findTestObject('06-Teams/05- Teams-General Channel/added new post msg'))

WebUI.verifyElementVisible(findTestObject('06-Teams/05- Teams-General Channel/posted pdf'))

WebUI.delay(10)

WebUI.uploadFile(findTestObject('06-Teams/05- Teams-General Channel/button_add image'), 'C:\\Users\\User\\Desktop\\EL automation\\qa.jpg')

WebUI.verifyElementVisible(findTestObject('06-Teams/05- Teams-General Channel/added image'))

WebUI.delay(3)

WebUI.click(findTestObject('06-Teams/05- Teams-General Channel/button_send'))

WebUI.verifyElementVisible(findTestObject('06-Teams/05- Teams-General Channel/added new post msg'))

WebUI.delay(3)

WebUI.verifyElementVisible(findTestObject('06-Teams/05- Teams-General Channel/posted image'))

WebUI.delay(10)

WebUI.uploadFile(findTestObject('06-Teams/05- Teams-General Channel/button_attache_file'), 'C:\\Users\\User\\Desktop\\EL automation\\video.mp4')

WebUI.verifyElementVisible(findTestObject('06-Teams/05- Teams-General Channel/added video'))

WebUI.click(findTestObject('06-Teams/05- Teams-General Channel/button_send'))

WebUI.delay(5)

WebUI.verifyElementVisible(findTestObject('06-Teams/05- Teams-General Channel/posted video'))

WebUI.delay(10)

WebUI.setText(findTestObject('06-Teams/05- Teams-General Channel/Input field_post'), 'This is automation')

WebUI.click(findTestObject('06-Teams/05- Teams-General Channel/button_send'))

WebUI.delay(3)

WebUI.verifyElementVisible(findTestObject('06-Teams/05- Teams-General Channel/added new post msg'))

WebUI.verifyElementVisible(findTestObject('06-Teams/05- Teams-General Channel/posted_This is automation'))

WebUI.delay(3)

WebUI.click(findTestObject('06-Teams/05- Teams-General Channel/ellipsis 1'))

WebUI.click(findTestObject('06-Teams/05- Teams-General Channel/button_Edit Post'))

WebUI.setText(findTestObject('06-Teams/05- Teams-General Channel/Edit field'), 'Automation Edit ')

WebUI.click(findTestObject('06-Teams/05- Teams-General Channel/button_send edit'))

WebUI.verifyElementVisible(findTestObject('06-Teams/05- Teams-General Channel/Successfully edited post msg'))

WebUI.delay(3)

WebUI.click(findTestObject('06-Teams/05- Teams-General Channel/ellipsis 1'))

WebUI.click(findTestObject('06-Teams/05- Teams-General Channel/button_Delete Post'))

WebUI.verifyElementVisible(findTestObject('06-Teams/05- Teams-General Channel/delete post box'))

WebUI.click(findTestObject('06-Teams/05- Teams-General Channel/button_Delete'))

WebUI.verifyElementVisible(findTestObject('06-Teams/05- Teams-General Channel/Successfully deleted post msg'))

WebUI.delay(3)

WebUI.click(findTestObject('06-Teams/05- Teams-General Channel/ellipsis 1'))

WebUI.click(findTestObject('06-Teams/05- Teams-General Channel/button_Delete Post'))

WebUI.verifyElementVisible(findTestObject('06-Teams/05- Teams-General Channel/delete post box'))

WebUI.click(findTestObject('06-Teams/05- Teams-General Channel/button_Delete'))

WebUI.verifyElementVisible(findTestObject('06-Teams/05- Teams-General Channel/Successfully deleted post msg'))

WebUI.delay(3)

WebUI.click(findTestObject('06-Teams/05- Teams-General Channel/ellipsis 1'))

WebUI.click(findTestObject('06-Teams/05- Teams-General Channel/button_Delete Post'))

WebUI.verifyElementVisible(findTestObject('06-Teams/05- Teams-General Channel/delete post box'))

WebUI.click(findTestObject('06-Teams/05- Teams-General Channel/button_Delete'))

WebUI.verifyElementVisible(findTestObject('06-Teams/05- Teams-General Channel/Successfully deleted post msg'))

WebUI.delay(3)

WebUI.click(findTestObject('06-Teams/05- Teams-General Channel/ellipsis 1'))

WebUI.click(findTestObject('06-Teams/05- Teams-General Channel/button_Delete Post'))

WebUI.verifyElementVisible(findTestObject('06-Teams/05- Teams-General Channel/delete post box'))

WebUI.click(findTestObject('06-Teams/05- Teams-General Channel/button_Delete'))

WebUI.verifyElementVisible(findTestObject('06-Teams/05- Teams-General Channel/Successfully deleted post msg'))

WebUI.delay(3)

WebUI.closeBrowser()

