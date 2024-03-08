package practik1;

public class BottleOfWater extends Product{

    private double volume;

    public double getVolume() {
        return volume;
    }

    public void setVolume(double volume) {
        this.volume = volume;
    }

    public BottleOfWater(String brand, String name, double price, double volume){
        super(brand, name, price);
        this.volume = volume;
    }

    @Override
    public String displayInfo() {
        return String.format("Бутылка с водой\n\tПроизводитель: %s\n\tНаименование: %s\n\tСтоимость: %.2f\n\tОбъем: %.2f",
                brand, name, price, volume);
    }
}
