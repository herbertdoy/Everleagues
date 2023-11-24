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

WebUI.click(findTestObject('03-Header Menu/Shortcuts/Shortcut button'))

WebUI.verifyElementVisible(findTestObject('03-Header Menu/Shortcuts/Shortcut modal heading text'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyElementVisible(findTestObject('03-Header Menu/Shortcuts/Shortcut modal table'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('03-Header Menu/Shortcuts/Invite new user'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('03-Header Menu/Shortcuts/Invite new user_Cancel'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('03-Header Menu/Shortcuts/Shortcut button'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('03-Header Menu/Shortcuts/2FA'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('03-Header Menu/Shortcuts/Shortcut button'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('03-Header Menu/Shortcuts/Client Assignment'), FailureHandling.CONTINUE_ON_FAILURE)

