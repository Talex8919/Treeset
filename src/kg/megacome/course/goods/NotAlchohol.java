package kg.megacome.course.goods;

import kg.megacome.course.enums.LevelOfValidality;

import java.time.Period;

public class NotAlchohol extends ProductsInMarket {
    private LevelOfValidality notAlchoholVal;

    public NotAlchohol(String nameOfPoduct, Period sellByDate, int amountOfGoods,LevelOfValidality notAlchoholVal) {
        super(nameOfPoduct, sellByDate, amountOfGoods);
    this.notAlchoholVal= notAlchoholVal;
    }

    public LevelOfValidality getNotAlchoholVal() {
        return notAlchoholVal;
    }

    public void setNotAlchohol(LevelOfValidality notAlchohol) {
        this.notAlchoholVal = notAlchoholVal;
    }
}


