package fluentinterface;

public class Restaurant implements IRestaurant {
    private String nume;

    public Restaurant(String nume){
        this.nume=nume;
    }

    @Override
    public IRestaurant select() {
        System.out.println("Enter in Restaurant "+ nume);
        return this;
    }

    @Override
    public IMenu getMenu() {
//        MenuImplementation menu=new MenuImplementation();
//        return menu;
        return null;
    }
}
