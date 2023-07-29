package com.dragos.service;


public interface SignUpInterface {
    void singUpClient(String bankName, String firstName, String lastName, String clientEmail, String password, double funds);
}