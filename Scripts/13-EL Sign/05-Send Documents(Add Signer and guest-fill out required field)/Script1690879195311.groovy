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

//WebUI.click(findTestObject('13-EL Sign/div_ELSignTrackID'))
//WebUI.delay(3)
WebUI.click(findTestObject('13-EL Sign/button_personADD SIGNER  FIELD'))

WebUI.click(findTestObject('13-EL Sign/input_Search for a Signer'))

WebUI.click(findTestObject('13-EL Sign/mat-option_addsigner_testuser005mailinator.com'), FailureHandling.STOP_ON_FAILURE)

WebUI.scrollToElement(findTestObject('13-EL Sign/button_SAVE'), 0)

WebUI.click(findTestObject('13-EL Sign/button_SAVE'))

WebUI.delay(GlobalVariable.delay_3seconds)

WebUI.click(findTestObject('13-EL Sign/button_personADD SIGNER  FIELD'))

WebUI.delay(GlobalVariable.delay_3seconds)

WebUI.click(findTestObject('13-EL Sign/button_person_outlineADD GUEST'))

WebUI.verifyElementVisible(findTestObject('13-EL Sign/mat-dialog-container_New GuestModal'))

WebUI.click(findTestObject('13-EL Sign/input_GuestEmailAddress'))

WebUI.click(findTestObject('13-EL Sign/mat-option_newguest_autotester03mailinator.com'))

WebUI.scrollToElement(findTestObject('13-EL Sign/button_SAVE2'), 0)

WebUI.click(findTestObject('13-EL Sign/button_SAVE2'))
