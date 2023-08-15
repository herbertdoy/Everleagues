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

WebUI.click(findTestObject('08-Operations/Private Circle/button_add'))

WebUI.verifyElementVisible(findTestObject('08-Operations/Private Circle/Add New Circle modal'))

WebUI.verifyElementNotClickable(findTestObject('08-Operations/Private Circle/button_Add modal'))

WebUI.click(findTestObject('08-Operations/Private Circle/Select User dropdown'))

WebUI.clickOffset(findTestObject('08-Operations/Private Circle/h4_Add New Circle Association'), 100, 100)

WebUI.click(findTestObject('08-Operations/Private Circle/Relationship dropdown'))

WebUI.clickOffset(findTestObject('08-Operations/Private Circle/h4_Add New Circle Association'), 100, 100)

WebUI.verifyElementVisible(findTestObject('08-Operations/Private Circle/Select User Field is required'))

WebUI.verifyElementVisible(findTestObject('08-Operations/Private Circle/Relationship is required'))

WebUI.delay(GlobalVariable.delay_3seconds)

