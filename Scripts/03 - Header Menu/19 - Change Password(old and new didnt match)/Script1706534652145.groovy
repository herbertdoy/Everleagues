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

WebUI.setEncryptedText(findTestObject('03-Header Menu/User Profile/Change Password/input_Old password'), '8yFRyszE6U6jvsCn51OQbg==')

WebUI.setText(findTestObject('03-Header Menu/User Profile/Change Password/input_new password'), Xformat)

WebUI.setText(findTestObject('03-Header Menu/User Profile/Change Password/input_Confirm password'), Xmatch)

WebUI.click(findTestObject('03-Header Menu/User Profile/Change Password/input_Old password'))

WebUI.verifyElementVisible(findTestObject('03-Header Menu/User Profile/Change Password/error_Password must be at least 8 characters'))

WebUI.verifyElementVisible(findTestObject('03-Header Menu/User Profile/Change Password/font_Password does not match'))

WebUI.delay(GlobalVariable.delay_2s)

