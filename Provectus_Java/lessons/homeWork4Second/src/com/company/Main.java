package com.company;

public class Main {

    public static void main(String[] args) {

        Clerk clerk1 = new Clerk("Vlad", "Volkov", 34, "USA");
        clerk1.work();

        Clerk clerk2 = new Clerk();
        clerk2.work();

        HR hr1 = new HR();
        hr1.work();

        HR hr2 = new HR("Valeria", "Teplova", 26, "Tower", 21);
        hr2.work();

        Cleaner cleaner1 = new Cleaner();
        cleaner1.work();

        Cleaner cleaner2 = new Cleaner("Svetlana", "Serova", 50, "USA", 150);
        cleaner2.work();

        OfficeManager officeManager1 = new OfficeManager();
        officeManager1.work();

        OfficeManager officeManager2 = new OfficeManager("Petr", "Revenko", 40, "USA");
        officeManager2.work();



    }
}
