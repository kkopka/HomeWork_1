package model;

import java.sql.SQLOutput;
import java.util.Random;

public class Kotik {
    private int hungerLvl = 10;
    private int food = 2;
    private static int catCount;
    private int prettiness;
    private String name;
    private int weight;
    private String meow;


    public Kotik(int prettiness, String name, int weight, String meow) {
        catCount++;
        this.prettiness = prettiness;
        this.meow = meow;
        this.name = name;
        this.weight = weight;
    }

    public Kotik() {
        catCount++;
        setKotik(34, "Vasya", 24, "Мяу мяу");
    }

    private void setKotik(int prettiness, String name, int weight, String meow) {
        this.prettiness = prettiness;
        this.meow = meow;
        this.name = name;
        this.weight = weight;
    }


    public boolean sayMeow() {
        System.out.println("говорит мяу");
        return true;
    }


    public boolean play() {
        System.out.println("играет");
        return true;
    }

    public boolean run() {
        System.out.println("бегает");
        return true;
    }

    public boolean sleep() {
        System.out.println("спит");
        return true;
    }

    public boolean hunts() {
        System.out.println("охотится");
        return true;
    }

    public void eat(int food) {
        hungerLvl += food;
    }

    public void eat(int food, String nameFood) {
        System.out.println("съел " + nameFood + " в количестве " + food + "-ух пачек");
    }

    public void eat() {
        eat(2, "кошачий корм");
    }

    public void liveAnotherDay() {
        for (int i = 1; i < 25; i++) {
            System.out.print("Итерация №" + i + ": "+this.name+" ");
            if (hungerLvl <= 0) {
                eat(food);
                eat();
                continue;
            }
            Random random = new Random();
            switch (random.nextInt(5)) {
                case 0:
                    this.sayMeow();
                    hungerLvl -= 1;
                    break;
                case 1:
                    this.play();
                    hungerLvl -= 1;
                    break;
                case 2:
                    this.run();
                    hungerLvl -= 1;
                    break;
                case 3:
                    this.sleep();
                    hungerLvl -= 1;
                    break;
                case 4:
                    this.hunts();
                    hungerLvl -= 1;
                    break;
            }

        }

    }

    public int getHungerLvl() {
        return hungerLvl;
    }

    public static int getCatCount() {
        return catCount;
    }

    public int getPrettiness() {
        return prettiness;
    }

    public String getName() {
        return name;
    }

    public int getWeight() {
        return weight;
    }

    public String getMeow() {
        return meow;
    }


}
