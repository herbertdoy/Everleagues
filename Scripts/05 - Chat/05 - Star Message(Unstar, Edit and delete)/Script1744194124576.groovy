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

WebUI.mouseOver(findTestObject('05-Chat/Star a messsage/div_StarMessage'))

WebUI.click(findTestObject('05-Chat/Star a messsage/button_expand_lessStarChat'))

WebUI.click(findTestObject('05-Chat/Star a messsage/button_Star message'))

WebUI.delay(GlobalVariable.delay_1s)

WebUI.verifyElementVisible(findTestObject('05-Chat/snackbar/starredMessage'))

//WebUI.verifyElementVisible(findTestObject('05-Chat/Star a messsage/snack-bar-container_Message starredOK'))
WebUI.verifyElementVisible(findTestObject('05-Chat/Star a messsage/mat-icon_star_rate'))

WebUI.delay(GlobalVariable.delay_2s)

WebUI.click(findTestObject('05-Chat/Star a messsage/button_EllipsesSide'))

WebUI.click(findTestObject('05-Chat/Star a messsage/button_Starred Messages'))

WebUI.verifyElementVisible(findTestObject('05-Chat/Star a messsage/mat-toolbar_Starred Messages'))

WebUI.delay(GlobalVariable.delay_2s)

WebUI.click(findTestObject('05-Chat/Star a messsage/div_LeftSideStarredMessage'))

WebUI.delay(GlobalVariable.delay_2s)

WebUI.verifyElementVisible(findTestObject('05-Chat/Star a messsage/div_higlightStarred'))

WebUI.delay(GlobalVariable.delay_2s)

WebUI.mouseOver(findTestObject('05-Chat/Star a messsage/div_higlightStarred'))

WebUI.delay(GlobalVariable.delay_2s)

WebUI.click(findTestObject('05-Chat/Star a messsage/btn_expandLess2'))

WebUI.click(findTestObject('05-Chat/Edit chat/button_Edit'))

WebUI.delay(GlobalVariable.delay_2s)

WebUI.setText(findTestObject('05-Chat/Edit chat/textarea_editChatfield'), EditMessage)

WebUI.delay(GlobalVariable.delay_2s)

WebUI.click(findTestObject('05-Chat/Edit chat/button_OK'))

WebUI.verifyElementVisible(findTestObject('05-Chat/Star a messsage/div_StarredEdit'))

WebUI.delay(GlobalVariable.delay_2s)

WebUI.click(findTestObject('05-Chat/Star a messsage/button_backleftarrow'))

WebUI.delay(GlobalVariable.delay_2s)

WebUI.mouseOver(findTestObject('05-Chat/Star a messsage/div_higlightStarred'))

WebUI.delay(GlobalVariable.delay_2s)

WebUI.click(findTestObject('05-Chat/Star a messsage/btn_expandless4'))

WebUI.click(findTestObject('05-Chat/Star a messsage/button_Unstar message'))

WebUI.delay(GlobalVariable.delay_1s)

WebUI.verifyElementVisible(findTestObject('05-Chat/snackbar/unstarred_Message'))

WebUI.delay(GlobalVariable.delay_2s)

WebUI.mouseOver(findTestObject('05-Chat/Star a messsage/div_higlightStarred'))

WebUI.delay(GlobalVariable.delay_2s)

WebUI.click(findTestObject('05-Chat/Star a messsage/btn_expandless4'))

WebUI.click(findTestObject('05-Chat/Star a messsage/button_Star message'))

WebUI.delay(GlobalVariable.delay_2s)

WebUI.mouseOver(findTestObject('05-Chat/Star a messsage/div_higlightStarred'))

WebUI.delay(GlobalVariable.delay_2s)

WebUI.click(findTestObject('05-Chat/Star a messsage/btn_expandless4'))

WebUI.click(findTestObject('05-Chat/Star a messsage/btn_deleteStarredMessage'))

WebUI.delay(GlobalVariable.delay_2s)

WebUI.click(findTestObject('05-Chat/Star a messsage/btn_delete'))

WebUI.delay(GlobalVariable.delay_1s)

WebUI.verifyElementVisible(findTestObject('05-Chat/snackbar/deleteMessage'))

WebUI.delay(GlobalVariable.delay_1s)

WebUI.verifyElementVisible(findTestObject('05-Chat/Delete a message/div_deletedDisplayMessage'))

//WebUI.verifyElementVisible(findTestObject('05-Chat/Star a messsage/snack-bar-container_Message unstarredOK'))
WebUI.delay(GlobalVariable.delay_3s)

