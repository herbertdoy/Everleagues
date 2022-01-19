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

WebUI.setText(findTestObject('02-Side Icons(Organization)/Add Contact/Email Field'), 'testuser01@mailinator.com')

WebUI.setEncryptedText(findTestObject('02-Side Icons(Organization)/Add Contact/Password Field'), '8yFRyszE6U6jvsCn51OQbg==')

WebUI.click(findTestObject('02-Side Icons(Organization)/Add Contact/button_Sign in'))

WebUI.delay(2)

WebUI.click(findTestObject('03-Header Menu/User Profile/Users Profile menu and notification button/div_User drop down menu button'))

WebUI.delay(1)

WebUI.click(findTestObject('03-Header Menu/User Profile/Users Profile menu and notification button/h4_View Profile'))

WebUI.delay(2)

WebUI.verifyElementNotClickable(findTestObject('03-Header Menu/User Profile/View Profile/Profile Tab/input_Username'))

WebUI.delay(2)

WebUI.setText(findTestObject('03-Header Menu/User Profile/View Profile/Profile Tab/input_FirstName'), 'THIS IS')

WebUI.setText(findTestObject('03-Header Menu/User Profile/View Profile/Profile Tab/input_LastName'), 'AUTOMATION')

WebUI.delay(2)

WebUI.click(findTestObject('03-Header Menu/User Profile/View Profile/Profile Tab/button_Save'))

WebUI.verifyElementVisible(findTestObject('03-Header Menu/User Profile/View Profile/Profile Tab/success msg'))

WebUI.delay(2)

WebUI.mouseOver(findTestObject('03-Header Menu/User Profile/View Profile/Profile Tab/img tray'))

WebUI.click(findTestObject('03-Header Menu/User Profile/View Profile/Profile Tab/Upload Icon'))

CustomKeywords.'uploadpackage.Upload.uploadFile'(findTestObject('Object Repository/03-Header Menu/User Profile/View Profile/Profile Tab/button_folderBrowse'), 
    'C:\\Users\\User\\Desktop\\DAMAGE PHOTOS\\qa.jpg')

WebUI.delay(2)

WebUI.click(findTestObject('03-Header Menu/User Profile/View Profile/Profile Tab/button_Upload Image'))

WebUI.delay(3)

WebUI.closeBrowser()

