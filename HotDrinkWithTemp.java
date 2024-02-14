package ДЗ;

public class HotDrinkWithTemp extends HotDrink {
    private int temp;

    public HotDrinkWithTemp(String name, int volume) {
        super(name, volume);
        this.temp = temp;
    }
    public int getTemp(){
        return temp;
    }
    public void setTemp(int temp){
        this.temp = temp;
    }
    @Override
    public String toString(){
        return "HotDrinkWithTemp{" + "Temp" + temp + ", name=" + getName() + '}';
    }
} 
