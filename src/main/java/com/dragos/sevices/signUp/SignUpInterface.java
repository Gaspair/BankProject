package com.dragos.sevices.signUp;

import java.sql.SQLException;

public interface SignUpInterface {
    public boolean signUp(int bankId, String customerEmail, String password,String first_name, String last_name) throws SQLException;
}
