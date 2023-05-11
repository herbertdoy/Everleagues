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
import java.awt.Toolkit as Toolkit
import java.awt.datatransfer.DataFlavor as DataFlavor

WebUI.delay(GlobalVariable.delay_3seconds)

WebUI.mouseOver(findTestObject('09-Settings/Organization unit/div_GG TESTER'))

WebUI.delay(GlobalVariable.delay_3seconds)

//WebUI.waitForElementClickable(findTestObject('09-Settings/Organization unit/div_GG TESTER'), 0)
WebUI.click(findTestObject('09-Settings/Organization unit/div_GG TESTER'))

WebUI.delay(GlobalVariable.delay_3seconds)

//WebUI.waitForElementVisible(findTestObject('09-Settings/Organization unit/button_link'), 0)
//WebUI.waitForElementClickable(findTestObject('09-Settings/Organization unit/button_link'), 0)
WebUI.click(findTestObject('09-Settings/Organization unit/button_link'))

WebUI.verifyElementPresent(findTestObject('09-Settings/Organization unit/mat-dialog-container_Join Request modal'), 0)

WebUI.verifyElementPresent(findTestObject('09-Settings/Organization unit/h2_Join Request'), 0)

WebUI.verifyElementPresent(findTestObject('09-Settings/Organization unit/div_Client link'), 0)

WebUI.verifyElementPresent(findTestObject('09-Settings/Organization unit/div_Partner link'), 0)

WebUI.delay(GlobalVariable.delay_3seconds)

WebUI.click(findTestObject('09-Settings/Organization unit/button_COPY'))

WebUI.verifyElementPresent(findTestObject('09-Settings/Organization unit/snack-bar-container_Copy Link'), 0)

WebUI.click(findTestObject('09-Settings/Organization unit/button_Ok'))

WebUI.delay(GlobalVariable.delay_3seconds)

//WebUI.executeJavaScript('window.open();', [])
//currentWindow = WebUI.getWindowIndex()
//WebUI.delay(3)
//WebUI.switchToWindowIndex(currentWindow + 1)
//WebUI.delay(3)
String my_clipboard = Toolkit.getDefaultToolkit().getSystemClipboard().getContents(null).getTransferData(DataFlavor.stringFlavor)

WebUI.navigateToUrl(my_clipboard)

WebUI.delay(GlobalVariable.delay_3seconds)

WebUI.verifyElementPresent(findTestObject('09-Settings/Organization unit/mat_card_join request link'), 0)

WebUI.delay(GlobalVariable.delay_3seconds)

WebUI.navigateToUrl(GlobalVariable.appURL)

WebUI.delay(GlobalVariable.delay_3seconds)

