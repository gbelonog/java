package com.company.com.edication.practice3;

/**
 * Created by galina on 18.01.17.
 */
public class Ant extends Insect{
private int jobType;

    public int getJobType() {
        return jobType;
    }

    public void setJobType(int jobType) {
        this.jobType = jobType;
    }

    public Ant() {
    }

    public Ant(int jobType) {
        this.jobType = jobType;
    }

    public Ant(double weight, boolean hungry, int jobType) {
        super(weight, hungry);
        this.jobType = jobType;
    }

    @Override
    public void voice() {

    }

    @Override
    public void play() {

    }

    @Override
    public void eat() {

    }
}
