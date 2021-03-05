package model;

import java.sql.SQLOutput;
import java.util.Random;

public class Kotik {
    private int hungerLvl = 10;
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
        return true;
    }

    public boolean play() {
        return true;
    }

    public boolean run() {
        return true;
    }

    public boolean sleep() {
        return true;
    }

    public boolean hunts() {
        return true;
    }

    public void eat(int food) {
        hungerLvl += food;
    }

    public void eat(int food, String nameFood) {
        hungerLvl += food;
    }

    public void eat() {
        eat(2, "Кошачий корм");
    }

    public void liveAnotherDay() {
        for (int i = 0; i < 24; i++) {
            if (hungerLvl <= 0) {
                eat();
            }
            Random random = new Random();
            switch (random.nextInt(5)) {
                case 0:
                    this.sayMeow();
                    hungerLvl -= 1;
                    System.out.println("Котик говорит мяу");
                    break;
                case 1:
                    this.play();
                    hungerLvl -= 1;
                    System.out.println("Котик играет");
                    break;
                case 2:
                    this.run();
                    hungerLvl -= 1;
                    System.out.println("Котик бежит");
                    break;
                case 3:
                    this.sleep();
                    hungerLvl -= 1;
                    System.out.println("Котик спит");
                    break;
                case 4:
                    this.hunts();
                    hungerLvl -= 1;
                    System.out.println("Котик охотится");
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
