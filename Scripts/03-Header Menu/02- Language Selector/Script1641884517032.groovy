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
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW

WebUI.click(findTestObject('03-Header Menu/Language/button_Language Selector'))

WebUI.delay(GlobalVariable.delay_2seconds)

WebUI.click(findTestObject('03-Header Menu/Language/button_chinese 1'))

WebUI.delay(GlobalVariable.delay_2seconds)

WebUI.verifyElementVisible(findTestObject('03-Header Menu/Language/Language Div/div_chinese1 dashboard'))

WebUI.verifyElementVisible(findTestObject('03-Header Menu/Language/Language Div/div_chinese1 chat'))

WebUI.verifyElementVisible(findTestObject('03-Header Menu/Language/Language Div/div_chinese1 teams'))

WebUI.delay(GlobalVariable.delay_2seconds)

WebUI.click(findTestObject('03-Header Menu/Language/button_Language Selector'))

WebUI.delay(GlobalVariable.delay_2seconds)

WebUI.click(findTestObject('03-Header Menu/Language/button_chinese 2'))

WebUI.delay(GlobalVariable.delay_2seconds)

WebUI.verifyElementVisible(findTestObject('03-Header Menu/Language/Language Div/div_chinese2 dashboard'))

WebUI.verifyElementVisible(findTestObject('03-Header Menu/Language/Language Div/div_chinese2 chat'))

WebUI.verifyElementVisible(findTestObject('03-Header Menu/Language/Language Div/div_chinese2 teams'))

WebUI.delay(GlobalVariable.delay_2seconds)

WebUI.click(findTestObject('03-Header Menu/Language/button_Language Selector'))

WebUI.delay(GlobalVariable.delay_2seconds)

WebUI.click(findTestObject('03-Header Menu/Language/button_chinese 3'))

WebUI.delay(GlobalVariable.delay_2seconds)

WebUI.verifyElementVisible(findTestObject('03-Header Menu/Language/Language Div/div_chinese3 dashboard'))

WebUI.verifyElementVisible(findTestObject('03-Header Menu/Language/Language Div/div_chinese3 chat'))

WebUI.verifyElementVisible(findTestObject('03-Header Menu/Language/Language Div/div_chinese3 teams'))

WebUI.delay(GlobalVariable.delay_2seconds)

WebUI.click(findTestObject('03-Header Menu/Language/button_Language Selector'))

WebUI.delay(GlobalVariable.delay_2seconds)

WebUI.click(findTestObject('03-Header Menu/Language/button_Espanol'))

WebUI.delay(GlobalVariable.delay_2seconds)

WebUI.verifyElementVisible(findTestObject('03-Header Menu/Language/Language Div/div_spanish_Panel'))

WebUI.verifyElementVisible(findTestObject('03-Header Menu/Language/Language Div/div_spanish_Equipo'))

WebUI.delay(GlobalVariable.delay_2seconds)

WebUI.click(findTestObject('03-Header Menu/Language/button_Language Selector'))

WebUI.delay(GlobalVariable.delay_2seconds)

WebUI.click(findTestObject('03-Header Menu/Language/button_Italiano'))

WebUI.delay(GlobalVariable.delay_10seconds)

WebUI.verifyElementVisible(findTestObject('03-Header Menu/Language/Language Div/div_Pannello di controllo'))

WebUI.verifyElementVisible(findTestObject('03-Header Menu/Language/Language Div/div_Impostazioni'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('03-Header Menu/Language/button_Language Selector'))

WebUI.delay(GlobalVariable.delay_2seconds)

WebUI.click(findTestObject('03-Header Menu/Language/button_English'))

WebUI.delay(GlobalVariable.delay_2seconds)

WebUI.verifyElementVisible(findTestObject('03-Header Menu/Language/Language Div/div_Dashboard'))

WebUI.verifyElementVisible(findTestObject('03-Header Menu/Language/Language Div/div_Teams'))

WebUI.delay(GlobalVariable.delay_2seconds)

