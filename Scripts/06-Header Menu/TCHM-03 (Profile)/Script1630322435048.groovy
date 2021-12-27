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
import org.openqa.selenium.Keys as Keys

WebUI.delay(3)

WebUI.click(findTestObject('06-Header Menu/User Profile/div_Profile'))

WebUI.verifyElementVisible(findTestObject('06-Header Menu/User Profile/Profile/ProfileImage'))

WebUI.verifyElementVisible(findTestObject('06-Header Menu/User Profile/Profile/input_Username_mat-input-23'))

WebUI.verifyElementVisible(findTestObject('06-Header Menu/User Profile/Profile/input_Last Name_mat-input-24'))

WebUI.verifyElementVisible(findTestObject('06-Header Menu/User Profile/Profile/ProfileEmail'))

WebUI.delay(3)

WebUI.click(findTestObject('06-Header Menu/User Profile/Profile/input_Username_mat-input-23'))

WebUI.sendKeys(findTestObject('06-Header Menu/User Profile/Profile/input_Username_mat-input-23'), Keys.chord(Keys.CONTROL, 
        'a'))

WebUI.sendKeys(findTestObject('06-Header Menu/User Profile/Profile/input_Username_mat-input-23'), Keys.chord(Keys.BACK_SPACE))

WebUI.setText(findTestObject('06-Header Menu/User Profile/Profile/input_Username_mat-input-23'), 'Norvs26')

WebUI.delay(2)

WebUI.click(findTestObject('06-Header Menu/User Profile/Profile/input_Last Name_mat-input-24'))

WebUI.sendKeys(findTestObject('06-Header Menu/User Profile/Profile/input_Last Name_mat-input-24'), Keys.chord(Keys.CONTROL, 
        'a'))

WebUI.sendKeys(findTestObject('06-Header Menu/User Profile/Profile/input_Last Name_mat-input-24'), Keys.chord(Keys.BACK_SPACE))

WebUI.setText(findTestObject('06-Header Menu/User Profile/Profile/input_Last Name_mat-input-24'), 'Tester')

WebUI.delay(2)

WebUI.click(findTestObject('06-Header Menu/User Profile/Profile/button_Save'))

