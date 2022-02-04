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

WebUI.navigateToUrl('https://www.amazon.ca/ap/signin?openid.pape.max_auth_age=0&openid.return_to=https%3A%2F%2Fwww.amazon.ca%2Fref%3Dnav_signin&openid.identity=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.assoc_handle=caflex&openid.mode=checkid_setup&openid.claimed_id=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.ns=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0&')

WebUI.verifyElementPresent(findTestObject('Busqueda/Page_Amazon Sign In/input_Email or mobile phone number_email'), 0)

WebUI.setText(findTestObject('Object Repository/Busqueda/Page_Amazon Sign In/input_Email or mobile phone number_email'), 
    'nayeliangelicamartinezmoreta@gmail.com')

WebUI.verifyElementClickable(findTestObject('Busqueda/Page_Amazon Sign In/input_Enter your e-mail address or mobile p_b31b06'))

WebUI.click(findTestObject('Object Repository/Busqueda/Page_Amazon Sign In/input_Enter your e-mail address or mobile p_b31b06'))

WebUI.verifyElementPresent(findTestObject('Busqueda/Page_Amazon Sign In/input_Forgot Password_password'), 0)

WebUI.setEncryptedText(findTestObject('Object Repository/Busqueda/Page_Amazon Sign In/input_Forgot Password_password'), 
    'd6govjA23wZtxZngzvncjw==')

WebUI.verifyElementClickable(findTestObject('Busqueda/Page_Amazon Sign In/input_Enter your password_signInSubmit'))

WebUI.click(findTestObject('Object Repository/Busqueda/Page_Amazon Sign In/input_Enter your password_signInSubmit'))

for (int i = 1; i <= findTestData('Data Files/DataBusqueda').rowNumbers; i++) {
    WebUI.verifyElementVisible(findTestObject('Object Repository/SpyBusqueda/Page_/input_All_field-keywords'))

    WebUI.click(findTestObject('Object Repository/Busqueda/Page_/div_All              Select the department _2e573d'))

    WebUI.setText(findTestObject('Object Repository/SpyBusqueda/Page_/input_All_field-keywords'), findTestData('Data Files/DataBusqueda').getValue(
            1, i))

    WebUI.verifyElementClickable(findTestObject('Object Repository/SpyBusqueda/Page_/input_All_nav-search-submit-button'))

    WebUI.click(findTestObject('Object Repository/SpyBusqueda/Page_/input_All_nav-search-submit-button'))

    WebUI.delay(2)
	
	WebUI.refresh()
}

WebUI.callTestCase(findTestCase('Ejercicio2/TestCaseBusqueda/Logout'), [:], FailureHandling.STOP_ON_FAILURE)

