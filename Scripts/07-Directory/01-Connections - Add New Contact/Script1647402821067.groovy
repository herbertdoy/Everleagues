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

WebUI.openBrowser('')

WebUI.navigateToUrl('https://lab.everleagues.com/')

WebUI.maximizeWindow()

WebUI.setText(findTestObject('02-Side Icons(Organization)/Add Contact/Email Field'), 'testuser02@mailinator.com')

WebUI.setEncryptedText(findTestObject('02-Side Icons(Organization)/Add Contact/Password Field'), '8yFRyszE6U6jvsCn51OQbg==')

WebUI.click(findTestObject('02-Side Icons(Organization)/Add Contact/button_Sign in'))

WebUI.delay(3)

WebUI.click(findTestObject('06-Teams/For 2FA/button_Confirm_2FA'))

WebUI.executeJavaScript('window.open();', [])

currentWindow = WebUI.getWindowIndex()

WebUI.delay(3)

WebUI.switchToWindowIndex(currentWindow + 1)

WebUI.navigateToUrl('https://www.mailinator.com/')

WebUI.delay(3)

WebUI.setText(findTestObject('00-Signup and Activation/zMailinator/input_LOGIN_search'), 'testuser02@mailinator.com')

WebUI.click(findTestObject('00-Signup and Activation/zMailinator/gobutton'), FailureHandling.STOP_ON_FAILURE)

WebUI.delay(3)

WebUI.click(findTestObject('00-Signup and Activation/zMailinator/Email - everleagues'))

WebUI.delay(3)

String code = WebUI.getText(findTestObject('Object Repository/06-Teams/For 2FA/2FA code'))

WebUI.delay(3)

WebUI.closeWindowTitle('Mailinator')

WebUI.delay(3)

WebUI.switchToWindowIndex(0)

WebUI.delay(3)

WebUI.setText(findTestObject('Object Repository/06-Teams/For 2FA/input_Enter verification code_code'), code)

WebUI.delay(3)

WebUI.click(findTestObject('06-Teams/For 2FA/button_Verify_2FA'))

WebUI.delay(5)

WebUI.click(findTestObject('03-Header Menu/Hamburger Button/div_Directory'))

WebUI.delay(3)

WebUI.verifyElementVisible(findTestObject('07-Directory/Connections/div_Connections'))

WebUI.verifyElementVisible(findTestObject('07-Directory/Connections/div_Labels'))

WebUI.delay(3)

WebUI.click(findTestObject('07-Directory/Connections/div_Connections'))

WebUI.delay(3)

WebUI.verifyElementVisible(findTestObject('07-Directory/Connections/h4_CONNECTIONS'))

WebUI.verifyElementVisible(findTestObject('07-Directory/Connections/h5_Save your contacts here and throw your business cards away'))

WebUI.verifyElementVisible(findTestObject('07-Directory/Connections/button_search'))

WebUI.verifyElementVisible(findTestObject('07-Directory/Connections/button_add new contact'))

WebUI.verifyElementVisible(findTestObject('07-Directory/Connections/button_Filter'))

WebUI.delay(3)

WebUI.click(findTestObject('07-Directory/Connections/button_add new contact'))

WebUI.delay(3)

WebUI.verifyElementVisible(findTestObject('07-Directory/Connections/Add new contact modal'))

WebUI.delay(3)

WebUI.click(findTestObject('07-Directory/Connections/input_firstName'))

WebUI.click(findTestObject('07-Directory/Connections/input_lastName'))

WebUI.click(findTestObject('07-Directory/Connections/input_Type_email'))

WebUI.delay(3)

WebUI.verifyElementVisible(findTestObject('07-Directory/Connections/div_First Name Field is required'))

WebUI.verifyElementVisible(findTestObject('07-Directory/Connections/div_Last Name Field is required'))

WebUI.delay(3)

WebUI.setText(findTestObject('07-Directory/Connections/input_firstName'), 'GG')

WebUI.setText(findTestObject('07-Directory/Connections/input_lastName'), 'Auto')

WebUI.setText(findTestObject('07-Directory/Connections/input_Type_email'), 'autotester@mailinator.com')

WebUI.click(findTestObject('07-Directory/Connections/input_Type_phone'))

WebUI.click(findTestObject('07-Directory/Connections/button_area code'))

WebUI.delay(3)

WebUI.verifyElementVisible(findTestObject('07-Directory/Connections/area code modal'))

WebUI.click(findTestObject('07-Directory/Connections/button_United States 1'))

WebUI.delay(3)

WebUI.setText(findTestObject('07-Directory/Connections/input_Type_phone'), '2345678901')

WebUI.delay(3)

WebUI.click(findTestObject('07-Directory/Connections/button_add_address'))

WebUI.click(findTestObject('07-Directory/Connections/button_add_address'))

WebUI.verifyElementVisible(findTestObject('07-Directory/Connections/Edit address modal'))

WebUI.delay(3)

WebUI.click(findTestObject('07-Directory/Connections/input_Edit Address_street1'))

WebUI.click(findTestObject('07-Directory/Connections/input_Street 1_street2'))

WebUI.click(findTestObject('07-Directory/Connections/input_Street 2_postcode'))

WebUI.click(findTestObject('07-Directory/Connections/input_Zip  Postal Code_city'))

WebUI.click(findTestObject('07-Directory/Connections/input_City_state'))

WebUI.click(findTestObject('07-Directory/Connections/input_State_country'))

WebUI.click(findTestObject('07-Directory/Connections/input_Country_addressLabel'))

WebUI.delay(3)

WebUI.verifyElementVisible(findTestObject('07-Directory/Connections/span_Work'))

WebUI.verifyElementVisible(findTestObject('07-Directory/Connections/span_Personal'))

WebUI.verifyElementVisible(findTestObject('07-Directory/Connections/span_Other'))

WebUI.delay(3)

WebUI.click(findTestObject('07-Directory/Connections/h4_Edit Address'))

WebUI.delay(3)

WebUI.verifyElementVisible(findTestObject('07-Directory/Connections/street 1 error'))

WebUI.verifyElementVisible(findTestObject('07-Directory/Connections/post code error'))

WebUI.verifyElementVisible(findTestObject('07-Directory/Connections/city error'))

WebUI.verifyElementVisible(findTestObject('07-Directory/Connections/state error'))

WebUI.verifyElementVisible(findTestObject('07-Directory/Connections/country error'))

WebUI.delay(3)

WebUI.setText(findTestObject('07-Directory/Connections/input_Edit Address_street1'), 'Auto street 1')

WebUI.setText(findTestObject('07-Directory/Connections/input_Street 1_street2'), 'Auto street 2')

WebUI.setText(findTestObject('07-Directory/Connections/input_Street 2_postcode'), '54321')

WebUI.setText(findTestObject('07-Directory/Connections/input_Zip  Postal Code_city'), 'Auto city')

WebUI.setText(findTestObject('07-Directory/Connections/input_City_state'), 'Auto state')

WebUI.setText(findTestObject('07-Directory/Connections/input_State_country'), 'Auto country')

WebUI.click(findTestObject('07-Directory/Connections/input_Country_addressLabel'), FailureHandling.STOP_ON_FAILURE)

WebUI.delay(3)

WebUI.click(findTestObject('07-Directory/Connections/span_Work'))

WebUI.click(findTestObject('07-Directory/Connections/address_Save'))

WebUI.delay(3)

WebUI.verifyElementVisible(findTestObject('07-Directory/Connections/added address'))

