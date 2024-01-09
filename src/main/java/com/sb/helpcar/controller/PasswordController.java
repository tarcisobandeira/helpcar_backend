package com.sb.helpcar.controller;

import ch.qos.logback.core.net.SyslogOutputStream;

import javax.crypto.*;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.util.Arrays;

public class PasswordController {
    KeyGenerator kg = KeyGenerator.getInstance("AES");
    SecretKey sk =  kg.generateKey();
    Cipher cipher = Cipher.getInstance("AES");

    public PasswordController() throws NoSuchAlgorithmException, NoSuchPaddingException {
    }


    public String CriptCreate(String password) {
        try {
            cipher.init(Cipher.ENCRYPT_MODE, sk);
            byte[] criptBytes = cipher.doFinal(password.getBytes());
            return criptBytes.toString();
        } catch (InvalidKeyException e) {
            throw new RuntimeException(e);
        } catch (IllegalBlockSizeException e) {
            throw new RuntimeException(e);
        } catch (BadPaddingException e) {
            throw new RuntimeException(e);
        }

    }

    public String Descript(String password) {
        try {
            cipher.init(Cipher.DECRYPT_MODE, sk);
            byte[] criptBytes = cipher.doFinal(password.getBytes());
            System.out.println(criptBytes);
            return criptBytes.toString();
        } catch (InvalidKeyException e) {
            throw new RuntimeException(e);
        } catch (IllegalBlockSizeException e) {
            throw new RuntimeException(e);
        } catch (BadPaddingException e) {
            throw new RuntimeException(e);
        }

    }
}
