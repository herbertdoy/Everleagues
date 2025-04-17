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

WebUI.click(findTestObject('05-Chat/09-Hiding a chat/ellipsis_chat setting'))

WebUI.delay(GlobalVariable.delay_2s)

WebUI.click(findTestObject('05-Chat/10-Export Chat/button_Export Chat'))

WebUI.verifyElementVisible(findTestObject('05-Chat/10-Export Chat/h4_Export Chat'))

WebUI.verifyElementVisible(findTestObject('05-Chat/10-Export Chat/div_Each export is limited to 100 messages'))

WebUI.verifyElementVisible(findTestObject('05-Chat/10-Export Chat/mat-hint_Default filename will be used if left empty'))

WebUI.delay(GlobalVariable.delay_2s)

WebUI.setText(findTestObject('05-Chat/10-Export Chat/input_Each export is limited to 100 messages_filename'), export_name)

WebUI.click(findTestObject('05-Chat/10-Export Chat/input_Default filename will be used if left empty_locationName'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.delay(GlobalVariable.delay_2s)

WebUI.verifyElementVisible(findTestObject('05-Chat/10-Export Chat/h4_Select Export Location'))

WebUI.click(findTestObject('05-Chat/10-Export Chat/span_My Drive'))

WebUI.click(findTestObject('05-Chat/10-Export Chat/button_Create New Folder'))

WebUI.delay(GlobalVariable.delay_2s)

//def random = new Random()
//
//def randomString = Long.toHexString(random.nextLong())
//
//def exportFolder = 'aExport' + randomString
//KeywordUtil.logInfo('Generated password: ' + password)
WebUI.setText(findTestObject('05-Chat/10-Export Chat/input_exportLoc'), locName)

WebUI.delay(GlobalVariable.delay_2s)

WebUI.click(findTestObject('05-Chat/10-Export Chat/button_Select'))

//WebUI.click(findTestObject('05-Chat/10-Export Chat/div_exportFolder'))
WebUI.delay(GlobalVariable.delay_2s)

WebUI.scrollToElement(findTestObject('05-Chat/10-Export Chat/span_Export Folder'), 0)

WebUI.click(findTestObject('05-Chat/10-Export Chat/span_Export Folder'))

WebUI.delay(GlobalVariable.delay_2s)

WebUI.click(findTestObject('05-Chat/10-Export Chat/button_Select'))

WebUI.delay(GlobalVariable.delay_2s)

WebUI.click(findTestObject('05-Chat/10-Export Chat/span_Custom range'))

WebUI.verifyElementVisible(findTestObject('05-Chat/10-Export Chat/span_Start Date'))

WebUI.verifyElementVisible(findTestObject('05-Chat/10-Export Chat/span_End Date'))

WebUI.delay(GlobalVariable.delay_2s)

WebUI.click(findTestObject('05-Chat/10-Export Chat/span_Last'))

WebUI.click(findTestObject('05-Chat/10-Export Chat/div_minute(s) dropdown'))

WebUI.verifyElementVisible(findTestObject('05-Chat/10-Export Chat/mat-option_minute(s)'))

WebUI.verifyElementVisible(findTestObject('05-Chat/10-Export Chat/mat-option_hour(s)'))

WebUI.verifyElementVisible(findTestObject('05-Chat/10-Export Chat/mat-option_day(s)'))

WebUI.verifyElementVisible(findTestObject('05-Chat/10-Export Chat/mat-option_week(s)'))

WebUI.verifyElementVisible(findTestObject('05-Chat/10-Export Chat/mat-option_month(s)'))

WebUI.verifyElementVisible(findTestObject('05-Chat/10-Export Chat/mat-option_year(s)'))

WebUI.click(findTestObject('05-Chat/10-Export Chat/mat-option_hour(s)'))

WebUI.delay(GlobalVariable.delay_2s)

WebUI.click(findTestObject('05-Chat/10-Export Chat/span_Include files and media'))

WebUI.delay(GlobalVariable.delay_2s)

WebUI.click(findTestObject('05-Chat/10-Export Chat/button_Export'))

WebUI.verifyElementVisible(findTestObject('05-Chat/10-Export Chat/span_Exporting chat. We will send you a notification once it is completed'))

WebUI.delay(GlobalVariable.delay_2s)

WebUI.click(findTestObject('05-Chat/09-Hiding a chat/ellipsis_chat setting'))

WebUI.delay(GlobalVariable.delay_2s)

WebUI.click(findTestObject('05-Chat/10-Export Chat/button_Export Chat'))

WebUI.delay(GlobalVariable.delay_2s)

WebUI.click(findTestObject('05-Chat/10-Export Chat/input_Default filename will be used if left empty_locationName'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.delay(GlobalVariable.delay_2s)

WebUI.click(findTestObject('05-Chat/10-Export Chat/span_MyDrive'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('05-Chat/10-Export Chat/button_Select'))

WebUI.delay(GlobalVariable.delay_2s)

WebUI.click(findTestObject('05-Chat/10-Export Chat/button_Export'))

WebUI.delay(GlobalVariable.delay_2s)

WebUI.click(findTestObject('05-Chat/09-Hiding a chat/ellipsis_chat setting'))

WebUI.delay(GlobalVariable.delay_2s)

WebUI.click(findTestObject('05-Chat/10-Export Chat/button_Export Chat'))

WebUI.delay(GlobalVariable.delay_2s)

WebUI.click(findTestObject('05-Chat/10-Export Chat/input_Default filename will be used if left empty_locationName'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.delay(GlobalVariable.delay_2s)

WebUI.click(findTestObject('05-Chat/10-Export Chat/toggle_sharedDrive'))

WebUI.click(findTestObject('05-Chat/10-Export Chat/span_chatExport'))

WebUI.delay(GlobalVariable.delay_2s)

WebUI.click(findTestObject('05-Chat/10-Export Chat/button_Select'))

WebUI.delay(GlobalVariable.delay_2s)

WebUI.click(findTestObject('05-Chat/10-Export Chat/button_Export'))

WebUI.delay(GlobalVariable.delay_2s)

WebUI.scrollToElement(findTestObject('05-Chat/10-Export Chat/div_replyForScroll'), 0)

WebUI.delay(GlobalVariable.delay_2s)

WebUI.mouseOver(findTestObject('05-Chat/10-Export Chat/chevron_file'))

WebUI.click(findTestObject('05-Chat/10-Export Chat/chevron_file'))

WebUI.delay(GlobalVariable.delay_2s)

WebUI.click(findTestObject('05-Chat/10-Export Chat/btn_SavetoCloudStorage'))

WebUI.delay(GlobalVariable.delay_2s)

WebUI.click(findTestObject('05-Chat/10-Export Chat/span_MyDrive'))

WebUI.delay(GlobalVariable.delay_2s)

WebUI.click(findTestObject('05-Chat/10-Export Chat/button_Select'))

WebUI.waitForElementVisible(findTestObject('05-Chat/snackbar/span_saveToDrive'), 0)

WebUI.verifyElementVisible(findTestObject('05-Chat/snackbar/span_saveToDrive'))

WebUI.delay(GlobalVariable.delay_2s)

WebUI.click(findTestObject('05-Chat/10-Export Chat/a_Files'))

WebUI.delay(GlobalVariable.delay_2s)

WebUI.click(findTestObject('05-Chat/10-Export Chat/btn_filesDownload'))

WebUI.delay(GlobalVariable.delay_2s)

WebUI.click(findTestObject('05-Chat/10-Export Chat/btn_filesExport'))

WebUI.delay(GlobalVariable.delay_2s)

WebUI.click(findTestObject('05-Chat/10-Export Chat/span_MyDrive'))

WebUI.click(findTestObject('05-Chat/10-Export Chat/button_Select'))

WebUI.delay(GlobalVariable.delay_3s)

