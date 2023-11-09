package ua.edu.ucu.apps.demo.flowers;

import ua.edu.ucu.apps.demo.decorators.DiscountDecorator;
import ua.edu.ucu.apps.demo.decorators.PaperDecorator;

public class Main {
    public static void main(String[] args) {
        Item item = new Flower(1, 90, 0.8, FlowerColor.RED);
        item = new DiscountDecorator(new PaperDecorator(item));
        System.out.println(item.price());

        Item item2 = new Flower(1, 90, 0.8, FlowerColor.RED);
        item2 = new PaperDecorator(new DiscountDecorator(item));
        System.out.println(item2.price());
    }
}
