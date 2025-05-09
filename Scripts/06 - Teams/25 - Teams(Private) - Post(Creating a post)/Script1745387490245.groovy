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

WebUI.scrollToElement(findTestObject('06-Teams/05- Teams-General Channel/Input field_post'), 0)

WebUI.setText(findTestObject('06-Teams/05- Teams-General Channel/Input field_post'), post)

WebUI.click(findTestObject('06-Teams/05- Teams-General Channel/button_send'))

WebUI.delay(GlobalVariable.delay_2s)

WebUI.verifyElementVisible(findTestObject('06-Teams/05- Teams-General Channel/posted_This is automation'))

WebUI.delay(GlobalVariable.delay_2s)

WebUI.click(findTestObject('06-Teams/05- Teams-General Channel/ellipsis 1'))

WebUI.click(findTestObject('06-Teams/05- Teams-General Channel/button_Edit Post'))

WebUI.verifyElementVisible(findTestObject('06-Teams/05- Teams-General Channel/h2_Edit post'))

WebUI.setText(findTestObject('06-Teams/05- Teams-General Channel/Edit field'), editPost)

WebUI.click(findTestObject('06-Teams/05- Teams-General Channel/button_send edit'))

WebUI.waitForElementVisible(findTestObject('06-Teams/05- Teams-General Channel/Successfully edited post msg'), 0)

WebUI.verifyElementVisible(findTestObject('06-Teams/05- Teams-General Channel/Successfully edited post msg'))

WebUI.delay(GlobalVariable.delay_2s)

WebUI.scrollToElement(findTestObject('06-Teams/05- Teams-General Channel/Bold select'), 0)

WebUI.click(findTestObject('06-Teams/05- Teams-General Channel/Bold select'))

WebUI.click(findTestObject('06-Teams/05- Teams-General Channel/Input field_post'), FailureHandling.STOP_ON_FAILURE)

WebUI.sendKeys(findTestObject('Object Repository/06-Teams/05- Teams-General Channel/Input field_post'), bold)

WebUI.click(findTestObject('06-Teams/05- Teams-General Channel/button_send'))

WebUI.waitForElementVisible(findTestObject('06-Teams/05- Teams-General Channel/added new post msg'), 0)

WebUI.verifyElementVisible(findTestObject('06-Teams/05- Teams-General Channel/added new post msg'))

WebUI.delay(GlobalVariable.delay_2s)

WebUI.verifyElementVisible(findTestObject('06-Teams/05- Teams-General Channel/Bold'))

WebUI.delay(GlobalVariable.delay_2s)

WebUI.click(findTestObject('06-Teams/05- Teams-General Channel/Italic Select'))

WebUI.click(findTestObject('06-Teams/05- Teams-General Channel/Input field_post'), FailureHandling.STOP_ON_FAILURE)

WebUI.sendKeys(findTestObject('Object Repository/06-Teams/05- Teams-General Channel/Input field_post'), italic)

WebUI.click(findTestObject('06-Teams/05- Teams-General Channel/button_send'))

WebUI.waitForElementVisible(findTestObject('06-Teams/05- Teams-General Channel/added new post msg'), 0)

WebUI.verifyElementVisible(findTestObject('06-Teams/05- Teams-General Channel/added new post msg'))

WebUI.delay(GlobalVariable.delay_2s)

WebUI.verifyElementVisible(findTestObject('06-Teams/05- Teams-General Channel/Italic'))

WebUI.delay(GlobalVariable.delay_2s)

WebUI.click(findTestObject('06-Teams/05- Teams-General Channel/Underline select'))

WebUI.click(findTestObject('06-Teams/05- Teams-General Channel/Input field_post'), FailureHandling.STOP_ON_FAILURE)

WebUI.sendKeys(findTestObject('Object Repository/06-Teams/05- Teams-General Channel/Input field_post'), underline)

WebUI.click(findTestObject('06-Teams/05- Teams-General Channel/button_send'))

WebUI.waitForElementVisible(findTestObject('06-Teams/05- Teams-General Channel/added new post msg'), 0)

WebUI.verifyElementVisible(findTestObject('06-Teams/05- Teams-General Channel/added new post msg'))

WebUI.delay(GlobalVariable.delay_2s)

WebUI.verifyElementVisible(findTestObject('06-Teams/05- Teams-General Channel/Underline'))

WebUI.delay(GlobalVariable.delay_2s)

WebUI.click(findTestObject('06-Teams/05- Teams-General Channel/Strikethrough select'))

WebUI.click(findTestObject('06-Teams/05- Teams-General Channel/Input field_post'), FailureHandling.STOP_ON_FAILURE)

WebUI.sendKeys(findTestObject('Object Repository/06-Teams/05- Teams-General Channel/Input field_post'), strikethrough)

WebUI.click(findTestObject('06-Teams/05- Teams-General Channel/button_send'))

WebUI.waitForElementVisible(findTestObject('06-Teams/05- Teams-General Channel/added new post msg'), 0)

WebUI.verifyElementVisible(findTestObject('06-Teams/05- Teams-General Channel/added new post msg'))

WebUI.delay(GlobalVariable.delay_2s)

WebUI.verifyElementVisible(findTestObject('06-Teams/05- Teams-General Channel/Strikethrough'))

WebUI.delay(GlobalVariable.delay_2s)

WebUI.click(findTestObject('06-Teams/05- Teams-General Channel/Heading dropdown'))

WebUI.verifyElementVisible(findTestObject('06-Teams/05- Teams-General Channel/div_Header 1'))

WebUI.verifyElementVisible(findTestObject('06-Teams/05- Teams-General Channel/div_Header 2'))

WebUI.verifyElementVisible(findTestObject('06-Teams/05- Teams-General Channel/div_Header 3'))

WebUI.verifyElementVisible(findTestObject('06-Teams/05- Teams-General Channel/div_Header 4'))

WebUI.verifyElementVisible(findTestObject('06-Teams/05- Teams-General Channel/div_Header 5'))

WebUI.verifyElementVisible(findTestObject('06-Teams/05- Teams-General Channel/div_Header 6'))

WebUI.delay(GlobalVariable.delay_2s)

WebUI.click(findTestObject('06-Teams/05- Teams-General Channel/div_Header 4'))

WebUI.click(findTestObject('06-Teams/05- Teams-General Channel/Input field_post'), FailureHandling.STOP_ON_FAILURE)

WebUI.sendKeys(findTestObject('Object Repository/06-Teams/05- Teams-General Channel/Input field_post'), header4)

WebUI.click(findTestObject('06-Teams/05- Teams-General Channel/button_send'))

WebUI.waitForElementVisible(findTestObject('06-Teams/05- Teams-General Channel/added new post msg'), 0)

WebUI.verifyElementVisible(findTestObject('06-Teams/05- Teams-General Channel/added new post msg'))

WebUI.delay(GlobalVariable.delay_2s)

WebUI.verifyElementVisible(findTestObject('06-Teams/05- Teams-General Channel/h4_Four'))

WebUI.delay(GlobalVariable.delay_2s)

WebUI.click(findTestObject('06-Teams/05- Teams-General Channel/Heading dropdown'))

WebUI.click(findTestObject('06-Teams/05- Teams-General Channel/div_Header 5'))

WebUI.click(findTestObject('06-Teams/05- Teams-General Channel/Input field_post'), FailureHandling.STOP_ON_FAILURE)

WebUI.sendKeys(findTestObject('Object Repository/06-Teams/05- Teams-General Channel/Input field_post'), header5)

WebUI.click(findTestObject('06-Teams/05- Teams-General Channel/button_send'))

WebUI.waitForElementVisible(findTestObject('06-Teams/05- Teams-General Channel/added new post msg'), 0)

WebUI.verifyElementVisible(findTestObject('06-Teams/05- Teams-General Channel/added new post msg'))

WebUI.delay(GlobalVariable.delay_2s)

WebUI.verifyElementVisible(findTestObject('06-Teams/05- Teams-General Channel/h5_Five'))

WebUI.delay(GlobalVariable.delay_2s)

