package fluentinterface;

import java.util.Arrays;

public class App {
    public static void main(String[] args) {

        new Restaurant("Napoli")
                .select()
                .getMenu()
                .orderPizza(Arrays.asList(new Integer[]{1,3}))
                .eatPizza();

    }
}
