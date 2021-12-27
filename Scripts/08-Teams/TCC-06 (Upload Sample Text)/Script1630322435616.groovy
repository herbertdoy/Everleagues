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

WebUI.openBrowser('')

WebUI.navigateToUrl('https://lab.everleagues.com/')

WebUI.maximizeWindow()

WebUI.setText(findTestObject('Object Repository/01-Login/input_Email_email'), 'norvs26@mailinator.com')

WebUI.setEncryptedText(findTestObject('Object Repository/01-Login/input_Email_password'), '8yFRyszE6U6jvsCn51OQbg==')

WebUI.click(findTestObject('Object Repository/01-Login/button_Sign in'))

WebUI.delay(3)

WebUI.click(findTestObject('08-Teams/div_Teams'))

WebUI.delay(2)

WebUI.verifyElementVisible(findTestObject('08-Teams/Teams Verification/h4_TEAMS'))

WebUI.verifyElementVisible(findTestObject('08-Teams/Teams Verification/div_Teamssearch'))

WebUI.verifyElementVisible(findTestObject('08-Teams/Teams Verification/Teams Box'))

WebUI.delay(2)

WebUI.click(findTestObject('08-Teams/mat-icon_search'))

WebUI.setText(findTestObject('08-Teams/Search_Input'), 'Test Organization')

WebUI.delay(2)

WebUI.verifyElementVisible(findTestObject('08-Teams/Teams Verification/TestOrganizationXpath1'), FailureHandling.STOP_ON_FAILURE)

WebUI.delay(2)

WebUI.doubleClick(findTestObject('08-Teams/div_TOTest Organization'))

WebUI.click(findTestObject('08-Teams/div_General'))

WebUI.delay(3)

WebUI.verifyElementVisible(findTestObject('08-Teams/a_Posts'))

WebUI.verifyElementVisible(findTestObject('08-Teams/a_Files'))

WebUI.verifyElementVisible(findTestObject('08-Teams/General Text Area'))

WebUI.verifyElementVisible(findTestObject('08-Teams/mat-icon_search(posts)'))

WebUI.verifyElementVisible(findTestObject('08-Teams/SearchPostsInput'))

WebUI.verifyElementVisible(findTestObject('08-Teams/mat-icon_attach_file'))

WebUI.verifyElementVisible(findTestObject('08-Teams/mat-icon_image'))

WebUI.delay(2)

WebUI.setText(findTestObject('08-Teams/General Text Area'), 'Hi, This is a sample post for everleagues automation')

WebUI.delay(2)

WebUI.click(findTestObject('08-Teams/mat-icon_send(GeneralPost)'))

WebUI.delay(2)

CustomKeywords.'uploadpackage.Upload.uploadFile'(findTestObject('08-Teams/mat-icon_attach_file'), 'C:\\Users\\me\\Documents\\Everleagues Sample Text.txt')

WebUI.delay(3)

WebUI.click(findTestObject('08-Teams/mat-icon_send(GeneralPost)'))

WebUI.delay(3)

WebUI.closeBrowser()

