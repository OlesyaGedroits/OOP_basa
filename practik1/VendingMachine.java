package practik1;

import java.util.List;

public class VendingMachine {

    private List<Product> products;

    public VendingMachine(List<Product> products){
        this.products = products;
    }

    public BottleOfWater getBottleOfWater(String name, double volume){
        for (Product product : products){
            if (product instanceof BottleOfWater){
                BottleOfWater ofWater = (BottleOfWater)product;
                if (ofWater.getName().equals(name) && ofWater.getVolume() == volume)
                    return ofWater;
            }
        }
        return null;
    }

    public Chocolate getChokolate(String typeOfChocolate, double gram){
            for (Product product : products){
                if (product instanceof Chocolate){
                    Chocolate choco = (Chocolate)product;
                    if (choco.getTypeOfChocolate().equals(typeOfChocolate) && choco.getGram() == gram)
                        return choco;
                }
            }
            return null;
        }
}
