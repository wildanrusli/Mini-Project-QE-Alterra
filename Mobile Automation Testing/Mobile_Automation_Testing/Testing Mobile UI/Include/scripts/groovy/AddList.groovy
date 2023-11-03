import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.checkpoint.Checkpoint
import com.kms.katalon.core.checkpoint.CheckpointFactory
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.testcase.TestCase
import com.kms.katalon.core.testcase.TestCaseFactory
import com.kms.katalon.core.testdata.TestData
import com.kms.katalon.core.testdata.TestDataFactory
import com.kms.katalon.core.testobject.ObjectRepository
import com.kms.katalon.core.testobject.TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

import internal.GlobalVariable

import org.openqa.selenium.WebElement
import org.openqa.selenium.WebDriver
import org.openqa.selenium.By

import com.kms.katalon.core.mobile.keyword.internal.MobileDriverFactory
import com.kms.katalon.core.webui.driver.DriverFactory

import com.kms.katalon.core.testobject.RequestObject
import com.kms.katalon.core.testobject.ResponseObject
import com.kms.katalon.core.testobject.ConditionType
import com.kms.katalon.core.testobject.TestObjectProperty

import com.kms.katalon.core.mobile.helper.MobileElementCommonHelper
import com.kms.katalon.core.util.KeywordUtil

import com.kms.katalon.core.webui.exception.WebElementNotFoundException

import cucumber.api.java.en.And
import cucumber.api.java.en.Given
import cucumber.api.java.en.Then
import cucumber.api.java.en.When



class AddList {
	/**
	 * The step definitions below match with Katalon sample Gherkin steps
	 */
	@Given("user on list page")
	def user_on_list_page() {
		Mobile.startApplication('F:\\Mini Project\\Mobile Automation Testing\\Testing Mobile UI\\mobile-app\\app-debug.apk', true)
	}

	@When("I Click Plus button")
	def I_Click_Plus_button() {
		Mobile.tap(findTestObject('Button Plus'), 0)
	}

	@And("I Input Data")
	def I_Input_Data() {
		Mobile.tap(findTestObject('Input add'), 0)
		Mobile.setText(findTestObject('Input add'), 'Test', 0)
	}
	@And("I Input Quantity")
	def I_Input_Quantity() {
		Mobile.tap(findTestObject('Quantity'), 0, FailureHandling.STOP_ON_FAILURE)
		Mobile.setText(findTestObject('Quantity'), '100', 0)
	}
	
	@And("I Get Error Name")
	def i_get_error_name() {
		Mobile.getText(findTestObject('Error Name'), 0, FailureHandling.STOP_ON_FAILURE)
	}
	@And("I Get Error Quantity")
	def i_get_error_quantity() {
		Mobile.getText(findTestObject('Error quantity'), 0, FailureHandling.STOP_ON_FAILURE)
	}

	@Then("I Click Add Button")
	def I_Click__Button() {
		Mobile.tap(findTestObject('Add Button'), 0, FailureHandling.STOP_ON_FAILURE)
	}
}