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

WebUI.delay(3)

WebUI.click(findTestObject('11-Settings/Team Setup/mat-icon_add(AddTeam)'))

WebUI.verifyElementVisible(findTestObject('11-Settings/Team Setup/AddTeamDialogBox'))

WebUI.delay(2)

WebUI.setText(findTestObject('11-Settings/Team Setup/input_Settings_teamName(AddTeam)'), 'Team Everleagues')

WebUI.click(findTestObject('11-Settings/Team Setup/button_Create(Team)'))

WebUI.delay(3)

WebUI.click(findTestObject('08-Teams/div_Teams'))

WebUI.delay(2)

WebUI.verifyElementVisible(findTestObject('11-Settings/Team Setup/div_TETeam Everleagues'))

WebUI.click(findTestObject('11-Settings/Team Setup/div_Team Setup'))

