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

WebUI.delay(GlobalVariable.delay_3seconds)

WebUI.mouseOver(findTestObject('09-Settings/Organization unit/div_GG TESTER'))

WebUI.delay(GlobalVariable.delay_3seconds)

//WebUI.waitForElementClickable(findTestObject('09-Settings/Organization unit/div_GG TESTER'), 0)
WebUI.click(findTestObject('09-Settings/Organization unit/div_GG TESTER'))

WebUI.delay(GlobalVariable.delay_3seconds)

//WebUI.waitForElementVisible(findTestObject('09-Settings/Users/Active User/button_ellipses'), 0)
//WebUI.waitForElementClickable(findTestObject('09-Settings/Users/Active User/button_ellipses'), 0)
WebUI.click(findTestObject('09-Settings/Users/Active User/button_ellipses'))

WebUI.delay(GlobalVariable.delay_3seconds)

WebUI.click(findTestObject('09-Settings/Organization unit/button_Delete Organization Unit'))

WebUI.verifyElementVisible(findTestObject('09-Settings/Organization unit/mat-dialog-container_Delete Organization Unit modal'), 
    FailureHandling.STOP_ON_FAILURE)

WebUI.verifyElementVisible(findTestObject('09-Settings/Organization unit/h4_Delete Organization Unit'), FailureHandling.STOP_ON_FAILURE)

WebUI.verifyElementVisible(findTestObject('09-Settings/Organization unit/span_Warning All resources associated with this root organization will be permanently deleted'), 
    FailureHandling.STOP_ON_FAILURE)

WebUI.delay(GlobalVariable.delay_1second)

WebUI.click(findTestObject('09-Settings/Users/Active User/button_Cancel_restore'), FailureHandling.STOP_ON_FAILURE)

WebUI.delay(GlobalVariable.delay_2seconds)

WebUI.mouseOver(findTestObject('09-Settings/Organization unit/div_GG TESTER'))

WebUI.click(findTestObject('09-Settings/Users/Active User/button_ellipses'))

WebUI.delay(GlobalVariable.delay_2seconds)

WebUI.click(findTestObject('09-Settings/Organization unit/button_Delete Organization Unit'))

//WebUI.click(findTestObject('09-Settings/Organization unit/button_Delete Organization Unit'))
//
//WebUI.verifyElementVisible(findTestObject('09-Settings/Organization unit/mat-dialog-container_Delete Organization Unit modal'), 
//    FailureHandling.STOP_ON_FAILURE)
//
//WebUI.verifyElementVisible(findTestObject('09-Settings/Organization unit/h4_Delete Organization Unit'), FailureHandling.STOP_ON_FAILURE)
//
//WebUI.verifyElementVisible(findTestObject('09-Settings/Organization unit/span_Warning All resources associated with this root organization will be permanently deleted'), 
//    FailureHandling.STOP_ON_FAILURE)
WebUI.delay(GlobalVariable.delay_3seconds)

WebUI.click(findTestObject('09-Settings/Users/Active User/button_Delete'))

WebUI.verifyElementVisible(findTestObject('09-Settings/Organization unit/snack-bar-container_Successfully deleted organization unitOK'), 
    FailureHandling.STOP_ON_FAILURE)

WebUI.delay(GlobalVariable.delay_3seconds)

WebUI.closeBrowser()

