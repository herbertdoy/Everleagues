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

WebUI.delay(3)

WebUI.click(findTestObject('06-Header Menu/Hamburger Button/button_menu_Hamburger'))

WebUI.delay(1)

WebUI.click(findTestObject('06-Header Menu/Hamburger Button/button_menu_Hamburger'))

WebUI.verifyElementVisible(findTestObject('06-Header Menu/Hamburger Button/div_Dashboard(1)'))

WebUI.verifyElementVisible(findTestObject('06-Header Menu/Hamburger Button/div_Chat(2)'))

WebUI.verifyElementVisible(findTestObject('06-Header Menu/Hamburger Button/div_Teams(3)'))

WebUI.verifyElementVisible(findTestObject('06-Header Menu/Hamburger Button/div_Directory(4)'))

WebUI.verifyElementVisible(findTestObject('06-Header Menu/Hamburger Button/div_Operation(5)'))

WebUI.verifyElementVisible(findTestObject('06-Header Menu/Hamburger Button/div_Settings(6)'))

WebUI.verifyElementVisible(findTestObject('06-Header Menu/Hamburger Button/div_US Tax(7)'))

WebUI.verifyElementVisible(findTestObject('06-Header Menu/Hamburger Button/div_Open Video Conference(8)'))

WebUI.verifyElementVisible(findTestObject('06-Header Menu/Hamburger Button/div_Income and Expense(9)'))

WebUI.verifyElementVisible(findTestObject('06-Header Menu/Hamburger Button/div_EZSign (beta)(10)'))

WebUI.verifyElementVisible(findTestObject('06-Header Menu/Hamburger Button/div_EL HealthCheck(11)'))

WebUI.scrollToElement(findTestObject('06-Header Menu/Hamburger Button/div_Storage (beta)(12)'), 1)

WebUI.verifyElementVisible(findTestObject('06-Header Menu/Hamburger Button/div_Storage (beta)(12)'))

WebUI.verifyElementVisible(findTestObject('06-Header Menu/Hamburger Button/div_Help(13)'))

WebUI.delay(3)

WebUI.click(findTestObject('06-Header Menu/Hamburger Button/button_menu_Hamburger'))

