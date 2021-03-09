package kg.megacome.course.goods;

import kg.megacome.course.enums.LevelOfValidality;

import java.time.Period;

public class AlcocholDrinks extends ProductsInMarket {
    private LevelOfValidality alcholoVal;

    public LevelOfValidality getAlcholoVal() {
        return alcholoVal;
    }

    public void setAlcholoVal(LevelOfValidality alcholoVal) {
        this.alcholoVal = alcholoVal;
    }

    public AlcocholDrinks(String nameOfPoduct, Period sellByDate, int amountOfGoods, LevelOfValidality alcholoVal) {
        super(nameOfPoduct, sellByDate, amountOfGoods);
        this.alcholoVal = alcholoVal;
    }
}

