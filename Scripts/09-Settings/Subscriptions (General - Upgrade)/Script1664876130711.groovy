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

WebUI.delay(2)

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

WebUI.click(findTestObject('06-Teams/button_doublearrow'))

WebUI.click(findTestObject('06-Teams/button_My Organizations'))

WebUI.click(findTestObject('06-Teams/button_GG Automation'))

WebUI.delay(4)

WebUI.verifyElementVisible(findTestObject('06-Teams/span_GG Automation'))

WebUI.delay(10)

WebUI.click(findTestObject('03-Header Menu/Hamburger Button/div_Settings'))

WebUI.verifyElementVisible(findTestObject('09-Settings/Users/div_Organization'))

WebUI.verifyElementVisible(findTestObject('09-Settings/Users/div_Organization Units'))

WebUI.verifyElementVisible(findTestObject('09-Settings/Users/div_Subscriptions'))

WebUI.verifyElementVisible(findTestObject('09-Settings/Users/div_Users'))

WebUI.delay(3)

WebUI.click(findTestObject('09-Settings/Users/div_Subscriptions'))

WebUI.verifyElementVisible(findTestObject('09-Settings/Subscription/h4_SUBSCRIPTIONS'))

WebUI.verifyElementVisible(findTestObject('09-Settings/Subscription/div_General'))

WebUI.click(findTestObject('09-Settings/Subscription/div_General'))

WebUI.verifyElementVisible(findTestObject('09-Settings/Subscription/General/h6_Plan Free Limited'))

WebUI.verifyElementVisible(findTestObject('09-Settings/Subscription/General/div_Current Usage-progress-bar-element'))

WebUI.verifyElementVisible(findTestObject('09-Settings/Subscription/General/mat-card_Internal License UsageConsumed 0.00 day pass'))

WebUI.verifyElementVisible(findTestObject('09-Settings/Subscription/General/mat-card_External License UsageConsumed 0.00 day pass290'))

WebUI.verifyElementVisible(findTestObject('09-Settings/Subscription/General/mat-card_Cloud Storage Download TrafficConsumed 0.00 mb'))

WebUI.verifyElementVisible(findTestObject('09-Settings/Subscription/General/mat-card_Cloud Storage Upload TrafficConsumed 0.00 mb270'))

WebUI.delay(3)

//WebUI.click(findTestObject('09-Settings/Subscription/General/button_Upgrade'))
//WebUI.verifyElementVisible(findTestObject('09-Settings/Subscription/General/mat-dialog_Add Payment Information Modal'))
//WebUI.verifyElementVisible(findTestObject('09-Settings/Subscription/General/h4_Add Payment Information'))
//WebUI.click(findTestObject('09-Settings/Subscription/General/div_Select Card dropdown'))
//WebUI.click(findTestObject('09-Settings/Subscription/General/span_New Card-option'))
//WebUI.click(findTestObject('09-Settings/Subscription/General/input_Name on Card field'), FailureHandling.STOP_ON_FAILURE)
//WebUI.click(findTestObject('09-Settings/Subscription/General/input_cardnumber'), FailureHandling.STOP_ON_FAILURE)
//WebUI.click(findTestObject('09-Settings/Subscription/General/input_exp-date'), FailureHandling.STOP_ON_FAILURE)
//WebUI.click(findTestObject('09-Settings/Subscription/General/input_cvc'), FailureHandling.STOP_ON_FAILURE)
//WebUI.click(findTestObject('09-Settings/Subscription/General/input_Zip-Postal Code field'), FailureHandling.STOP_ON_FAILURE)
//WebUI.verifyElementVisible(findTestObject('09-Settings/Subscription/General/div_Redeem Coupon'))
//WebUI.click(findTestObject('09-Settings/Subscription/General/input_Redeem Coupon_coupon'), FailureHandling.STOP_ON_FAILURE)
//WebUI.verifyElementVisible(findTestObject('09-Settings/Subscription/General/mat-error_Name is required'))
//WebUI.verifyElementVisible(findTestObject('09-Settings/Subscription/General/mat-error_Zip  Postal Code is required'))
//WebUI.delay(3)
//WebUI.click(findTestObject('09-Settings/Users/Active User/button_Cancel_restore'), FailureHandling.STOP_ON_FAILURE)
//WebUI.verifyElementVisible(findTestObject('09-Settings/Users/User Page'))
//WebUI.delay(3)
WebUI.click(findTestObject('09-Settings/Subscription/General/button_Upgrade'))

WebUI.verifyElementVisible(findTestObject('09-Settings/Subscription/General/mat-dialog_Add Payment Information Modal'))

WebUI.verifyElementVisible(findTestObject('09-Settings/Subscription/General/h4_Add Payment Information'))

WebUI.click(findTestObject('09-Settings/Subscription/General/div_Select Card dropdown'))

WebUI.click(findTestObject('09-Settings/Subscription/General/span_New Card-option'))

'change everytime when you upgrade'
WebUI.setText(findTestObject('09-Settings/Subscription/General/input_Name on Card field'), 'GG Card3')

WebUI.switchToFrame(findTestObject('09-Settings/Subscription/General/iframe_Card number___privateStripeFrame35554'), 5)

WebUI.setText(findTestObject('09-Settings/Subscription/General/input_cardnumber'), '4242424242424242')

WebUI.switchToFrame(findTestObject('09-Settings/Subscription/General/iframe_Expiration___privateStripeFrame35555'), 5)

WebUI.setText(findTestObject('09-Settings/Subscription/General/input_exp-date'), '1223')

WebUI.switchToFrame(findTestObject('09-Settings/Subscription/General/iframe_CVC___privateStripeFrame35556'), 5)

WebUI.setText(findTestObject('09-Settings/Subscription/General/input_cvc'), '123')

'change everytime when you upgrade'
WebUI.setText(findTestObject('09-Settings/Subscription/General/input_Zip-Postal Code field'), '60489')

WebUI.verifyElementVisible(findTestObject('09-Settings/Subscription/General/div_Redeem Coupon'))

WebUI.click(findTestObject('09-Settings/Subscription/General/input_Redeem Coupon_coupon'), FailureHandling.STOP_ON_FAILURE)

WebUI.delay(3)

WebUI.click(findTestObject('09-Settings/Subscription/General/button_Upgrade Subscription'), FailureHandling.STOP_ON_FAILURE)

WebUI.delay(4)

WebUI.closeBrowser()

