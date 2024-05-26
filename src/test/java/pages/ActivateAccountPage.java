package pages;

public class ActivateAccountPage {

    //step 1 element locators
    public static String nextButton = "/html/body/div[1]/section/section/div/div/div[2]/form/footer/button/div/span";

    //step 2 element locators
    public static String step2NextButton = "//button[@class='button step__next-button button--primary']";

    //step 3 element locators
    public static String businessNameField = "//*[@id=\"account.trade_name\"]";
    public static String customerServiceNumberField = "//*[@id=\"account.customer_service_number\"]";
    public static String addressLine1Field = "//*[@id=\"address.line1\"]";
    public static String cityField = "//*[@id=\"address.city\"]";
    public static String regionDropdown = "//*[@id=\"root\"]/section/section/div/div/section/form/div[1]/fieldset/div[3]/div[2]/div/button/div[1]/div";
    public static String zipField = "//*[@id=\"address.postal_code\"]";
    public static String physicalStoreRadioButton = "//*[@id=\"business.brick_and_mortar.true\"]";
    public static String employeeNumberDropdown = "//*[@id=\"root\"]/section/section/div/div/section/form/div[1]/fieldset/div[4]/div[2]/button/div[1]";
    public static String businessIndustryDropdown = "//*[@id=\"root\"]/section/section/div/div/section/form/div[1]/fieldset/div[5]/div[2]/button/div[1]";
    public static String productDescriptionField = "//*[@id=\"business.description\"]";
    public static String onlinePresenceField = "//*[@id=\"business.website\"]/div/label/input";
    public static String businessHandleField = "//*[@id=\"business.handle\"]";
    public static String step3NextButton = "/html/body/div[1]/section/section/div/div/section/form/div[3]/footer/button[2]";

    //step 4 element locators
    public static String selectBusinessType = "//*[@id=\"root\"]/section/section/div/div/section/div/form/div[2]/div[1]/button";
    public static String step4NextButton1 = "//*[@id=\"root\"]/section/section/div/div/section/div/form/footer/button";
    public static String uploadDTIDocuments = "//*[@id=\"dti_registration\"]";
    public static String clickDateField = "//*[@id=\"date_of_birth\"]";
    public static String birthdayInputField = "//input[@class='ant-calendar-input ']";
    public static String nationalityDropdown = "//*[@id=\"root\"]/section/section/div/div/section/form/div[2]/div/fieldset/div[4]/div/div[2]/div/button/div[1]";
    public static String cityOfBirthField = "//*[@id=\"place_of_birth_city\"]";
    public static String countryOfBirthDropdown = "//*[@id=\"root\"]/section/section/div/div/section/form/div[2]/div/fieldset/div[6]/div/div[2]/button/div[1]";
    public static String step4AddressLine1 = "/html/body/div[1]/section/section/div/div/section/form/div[2]/div/fieldset/div[8]/label/input";
    public static String step4CityField = "//*[@id=\"city\"]";
    public static String step4RegionDropdown = "//*[@id=\"root\"]/section/section/div/div/section/form/div[2]/div/fieldset/div[10]/div[2]/div/button/div[1]";
    public static String step4ZipField = "//*[@id=\"postal_code\"]";
    public static String businessDurationDropdown = "//*[@id=\"root\"]/section/section/div/div/section/form/div[3]/div/fieldset/div[2]/div[2]/button/div[1]";
    public static String businessTIN = "//*[@id=\"tin_number\"]";
    public static String bankDropdown = "//*[@id=\"root\"]/section/section/div/div/section/form/div[4]/div/fieldset/div[3]/div/button/div[1]";
    public static String accountNameField = "//*[@id=\"account_name\"]";
    public static String accountNumberField = "//*[@id=\"account_number\"]";
    public static String step42NextButton = "//*[@id=\"root\"]/section/section/div/div/section/form/div[4]/footer/button[2]";

    // step 5 element selectors
    public static String firstNameField = "//*[@id=\"dsa.first_name\"]";
    public static String lastNameField = "//*[@id=\"dsa.last_name\"]";
    public static String emailAddressField = "//*[@id=\"dsa.email\"]";
    public static String agreeRadioButton = "//*[@id=\"dsa.authorized.true\"]" ;
    public static String authorizedPersons = "//*[@id=\"dsa.authorized_persons\"]";
    public static String signatureCanvas = "//*[@id=\"root\"]/section/section/div/div/section/form/div[2]/div/div[2]/div/div/canvas";
    public static String finalSubmitButton ="//*[@id=\"root\"]/section/section/div/div/section/form/div[2]/div/footer/button";
    public static String submissionConfirmation = "//*[@id=\"root\"]/section/section/div/div/section/div[1]/div/div[2]/h2";
}
