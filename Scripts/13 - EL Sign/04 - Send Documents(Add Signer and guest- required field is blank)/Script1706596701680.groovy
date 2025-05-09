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

WebUI.click(findTestObject('13-EL Sign/div_ELSignTrackID'))

WebUI.delay(GlobalVariable.delay_2s)

WebUI.click(findTestObject('13-EL Sign/span_COMPLETE'))

WebUI.waitForElementVisible(findTestObject('13-EL Sign/snack-bar-container_Please add signer and field'), 0)

WebUI.verifyElementVisible(findTestObject('13-EL Sign/snack-bar-container_Please add signer and field'))

WebUI.delay(GlobalVariable.delay_2s)

WebUI.click(findTestObject('13-EL Sign/button_personADD SIGNER  FIELD'))

WebUI.delay(GlobalVariable.delay_2s)

WebUI.verifyElementVisible(findTestObject('13-EL Sign/mat-dialog-container_AddSignerModal'))

WebUI.click(findTestObject('13-EL Sign/input_Search for a Signer'))

WebUI.sendKeys(findTestObject('13-EL Sign/input_Search for a Signer'), Keys.chord(Keys.ESCAPE))

WebUI.click(findTestObject('13-EL Sign/input_Receiver email address'))

WebUI.clickOffset(findTestObject('13-EL Sign/input_Receiver email address'), 100, 100)

WebUI.verifyElementVisible(findTestObject('13-EL Sign/mat-error_Signer name is required'))

WebUI.verifyElementVisible(findTestObject('13-EL Sign/mat-error_Email address is required'))

WebUI.scrollToElement(findTestObject('13-EL Sign/button_SAVE'), 0)

WebUI.verifyElementNotClickable(findTestObject('13-EL Sign/button_SAVE'))

WebUI.click(findTestObject('13-EL Sign/button_CANCEL'))

WebUI.delay(GlobalVariable.delay_2s)

WebUI.click(findTestObject('13-EL Sign/button_personADD SIGNER  FIELD'))

WebUI.delay(GlobalVariable.delay_2s)

WebUI.click(findTestObject('13-EL Sign/button_ADD GUEST'))

WebUI.verifyElementVisible(findTestObject('13-EL Sign/mat-dialog-container_New GuestModal'))

WebUI.click(findTestObject('13-EL Sign/input_GuestEmailAddress'))

WebUI.sendKeys(findTestObject('13-EL Sign/input_GuestEmailAddress'), Keys.chord(Keys.ESCAPE))

WebUI.click(findTestObject('13-EL Sign/mat-icon_clear'))

WebUI.delay(GlobalVariable.delay_2s)

