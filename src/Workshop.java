import javax.swing.JOptionPane;

public class Workshop {
    public static void main(String[] args) {
        Car opala = new Car("Golf", 1981, "250-S", 4882.22);
        opala.displayInfo();
    }
}

class Car {
    private final double price;
    private final int year;
    private final String model, engine;

    public Car(String model, int year, String engine, double price) {
        this.model = model;
        this.year = year;
        this.engine = engine;
        this.price = price;
    }

    void displayInfo() {
        JOptionPane.showMessageDialog(null, "Model: " + model +
                                                            "\nYear: " + year +
                                                            "\nEngine: " + engine +
                                                            "\nPrice: $ " + price);
    }
}