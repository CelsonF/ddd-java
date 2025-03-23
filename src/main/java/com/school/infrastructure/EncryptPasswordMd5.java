package com.school.infrastructure;

import com.school.domain.student.PasswordEncrypt;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class EncryptPasswordMd5 implements PasswordEncrypt {


    @Override
    public String encryptPassword(String password) {
      try {
          MessageDigest md = MessageDigest.getInstance("MD5");
          md.update(password.getBytes());
          byte[] bytes = md.digest();
          StringBuilder sb = new StringBuilder();
          for (byte b : bytes) {
              sb.append(Integer.toString((b & 0xff) + 0x100, 16).substring(1));
          }
          return sb.toString();

      } catch (NoSuchAlgorithmException e) {
          throw new RuntimeException(e);
      }
    }

    @Override
    public Boolean validateEncryptedPassword(String encryptedPassword, String password) {
        return encryptedPassword.equals(encryptPassword(password));
    }

}
