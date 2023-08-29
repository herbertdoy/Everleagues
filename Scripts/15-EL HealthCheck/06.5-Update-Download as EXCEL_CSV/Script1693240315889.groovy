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
import java.io.File

WebUI.click(findTestObject('15-EL HealthCheck/Activated information tracker/UPDATE/Update_Download as button'))

WebUI.click(findTestObject('15-EL HealthCheck/Activated information tracker/UPDATE/Update_DownloadAs_EXCELCSV'))

WebUI.click(findTestObject('15-EL HealthCheck/Activated information tracker/UPDATE/Update_download_button'))


// Assertion Steps to see if the file exists on downloads path
def static boolean verifyFileExists(String filePath) {
	File file = new File(filePath)
	return file.exists() && !file.isDirectory()
}

// Verify if the file exists
def filePath = "C:\\Users\\Personal\\Downloads\\InfoTrackerCSV.csv"
boolean fileExists = verifyFileExists(filePath)

// Perform an assertion based on the result
assert fileExists : "File exists at path: " + filePath

// Specify the path to the downloaded file that you want to delete
// Update this with the actual file path
String filePathToDelete = "C:\\Users\\Personal\\Downloads\\InfoTrackerCSV.csv"


// Create a File object for the downloaded file
File fileToDelete = new File(filePathToDelete)

// Check if the file exists before attempting to delete
if (fileToDelete.exists()) {
	// Attempt to delete the file
	if (fileToDelete.delete()) {
		println("File deleted successfully.")
	} else {
		println("Failed to delete the file.")
	}
} else {
	println("File not found.")
}








