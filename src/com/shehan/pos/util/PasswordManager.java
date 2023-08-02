package com.shehan.pos.util;

import org.mindrot.BCrypt;

public class PasswordManager {
    public static String encryptPassword(String plaintext){
        return BCrypt.hashpw(plaintext,BCrypt.gensalt(10));
    }
    public static boolean checkPassword(String plaintext, String hash){
        return BCrypt.checkpw(plaintext,hash);
    }

}
