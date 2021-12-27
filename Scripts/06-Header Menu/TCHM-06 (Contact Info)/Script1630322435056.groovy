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

WebUI.click(findTestObject('06-Header Menu/User Profile/Contact Info/div_Contact Info'))

WebUI.delay(3)

WebUI.verifyElementVisible(findTestObject('06-Header Menu/User Profile/Contact Info/Position_Info'))

WebUI.verifyElementVisible(findTestObject('06-Header Menu/User Profile/Contact Info/div_Email'))

WebUI.verifyElementVisible(findTestObject('06-Header Menu/User Profile/Contact Info/div_Phone'))

WebUI.verifyElementVisible(findTestObject('06-Header Menu/User Profile/Contact Info/div_Address'))

WebUI.verifyElementVisible(findTestObject('06-Header Menu/User Profile/Contact Info/button_Save(Contact Info)'))

