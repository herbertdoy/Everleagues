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

WebUI.click(findTestObject('03-Header Menu/User Profile/Users Profile menu and notification button/div_User drop down menu button'))

WebUI.delay(GlobalVariable.delay_2seconds)

WebUI.click(findTestObject('03-Header Menu/Header Menu Verifications/h4_Change Password'))

WebUI.delay(GlobalVariable.delay_1second)

WebUI.setEncryptedText(findTestObject('03-Header Menu/User Profile/Change Password/input_Old password'), GlobalVariable.old_password)

WebUI.setEncryptedText(findTestObject('03-Header Menu/User Profile/Change Password/input_new password'), GlobalVariable.new_password)

WebUI.setEncryptedText(findTestObject('03-Header Menu/User Profile/Change Password/input_Confirm password'), GlobalVariable.confirm_password)

WebUI.click(findTestObject('03-Header Menu/User Profile/Change Password/button_Change Password'))

WebUI.verifyElementVisible(findTestObject('03-Header Menu/User Profile/Change Password/Failed to change password'))

WebUI.click(findTestObject('09-Settings/Users/Active User/button_Cancel_restore'))

WebUI.delay(GlobalVariable.delay_2seconds)

