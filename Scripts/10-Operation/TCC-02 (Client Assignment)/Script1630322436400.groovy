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

WebUI.click(findTestObject('10-Operation/div_Client Assignment'))

WebUI.verifyElementVisible(findTestObject('10-Operation/Client Assignment Objects/div_createOrganization Unit'))

WebUI.verifyElementVisible(findTestObject('10-Operation/Client Assignment Objects/EmployeesBox'))

WebUI.verifyElementVisible(findTestObject('10-Operation/Client Assignment Objects/AssignedClientsBox'))

WebUI.verifyElementVisible(findTestObject('10-Operation/Client Assignment Objects/ClientsBox'))

WebUI.verifyElementVisible(findTestObject('10-Operation/Client Assignment Objects/span_arrow_back Assign'))

WebUI.verifyElementVisible(findTestObject('10-Operation/Client Assignment Objects/span_Unassign arrow_forward'))

