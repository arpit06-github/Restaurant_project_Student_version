import java.util.ArrayList;

public class Item {
    private String name;
    private int price;

    public Item(String name, int price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {

        return name;
    }
    //TDD Changes
    public int getPrice() {
        return price;
    }
    //TDD Changes
    @Override
    public String toString(){
        return  name + ":"
                + price
                + "\n"
                ;
    }
}
