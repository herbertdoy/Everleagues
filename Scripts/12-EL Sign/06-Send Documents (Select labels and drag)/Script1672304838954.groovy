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

WebUI.dragAndDropToObject(findTestObject('12-EL Sign/button_createGG TESTERSign here'), findTestObject('12-EL Sign/documents'), 
    FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('12-EL Sign/div_create-draggable'))

WebUI.click(findTestObject('12-EL Sign/button_clear'))

WebUI.verifyElementVisible(findTestObject('12-EL Sign/mat-dialog-container_Do you confirm the deletion of this ELSign fieldModal'))

WebUI.click(findTestObject('12-EL Sign/button_No'))

WebUI.click(findTestObject('12-EL Sign/button_clear'))

WebUI.delay(GlobalVariable.delay_3seconds)

WebUI.click(findTestObject('12-EL Sign/button_Yes'))

WebUI.delay(GlobalVariable.delay_3seconds)

WebUI.dragAndDropToObject(findTestObject('12-EL Sign/button_createGG TESTERSign here'), findTestObject('12-EL Sign/documents'), 
    FailureHandling.STOP_ON_FAILURE)

WebUI.dragAndDropByOffset(findTestObject('12-EL Sign/button_createGG TESTERSign here'), 3, 10)

WebUI.dragAndDropByOffset(findTestObject('12-EL Sign/button_calendarGG TESTERDate signed'), 3, 30)

WebUI.dragAndDropByOffset(findTestObject('12-EL Sign/button_person_pinGG TESTERInitial here'), 3, 60)

WebUI.delay(GlobalVariable.delay_3seconds)

//WebUI.delay(3)
//
//WebUI.click(findTestObject('12-EL Sign/button_createGG TESTERSign here'))
//
//WebUI.clickOffset(findTestObject('12-EL Sign/span_COMPLETE'), 100, 100)
//
//WebUI.click(findTestObject('12-EL Sign/button_calendarGG TESTERDate signed'))
//
//WebUI.clickOffset(findTestObject('12-EL Sign/span_COMPLETE'), 100, 100)
//
//WebUI.click(findTestObject('12-EL Sign/button_person_pinGG TESTERInitial here'))
//
//WebUI.clickOffset(findTestObject('12-EL Sign/span_COMPLETE'), 100, 100)
//
//WebUI.delay(3)
//WebUI.dragAndDropByOffset(findTestObject('12-EL Sign/div_usericon-draggable'), 3, 30)
//
//WebUI.dragAndDropByOffset(findTestObject('12-EL Sign/div_calendar-draggable'), 3, 60)
WebUI.click(findTestObject('12-EL Sign/span_COMPLETE'))

WebUI.delay(GlobalVariable.delay_3seconds)

WebUI.verifyElementVisible(findTestObject('12-EL Sign/th_Send ELSign Invite'))

WebUI.scrollToElement(findTestObject('12-EL Sign/div_Dear ReceiverName'), 0)

WebUI.scrollToElement(findTestObject('12-EL Sign/th_Send ELSign Invite'), 0)

WebUI.delay(GlobalVariable.delay_3seconds)

WebUI.click(findTestObject('12-EL Sign/button_sendSend Invite'))

WebUI.delay(GlobalVariable.delay_3seconds)

