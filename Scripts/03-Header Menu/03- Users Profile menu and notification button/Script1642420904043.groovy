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

WebUI.click(findTestObject('03-Header Menu/User Profile/Users Profile menu and notification button/button_notification bell'))

WebUI.delay(2)

WebUI.verifyElementVisible(findTestObject('03-Header Menu/User Profile/Users Profile menu and notification button/div_notification modal'))

WebUI.delay(2)

WebUI.clickOffset(findTestObject('03-Header Menu/User Profile/Users Profile menu and notification button/div_notification modal'), 
    100, 100)

WebUI.click(findTestObject('03-Header Menu/User Profile/Users Profile menu and notification button/div_User drop down menu button'))

WebUI.delay(1)

WebUI.verifyElementVisible(findTestObject('03-Header Menu/User Profile/Users Profile menu and notification button/h4_View Profile'))

WebUI.verifyElementVisible(findTestObject('03-Header Menu/User Profile/Users Profile menu and notification button/h4_Change Password'))

WebUI.verifyElementVisible(findTestObject('03-Header Menu/User Profile/Users Profile menu and notification button/h4_Sign Out'))

WebUI.delay(2)

WebUI.click(findTestObject('03-Header Menu/User Profile/Users Profile menu and notification button/h4_Sign Out'))

WebUI.verifyElementVisible(findTestObject('03-Header Menu/User Profile/Users Profile menu and notification button/Login card'))

WebUI.delay(2)

WebUI.closeBrowser()

