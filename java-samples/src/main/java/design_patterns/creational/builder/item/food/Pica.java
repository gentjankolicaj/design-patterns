package design_patterns.creational.builder.item.food;

public class Pica extends Food {
    @Override
    public String item() {
        return "Pica";
    }

    @Override
    public double price() {
        return 350;
    }
}
