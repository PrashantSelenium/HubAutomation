package hub.library;

public class ObjectReference {

	ReadXmlData rxml = new ReadXmlData();
   
    public String prod_url = rxml.data("prod_url");
    public String local_url = rxml.data("local_url");
    
    //User login
    public static String userLoginUsername = "//input[@id='userName']";
    public static String userLoginPassword = "//input[@id='password']";
    public static String userLoginButton = "//input[@id='subRegInd']";
    public static String hubLoginError = "//div[@id='hubLoginError']";
    public static String userLogoutLink = "//a[@id='logoutLink']";
    public static String emptyErrorMessage = "Username or Password should not be empty.";
    public static String invalidErrorMessage = "Invalid Username and/or Password, please try again.";
    
    //User Login new
    public static String registerButton = "(//input[@id='subRegInd'])[1]";
    public static String loginButton = "(//input[@id='subRegInd'])[2]";
    public static String mandatoryFields = "//div[@id=flashMessageContent']";
    public static String mandatoryMessage = "Please complete all mandatory fields.";
    public static String loginSecurityError = "//div[@id='flashMessageContent']/div";
    public static String loginSecurityMessage = "You have attempted 3 times to login. Please click on Forgot My Password to reset your account's password.";
    public static String loginErrorMessage = "//*[@id='hubLoginError']";
    
    
    //Signup page
    public static String registrationForm = "//form[@id='hubRegisForm']";
    public static String signupCaptchaImg = "//img[@id='scImage']";
    public static String signupCaptcha = "//input[@id='validationCode']";
    public static String signupDone ="//input[@id='subRegInd']";
    public static String signUpErrorFN = "//div[text()='First name field should not be empty.']";
    public static String signUpErrorLN = "//div[text()='Last name field should not be empty.']";
    public static String signUpErrorBranchId = "//div[text()='Branch ID field should not be empty.']";
    public static String signUpErrorStaffId = "//div[text()='Staff ID/Broker ID field should not be empty.']";
    public static String signUpErrorProfId = "//div[text()='Professional Industry Body ID field should not be empty.']";
    public static String signUpErrorUserRole = "//div[text()='User role field should not be empty.']";
    public static String signUpErrorEmail = "//div[text()='Email field should not be empty.']";
    public static String signUpErrorConfirmEmail = "//div[text()='Confirm email field should not be empty.']";
    public static String signUpErrorMobile = "//div[text()='Mobile number field should not be empty.']";
    public static String signUpErrorPhone = "//div[text()='Phone number field should not be empty.']";
    public static String signUpErrorUsername = "//div[text()='Username should not be empty.']";
    public static String signUpErrorPassword = "//div[text()='Password field should not be empty.']";
    public static String signUpErrorConfirmPass = "//div[text()='Confirm password field should not be empty.']";
    public static String signUpErrorSecurityQuestion = "//div[text()='Security question field should not be empty.']";
    public static String signUpErrorSecurityAnswer = "//div[text()='Security answer field should not be empty.']";
    public static String signUpErrorCaptcha = "//div[text()='Validation code should not be empty.']";

        
    //My Account 
    public static String userMyAccount = "//li[@id='myAccount']/div/a";
    public static String myAccountFN = "//input[@id='firstName']";
    public static String myAccountLN = "//input[@id='lastName']";
    public static String myAccountBranchId = "//input[@id='BranchID']";
    public static String myAccountStaffId = "//input[@id='StaffIDBrokerID']";
    public static String myAccountProfId = "//input[@id='ProfessionalIndustryBodyID']";
    public static String myAccountEmail = "//input[@id='userEmail']";
    public static String myAccountConfirmEmail = "//input[@id='confirmUserEmail']";
    public static String myAccountMobile = "//input[@id='mobileNumber']";
    public static String myAccountPhone = "//input[@id='phoneNumber']";
    public static String myAccountUsername = "//input[@id='userName']";
    public static String myAccountPassword = "//input[@id='userPass']";
    public static String myAccountConfirmPassword = "//input[@id='confirmUserPass']";
    public static String myAccountSecurityQuestion = "//input[@id='securityQuestion']";
    public static String myAccountSecurityAnswer = "//input[@id='securityAnswer']";
    public static String myAccountUserRole = "//select[@id='userRole']";

    
    
    
    //My Transactions
    public static String userMyTransactions = "//li[@id='myTransactions']/div/a";
    public static String userMyTransactionList = "//div[@class='TransactionList']";
    
    //Reset Password
    public static String oldForgotPassword = "//form[@id='hubForgotPassForm']";
    public static String userForgotPasswordInstruction = "(//span)[4]";
    public static String userForgotPasswordBtn = "(//input[@id='subRegInd'])[3]";
    public static String userForgotPasswordUsername = "//input[@id='user-name']";
    public static String userForgotPasswordEmailAddress = "//input[@id='email-address']";
    public static String userForgotPasswordError = "//div[@id='errorMessage']";
    public static String userForgotPasswordEmpty = "//div[@id='errorMessage']";
    public static String userResetPasswordBtn = "(//input[@id='subRegInd'])[4]";
    public static String userResetPasswordMessage = "(//span)[6]";
    public static String userResetPasswordEmailSent = "//label[@class='fontStyle12']";
    public static String userResetPasswordSuccessPopup = "//div[@id='cboxContent']";
    public static String userResetPasswordSuccessPopupMessage = "(//div/p)[5]";
    public static String userResetPasswordSuccessPopupClose = "//img[@src='/ttsvr/myrp/images/ui/modalbox/close.png']";
    public static String userResetPasswordChangeMessage = "(//td/div)[3]";
    public static String userResetPasswordChangeMessage2 = "(//td/div)[4]";
    public static String userResetPasswordChange = "";
    public static String userResetPasswordNewPass = "//input[@id='newPassword']";
    public static String userResetPasswordConfirmPass = "//input[@id='confirmPassword']";
    public static String userResetPasswordCancelBtn = "//input[@id='cancel']";
    public static String userResetPasswordResetPassBtn = "//input[@id='resetPassword']";
    public static String userResetPasswordInfo = "//div[@class='pass_info']";
    public static String userResetPasswordError = "";
    public static String userResetPasswordSuccess = "";
    public static String userOneTimePasswordFirstPopup = "//div[@class='oneTimePassword']";
    public static String userOneTimePasswordMessage = "(//div[@class='oneTimePasswordMessage']/div)[1]";
    public static String userOneTimePasswordLabel = "//div[@class='oneTimePasswordForm']/label";
    public static String userOneTimePasswordField ="//input[@id='inputPasswordField']";
    public static String userOneTimePasswordConfirm ="//input[@id='oneTime-button']";
    public static String userOneTimePasswordClose ="//img[@src='/ttsvr/myrp/images/ui/modalbox/close.png']";
    public static String userShowValidation = "//h4";
    public static String userShowValidationOneNumber = "//td[@id='one_number']";
    public static String userShowValidationLowerCase = "//td[@id='lower_case']";
    public static String userShowValidationUpperCase = "//td[@id='upper_case']";
    public static String userShowValidationSpecialChar = "//td[@id='special_character']";


    
    //Property Search
    public static String userPropertySearch = "//input[@id='hubSearchAddress']";
    public static String userSearchButton = "//input[@id='hubSearchButton']";
    public static String userPropertyDetails = "//div[@id='propdetails']";
    
    //CFA
    public static String userCFAButton = "//input[@src='/myrp/images/hub/hub_cantFindAddress.png']";
    public static String userCFAUnitNumber = "//input[@id='hubSearchAddress_unitNumber']";
    public static String userCFAStreetNumber = "//input[@id='hubSearchAddress_streetNumber']";
    public static String userCFALotNumber = "//input[@id='hubSearchAddress_lotNumber']";
    public static String userCFAStreetName = "//input[@id='hubSearchAddress_streetName']";
    public static String userCFAStreetType = "//input[@id='hubSearchAddress_street_Type']";
    public static String userCFAStatePostcode = "//input[@id='hubSearchAddress_suburbStatePostcode']";
    public static String userCFABackSearch = "(//div[@id='clearAllIcon'])[1]";
    public static String userCFAClear = "(//div[@id='clearAllIcon'])[2]";
    public static String userCFAConfirm = "//div[@id='proceedBtn']";
    public static String userCFASuggestion = "//div[@class='hubResults cantfindAddListContainer']";
    public static String userCFASuburbList = "(//div[@class='acResults'])[2]";
    
    
    //Pending Transactions
    public static String userPendingTransactionMessage ="//div[@id='divContainer']";
    
    //Property Details
    public static String userCart ="//a[@id='cartCount']";

    //originator
    public static String userOriginatorDetails = "//div[@id='div_questionnaire']";
    public static String userOEVPP = "//input[@id='2']";
    public static String userNoneApply ="//input[@id='26']";
    public static String userAVMAck ="//input[@id='6']";
    public static String userOriginatorToProductSelection = "(//a[@class='hubTextlink'])[6]";
    public static String userOriginatorProceed = "(//table[@class='propertyDetailQuestionLink']//a)[2]";
    
    //Product tabs
    public static String productTabsMenu = "//div[@id='containerTab']";
    public static String tabReports = "//a[@id='linkReports']";
    public static String tabValuations = "//a[@id='linkValuations']";
     
    public static String userProductTab = "//input[@id='linkResidential_Valuations']";
    public static String tabResidentialValuation = "//input[@id='linkResidential_Valuations']";
    public static String tabRetroReports = "//div[@id='linkRetro_Reports']";
    public static String tabCommercialValuations ="//div[@id='linkCommercial_Valuations']";
    public static String tabRuralValuations ="//div[@id='linkRural_Valuations']";
    public static String userValuationsTab = "//div[@id('tabValuations')]";
    public static String userRetroReportsTab = "//div[@id='tabRetro_Reports']";
    
    //Products
    public static String productLenderEmpowerment = "//div[@id='tabReports']/table/tbody/tr/td/div/div/ul/li[2]/div/input[@id='purchaseButton']";
    public static String productLenderAVM = "//div[@id='tabValuations']//input[@id='purchaseButton']";
    public static String productShorFormVal = "//div[@id='tabValuations']/table/tbody/tr[2]/td/div/div/ul/li[2]/div/input[@id='purchaseButton']";

    //Product selection
    public static String userAddToCart = "(//input[@id='purchaseButton'])[1]";
    public static String userProceedToProductSelection = "(//a[@class='hubTextlink'])[4]";
    public static String userResidentialTabLink = "//a[@id='linkResidential_Valuations']";
    public static String userValuationsTabLink = "//a[@id='linkValuations']";
    public static String userRetroReportsTabLink = "//a[@id='linkRetro_Reports']";
    public static String userNavProductSelection = "(//div[@class='navigation'])[1]";
    public static String userProductSelectionList = "//div[@class='ProductSelectionList']";
    public static String userProductSelectionListOverview = "//div[@class='overview']";

    //Instruction details
    public static String userProceedToInstructionDetails = "Proceed to instruction details";  
    public static String userInstructionDetails = "//div[@id='instructionDetails_acc']";
    public static String userCustomerFName = "//input[@id='1_1_value']";
    public static String userCustomerLName = "//input[@id='2_1_value']";
    public static String userCustomerContact = "//input[@id='13_1_value']";
    public static String userCustomerEmail = "//input[@id='14_1_value']";
    public static String userSameAsCustomer = "//input[@id='checkbox_16_2_value']";

    //Cart Count Pop up
    public static String userCartCountPopup = "//table[@id='cartCountRestrictionPopup']/tbody/tr[2]/td";
    public static String userCartCountContinue = "//a[@id='cartCountRestrictionContinueBtn']";
    public static String userCartCountOk= "//a[@id='cartCountRestrictionOkBtn']";
    public static String userCartCountChange = "//a[@id='cartCountRestrictionChangeProductBtn']";
    public static String userCartCountCancel = "//input[@id='cartCountRestrictionCancel']";

    // Payment Details
    public static String userProceedToPaymentDetails = "Proceed to payment details";  
    public static String userPaymentDetailsForm = "//div[@id='paymentDetailForm']";
    public static String userPaymentItem = "//td[@class='labelText hubHeaderBodyText']";
    public static String userPaymentTermsConditions = "//input[@id='termsAndConditions']";
    public static String userPaymentPassword = "//input[@id='accountPassword']";
    public static String userPaymentBroker = "//input[@id='accountId']";
    public static String userPaymentCreditName = "//input[@id='nameForTaxInvoice']";
    public static String userPaymentCreditEmail = "//input[@id='emailForTaxInvoice']";
    public static String userPaymentCreditNumber = "//input[@id='cardNumber']";
    public static String userPaymentCreditSecurity = "//input[@id='securityCode']";
    public static String userPaymentDetailsRemove = "//input[@class='hubRemoveButton']";
    public static String userPaymentDetailsRemovePopup = "//div[@id='hubCboxLoadedContent']";
    public static String userPaymentDetailsRemoveOk = "//a[contains(text(),'OK')]";
    
    //Order Confirmation
    public static String userConfirmPayment = "//img[@src='/myrp/images/hub/hub_confirm.png']"; 
    public static String userOrderItem = "//td[@class='labelText']";
    public static String userOrderDetailFN = "(//div[@class='wrap']/div/div[@class='hubHeaderBodyText'])[1]";
    public static String userOrderDetailLN = "(//div[@class='wrap']/div/div[@class='hubHeaderBodyText'])[2]";
    public static String userOrderDetailCN = "(//div[@class='wrap']/div/div[@class='hubHeaderBodyText'])[3]";
    public static String userOrderDetailCA = "(//div[@class='wrap']/div/div[@class='hubHeaderBodyText'])[4]";
    
    //Mortgage Valuation Notification
    public static String userMortgagePopup = "//table[@class='hubHeaderBodyText']//td[@align='center']";
    public static String userMortgagePopupOkBtn = "(//a[@class='hubButtonText'])[6]";

    //RetroVal
    public static String userRetroValuationDate = "(//input[@id='retroDate_108'])";
    public static String userDatePickerMonth = "//select[@class='ui-datepicker-month']";
    public static String userDatePickerYear = "//select[@class='ui-datepicker-year']";
    public static String userRetroBedroom = "//select[@id='bedroom_108']";
    public static String userRetroBathroom = "//select[@id='bathroom_108']";
    public static String userRetroCarspace = "//select[@id='carspace_108']";
    public static String userRetroCheckAvailability = "(//input[@id='checkAvailability'])[2]";
    public static String errorRetroContainer ="//span[@id='checkAvailabilityError']";
    public static String errorRetroValuationDate = "//span[@colspan='4']";
    
    
    //Channels
    public static String cbaLender = "https://stage-cbalender.rppropertyhub.com";
    public static String aussieSelect = "https://stage-aussieselect.rppropertyhub.com";
    public static String bankMelbourne = "https://stage-bankmelbourne.rppropertyhub.com";
    
    
    
    //Admin Login
    public static String adminLoginUsername = "//input[@id='hubAdminLoginUsername']";
    public static String adminLoginPassword = "//input[@id='hubAdminLoginPassword']";
    public static String adminLoginButton = "//input[@id='hubAdminLoginBtn']";
    public static String adminLinkLogout = "//a[@onclick='HubAdminLogout.logout();']";
    
    //Admin Channel - Details
    public static String adminChannelTable = "//div[@id='baseProductGroupForm']";
    public static String adminChannelHeader = "//label[@class='mainLabel']";
    public static String adminChannelEdit = "//a[contains(@href, '/n/Channel-Details/myrp-783?channelId=18')]"; //bglChannelId20
    
    //Admin Channel - Cart and Payment
    public static String adminChannelCartAndPayment = "//a[@href='/n/Cart-and-Payment/myrp-786?channelId=18']";
    public static String adminChannelOrderConfirmation = "(//label[@class='mainLabel'])[1]"; 
    public static String adminCartCountCheckbox = "//input[@id='isActiveCartCountRestriction']";
    public static String adminCartCountValue = "//input[@id='isActiveCartCountRestrictionValue']";
    public static String adminCartCountNumber = "//input[@id='cartCountRestrictionNumber']";  
    public static String adminButtonSave = "//input[@value='Save']"; 
      
    //Admin menu
    public static String  adminHome= "(//span[@class='parent'])[1]";
    public static String  adminProducts = "(//span[@class='parent'])[2]";
    public static String  adminChannels = "(//span[@class='parent'])[3]";
    public static String  adminUsers = "(//span[@class='parent'])[4]";
    public static String  adminUtilities = "(//span[@class='parent'])[5]";
    
    //Admin Products - Base Products
    public static String adminBaseProductLink = "//a[contains(@href, 'n/Base-Products/')]";
    public static String baseProductHeader = "//a[text()='BASE PRODUCTS']";
    public static String baseProductList = "//div[@id='adminBaseProductListContainer']";
    
    
    
    public static String baseProdAddNewLink = "//a[text()='Add New']";
    public static String baseProdCancelBtn = "(//div[@class='button-text'])[1]";
    public static String baseProdSaveBtn = "//div[@class='button-text-save']";
    public static String baseProdBackToListBtn = "(//div[@class='button-text'])[2]";
    public static String baseProductErrorMessage = "//div[@id='errorMessage']";
    public static String baseProdActivate = "//input[@id='isActivate']";
    
    public static String baseProdAddNewHeader = "//a[text()='ADD BASE PRODUCT']";
    public static String baseProdAddNewLabel = "//label[@id='base-product-mail-label']";
    public static String baseProdNameFieldLabel = "//label[text()='* Name:']";
    public static String baseProdDataGroupFieldLabel = "//label[text()='* Product Data Group:']";
    public static String baseProdTypeFieldLabel = "//label[text()='* Product Type:']";
    public static String baseProdNameField = "//input[@id='baseProductName']";
    public static String baseProdDataGroupField = "//select[@id='baseProductGroupId']";
    public static String baseProdTypeField = "//select[@id='productType']";
    public static String prodTypeReport = "//select[@id='productType']/option[@value='27']";
    public static String prodTypeService = "//select[@id='productType']/option[@value='28']";
    public static String prodTypeProcessedReport = "//select[@id='productType']/option[@value='29']";
    public static String baseProdReportSourceLabel = "//label[text()='* Report Source:']";
    public static String baseProdReportSourceField = "//select[@id='reportSourceLookup']";
    public static String repSourceValexRequestMethod = "//select[@id='reportSourceLookup']/option[@value='33']";
    public static String repSourceBSG = "//select[@id='reportSourceLookup']/option[@value='34']";
    public static String repSourceRPPropertyHub = "//select[@id='reportSourceLookup']/option[@value='35']";
    public static String repSourceValexFindMethod = "//select[@id='reportSourceLookup']/option[@value='36']";
    public static String baseProdReportTypeLabel = "//label[text()='* Report Type:']";
    public static String baseProdReportTypeField = "//select[@id='reportType']";
    public static String repTypePropertyProfile = "//option[@value='Property Profile']";
    public static String repTypeRetroVal = "//option[@value='RetroVal']";
    public static String repTypeRPAVM = "//option[@value='RP AVM']";
    public static String repTypeScorecard = "//option[@value='Scorecard']";
    public static String repTypeCBAAVM = "//option[@value='CBA AVM']";
    public static String repTypeAussieAVM = "//option[@value='Aussie AVM']";
    public static String reportNameLabel = "//label[text()='* Report Name:']";
    public static String reportNameField = "//input[@id='reportName']";
    public static String baseProdDupValServiceTypeLabel = "//td[text()='* Dup Valuation Service Type:']";
    public static String baseProdDupValServiceTypeField = "//select[@id='dupValServiceType']";
    public static String dupValServiceResidetialSF = "//select[@id='dupValServiceType']/option[@value='23']";
    public static String dupValServiceConstructionSF = "//select[@id='dupValServiceType']/option[@value='24']";
    public static String dupValServiceCompTitleSF = "//select[@id='dupValServiceType']/option[@value='25']";
    public static String dupValServiceLeaseTitleSF = "//select[@id='dupValServiceType']/option[@value='26']";
    public static String baseProdValServiceTypeLabel = "//td[text()='* Valex Service Type:']";
    public static String baseProdValServiceTypeField = "//input[@id='valexServiceType']";
    
    public static String baseProdValSubTypeLabel = "//td[text()='* ValSubType:']";
    public static String baseProdValSubTypeField = "//select[@id='valSubType']";
    public static String valSubTypeNA = "//select[@id='valSubType']/option[@value='2']";
    public static String valSubTypeDesktopValuation = "//select[@id='valSubType']/option[@value='10']";
    public static String valSubTypeShortForm = "//select[@id='valSubType']/option[@value='11']";
    public static String valSubTypeStandard = "//select[@id='valSubType']/option[@value='12']";
   
    public static String baseProdValSubTypeNoteLabel = "//td[text()='ValSubTypeNote:']";
    public static String baseProdValSubTypeNoteField = "//input[@id='valSubTypeNote']";
   
    public static String baseProdConstructionLabel = "//td[text()='* Construction:']"; 	 
    public static String baseProdConstructionField = "//select[@id='construction']";
   
    public static String valexRequestAVMSourceLabel = "//td[text()='Valex Request AVM Source:']";
    public static String valexRequestAVMSourceField = "//select[@id='requestAvmSource']";
   
    public static String valexResponseAVMSourceLabel = "//td[text()='Valex Response AVM Source:']";
    public static String valexResponseAVMSourceField = "//select[@id='responseAvmSource']";

    
    
    //Admin Products - Base Product Groups
    public static String  adminBaseProductGroupsLink= "//a[contains(@href, 'n/Base-Products-Groups/')]";
    
    //Admin Products - Custom Products
    public static String  adminCustomProductLink= "//a[contains(@href, 'n/Custom-Products/')]";
    
    //Admin Promotion Code UI List
    public static String productsTab = "//*[@id='cssmenu']/ul/li[2]/span";
    public static String adminPromotionsTab = "//*[@id='cssmenu']/ul/li[2]/ul/li[5]/a/span";
    public static String adminPromotionsSearchTextField = "//input[@id='promotionSearchTextField']";
    public static String adminPromotionsSearchCloseButton = "//img[@id='baseProductSearchClearIcon']";
    public static String adminPromotionsSearchButton = "//input[@id='baseProductSearchIcon']";
    
    public static String adminPromotionListHeaderText = "/html/body/table/tbody/tr/td/table/tbody/tr/td/table/tbody/tr[3]/td/table/tbody/tr/td[2]/table/tbody/tr[1]/td/table/tbody/tr/td[1]/table/tbody/tr/td/span/a";
    public static String adminPromotionListAddNewText = "/html/body/table/tbody/tr/td/table/tbody/tr/td/table/tbody/tr[3]/td/table/tbody/tr/td[2]/table/tbody/tr[1]/td/table/tbody/tr/td[2]/table/tbody/tr/td[1]/a";
    public static String adminPromotionListHelpLink = "/html/body/table/tbody/tr/td/table/tbody/tr/td/table/tbody/tr[3]/td/table/tbody/tr/td[2]/table/tbody/tr[1]/td/table/tbody/tr/td[2]/table/tbody/tr/td[3]/table/tbody/tr/td[3]/a";
    public static String adminPromotionListHelpIcon = "/html/body/table/tbody/tr/td/table/tbody/tr/td/table/tbody/tr[3]/td/table/tbody/tr/td[2]/table/tbody/tr[1]/td/table/tbody/tr/td[2]/table/tbody/tr/td[3]/table/tbody/tr/td[1]/img";
    public static String result = "//*[@id='adminPromotionListContainer']/table[1]/tbody/tr[3]/td/table/tbody/tr/td[1]/table/tbody/tr[1]/td/span";
    
   //Admin Promotion Code UI Add New Header
    public static String adminPromotionNew_HeaderText = "/html/body/table/tbody/tr/td/table/tbody/tr/td/table/tbody/tr[3]/td/table/tbody/tr/td/table/tbody/tr[1]/td/table/tbody/tr/td[1]/table/tbody/tr/td[1]/span/a";
    public static String adminPromotionNew_ShowHistoryText = "";
    public static String adminPromotionNew_HelpLink = "/html/body/table/tbody/tr/td/table/tbody/tr/td/table/tbody/tr[3]/td/table/tbody/tr/td/table/tbody/tr[1]/td/table/tbody/tr/td[2]/table/tbody/tr/td/table/tbody/tr/td[5]/a";
    public static String adminPromotionNew_HelpIcon = "/html/body/table/tbody/tr/td/table/tbody/tr/td/table/tbody/tr[3]/td/table/tbody/tr/td/table/tbody/tr[1]/td/table/tbody/tr/td[2]/table/tbody/tr/td/table/tbody/tr/td[3]/img";
    public static String adminPromotionNew_BaseProdLabel = "//*[@id='base-product-mail-label']";
    
  //Admin Promotion Code UI Add New Label
    public static String adminPromotionNew_Name = "//*[@id='addPromotionForm']/tbody/tr[1]/td[1]/label";
    public static String adminPromotionNew_Description = "//*[@id='addPromotionForm']/tbody/tr[3]/td[1]/label";
    public static String adminPromotionNew_CodePrefix = "//*[@id='addPromotionForm']/tbody/tr[5]/td[1]/label";
    public static String adminPromotionNew_CodeNumber = "//*[@id='addPromotionForm']/tbody/tr[7]/td[1]/label";
    public static String adminPromotionNew_Multiplier = "//*[@id='addPromotionForm']/tbody/tr[9]/td[1]/label";
    public static String adminPromotionNew_UserLimit = "//*[@id='addPromotionForm']/tbody/tr[13]/td[1]/label";
    public static String adminPromotionNew_StartDate = "//*[@id='addPromotionForm']/tbody/tr[17]/td[1]/label";
    public static String adminPromotionNew_FinishDate = "//*[@id='addPromotionForm']/tbody/tr[19]/td[1]/label";
    public static String adminPromotionNew_Status = "//*[@id='addPromotionForm']/tbody/tr[21]/td[1]/label";
    public static String adminPromotionNew_Type = "//*[@id='addPromotionForm']/tbody/tr[23]/td[1]/label";
    public static String adminPromotionNew_TypeValue = "//*[@id='addPromotionForm']/tbody/tr[25]/td[1]/label";
    public static String adminPromotionNew_Channel = "//*[@id='addPromotionForm']/tbody/tr[27]/td[1]/label";
    public static String adminPromotionNew_BaseProduct = "//*[@id='addPromotionForm']/tbody/tr[29]/td[1]/label";
    public static String adminPromotionNew_WeekDays = "//*[@id='addPromotionForm']/tbody/tr[31]/td[1]/label";
    public static String adminPromotionNew_Region = "//*[@id='addPromotionForm']/tbody/tr[33]/td[1]/label";
    
    
  //Admin Promotion Code UI Add New Input fields
    public static String adminPromotionNew_Input_Name = "//*[@id='promotionName']";
    public static String adminPromotionNew_Input_Description = "//*[@id='description']";
    public static String adminPromotionNew_Input_CodePrefix = "//*[@id='codePrefix']";
    public static String adminPromotionNew_Input_CodeNumber = "//*[@id='codeNumber']";
    public static String adminPromotionNew_Input_chk_Multiplier = "//*[@id='isCodeMultiplier']";
    public static String adminPromotionNew_Input_txtbox_Multiplier = "//*[@id='codeMultiplier']";
    public static String adminPromotionNew_Input_chk_UserLimit = "//*[@id='isUserLimit']";
    public static String adminPromotionNew_Input_txtbox_UserLimit = "//*[@id='userLimit']";
    public static String adminPromotionNew_Input_StartDate = "//*[@id='startDate']";
    public static String adminPromotionNew_Input_FinishDate = "//*[@id='endDate']";
    public static String adminPromotionNew_Input_Status = "//*[@id='status']";
    public static String adminPromotionNew_Input_Type = "//*[@id='type']";
    public static String adminPromotionNew_Input_TypeValue = "//*[@id='typeValue']";
    public static String adminPromotionNew_Input_Channel = "//*[@id='channelId']";
    public static String adminPromotionNew_Input_BaseProduct = "//*[@id='baseProductId']";
    public static String adminPromotionNew_Input_chk_WeekDays_Sun = "(//*[@id='promotionDays'])[1]";
    public static String adminPromotionNew_Input_chk_WeekDays_Mon = "(//*[@id='promotionDays'])[2]";
    public static String adminPromotionNew_Input_chk_WeekDays_Tue = "(//*[@id='promotionDays'])[3]";
    public static String adminPromotionNew_Input_chk_WeekDays_Wed = "(//*[@id='promotionDays'])[4]";
    public static String adminPromotionNew_Input_chk_WeekDays_Thu = "(//*[@id='promotionDays'])[5]";
    public static String adminPromotionNew_Input_chk_WeekDays_Fri = "(//*[@id='promotionDays'])[6]";
    public static String adminPromotionNew_Input_chk_WeekDays_Sat = "(//*[@id='promotionDays'])[7]";
    public static String adminPromotionNew_Input_chk_Region_Act = "(//*[@id='promotionRegions'])[1]";
    public static String adminPromotionNew_Input_chk_Region_Nt = "(//*[@id='promotionRegions'])[2]";
    public static String adminPromotionNew_Input_chk_Region_Nsw = "(//*[@id='promotionRegions'])[3]";
    public static String adminPromotionNew_Input_chk_Region_Qld = "(//*[@id='promotionRegions'])[4]";
    public static String adminPromotionNew_Input_chk_Region_Sa = "(//*[@id='promotionRegions'])[5]";
    public static String adminPromotionNew_Input_chk_Region_Tas = "(//*[@id='promotionRegions'])[6]";
    public static String adminPromotionNew_Input_chk_Region_Vic = "(//*[@id='promotionRegions'])[7]";
    public static String adminPromotionNew_Input_chk_Region_Wa = "(//*[@id='promotionRegions'])[8]";
    
  //Admin Promotion Code UI Add New Buttons
    public static String adminPromotionNew_Cancel = "/html/body/table/tbody/tr/td/table/tbody/tr/td/table/tbody/tr[3]/td/table/tbody/tr/td/table/tbody/tr[2]/td/table/tbody/tr/td/table/tbody/tr/td/div/table[2]/tbody/tr/td[1]/div/div";
    public static String adminPromotionNew_Save = "/html/body/table/tbody/tr/td/table/tbody/tr/td/table/tbody/tr[3]/td/table/tbody/tr/td/table/tbody/tr[2]/td/table/tbody/tr/td/table/tbody/tr/td/div/table[2]/tbody/tr/td[3]/div/div";
    public static String adminPromotionNew_Back = "/html/body/table/tbody/tr/td/table/tbody/tr/td/table/tbody/tr[3]/td/table/tbody/tr/td/table/tbody/tr[2]/td/table/tbody/tr/td/table/tbody/tr/td/div/table[2]/tbody/tr/td[4]/div/div";
    
  //Admin Promotion Code UI Add New Horizontal Lines
    public static String adminPromotionNew_HorizontalLine1 = "//*[@id='addPromotionForm']/tbody/tr[4]/td/hr";
    public static String adminPromotionNew_HorizontalLine2 = "//*[@id='addPromotionForm']/tbody/tr[16]/td/hr";
    public static String adminPromotionNew_HorizontalLine3 = "//*[@id='addPromotionForm']/tbody/tr[26]/td/hr";
    public static String adminPromotionNew_HorizontalLine4 = "//*[@id='addPromotionForm']/tbody/tr[30]/td/hr";
    public static String adminPromotionNew_HorizontalLine5 = "//*[@id='addPromotionForm']/tbody/tr[32]/td/hr";
    
    public static String adminPromotionNew_RegionErrMsg = "/html/body/table/tbody/tr/td/table/tbody/tr/td/table/tbody/tr[3]/td/table/tbody/tr/td/table/tbody/tr[2]/td/table/tbody/tr/td/table/tbody/tr/td/div/table/tbody/tr[33]/td[2]/div[9]";
    public static String adminPromotionNew_WeekdaysErrMsg = "/html/body/table/tbody/tr/td/table/tbody/tr/td/table/tbody/tr[3]/td/table/tbody/tr/td/table/tbody/tr[2]/td/table/tbody/tr/td/table/tbody/tr/td/div/table/tbody/tr[31]/td[2]/div[8]";
    public static String adminPromotionNew_BaseProdErrMsg = "/html/body/table/tbody/tr/td/table/tbody/tr/td/table/tbody/tr[3]/td/table/tbody/tr/td/table/tbody/tr[2]/td/table/tbody/tr/td/table/tbody/tr/td/div/table/tbody/tr[29]/td[2]/div";
    public static String adminPromotionNew_CodeMultiErrMsg = "/html/body/table/tbody/tr/td/table/tbody/tr/td/table/tbody/tr[3]/td/table/tbody/tr/td/table/tbody/tr[2]/td/table/tbody/tr/td/table/tbody/tr/td/div/table/tbody/tr[11]/td[2]/div";
    public static String adminPromotionNew_UserLimitErrMsg = "/html/body/table/tbody/tr/td/table/tbody/tr/td/table/tbody/tr[3]/td/table/tbody/tr/td/table/tbody/tr[2]/td/table/tbody/tr/td/table/tbody/tr/td/div/table/tbody/tr[15]/td[2]/div";
    public static String adminPromotion_FlashMessage = "//*[@id='flashMessage']";

    //Admin Add/Edit Product Tab
    public static String adminProductTabName = "//*[@id='hubAdminChannelTab']"; 
    public static String adminProductTabDescription = "//*[@id='productTabDescription']";
    public static String adminProductTabIsActive = "//*[@id='isActive']";
    public static String adminProductTabSave = "//div[@class='button-text-save']"; 
    public static String adminChannelTab = "//*[@id='cssmenu']/ul/li[3]/span";
    public static String adminChannelListTab = "//*[@id='cssmenu']/ul/li[3]/ul/li[2]/a/span";
    public static String adminChannelSearchTextField = "//*[@id='channelSingleLineSearchTextField']";
    public static String flashMessage = "//*[@id='flashMessageContent']";  
    public static String upload = "//*[@id='thumbNailUpload']";  
    public static String ckeditor = "//*[@id='cke_contents_productTabDescription']/iframe"; 
    public static String body = "/html/body";
    public static String addNew = "/html/body/table/tbody/tr/td/table/tbody/tr/td/table/tbody/tr[3]/td/table/tbody/tr/td[3]/table/tbody/tr[1]/td/table/tbody/tr/td[2]/table/tbody/tr/td[5]/a";
    public static String thumbNailImg = "//*[@id='addChannelTabForm']/tbody/tr[6]/td[2]/table/tbody/tr[2]/td/img";
    public static String channelTabsContainer = "//*[@id='channelTabsContainer']/div[2]/table[1]";
    
    //Footer
    public static String userManual = "//a[@id='userManualDownload']";
    public static String contactUs = "//*[@id='custservice']/table/tbody/tr[2]/td[2]/table/tbody/tr[1]/td[2]/div/a[2]";
    public static String feedback = "//*[@id='custservice']/table/tbody/tr[2]/td[2]/table/tbody/tr[1]/td[2]/div/a[3]";
    public static String contactUsPage = "//div[contains(text(),'Contact Us')]";
    public static String feedbackPage = "//div[contains(text(),'Feedback')]";
}


