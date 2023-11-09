package ua.edu.ucu.apps.demo.decorators;

import ua.edu.ucu.apps.demo.flowers.Item;

public class DiscountDecorator extends ItemDecorator {

    public DiscountDecorator(Item item) {
        super(item);
    }

    public double price() {
        return super.price() * 0.8;
    }

    public String getDescription() {
        return super.getDescription() + " in paper";
    }
}