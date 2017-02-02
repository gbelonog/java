package com.company;

public class Main {

    public static void main(String[] args) {
	    Bank bank = new Bank();

        User user = bank.registration("Alex");
        Card card1 = bank.createCard(user);
        Card card2 = bank.createCard(user);

        bank.addGetMoney(user, new GetMoney() {
            @Override
            public boolean getMoney(Card card, long amount) {
                if(amount > 1000) return false;

                return false;
            }
        });

        bank.addMoney(card1, 500);
        System.out.println(card1);
        /*bank.getMoney(card1,1000);
        System.out.println(card1);
        bank.getMoney(card1,100);
        System.out.println(card1);

        bank.transfer(card1, card2, 1000);
        System.out.println(card1);
        System.out.println(card2);

        bank.transfer(card1, card2, 150);
        System.out.println(card1);
        System.out.println(card2);

        System.out.println(bank);*/

        //bank.getMoney(card1,1000);
        bank.getMoney(card1,100);


    }
}
