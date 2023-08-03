package com.dragos.sevices.SignIn;

import com.dragos.businessLogic.Client;

public interface SignInInterface {
    public Client signIn(int bankId, String email, String password);
}
