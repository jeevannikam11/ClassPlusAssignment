package config;

import java.io.File;

/**
 * @author Jeevan.Nikam
 *
 */
public class ObjectRepository {
	
	public static final String testDataFilePath = System.getProperty("user.dir") + File.separator + "src"
			+ File.separator + "main" + File.separator + "java" + File.separator + "com" + File.separator + "jio"
			+ File.separator + "config" + File.separator + "testdata.xlsx";
	
	protected static class LoginScreen {
		/**
		 * Login page item locator
		 */
		public static final String mobileOrEmail_Xpath = "//input[@id='corporate-email']";
		//public static final String agreeCheckBox_Css = "label.custom-control-label";
		public static final String agreeCheckBox_Xpath = "//input[@id='checkbox']";
		public static final String submitButton_Xpath = "//button[@id='sendOTP']";
		
		//xpath=//div[5]/div/label
		
		public static class EnterOTP{			
			public static final String enterOtp_Xpath = "//input[@id='enter-otp']";
			public static final String verifyOtpButton_Xpath = "//button[@id='verifyOTP']";
			public static final String resendOtp_Xpath = "//a[@id='resend']";
		}
		
	}
	
	protected static class LeadCreationScreen {
		/**
		 * LeadCreation page item locator
		 */
		
		public static final String employerDetailsHeader_Xpath = "//h4[@class='color-text-primary']";
		public static final String fullName_Xpath = "//input[@id='name']";
		public static final String orgName_Xpath = "//input[@id='organization']";
		public static final String emailId_Xpath = "//input[@id='email']";
		public static final String address_Xpath = "//input[@id='address']";
		public static final String pin_Xpath = "//input[@id='pinCode']";
		public static final String submitButton_Xpath = "//button[@id='submit']";
		
		public static class ThankYouScreen{			
			public static final String thankYouMessage_Xpath = "//div[@class='add-text success_pop']";
			public static final String closeButton_Xpath = "//div[@class='light-box-closebtn']";
		}

	}
	
	
	protected static class AdminDashboardScreen{
		
		/**
		 * Admin home page page item locator
		 */
		
		public static final String mobileAndCompanyName_Xpath = "//b[string-length(substring-before(., ','))=10 and number(substring-before(., ','))]";
		public static final String adminNameAndCompanyName_Xpath = "//b[string-length(substring-before(., ',')) and string(substring-before(., ','))]";
		public static final String logOutButton_Xpath = "//a[@class='float-right logout']";
		public static final String adminDashboard_Xpath = "//a[@title='Dashboard']";
		public static final String adminEmployeeTab_Xpath = "//a[@title='Employee']";
		public static final String adminWorkLocationTab_Xpath = "//a[@title='Work Location']";
		public static final String adminSupportTab_Xpath = "//a[@title='Support']";
		public static final String mobAndOrgName_CSS = "body:nth-child(2) header:nth-child(1) div.top-section:nth-child(1) > b:nth-child(3)";
		public static final String empPresentToday_Xpath = "//span[@id='total_present']";
		/*public static final String totalEmployeeCount_Xpath = "//div[@id='total_emp_count']";
		public static final String empCheckInCount_Xpath = "//div[@id='total_emp_checkin']";
		public static final String empCheckOutCount_Xpath = "//div[@id='total_emp_checkout']";
		public static final String empNoActivityCount_Xpath = "//div[@id='total_emp_noactivity']";*/
		public static final String totalEmployeeCount_Xpath = "//div[@id='total_emp_count']";
		public static final String empCheckInCount_Xpath = "//div[@id='total_emp_checkin']";
		public static final String empCheckOutCount_Xpath = "//div[@id='total_emp_checkout']";
		public static final String empOnlyCheckOutCount_Xpath = "//div[@class='col-md-12 col-xl-9']//li[4]//div[1]//div[2]//div[2]";
		public static final String empNoActivityCount_Xpath = "//div[@id='total_emp_noactivity']";
		public static final String attendanceDetailsButton_Xpath = "//a[@class='btn jio-btn jio-btn-primary float-right']";
	}
	
	protected static class AdminEmployeeHomePageScreen{
		
		//Employee table
		
		public static final String employeeTable_Xpath = "//a[@title='Employee']";
		public static final String employeeTableNextButton_Xpath = "//a[@id='empdatatable_next']";
		public static final String employeeTableRow_Xpath = "//table[@id='empdatatable']/tbody/tr";
		public static final String employeeTablePageNumberButton_Xpath = "//*[contains(@class, 'paginate_button')]";
		public static final String logOutButton_Xpath = "//a[@class='float-right logout']";
		
		public static final String employeeMobileNumber_Xpath = "//*[@class='wl_id']";
		public static final String employeeName_Xpath = "//*[@class = 'wl_name']";
		public static final String employeeManagerMobile_Xpath = "//*[@id='empdatatable']/tbody/tr/td[3]";
		public static final String employeeWorkLocationName_Xpath = "//*[@id='empdatatable']/tbody/tr/td[4]";
		public static final String employeeLocationAssignedImange_Xpath = "//*[@class='green-location']";
		public static final String employeeManagerAssignedImange_Xpath = "//*[@class='green-emp']";
		public static final String editEmployeeButton_Xpath = "//*[@class='track-location' and @src='css/assets/images/edit.png']";
		public static final String deleteEmployeeButton_Xpath = "//*[@class='track-location' and @src='css/assets/images/Del.png']";
		
		public static final String deleteEmployeePopUpDeleteButton_Xpath = "//button[@id='deleteEmp']";
		public static final String deleteEmployeePopUpCancelButton_Xpath = "//button[contains(text(),'Cancel')]";
		public static final String deleteEmployeePopUpCloseButton_Xpath = "//div[@class='light-box-wraper slide-popup']//div[@class='light-box-closebtn']";
		
		
		public static final String editFirstEmployeeButton_Xpath = "//*[@id='empdatatable']/tbody/tr[1]/td[7]/a[1]/img[1]";
		public static final String deleteFirstEmployeeButton_Xpath = "//*[@id='empdatatable']/tbody/tr[1]/td[7]/a[2]/img[1]";
		public static final String locationAssignedImangeFirstEmployee_Xpath = "//*[@id='empdatatable']/tbody/tr[1]/td[5]//img[1]";
		public static final String managerAssignedImangeFirstEmployee_Xpath = "//*[@id='empdatatable']/tbody/tr[1]/td[6]//img[1]";
		
		public static final String addIndividualButton_Xpath = "//button[@id='addNewEmployee']";
		public static final String bulkUploadButton_Xpath = "//button[@id='bulkoperation']";
		public static final String exportButton_Xpath = "//button[@id='export']";
		public static final String searchEmployee_Xpath = "//input[@placeholder='Search']";
		
		public static final String noEmployeeMessage_Xpath = "//p[@class='red-txt']";
		public static final String noDataAvailableMessage_Xpath = "//td[@class='dataTables_empty']";
		
		
		public static class AddEmployeeBulkUpload {
			
			public static final String addNewRecord_Xpath = "//label[@for='add_record']";
			public static final String updateExistingRecord_Xpath = "//label[@for='update_record']";
			public static final String nextButton_Xpath = "//button[contains(text(),'Next')]";
			public static final String closeButton_Xpath = "//div[@class='light-box-wraper slide-popup']//div[@class='light-box-closebtn']";
			public static final String browseFileButton_Xpath = "//input[@name='file']";
			public static final String uploadScreenCloseButton_Xpath = "//div[@class='light-box-wraper slide-popup']//div[@class='light-box-closebtn']";
			public static final String uploadScreenUploadButton_Xpath = "//button[@id='uploadFileForm']";
			public static final String uploadScreenDownloadTemplateButton_Xpath = "//button[@id='templateButton']";
			public static final String uploadScreenTotalRecordsCount_Xpath = "//div[@class='value']";
			public static final String uploadScreenSuccessRecordsCount_Xpath = "//div[@class='value green']";
			public static final String uploadScreenFailedRecordsCount_Xpath = "//div[@class='value red']";
			public static final String uploadScreenDownloadReportButton_Xpath = "//a[@class='downloadReport']";
			
		}
		
		
		public static class EditEmployee {
			
			public static final String backToListOfEmployees_Xpath = "//div[@id='editEmployeePopup']//div[@class='title_list back']";
			public static final String editEmployeeMobile_Xpath = "//input[@id='edit_emp_mob_num']";
			public static final String editEmployeeName_Xpath = "//input[@id='edit_empl_name']";
			public static final String searchWorkLocation_Xpath = "//input[@id='work_location_edit']";
			public static final String searchManagerMobile_Xpath = "//input[@id='edit_manager']";
			public static final String saveChangesButton_Xpath = "//*[@id=\"edit_empdata_save\"]";
			public static final String selectWorkLocationRadioButton_Xpath = "//label[@for='edit_em0']";
			//public static final String editEmployeeSelectWorkLocationRadioButtonList_Xpath = "//table[@id='tableSortWorkLocEdit']//tbody/tr/td[1]";
			public static final String editEmployeeSelectWorkLocationRadioButtonList_Xpath = "//table[@id='tableSortWorkLocEdit']//td[@class='work-link work-detail']";
		}
		
		public static class AddEmployee {
			
			public static final String addEmployeeBackToListOfEmployees_Xpath = "//div[@id='editEmployeePopup']//div[@class='title_list back']";
			public static final String addEmployeeMobile_Xpath = "//input[@id='add_emp_mob_num']";
			public static final String addEmployeeName_Xpath = "//input[@id='add_empl_name']";
			public static final String addEmployeeSearchWorkLocation_Xpath = "//input[@id='work_location_add']";
			public static final String addEmployeeSearchManagerMobile_Xpath = "//input[@id='add_manager']";
			public static final String addEmployeeAddEmployeeButton_Xpath = "//button[@id='add_empdata_save']";
			public static final String addEmployeeSelectWorkLocationRadioButtonList_Xpath = "//div[@class='form-group list-of-add-loc']//tr[2]//td[1]";
		}
		
	}
	
	protected static class AdminWorkLocationHomePageScreen{
		
		public static final String addWorkLocationButton_Xpath = "//div[@class='add-emp-btn text-right']//a[@id='addWorkLocation']";
		public static final String bulkUploadButton_Xpath = "//div[@class='add-emp-btn text-right']//button[@id='bulkoperation']";
		public static final String exportButton_Xpath = "//button[@id='exportWL']";
		public static final String searchPlace_Xpath = "//div[@id='work_loc_datatable_filter']//input[@placeholder='Search']";
		public static final String logOutButton_Xpath = "//a[@class='float-right logout']";
		public static final String workLocationTableRow_Xpath = "//table[@id='work_loc_datatable']/tbody/tr";
		public static final String workLocationTablePageNumberButton_Xpath = "//*[contains(@class, 'paginate_button')]";
		
		public static final String workLocationTablenextButton_Xpath = "//a[@id='work_loc_datatable_next']";
		public static final String firstPage_Xpath = "//a[@class='paginate_button current']";
		
		public static final String workLocationId_Xpath = "//div[@class='wl_id']";
		public static final String workLocationName_Xpath = "//div[@class='wl_name']";
		public static final String address_Xpath = "//div[@class = 'address_wrap']";
		public static final String radius_Xpath = "//tbody//tr//td[4]";
		public static final String editWorkLocationButton_Xpath = "//*[@class='edit' and @src='css/assets/images/edit.png']";
		public static final String deleteWorkLocationButton_Xpath = "//*[@class='edit' and @src='css/assets/images/Del.png']";
		
		public static final String deleteWorkLocationPopUpDeleteButton_Xpath = "//button[@id='confirm_delete_wl']";
		public static final String deleteWorkLocationPopUpCancelButton_Xpath = "//button[contains(text(),'Cancel')]";
		public static final String deleteWorkLocationPopUpCloseButton_Xpath = "//div[@class='light-box-wraper slide-popup']//div[@class='light-box-closebtn']";
		
		public static final String noWorkLocationMessage_Xpath = "//p[@class='red-txt']";
		public static final String noDataAvailableMessage_Xpath = "//td[@class='dataTables_empty']";
		
		
		public static class AddWorkLocation {
			
			public static final String addWorkLocationBackToListOfWorkLocation_Xpath = "//div[@id='addWorkLocationModal']//div[@class='title_list back']";
			public static final String addWorkLocationWorkLocationId_Xpath = "//input[@id='WL_LOCATION_ID_ADD']";
			public static final String addWorkLocationWorkLocationName_Xpath = "//input[@id='WL_LOCATION_NAME_ADD']";
			public static final String addWorkLocationWorkLocationAddress_Xpath = "//input[@id='WL_Address']";
			public static final String addWorkLocationGeoFence_Xpath = "//input[@id='WL_LOCATION_RADIUS_ADD']";
			public static final String addWorkLocationAddLocationButton_Xpath = "//button[@id='confirmButton']";
			public static final String searchLocationOnGoogleMaps_Xpath = "//input[@id='autocomplete']";
		}
		
		public static class AddWorkLocationBulkUpload {
			
			public static final String addNewRecord_Xpath = "//label[@for='add_record']";
			public static final String updateExistingRecord_Xpath = "//label[@for='update_record']";
			public static final String nextButton_Xpath = "//button[contains(text(),'Next')]";
			public static final String closeButton_Xpath = "//div[@class='light-box-wraper slide-popup']//div[@class='light-box-closebtn']";
			public static final String browseFileButton_Xpath = "//input[@name='file']";
			public static final String uploadScreenCloseButton_Xpath = "//button[contains(text(),'Close')]";
			public static final String uploadScreenUploadButton_Xpath = "//button[@id='uploadFileForm']";
			public static final String uploadScreenDownloadTemplateButton_Xpath = "//button[@id='templateButton']";
			public static final String uploadScreenTotalRecordsCount_Xpath = "//div[@class='value']";
			public static final String uploadScreenSuccessRecordsCount_Xpath = "//div[@class='value green']";
			public static final String uploadScreenFailedRecordsCount_Xpath = "//div[@class='value red']";
			public static final String uploadScreenDownloadReportButton_Xpath = "//a[@class='downloadReport']";
		}
		
		public static class EditWorkLocation {
			
			public static final String backToListOfWorkLocation_Xpath = "//div[@id='updateWorkLocationModal']//div[@class='title_list back']";
			public static final String editWorkLocationId_Xpath = "//input[@id='WL_ID_EDIT']";
			public static final String editWorkLocationName_Xpath = "//input[@id='WL_LOCATION_NAME_EDIT']";
			public static final String editWorkLocationAddress_Xpath = "//input[@id='WL_Address_EDIT']";
			public static final String editWorkLocationRadius_Xpath = "//input[@id='WL_RADIUS_EDIT']";
			public static final String saveChangesButton_Xpath = "//button[@id='updateButton']";
			public static final String editWorkLocationOnGoogleMap_Xpath = "//input[@id='autocompleteedit']";
		}
		
	}
	
	protected static class AdminAttendanceDetailsScreen{
		
		public static final String searchWorkLocation_Xpath = "//input[@id='workLocOfAtdn']";
		public static final String nameOrMobileNumber_Xpath = "//input[@id='mobileNum']";
		public static final String goButton_Xpath = "//button[@id='attendanceDetails']";
		public static final String nameMobMgrMobAddressSearchFeildOnDataTable_Xpath = "//input[@placeholder='Name / Mobile / Address']";
		public static final String attendanceDetailsTableDateList_Xpath = "//table[@id='empAtdnDet']//tbody/tr/td[1]";
		//public static final String attendanceDetailsTableEmployeeMobileNumberList_Xpath = "//table[@id='empAtdnDet']//tbody/tr/td[2]";
		public static final String attendanceDetailsTableEmployeeMobileNumberList_Xpath = "//*[@id=\"empAtdnDet\"]/tbody/tr/td[2]/div/a";
		public static final String attendanceDetailsTableEmployeeNameList_Xpath = "//table[@id='empAtdnDet']//tbody/tr/td[3]";
		public static final String attendanceDetailsTableEmployeeManagerMobileNumberList_Xpath = "//table[@id='empAtdnDet']//tbody/tr/td[4]";
		public static final String attendanceDetailsTableEmployeeCurrentCheckInStatusList_Xpath = "//table[@id='empAtdnDet']//tbody/tr/td[5]";
		public static final String attendanceDetailsTableEmployeeOutsideWorkLocationStatusList_Xpath = "//table[@id='empAtdnDet']//tbody/tr/td[6]";
		public static final String attendanceDetailsTableEmployeeFirstCheckInLastCheckOutStatusList_Xpath = "//table[@id='empAtdnDet']//tbody/tr/td[7]";
		public static final String attendanceDetailsTableEmployeeCheckInCheckOutAddressList_Xpath = "//table[@id='empAtdnDet']//tbody/tr/td[8]";
		
		public static final String attendanceDetailsTableFirstEmployeeCheckInTime_Xpath = "//tr[@class='odd']//td[7]//div[1]//small[1]";
		public static final String attendanceDetailsTableFirstEmployeeCheckOutTime_Xpath = "//tr[@class='odd']//td[7]//div[2]//small[1]";
		
		public static final String attendanceDetailsTableFirstEmployeeCheckInAddress_Xpath = "//tr[@class='odd']//td[8]//div[1]";
		public static final String attendanceDetailsTableFirstEmployeeCheckOutAddress_Xpath = "//tr[@class='odd']//td[8]//div[2]";
		
		public static final String attendanceDetailsTableNextButton_Xpath = "//a[@id='empAtdnDet_next']";
		public static final String attendanceDetailsRowList_Xpath = "//table[@id='empAtdnDet']//tbody/tr";
		public static final String attendanceDetailsPageNumberButtonList_Xpath = "//*[contains(@class, 'paginate_button')]";
		
		public static final String attendanceDetailsCheckInCheckBox_Xpath = "//ul[@class='employee-filter']//li[2]//div[1]//span[1]";
		public static final String attendanceDetailsCheckOutCheckBox_Xpath = "//ul[@class='employee-filter']//li[3]//div[1]//span[1]";
		public static final String attendanceDetailsOnlyCheckOutCheckBox_Xpath = "//ul[@class='employee-filter']//li[4]//div[1]//span[1]";
		public static final String attendanceDetailsNoActivityCheckBox_Xpath = "//ul[@class='employee-filter']//li[5]//div[1]//span[1]";
		public static final String attendanceDetailsOutsideWorkLocationCheckBox_Xpath = "//ul[@class='employee-filter']//li[6]//div[1]//span[1]";
		
		public static final String attendanceDetailsExportButton_Xpath = "//button[@id='exportAttnData']";
		public static final String attendanceDetailsDateDropDown_Xpath = "//*[@class='svg-inline--fa fa-caret-down fa-w-10']";
		public static final String attendanceDetailsDateDropDownSelectCustomRange_Xpath = "//li[@data-range-key='Custom Range']";
		public static final String attendanceDetailsDateDropDownSelectLastSevenDays_Xpath = "//li[contains(text(),'Last 7 Days')]";
		public static final String attendanceDetailsDateDropDownSelectYesterday_Xpath = "//li[@data-range-key='Yesterday']";
		public static final String attendanceDetailsDateDropDownSelectToday_Xpath = "//li[@data-range-key='Today']";
		
		public static final String attendanceDetailsDatePickerRightCalendar_Xpath = "//div[@class='drp-calendar right']//td[@class='available' or @class='weekend available']";
		public static final String attendanceDetailsDatePickerLeftCalendar_Xpath = "//div[@class='drp-calendar left']//td[@class='available' or @class='weekend available']";
		public static final String attendanceDetailsDatePickerTodaysDate_Xpath = "//td[@class='today active start-date available']";
		public static final String attendanceDetailsDatePickerApplyButton_Xpath = "//button[contains(text(),'Apply')]";
		
		public static class EmployeeDetails {
			
			public static final String employeeDetailsEmpName_Xpath = "//div[@class='ed_name']";
			public static final String employeeDetailsEmpMobile_Xpath = "//div[@class='ed_mobile']";
			public static final String employeeDetailsAttendanceDetailsDate_Xpath = "//div[@class='ed_date']";
			public static final String employeeDetailsEmpCurrentWorkLocation_Xpath = "//div[@class='mb-2 ed_wl_name']";
			public static final String employeeDetailsEmpCheckInCheckOutDetailsList_Xpath = "//div[@class='track_list']";
		}
	}
	
}
