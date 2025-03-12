package com.example.the_bank.utils;

import java.time.Year;

public class AccountUtils {

    public static final String ACCOUNT_EXIST_CODE = "001";
    public static final String ACCOUNT_EXIST_MESSAGE = "This user already has an account Created!";
    public static final String ACCOUNT_CREATION_SUCCESS = "002";
    public static final String ACCOUNT_CREATION_MESSAGE = "Account has been successfully created!";
    public static final String ACCOUNT_NOT_EXIST_CODE = "003";
    public static final String ACCOUNT_NOT_EXIST_MESSAGE = "USER WITH THE PROVIDED ACCOUNT NUMBER DOESNT EXIST";
    public static final String ACCOUNT_FOUND_CODE = "004";
    public static final String ACCOUNT_FOUND_SUCCESS = "USER ACCOUNT FOUND";
    public static final String ACCOUNT_CREDITED_SUCCESS = "005";

    public static final String ACCOUNT_CREDITED_SUCCESS_MESSAGE = "USER ACCOUNT WAS ";
    public static final String INSUFFICIENT_BALANCE_CODE = "006";
    public static final String INSUFFICIENT_BALANCE_MESSAGE = "INSUFFIENT_BALANCE_MESSAGE ";

    public static final String ACCOUNT_DEBITED_SUCCESS = "007";
    public static final String ACCOUNT_DEBITED_MESSAGE  = "ACCOUNT HAS BEEN SUCCESSFULLY DEBITED";

    public static final String DEBIT_ACCOUNT_NOT_EXIST_CODE = "YHE ACCOUNT YOU ARE TRYING TO ";
    public static final String TRANSFER_SUCCESSFUL_CODE = "008";
    public static final String TRANSFER_SUCCESSFUL_MESSAGE  = "TRANSFER SUCCESSFUL";
    public static String generateAccountNumber(){
    Year currentYear = Year.now();
    int min = 100000;
    int max = 999999;

    int randNumber = (int) Math.floor(Math.random() * ( max - min + 1) + min);
    String year =  String.valueOf(currentYear);

    String randomNumber = String.valueOf(randNumber);
    StringBuilder accountNumber = new StringBuilder();
    return accountNumber.append(year).append(randNumber).toString();



    }
}
