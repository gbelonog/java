package com.company;

import java.util.Arrays;

/**
 * Created by galina on 01.02.17.
 */
public class Bank {

    private  User[] users;

    public Bank(){
        users = new User[0];
    }

    public User registration(String name){
        User user = new User(name);

        //гыукы = Arrays.copyOf(users, user.length +1);
        User[] buf = users;
        users = new User[users.length +1];
        for(int i = 0; i < buf.length; i++){
            users[i] = buf[i];
        }
        users[users.length - 1] = user;

        return user;
    }
    public Card createCard(User user){
        Bill bill = new Bill();
        Card card = new Card(user, bill);

        return card;
    }

    public  void  addMoney(Card card, long amount){
        card.getBill().addAmount(amount);
    }

    public boolean getMoney(Card card, long amount){
        GetMoney listener = card.getOwner().getListener();
        if(listener != null){
            boolean allowGetMoneyOperation = listener.getMoney(card, amount);
            if(!allowGetMoneyOperation){
                System.out.println(" Пользаватель запретил cнимать деньги");
                return false;
            }
        }

        if(card.getBill().getAmount() < amount) {
            System.out.println("Недостаточно денег");
            return false;
        }

        card.getBill().addAmount(-amount);
        return true;
    }

    public boolean transfer(Card fromCard, Card toCard, long amount){
        if(fromCard == toCard){
            System.out.println("Вы не можете перевести деньги на ту же карту");
            return false;
        }
        if(!getMoney(fromCard, amount)) {
            System.out.println("Вы не можете перевести деньги. Недостаточно денег");
            return false;}

        addMoney(toCard, amount);
        System.out.println("Деньги переведены");
        return true;
    }

    @Override
    public String toString() {
        return "Bank{" +
                "users=" + Arrays.toString(users) +
                '}';
    }

    public void addGetMoney(User user, GetMoney listener){
        user.setListener(listener);
    }
}
