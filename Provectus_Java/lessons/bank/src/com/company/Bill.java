package com.company;

/**
 * Created by galina on 01.02.17.
 */
public class Bill {
    private long amount;

    public Bill() {
    }

    public long getAmount() {
        return amount;
    }

    public void addAmount(long amount){
        this.amount += amount;
    }

    @Override
    public String toString() {
        return "Bill{" +
                "amount=" + amount +
                '}';
    }
}
