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

WebUI.navigateToUrl('https://lab.everleagues.com/login?returnUrl=%2Fmain%2Fdashboard')

WebUI.maximizeWindow()

WebUI.setText(findTestObject('02-Side Icons(Organization)/Add Contact/Email Field'), 'testuser02@mailinator.com')

WebUI.setEncryptedText(findTestObject('02-Side Icons(Organization)/Add Contact/Password Field'), '8yFRyszE6U6jvsCn51OQbg==')

WebUI.click(findTestObject('02-Side Icons(Organization)/Add Contact/button_Sign in'))

WebUI.delay(2)

WebUI.click(findTestObject('03-Header Menu/User Profile/Users Profile menu and notification button/div_User drop down menu button'))

WebUI.delay(2)

WebUI.click(findTestObject('03-Header Menu/Header Menu Verifications/h4_Change Password'))

WebUI.verifyElementVisible(findTestObject('03-Header Menu/User Profile/Change Password/h4_Change Password'))

WebUI.delay(2)

WebUI.click(findTestObject('03-Header Menu/User Profile/Change Password/input_Old password'))

WebUI.click(findTestObject('03-Header Menu/User Profile/Change Password/input_new password'))

WebUI.click(findTestObject('03-Header Menu/User Profile/Change Password/input_Confirm password'))

WebUI.click(findTestObject('03-Header Menu/User Profile/Change Password/input_Old password'))

WebUI.delay(2)

WebUI.verifyElementVisible(findTestObject('03-Header Menu/User Profile/Change Password/error_Enter your password'))

WebUI.verifyElementVisible(findTestObject('03-Header Menu/User Profile/Change Password/error_Password must be at least 8 characters'))

WebUI.verifyElementVisible(findTestObject('03-Header Menu/User Profile/Change Password/error_Password does not match'))

WebUI.verifyElementNotClickable(findTestObject('03-Header Menu/User Profile/Change Password/button_Change Password'))

WebUI.click(findTestObject('03-Header Menu/User Profile/Change Password/button_Cancel'))

WebUI.click(findTestObject('03-Header Menu/User Profile/Users Profile menu and notification button/div_User drop down menu button'))

WebUI.delay(2)

WebUI.click(findTestObject('03-Header Menu/Header Menu Verifications/h4_Change Password'))

WebUI.delay(1)

WebUI.setText(findTestObject('03-Header Menu/User Profile/Change Password/input_Old password'), 'wrongoldpassword')

WebUI.setText(findTestObject('03-Header Menu/User Profile/Change Password/input_new password'), 'Qazwsx123')

WebUI.setText(findTestObject('03-Header Menu/User Profile/Change Password/input_Confirm password'), 'Qazwsx123')

WebUI.click(findTestObject('03-Header Menu/User Profile/Change Password/button_Change Password'))

WebUI.verifyElementVisible(findTestObject('03-Header Menu/User Profile/Change Password/Failed to change password'))

WebUI.delay(2)

WebUI.click(findTestObject('03-Header Menu/User Profile/Users Profile menu and notification button/div_User drop down menu button'))

WebUI.delay(2)

WebUI.click(findTestObject('03-Header Menu/Header Menu Verifications/h4_Change Password'))

WebUI.delay(1)

WebUI.setEncryptedText(findTestObject('03-Header Menu/User Profile/Change Password/input_Old password'), '8yFRyszE6U6jvsCn51OQbg==')

WebUI.setText(findTestObject('03-Header Menu/User Profile/Change Password/input_new password'), 'wrongformatpass')

WebUI.setText(findTestObject('03-Header Menu/User Profile/Change Password/input_Confirm password'), 'newpassdontmatch')

WebUI.click(findTestObject('03-Header Menu/User Profile/Change Password/input_Old password'))

WebUI.verifyElementVisible(findTestObject('03-Header Menu/User Profile/Change Password/error_Password must be at least 8 characters'))

WebUI.verifyElementVisible(findTestObject('03-Header Menu/User Profile/Change Password/error_Password does not match'))

WebUI.verifyElementNotClickable(findTestObject('03-Header Menu/User Profile/Change Password/button_Change Password'))

WebUI.delay(2)

