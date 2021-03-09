package kg.megacome.course.goods;

import kg.megacome.course.enums.LevelOfValidality;

import java.time.Period;

public class MilkGoods extends ProductsInMarket{

    private LevelOfValidality milkValidality;

    public MilkGoods(String nameOfPoduct, Period sellByDate, int amountOfGoods, LevelOfValidality milkValidality) {
        super(nameOfPoduct, sellByDate, amountOfGoods);
    this.milkValidality=milkValidality;
    }

    public LevelOfValidality getMilkValidality() {
        return milkValidality;
    }

    public void setMilkValidality(LevelOfValidality milkValidality) {
        this.milkValidality = milkValidality;
    }
}
