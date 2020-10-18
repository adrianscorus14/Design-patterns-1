package fluentinterface;

import java.util.List;

public interface IMenu {
    public IMenu orderPizza(List<Integer> orders);

    public IMenu eatPizza();

    public IMenu payPizza();

    public IPizza getPizza(int index);
}
