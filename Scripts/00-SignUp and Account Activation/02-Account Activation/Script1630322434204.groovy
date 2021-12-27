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

WebUI.executeJavaScript('window.open();', [])

currentWindow = WebUI.getWindowIndex()

//Go in to new tab
WebUI.switchToWindowIndex(currentWindow + 1)

WebUI.navigateToUrl('https://www.mailinator.com/')

WebUI.delay(3)

WebUI.closeWindowTitle('Everleagues')

WebUI.delay(2)

WebUI.switchToWindowTitle('Mailinator')

WebUI.delay(2)

WebUI.setText(findTestObject('00-Signup and Activation/Mailinator/input_Mailinator_addOverlay'), GlobalVariable.email)

WebUI.sendKeys(findTestObject('00-Signup and Activation/Mailinator/input_Mailinator_addOverlay'), Keys.chord(Keys.ENTER))

WebUI.delay(3)

WebUI.click(findTestObject('00-Signup and Activation/Mailinator/Email(2)'))

WebUI.delay(3)

WebUI.click(findTestObject('00-Signup and Activation/Mailinator/a_Activation link (2)'))

