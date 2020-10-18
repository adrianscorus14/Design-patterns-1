package fluentinterface;

import java.util.ArrayList;
import java.util.List;

public class Menu implements IMenu {
    List<IPizza> menuList = new ArrayList<>();
    List<IPizza> selectedList = new ArrayList<>();


    public Menu() {
        Pizza margharita = new Pizza();
        Pizza capriciosa = new Pizza();
        Pizza fruttidimare = new Pizza();

        menuList.add(margharita);
        menuList.add(capriciosa);
        menuList.add(fruttidimare);

    }


    @Override
    public IMenu orderPizza(List<Integer> orders) {
        System.out.println("Order pizza:");
        for (Integer index : orders) {
            
            IPizza pizza = menuList.get(index);
            selectedList.add(pizza);
//            pizza.getIngredients();
        }
        return this;
    }

    @Override
    public IMenu eatPizza() {
        return this;
    }

    @Override
    public IMenu payPizza() {
        return this;
    }

    @Override
    public IPizza getPizza(int index) {
        return null;
    }
}
