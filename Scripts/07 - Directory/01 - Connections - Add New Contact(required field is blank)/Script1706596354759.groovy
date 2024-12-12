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

WebUI.navigateToUrl(GlobalVariable.URL_lab)

WebUI.maximizeWindow()

WebUI.callTestCase(findTestCase('01 - Login and Forgot Password/04 - Login(Valid Credentials-testuser00005)'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('03-Header Menu/div_Directory'))

WebUI.delay(GlobalVariable.delay_3s)

WebUI.verifyElementVisible(findTestObject('07-Directory/Connections/div_Connections'))

WebUI.verifyElementVisible(findTestObject('07-Directory/Connections/div_Labels'))

WebUI.delay(GlobalVariable.delay_2s)

WebUI.click(findTestObject('07-Directory/Connections/div_Connections'))

WebUI.delay(GlobalVariable.delay_2s)

WebUI.verifyElementVisible(findTestObject('07-Directory/Connections/h4_CONNECTIONS'))

WebUI.verifyElementVisible(findTestObject('07-Directory/Connections/button_search'))

WebUI.verifyElementVisible(findTestObject('07-Directory/Connections/button_add new contact'))

WebUI.verifyElementVisible(findTestObject('07-Directory/Connections/button_Filter'))

WebUI.delay(GlobalVariable.delay_2s)

WebUI.click(findTestObject('07-Directory/Connections/button_add new contact'))

WebUI.delay(GlobalVariable.delay_2s)

WebUI.click(findTestObject('07-Directory/Connections/input_Type_email'))

WebUI.verifyElementVisible(findTestObject('07-Directory/Connections/Add new contact modal'))

WebUI.delay(GlobalVariable.delay_2s)

WebUI.sendKeys(findTestObject('07-Directory/Connections/input_firstName'), Keys.chord(Keys.CONTROL, 'a'))

WebUI.sendKeys(findTestObject('07-Directory/Connections/input_firstName'), Keys.chord(Keys.BACK_SPACE))

WebUI.sendKeys(findTestObject('07-Directory/Connections/input_lastName'), Keys.chord(Keys.CONTROL, 'a'))

WebUI.sendKeys(findTestObject('07-Directory/Connections/input_lastName'), Keys.chord(Keys.BACK_SPACE))

WebUI.click(findTestObject('07-Directory/Connections/input_Type_email'))

WebUI.delay(GlobalVariable.delay_2s)

WebUI.verifyElementVisible(findTestObject('07-Directory/Connections/button_Save'))

WebUI.delay(GlobalVariable.delay_2s)

