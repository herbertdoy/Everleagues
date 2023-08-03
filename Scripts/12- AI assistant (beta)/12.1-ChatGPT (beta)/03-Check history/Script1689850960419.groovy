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
// pangit si fet
import java.time.LocalDateTime as LocalDateTime
import java.time.format.DateTimeFormatter as DateTimeFormatter
// ** end of pangit si fet
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

LocalDateTime now = LocalDateTime.now()

LocalDateTime minus12Hours = now.minusHours(12)

//DateTimeFormatter formatter = DateTimeFormatter.ISO_LOCAL_DATE_TIME
DateTimeFormatter formatter = DateTimeFormatter.ofPattern('MM/dd/yyyy h:mm a')

//String nowString = formatter.format(now)
String formattedTime = minus12Hours.format(formatter)

WebUI.comment(formattedTime)

WebUI.click(findTestObject('12-AI Assistant(beta)/12.1-Chat GPT(beta)/History button'))

WebUI.verifyElementText(findTestObject('12-AI Assistant(beta)/12.1-Chat GPT(beta)/div_Chat History heading'), 'Chat History')

String historytime = ''

historytime = WebUI.getText(findTestObject('12-AI Assistant(beta)/12.1-Chat GPT(beta)/Chat history-Latest line with date'))

historytime.contains(formattedTime)

WebUI.click(findTestObject('12-AI Assistant(beta)/12.1-Chat GPT(beta)/Chat history-Latest line with date'))

WebUI.verifyElementVisible(findTestObject('12-AI Assistant(beta)/12.1-Chat GPT(beta)/History-Generated answer assertion'))

