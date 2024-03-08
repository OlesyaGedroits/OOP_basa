package practik1;

import java.util.ArrayList;
import java.util.Arrays;

public class Program {

    public static void main(String[] args) {

        Chocolate chokolate1 = new Chocolate("Комунарка", "Алёнка", 450, 150, "горький");
        System.out.println(chokolate1.displayInfo());

        Product chokolate2 = new Chocolate("Комунарка", "Алёнка", 650, 350, "молочный с орехами");
        System.out.println(chokolate2.displayInfo());

        BottleOfWater bottleOfWater1 = new BottleOfWater("Святой источник", "Вода без газов", 210, 0.5);
        System.out.println(bottleOfWater1.displayInfo());

        Product bottleOfMilk1 = new BottleOfMilk("Минская марка", "Молоко", 310, 0.5, 2.5);
        System.out.println(bottleOfMilk1.displayInfo());

        ArrayList<Product> list = new ArrayList<>();
        list.add(bottleOfMilk1);
        list.add(bottleOfWater1);
        list.add(chokolate1);
        list.add(chokolate2);
        list.add(new Chocolate("Спартак", "Алёшка", 410, 100, "молочный"));

        VendingMachine vendingMachine = new VendingMachine(list);
        Chocolate chocolateСhoice =  vendingMachine.getChokolate("горький", 250);
        if (chocolateСhoice != null){
            System.out.println("Вы выбрали: ");
            System.out.println(chocolateСhoice.displayInfo());
        }
        else {
            System.out.println("Такой шоколадки нет");
        }



    }

}
