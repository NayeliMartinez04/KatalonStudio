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

WebUI.navigateToUrl('https://www.amazon.com/ap/signin?_encoding=UTF8&language=es&openid.assoc_handle=usflex&openid.claimed_id=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.identity=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.mode=checkid_setup&openid.ns=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0&openid.ns.pape=http%3A%2F%2Fspecs.openid.net%2Fextensions%2Fpape%2F1.0&openid.pape.max_auth_age=0&openid.return_to=https%3A%2F%2Fwww.amazon.com%2Fgp%2Fyourstore%2Fhome%3Fie%3DUTF8%26action%3Dsign-out%26language%3Des%26path%3D%252Fgp%252Fyourstore%252Fhome%26ref_%3Dnav_AccountFlyout_signout%26signIn%3D1%26useRedirectOnSuccess%3D1')

WebUI.maximizeWindow()

WebUI.verifyElementPresent(findTestObject('CompraAmazon/Page_Amazon Iniciar sesin/input_Direccin de correo electrnico o nmero_cfb2c0'), 
    0)

WebUI.setText(findTestObject('Object Repository/CompraAmazon/Page_Amazon Iniciar sesin/input_Direccin de correo electrnico o nmero_cfb2c0'), 
    GlobalVariable.Username)

WebUI.verifyElementClickable(findTestObject('CompraAmazon/Page_Amazon Iniciar sesin/input_Escriba su correo electrnico o su nme_4466f0'))

WebUI.click(findTestObject('Object Repository/CompraAmazon/Page_Amazon Iniciar sesin/input_Escriba su correo electrnico o su nme_4466f0'))

WebUI.verifyElementPresent(findTestObject('CompraAmazon/Page_Amazon Iniciar sesin/input_Olvidaste tu contrasea_password'), 
    0)

WebUI.setEncryptedText(findTestObject('Object Repository/Compra Amazon/Page_Amazon Iniciar sesin/input_Olvidaste tu contrasea_password'), 
    GlobalVariable.Password)

WebUI.verifyElementClickable(findTestObject('CompraAmazon/Page_Amazon Iniciar sesin/input_Introduce tu contrasea_signInSubmit'))

WebUI.click(findTestObject('Object Repository/CompraAmazon/Page_Amazon Iniciar sesin/input_Introduce tu contrasea_signInSubmit'))

WebUI.verifyElementClickable(findTestObject('CompraAmazon/Page_/div_window.navmet.tmpnew Date()            _9630da'))

WebUI.click(findTestObject('Object Repository/CompraAmazon/Page_/div_window.navmet.tmpnew Date()            _9630da'))

WebUI.verifyElementPresent(findTestObject('CompraAmazon/Page_/input_Todos_field-keywords'), 0)

WebUI.setText(findTestObject('Object Repository/CompraAmazon/Page_/input_Todos_field-keywords'), 'lap')

WebUI.verifyElementClickable(findTestObject('CompraAmazon/Page_/div_laptop en Computadoras'))

WebUI.click(findTestObject('Object Repository/CompraAmazon/Page_/div_laptop en Computadoras'))

WebUI.verifyElementClickable(findTestObject('CompraAmazon/Page_Amazon.com  laptop/img_Juegos_s-image'))

WebUI.click(findTestObject('Object Repository/CompraAmazon/Page_Amazon.com  laptop/img_Juegos_s-image'))

WebUI.verifyElementClickable(findTestObject('CompraAmazon/Page_Amazon.com Samsung Galaxy Book Pro lap_f797b1/input_Cantidad_submit.add-to-cart'))

WebUI.click(findTestObject('Object Repository/CompraAmazon/Page_Amazon.com Samsung Galaxy Book Pro lap_f797b1/input_Cantidad_submit.add-to-cart'))

WebUI.verifyElementClickable(findTestObject('CompraAmazon/Page_Amazon.com Samsung Galaxy Book Pro lap_f797b1/input_US899.99_a-button-input'))

WebUI.click(findTestObject('Object Repository/CompraAmazon/Page_Amazon.com Samsung Galaxy Book Pro lap_f797b1/input_US899.99_a-button-input'))

WebUI.verifyElementClickable(findTestObject('CompraAmazon/Page_Selecciona un mtodo de pago - Compra A_c0f8a6/input_Amazon acepta las principales tarjeta_387d7f'))

WebUI.click(findTestObject('Object Repository/CompraAmazon/Page_Selecciona un mtodo de pago - Compra A_c0f8a6/input_Amazon acepta las principales tarjeta_387d7f'))

WebUI.setText(findTestObject('Object Repository/CompraAmazon/Page_Selecciona un mtodo de pago - Compra A_c0f8a6/input_Nmero de tarjeta_addCreditCardNumber'), 
    GlobalVariable.NumberV)

WebUI.setText(findTestObject('Object Repository/CompraAmazon/Page_Selecciona un mtodo de pago - Compra A_c0f8a6/input_Nombre en la tarjeta_ppw-accountHolderName'), 
    GlobalVariable.NameV)

WebUI.click(findTestObject('Object Repository/CompraAmazon/Page_Selecciona un mtodo de pago - Compra A_c0f8a6/span_01'))

WebUI.click(findTestObject('Object Repository/CompraAmazon/Page_Selecciona un mtodo de pago - Compra A_c0f8a6/a_02'))

WebUI.click(findTestObject('Object Repository/CompraAmazon/Page_Selecciona un mtodo de pago - Compra A_c0f8a6/span_2022'))

WebUI.click(findTestObject('Object Repository/CompraAmazon/Page_Selecciona un mtodo de pago - Compra A_c0f8a6/a_2027'))

WebUI.click(findTestObject('Object Repository/CompraAmazon/Page_Selecciona un mtodo de pago - Compra A_c0f8a6/input_Cancelar_ppw-widgetEventAddCreditCardEvent'))

WebUI.delay(3)

WebUI.closeBrowser()

