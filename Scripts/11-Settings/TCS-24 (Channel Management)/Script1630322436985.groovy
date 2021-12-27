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

WebUI.click(findTestObject('11-Settings/Organization/div_Settings'))

WebUI.delay(2)

WebUI.click(findTestObject('11-Settings/Organization/div_Organization'))

WebUI.delay(3)

WebUI.verifyElementVisible(findTestObject('11-Settings/Organization/div_Profile(1)'))

WebUI.verifyElementVisible(findTestObject('11-Settings/Organization/div_Payment(2)'))

WebUI.verifyElementVisible(findTestObject('11-Settings/Organization/div_Membership(3)'))

WebUI.verifyElementVisible(findTestObject('11-Settings/Organization/mat-card_Profile(4)'))

WebUI.verifyElementVisible(findTestObject('11-Settings/Organization/mat-card_Address(5)'))

WebUI.verifyElementVisible(findTestObject('11-Settings/Organization/mat-card_Contact(6)'))

WebUI.verifyElementVisible(findTestObject('11-Settings/Organization/button_Save(7)'))

WebUI.verifyElementVisible(findTestObject('11-Settings/Organization/button_Delete Organization(8)'))

WebUI.delay(3)

WebUI.click(findTestObject('11-Settings/Organization/mat-icon_EditImage'))

WebUI.delay(2)

WebUI.verifyElementVisible(findTestObject('11-Settings/Organization/UploadModal'))

CustomKeywords.'uploadpackage.Upload.uploadFile'(findTestObject('11-Settings/Organization/Upload_SelectFile'), 'C:\\Users\\me\\Documents\\everleaguesSample.jpg')

WebUI.delay(5)

WebUI.click(findTestObject('11-Settings/Organization/button_Upload Image'))

WebUI.verifyElementVisible(findTestObject('11-Settings/Organization/img_Profile_large-img'))

WebUI.delay(5)

WebUI.clearText(findTestObject('11-Settings/Organization/Address/Address_Street'))

WebUI.setText(findTestObject('11-Settings/Organization/Address/Address_Street'), 'Fondren Rd')

WebUI.clearText(findTestObject('11-Settings/Organization/Address/Address_City'))

WebUI.setText(findTestObject('11-Settings/Organization/Address/Address_City'), 'Houston')

WebUI.clearText(findTestObject('11-Settings/Organization/Address/Address_Postal'))

WebUI.setText(findTestObject('11-Settings/Organization/Address/Address_Postal'), '11281')

WebUI.clearText(findTestObject('11-Settings/Organization/Address/Address_State'))

WebUI.setText(findTestObject('11-Settings/Organization/Address/Address_State'), 'TX')

WebUI.clearText(findTestObject('11-Settings/Organization/Address/Address_Country'))

WebUI.setText(findTestObject('11-Settings/Organization/Address/Address_Country'), 'United States')

WebUI.delay(3)

WebUI.clearText(findTestObject('11-Settings/Organization/Contact/Contact_Email'))

WebUI.setText(findTestObject('11-Settings/Organization/Contact/Contact_Email'), 'valjesergomez@gmail.com')

WebUI.clearText(findTestObject('11-Settings/Organization/Contact/Contact_Web'))

WebUI.setText(findTestObject('11-Settings/Organization/Contact/Contact_Web'), 'lab.everleagues.com')

WebUI.clearText(findTestObject('11-Settings/Organization/Contact/Contact_Phone'))

WebUI.setText(findTestObject('11-Settings/Organization/Contact/Contact_Phone'), '639385172561')

WebUI.clearText(findTestObject('11-Settings/Organization/Contact/Contact_Fax'))

WebUI.setText(findTestObject('11-Settings/Organization/Contact/Contact_Fax'), '33445566')

WebUI.delay(3)

WebUI.click(findTestObject('11-Settings/Organization/button_Save(7)'))

WebUI.verifyElementVisible(findTestObject('11-Settings/Organization/snack-bar-container_Settings savedOK'))

WebUI.delay(3)

WebUI.click(findTestObject('11-Settings/Organization/Payment/div_Payment'))

WebUI.verifyElementVisible(findTestObject('11-Settings/Organization/Payment/button_add'))

WebUI.click(findTestObject('11-Settings/Organization/Payment/button_add'))

WebUI.verifyElementVisible(findTestObject('11-Settings/Organization/Payment/Name_on_Card(1)'))

WebUI.verifyElementVisible(findTestObject('11-Settings/Organization/Payment/label_Card number(2)'))

WebUI.verifyElementVisible(findTestObject('11-Settings/Organization/Payment/label_Expiration(3)'))

WebUI.verifyElementVisible(findTestObject('11-Settings/Organization/Payment/label_CVC(4)'))

WebUI.verifyElementVisible(findTestObject('11-Settings/Organization/Payment/Address(5)'))

WebUI.verifyElementVisible(findTestObject('11-Settings/Organization/Payment/City(6)'))

WebUI.verifyElementVisible(findTestObject('11-Settings/Organization/Payment/State(7)'))

WebUI.verifyElementVisible(findTestObject('11-Settings/Organization/Payment/Zip(8)'))

WebUI.delay(3)

WebUI.click(findTestObject('11-Settings/Organization/Payment/button_Cancel'))

WebUI.delay(3)

WebUI.click(findTestObject('11-Settings/Organization/Membership/div_Membership'))

WebUI.delay(2)

WebUI.verifyElementVisible(findTestObject('11-Settings/Organization/Membership/div_Toggle'))

WebUI.delay(2)

WebUI.click(findTestObject('11-Settings/Organization/Membership/div_Toggle'))

WebUI.verifyElementVisible(findTestObject('11-Settings/Organization/Membership/snack_bar (membership)'))

WebUI.delay(3)

WebUI.click(findTestObject('11-Settings/Organization/Membership/div_Toggle'))

WebUI.verifyElementVisible(findTestObject('11-Settings/Organization/Membership/snack_bar (membership)'))

WebUI.delay(3)

WebUI.click(findTestObject('11-Settings/Organization Units/div_Organization Units'))

WebUI.delay(3)

WebUI.verifyElementVisible(findTestObject('11-Settings/Organization Units/th_Name'))

WebUI.verifyElementVisible(findTestObject('11-Settings/Organization Units/th_Owner'))

WebUI.verifyElementVisible(findTestObject('11-Settings/Organization Units/th_Members'))

WebUI.delay(3)

WebUI.click(findTestObject('11-Settings/Organization Units/button_add(Add Organization Unit)'))

WebUI.verifyElementVisible(findTestObject('11-Settings/Organization Units/Add Organization Unit Modal'))

WebUI.verifyElementVisible(findTestObject('11-Settings/Organization Units/Organization Unit Name'))

WebUI.delay(3)

WebUI.setText(findTestObject('11-Settings/Organization Units/Organization Unit Name'), 'Test Unit')

WebUI.click(findTestObject('11-Settings/Organization Units/button_Save'))

WebUI.delay(3)

WebUI.mouseOver(findTestObject('11-Settings/Organization Units/Members Test Unit'))

WebUI.click(findTestObject('11-Settings/Organization Units/Joint Link'))

WebUI.delay(3)

WebUI.verifyElementVisible(findTestObject('11-Settings/Organization Units/Joint Link Modal'))

WebUI.click(findTestObject('11-Settings/Organization Units/button_Ok(Join Request)'))

WebUI.delay(3)

WebUI.mouseOver(findTestObject('11-Settings/Organization Units/Members Test Unit'))

WebUI.click(findTestObject('11-Settings/Organization Units/Elipses'))

WebUI.verifyElementVisible(findTestObject('11-Settings/Organization Units/button_Delete Organization Unit'))

WebUI.verifyElementVisible(findTestObject('11-Settings/Organization Units/button_Edit Organization Unit'))

WebUI.click(findTestObject('11-Settings/Organization Units/Overlay'))

WebUI.delay(3)

WebUI.click(findTestObject('11-Settings/Subscriptions/div_Subscriptions'))

WebUI.delay(3)

WebUI.verifyElementVisible(findTestObject('11-Settings/Subscriptions/div_Subscription'))

WebUI.verifyElementVisible(findTestObject('11-Settings/Subscriptions/div_Add-Ons'))

WebUI.verifyElementVisible(findTestObject('11-Settings/Subscriptions/SubscriptionsTable'))

WebUI.delay(2)

WebUI.click(findTestObject('11-Settings/Subscriptions/mat-icon_ChangePlan'))

WebUI.verifyElementVisible(findTestObject('11-Settings/Subscriptions/ChangePlan_Modal'))

WebUI.click(findTestObject('11-Settings/Subscriptions/button_Cancel(ChangePlan)'))

WebUI.delay(3)

WebUI.click(findTestObject('11-Settings/Subscriptions/div_Add-Ons'))

WebUI.click(findTestObject('11-Settings/Subscriptions/button_shopping_cart Buy'))

WebUI.verifyElementVisible(findTestObject('11-Settings/Subscriptions/Add-Ons-Modal'))

WebUI.scrollToElement(findTestObject('11-Settings/Subscriptions/button_Cancel(Add-Ons)'), 1)

WebUI.click(findTestObject('11-Settings/Subscriptions/button_Cancel(Add-Ons)'))

WebUI.delay(3)

WebUI.click(findTestObject('11-Settings/Team Setup/div_Team Setup'))

WebUI.verifyElementVisible(findTestObject('11-Settings/Team Setup/TeamTable'))

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

WebUI.delay(2)

WebUI.click(findTestObject('11-Settings/Team Setup/mat-icon_search(TeamSetup)'), FailureHandling.STOP_ON_FAILURE)

WebUI.setText(findTestObject('11-Settings/Team Setup/input_SearchField(TeamSetup)'), 'Team Everleagues')

WebUI.verifyElementVisible(findTestObject('11-Settings/Team Setup/td_Team Everleagues'))

WebUI.delay(2)

WebUI.click(findTestObject('11-Settings/Team Setup/Edit_Button2(TeamSetup)'))

WebUI.clearText(findTestObject('11-Settings/Team Setup/input_Settings_teamName(TeamSetup3)'))

WebUI.setText(findTestObject('11-Settings/Team Setup/input_Settings_teamName(TeamSetup3)'), 'Test Unit')

WebUI.delay(2)

WebUI.click(findTestObject('11-Settings/Team Setup/button_Save3'))

WebUI.delay(2)

WebUI.click(findTestObject('11-Settings/Team Setup/Add Channel/Channel_Management(TeamSetup)'))

WebUI.verifyElementVisible(findTestObject('11-Settings/Team Setup/Add Channel/Add_Channel'))

WebUI.click(findTestObject('11-Settings/Team Setup/Add Channel/Add_Channel'))

WebUI.setText(findTestObject('11-Settings/Team Setup/Add Channel/Input_ChannelName'), 'Channel 2')

WebUI.click(findTestObject('11-Settings/Team Setup/Add Channel/button_Add(AddChannel)'))

WebUI.delay(2)

WebUI.click(findTestObject('11-Settings/Team Setup/Add Channel/button_Close(AddChannel)'))

