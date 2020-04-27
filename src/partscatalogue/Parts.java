package partscatalogue;

public class Parts {
    String brand;
    String name;

    public Parts(String brand, String name) {
        this.brand = brand;
        this.name = name;
    }

    @Override
    public String toString() {
        return "brand='" + brand + '\'' +
                ", name='" + name + '\'';
    }
}
