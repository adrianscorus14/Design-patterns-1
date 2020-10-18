package fluentinterface;

public class Pizza implements IPizza {

    private int cost=52;


    @Override
    public IPizza getName() {
        return this;
    }

    @Override
    public IPizza getIngredients() {
        return this;
    }

    @Override
    public Integer getCost() {
        return this.cost;
    }
}
