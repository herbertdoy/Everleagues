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

WebUI.delay(2)

WebUI.click(findTestObject('09-Connections/Labels/mat-icon_edit(Labels)'))

WebUI.click(findTestObject('09-Connections/Labels/input_Edit Label_labelName(Labels)'), FailureHandling.STOP_ON_FAILURE)

WebUI.clearText(findTestObject('09-Connections/Labels/input_Edit Label_labelName(Labels)'), FailureHandling.STOP_ON_FAILURE)

WebUI.delay(1)

WebUI.setText(findTestObject('09-Connections/Labels/input_Edit Label_labelName(Labels)'), 'Sample Label Test')

WebUI.delay(1)

WebUI.click(findTestObject('09-Connections/Labels/button_Edit Label(Labels)'))

WebUI.delay(1)

WebUI.click(findTestObject('09-Connections/Labels/mat-icon_edit(Labels)'))

WebUI.delay(1)

WebUI.click(findTestObject('09-Connections/Labels/input_Edit Label_labelName(Labels)'), FailureHandling.STOP_ON_FAILURE)

WebUI.clearText(findTestObject('09-Connections/Labels/input_Edit Label_labelName(Labels)'), FailureHandling.STOP_ON_FAILURE)

WebUI.delay(1)

WebUI.setText(findTestObject('09-Connections/Labels/input_Edit Label_labelName(Labels)'), 'Sample Label')

WebUI.delay(1)

WebUI.click(findTestObject('09-Connections/Labels/button_Edit Label(Labels)'))

WebUI.delay(2)

