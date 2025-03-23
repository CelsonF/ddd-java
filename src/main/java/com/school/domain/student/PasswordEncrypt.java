package com.school.domain.student;

public interface PasswordEncrypt {

    String encryptPassword(String password);

    Boolean validateEncryptedPassword(String encryptedPassword, String password);

}
