package src;

import javax.swing.JOptionPane;

public class Workshop {
    public static void main(String[] args) {
        Car golf = new Car("Golf", 1981, "250-S", 4882.22);
        Car beetle = new Car("Beetle", 1978, "1600", 3882.25);
        Car nova = new Car("Nova", 1982, "151-S", 2743.24);

        String inputModel = JOptionPane.showInputDialog("Type a car model: ");

        if(inputModel != null) {
            if(inputModel.equalsIgnoreCase(golf.getModel())) {
                golf.displayInfo();
            } else if(inputModel.equalsIgnoreCase(beetle.getModel())) {
                beetle.displayInfo();
            } else if(inputModel.equalsIgnoreCase(nova.getModel())) {
                nova.displayInfo();
            } else {
                JOptionPane.showMessageDialog(null, "This car is not available.");
            }
        }
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

    public String getModel() {
        return model;
    }
}