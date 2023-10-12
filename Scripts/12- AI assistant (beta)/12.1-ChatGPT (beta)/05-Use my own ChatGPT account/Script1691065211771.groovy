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

WebUI.refresh()

WebUI.click(findTestObject('12-AI Assistant(beta)/AI asst button-Side panel'))

WebUI.click(findTestObject('12-AI Assistant(beta)/12.1-Chat GPT(beta)/Chat GPT (beta)'))

WebUI.click(findTestObject('12-AI Assistant(beta)/12.1-Chat GPT(beta)/Use my ownChatGPT account'))

/*WebUI.executeJavaScript('window.open();', [])

currentWindow = WebUI.getWindowIndex()

WebUI.delay(GlobalVariable.delay_3seconds)

WebUI.switchToWindowIndex(currentWindow + 1)

WebUI.navigateToUrl(GlobalVariable.url_CHATGPT)*/
String url = WebUI.getUrl()

//WebUI.verifyEqual(url, btnSrc)//
//WebUI.verifyElementText(findTestObject('12-AI Assistant(beta)/12.1-Chat GPT(beta)/Open AI.com-ChatGPT heading text'), 'ChatGPT')//
//WebUI.verifyEqual(findTestObject('12-AI Assistant(beta)/12.1-Chat GPT(beta)/Use my ownChatGPT account'), GlobalVariable.chatGPTURL)
url.contains('https://chat.openai.com/')

WebUI.closeWindowIndex(0)

