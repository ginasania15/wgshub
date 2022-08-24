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

WebUI.navigateToUrl('http://new2-wgshub.stagingapps.net/')

WebUI.click(findTestObject('Object Repository/Page_WGSHub  Digital Venture Builder Indonesia/a_Register'))

WebUI.setText(findTestObject('Object Repository/Page_Customer Register - WGSHub/input_First Name_registername'), 'Gina')

WebUI.setText(findTestObject('Object Repository/Page_Customer Register - WGSHub/input_Last Name_registerlastname'), 'Sania')

WebUI.setText(findTestObject('Object Repository/Page_Customer Register - WGSHub/input_Email_registeremail'), 'ginasania15@gmail.com')

WebUI.setEncryptedText(findTestObject('Object Repository/Page_Customer Register - WGSHub/input_Password_registerpassword'), 
    '3Z9vEXbPUsBByTjfTNd5SQ==')

WebUI.setEncryptedText(findTestObject('Object Repository/Page_Customer Register - WGSHub/input_Confirm Password_registerconfirm_password'), 
    '3Z9vEXbPUsBByTjfTNd5SQ==')

WebUI.setText(findTestObject('Object Repository/Page_Customer Register - WGSHub/input_Company Name_registercompany'), 'PT. Testing')

WebUI.setText(findTestObject('Object Repository/Page_Customer Register - WGSHub/input_Company Address_registeraddress'), 
    'Bandung')

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Customer Register - WGSHub/select_United States (1)United Kingdom (44)_f700f6'), 
    'ID', true)

WebUI.setText(findTestObject('Object Repository/Page_Customer Register - WGSHub/input_Phone Number_registerphone'), '89612103675')

WebUI.setText(findTestObject('Object Repository/Page_Customer Register - WGSHub/input_City_registercity'), 'Bandung')

WebUI.click(findTestObject('Object Repository/Page_Customer Register - WGSHub/div_id(katalon-rec_elementInfoDiv) (1)'))

WebUI.click(findTestObject('Object Repository/Page_Customer Register - WGSHub/input_Service Agreement_commit'))

WebUI.closeBrowser()

