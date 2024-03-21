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

WebUI.click(findTestObject('06-Teams/button_doublearrow'))

WebUI.click(findTestObject('06-Teams/button_My Organizations'))

WebUI.click(findTestObject('06-Teams/button_GG Automation'))

WebUI.delay(GlobalVariable.delay_2s)

WebUI.verifyElementVisible(findTestObject('06-Teams/span_GG Automation'))

WebUI.delay(GlobalVariable.delay_2s)

WebUI.click(findTestObject('03-Header Menu/div_Settings'))

WebUI.verifyElementVisible(findTestObject('09-Settings/Users/div_Organization'))

WebUI.verifyElementVisible(findTestObject('09-Settings/Users/div_Organization Units'))

WebUI.verifyElementVisible(findTestObject('09-Settings/Users/div_Subscriptions'))

WebUI.scrollToElement(findTestObject('09-Settings/Users/div_Users'), 0)

WebUI.verifyElementVisible(findTestObject('09-Settings/Users/div_Users'))

WebUI.delay(GlobalVariable.delay_2s)

WebUI.click(findTestObject('09-Settings/Users/div_Users'))

WebUI.verifyElementVisible(findTestObject('09-Settings/Users/h4_USERS'))

WebUI.verifyElementVisible(findTestObject('09-Settings/Users/Invited Users/div_Invited Users'))

WebUI.click(findTestObject('09-Settings/Users/Invited Users/div_Invited Users'))

WebUI.delay(GlobalVariable.delay_2s)

WebUI.setText(findTestObject('09-Settings/Users/Active User/Search field'), search_test3)

WebUI.delay(GlobalVariable.delay_2s)

WebUI.verifyElementVisible(findTestObject('09-Settings/Users/Invited Users/td_CTCSV test3'))

WebUI.delay(GlobalVariable.delay_2s)

WebUI.sendKeys(findTestObject('09-Settings/Users/Active User/Search field'), Keys.chord(Keys.CONTROL, 'a'))

WebUI.sendKeys(findTestObject('09-Settings/Users/Active User/Search field'), Keys.chord(Keys.BACK_SPACE))

WebUI.delay(GlobalVariable.delay_3s)

