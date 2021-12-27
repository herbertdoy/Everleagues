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

WebUI.delay(5)

WebUI.click(findTestObject('04-Side Icons(Organization)/button_person_add'))

WebUI.delay(2)

WebUI.verifyElementVisible(findTestObject('04-Side Icons(Organization)/Add New User Verifications/h4_Invite New User (Header)_1'))

WebUI.verifyElementVisible(findTestObject('04-Side Icons(Organization)/Add New User Verifications/Email_2'))

WebUI.verifyElementVisible(findTestObject('04-Side Icons(Organization)/Add New User Verifications/FirstName_3'))

WebUI.verifyElementVisible(findTestObject('04-Side Icons(Organization)/Add New User Verifications/LastName_4'))

WebUI.verifyElementVisible(findTestObject('04-Side Icons(Organization)/Add New User Verifications/Role_5'))

WebUI.verifyElementVisible(findTestObject('04-Side Icons(Organization)/Add New User Verifications/TestOrganization_6'))

WebUI.click(findTestObject('04-Side Icons(Organization)/button_Cancel (Invite New User)'))

