package kg.megacome.course.goods;

import java.time.Period;

public  class ProductsInMarket {
    private String nameOfPoduct;
    private Period sellByDate;
    private int amountOfGoods;

    public String getNameOfPoduct() {
        return nameOfPoduct;
    }

    public void setNameOfPoduct(String nameOfPoduct) {
        this.nameOfPoduct = nameOfPoduct;
    }

    public Period getSellByDate() {
        return sellByDate;
    }

    public void setSellByDate(Period sellByDate) {
        this.sellByDate = sellByDate;
    }

    public int getAmountOfGoods() {
        return amountOfGoods;
    }

    public void setAmountOfGoods(int amountOfGoods) {
        this.amountOfGoods = amountOfGoods;
    }

    public ProductsInMarket(String nameOfPoduct, Period sellByDate, int amountOfGoods) {
        this.nameOfPoduct = nameOfPoduct;
        this.sellByDate = sellByDate;
        this.amountOfGoods = amountOfGoods;
    }

    @Override
    public String toString() {
        return "kg.megacome.course.goods.ProductsInMarket{" +
                "nameOfPoduct='" + nameOfPoduct + '\'' +
                ", sellByDate=" + sellByDate +
                ", amountOfGoods=" + amountOfGoods +
                '}';
    }
}
