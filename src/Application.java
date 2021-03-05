import model.Kotik;

import java.util.Random;

public class Application {
    public static void main(String[] args) {
        Kotik kotik1 = new Kotik(34, "Barsik", 13, "Мяу");
        Kotik kotik2 = new Kotik();
        kotik1.liveAnotherDay();
        System.out.println("Имя kotik1: " + kotik1.getName() + ", его вес: " + kotik1.getWeight());
        if (kotik1.getMeow().equals(kotik2.getMeow())) {
            System.out.println(kotik1.getName()+" и "+kotik2.getName() + " разговаривают одинаково");
        } else {
            System.out.println(kotik1.getName()+" и "+kotik2.getName() + " разговаривают по-разному");
        }
        System.out.println("Создано котиков: " + Kotik.getCatCount());
    }

}
