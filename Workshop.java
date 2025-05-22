import javax.swing.JOptionPane;

public class Workshop {
    public static void main(String[] args) {
        Car beetle = new Car("Beetle", 1978, "1600", 5776.48);
        beetle.displayInfo();
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