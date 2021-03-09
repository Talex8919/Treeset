package kg.megacome.course.comparators;

import kg.megacome.course.goods.MilkGoods;

import java.util.Comparator;

public class MilkGoodsComparator implements Comparator<MilkGoods> {
    @Override
    public int compare(MilkGoods o1, MilkGoods o2) {
        return o1.getAmountOfGoods()- o2.getAmountOfGoods();
    }
}
