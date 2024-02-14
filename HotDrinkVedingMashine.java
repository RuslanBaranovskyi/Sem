package ДЗ;

import java.util.List;

public class HotDrinkVedingMashine implements VedingMashine{
    private final List<HotDrink> hotDrinksList;

    public HotDrinkVedingMashine(List<HotDrink> hotDrinksList){
        this.hotDrinksList = hotDrinksList;

    }

    @Override
    public HotDrink getProduct(String name){
        for (HotDrink product : hotDrinksList){
            if (product.getName().equals(name)){
                product.getVolume();
                return product;
            }
        }
        return null;
    }


     public HotDrinkWithTemp getProduct(String name, int volume, int temp){
        for(HotDrink product : hotDrinksList){
            if (product instanceof HotDrinkWithTemp){
                if (product.getName().equals(name)&& ((HotDrinkWithTemp) product).getVolume()==volume && ((HotDrinkWithTemp) product).getTemp() == temp){
                    return (HotDrinkWithTemp) product;
                }
            }
        }
        return null;
    }


}

