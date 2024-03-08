package practik1;

public class Chokolate extends Product {

    private double gram;
    private String typeOfChocolate;
    
    public double getGram() {
        return gram;
    }

    public void setGram(double gram) {
        this.gram = gram;
    }

    public String getTypeOfChocolate() {
        return typeOfChocolate;
    }

    public void setFat(String typeOfChocolate) {
        this.typeOfChocolate = typeOfChocolate;
    }

    public Chokolate (String brand, String name, double price, double gram, String typeOfChocolate){
        super(brand, name, price);
        this.gram = gram;
        this.typeOfChocolate = typeOfChocolate;
    }

    public String displayInfo(){
        return String.format("Шоколадка\n\t[Производитель: %s\n\tНаименование: %s\n\tСтоимость: %.2f\n\tГрамм: %.2f\n\tТип шоколада: %s",
                brand, name, price, gram, typeOfChocolate);
    }


}