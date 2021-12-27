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

WebUI.delay(2)

WebUI.click(findTestObject('08-Teams/OverlayClick'))

WebUI.delay(2)

WebUI.setText(findTestObject('08-Teams/SearchPostsInput'), 'Test')

WebUI.delay(2)

WebUI.click(findTestObject('08-Teams/mat-icon_search(posts)'))

WebUI.delay(2)

WebUI.click(findTestObject('08-Teams/div_Test(posts)'))

WebUI.delay(2)

WebUI.verifyElementVisible(findTestObject('08-Teams/div_Test(Post2)'))

WebUI.verifyElementText(findTestObject('08-Teams/div_Test(Post2)'), 'Test')

WebUI.delay(2)

WebUI.click(findTestObject('08-Teams/button_Close(Search_Results)'))

WebUI.delay(2)

WebUI.click(findTestObject('08-Teams/mat-icon_close(Search Results)'))

