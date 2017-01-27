package com.company;

public class Main {

    public static void main(String[] args) {

        Callback callback = new EmptyCallback();
        callback.invoke(4);

        User user = new User("alex");
        UserValidator userValidator = new UserValidator();

        UserValidator.validate(user, new ErrorHandler(){
            @Override
            public void error(String message){
                System.out.println(message);
            }
        });
    }

}
