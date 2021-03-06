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

WebUI.delay(5)

'This is a .jpg [make sure to change your filepath for the image before running the automation]'
CustomKeywords.'uploadpackage.Upload.uploadFile'(findTestObject('Object Repository/05-Chat/03-Sending attached file/button_attach_file'), 
    'C:\\Users\\User\\Desktop\\EL automation\\qa.jpg')

WebUI.delay(5)

WebUI.click(findTestObject('05-Chat/02-Sending chat messages/button_send'))

WebUI.delay(20)

'either you remove this script or you change the element coz its setup to verify the file I uploaded'
WebUI.verifyElementVisible(findTestObject('05-Chat/03-Sending attached file/img_You_inserted'))

WebUI.refresh()

WebUI.delay(15)

'This is a .pdf [make sure to change your filepath for the image before running the automation'
WebUI.uploadFileWithDragAndDrop(findTestObject('Object Repository/05-Chat/02-Sending chat messages/textarea__msg'), 'C:\\Users\\User\\Desktop\\EL automation\\sample.pdf')

WebUI.delay(5)

WebUI.click(findTestObject('05-Chat/02-Sending chat messages/button_send'))

WebUI.delay(20)

'either you remove this script or you change the element coz its setup to verify the file I uploaded'
WebUI.verifyElementVisible(findTestObject('05-Chat/03-Sending attached file/span_sample.pdf'))

WebUI.refresh()

WebUI.delay(15)

'This is a .mp4 [make sure to change your filepath for the image before running the automation'
WebUI.uploadFileWithDragAndDrop(findTestObject('Object Repository/05-Chat/02-Sending chat messages/textarea__msg'), 'C:\\Users\\User\\Desktop\\EL automation\\video.mp4')

WebUI.delay(5)

WebUI.click(findTestObject('05-Chat/02-Sending chat messages/button_send'))

WebUI.delay(20)

'either you remove this script or you change the element coz its setup to verify the file I uploaded'
WebUI.verifyElementVisible(findTestObject('05-Chat/03-Sending attached file/span_video.mp4'))

WebUI.delay(5)

