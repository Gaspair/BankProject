package com.dragos.businessLogic;

public interface FormValidatorInterface {

    public  boolean formSignUpValidator(String bankName, String firstName, String lastName, String clientEmail, String password, double funds);

    public  boolean formSignInValidator(String bankName, String email, String password);
}
