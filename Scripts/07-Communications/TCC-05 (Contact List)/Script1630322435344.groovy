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

WebUI.click(findTestObject('07-Communications/mat-icon_cancel'))

WebUI.delay(3)

WebUI.click(findTestObject('07-Communications/ContactList/span_User  One'))

WebUI.delay(2)

WebUI.click(findTestObject('07-Communications/ContactList/textarea_userOne'))

WebUI.setText(findTestObject('07-Communications/ContactList/textarea_userOne'), 'Hi! This is a sample message.')

WebUI.delay(2)

WebUI.click(findTestObject('07-Communications/ContactList/mat-icon_insert_emoticon_UserOne'))

WebUI.delay(3)

WebUI.click(findTestObject('07-Communications/ContactList/span_LikeEmoji_UserOne'))

WebUI.delay(2)

WebUI.click(findTestObject('07-Communications/ContactList/mat-icon_insert_emoticon_UserOne'))

WebUI.click(findTestObject('07-Communications/ContactList/sendButton_UserOne'))

WebUI.delay(2)

WebUI.click(findTestObject('07-Communications/ContactList/span_User Two'))

WebUI.delay(2)

WebUI.click(findTestObject('07-Communications/ContactList/textarea_userTwo'))

WebUI.setText(findTestObject('07-Communications/ContactList/textarea_userTwo'), 'Hi! This is a sample message.')

WebUI.delay(2)

WebUI.click(findTestObject('07-Communications/ContactList/mat-icon_insert_emoticon_UserTwo'))

WebUI.delay(3)

WebUI.click(findTestObject('07-Communications/ContactList/span_LikeEmoji_UserTwo'))

WebUI.delay(2)

WebUI.click(findTestObject('07-Communications/ContactList/mat-icon_insert_emoticon_UserTwo'))

WebUI.click(findTestObject('07-Communications/ContactList/sendButton_UserTwo'))

WebUI.delay(2)

WebUI.click(findTestObject('07-Communications/ContactList/span_User  One'))

WebUI.delay(2)

CustomKeywords.'uploadpackage.Upload.uploadFile'(findTestObject('07-Communications/ContactList/mat-icon_attach_file'), 'C:\\Users\\me\\Documents\\SampleImage.jpg')

WebUI.delay(5)

WebUI.click(findTestObject('07-Communications/ContactList/sendButton_UserOne'))

WebUI.delay(2)

WebUI.click(findTestObject('07-Communications/ContactList/mat-icon_videocam'))

WebUI.delay(2)

WebUI.click(findTestObject('07-Communications/ContactList/mat-icon_cancel(Video)'))

WebUI.delay(2)

WebUI.click(findTestObject('07-Communications/ContactList/mat-icon_videocam'))

WebUI.delay(2)

WebUI.click(findTestObject('07-Communications/ContactList/sendButton_UserOne'))

WebUI.delay(3)

