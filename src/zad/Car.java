package zad;

public class Car {
    public final String producer;
    public final String model;
    public String type;
    public String color;
    public Double value;

    public Car(String producer, String model, String type, String color, Double value) {
        this.producer = producer;
        this.model = model;
        this.type = type;
        this.color = color;
        this.value = value;
    }

    public void displayDetails(){
        System.out.printf("Producer:\t%s\nModel:\t\t%s\nType:\t\t%s\nColor:\t\t%s\nValue:\t\t%s\n\n",
                this.producer, this.model, this.type, this.color, this.value);
    }
}
