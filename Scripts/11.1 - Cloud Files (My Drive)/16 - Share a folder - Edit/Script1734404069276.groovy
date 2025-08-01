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

WebUI.delay(GlobalVariable.delay_2s)

WebUI.rightClick(findTestObject('11-Cloud Files/td_Automation folder EDIT'))

WebUI.click(findTestObject('11-Cloud Files/button_Share'))

WebUI.verifyElementVisible(findTestObject('11-Cloud Files/mat-dialog-container_View Share Files Modal'))

WebUI.click(findTestObject('11-Cloud Files/div_dropdown'))

WebUI.click(findTestObject('11-Cloud Files/mat-option_manager'))

WebUI.delay(GlobalVariable.delay_3s)

WebUI.verifyElementVisible(findTestObject('11-Cloud Files/div_GTGG tester2'))

WebUI.click(findTestObject('11-Cloud Files/div_dropdown2'))

WebUI.click(findTestObject('11-Cloud Files/mat-option-checkmark_contributor'))

WebUI.delay(GlobalVariable.delay_3s)

WebUI.verifyElementVisible(findTestObject('11-Cloud Files/div_GTGG tester'))

WebUI.click(findTestObject('11-Cloud Files/div_dropdown3'))

WebUI.click(findTestObject('11-Cloud Files/span_delete Remove Access'))

WebUI.click(findTestObject('11-Cloud Files/button_save2'))

WebUI.verifyElementVisible(findTestObject('11-Cloud Files/snack-bar-container_Shared file access updated successfully.OK'))

WebUI.delay(GlobalVariable.delay_2s)

WebUI.click(findTestObject('11-Cloud Files/mat-icon_close'))

WebUI.delay(GlobalVariable.delay_2s)

WebUI.rightClick(findTestObject('11-Cloud Files/td_Automation folder EDIT'))

WebUI.click(findTestObject('11-Cloud Files/button_Share'))

WebUI.delay(GlobalVariable.delay_2s)

String my_clipboard = Toolkit.getDefaultToolkit().getSystemClipboard().getContents(null).getTransferData(DataFlavor.stringFlavor)

WebUI.navigateToUrl(my_clipboard)

WebUI.delay(GlobalVariable.delay_2s)

WebUI.click(findTestObject('03-Header Menu/div_Cloud Files'))

WebUI.scrollToElement(findTestObject('11-Cloud Files/a_My Drive'), 0)

WebUI.click(findTestObject('11-Cloud Files/a_My Drive'))

WebUI.click(findTestObject('11-Cloud Files/h4_MY DRIVE'))

WebUI.delay(GlobalVariable.delay_2s)

