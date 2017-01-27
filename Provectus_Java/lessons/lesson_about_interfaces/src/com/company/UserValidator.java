package com.company;

/**
 * Created by galina on 25.01.17.
 */
public class UserValidator {

    public boolean validate (User user, ErrorHandler errorHandler){
        if (user.getName().contains("a")){
            errorHandler.error("Имя пользовавателя не должно содержать а");
            return false;
        }else return true;
    }
}
