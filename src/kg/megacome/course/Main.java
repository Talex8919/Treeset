package kg.megacome.course;

import kg.megacome.course.comparators.MilkGoodsComparator;
import kg.megacome.course.enums.LevelOfValidality;
import kg.megacome.course.goods.AlcocholDrinks;
import kg.megacome.course.goods.MilkGoods;
import kg.megacome.course.goods.NotAlchohol;
import kg.megacome.course.goods.ProductsInMarket;

import java.time.LocalDate;
import java.time.Period;
import java.util.*;

public class Main {

    public static void main(String[] args) {
        LocalDate startDayOfCola= LocalDate.of(2020,8,25);
        LocalDate endDateOfCola= LocalDate.of(2021, 3,25);
        Period sellByDateCola = Period.between(startDayOfCola,endDateOfCola);

        LocalDate startDayOfPepsi= LocalDate.of(2020,9,20);
        LocalDate endDateOfPepsi= LocalDate.of(2021, 11,20);
        Period sellByDatePepsi = Period.between(startDayOfPepsi,endDateOfPepsi);

        LocalDate startDayOfFanta= LocalDate.of(2020,11,25);
        LocalDate endDateOfFanta= LocalDate.of(2021, 9,25);
        Period sellByDateFanta = Period.between(startDayOfFanta,endDateOfFanta);

        LocalDate startDayOfSprite= LocalDate.of(2020,10,25);
        LocalDate endDateOfSprite= LocalDate.of(2021, 9,25);
        Period sellByDateSprite = Period.between(startDayOfSprite,endDateOfSprite);

        LocalDate startDayOfMirinda= LocalDate.of(2020,8,25);
        LocalDate endDateOfMirinda= LocalDate.of(2021, 12,25);
        Period sellByDateMirinda = Period.between(startDayOfMirinda,endDateOfMirinda);

        LocalDate startDayOfHennesy= LocalDate.of(2020,8,25);
        LocalDate endDateOfHennesy= LocalDate.of(2021, 8,25);
        Period sellByDateHennesy = Period.between(startDayOfHennesy,endDateOfHennesy);


        LocalDate startDayOfJackDaniels= LocalDate.of(2020,8,25);
        LocalDate endDateOfJackDaniels= LocalDate.of(2021, 10,25);
        Period sellByDateJackDaniels = Period.between(startDayOfJackDaniels,endDateOfJackDaniels);

        LocalDate startDayOfBacardi= LocalDate.of(2020,8,25);
        LocalDate endDateOfBacardi= LocalDate.of(2021, 12,25);
        Period sellByDateBacardi = Period.between(startDayOfBacardi,endDateOfBacardi);

        LocalDate startDayOfCaptainMorgan= LocalDate.of(2020,1,25);
        LocalDate endDateOfCaptainMorgan= LocalDate.of(2021, 12,25);
        Period sellByDateCaptainMorgan = Period.between(startDayOfCaptainMorgan,endDateOfCaptainMorgan);

        LocalDate startDayOfCrownRoyal= LocalDate.of(2020,8,25);
        LocalDate endDateOfCrownRoyal= LocalDate.of(2021, 3,25);
        Period sellByDateCrownRoyal = Period.between(startDayOfCrownRoyal,endDateOfCrownRoyal);

        LocalDate startDayOfFreshFields= LocalDate.of(2021,2,25);
        LocalDate endDateOfFreshFields= LocalDate.of(2021, 3,25);
        Period sellByDateFreshFields = Period.between(startDayOfFreshFields,endDateOfFreshFields);



        LocalDate startDayOfDairyDames= LocalDate.of(2021,2,15);
        LocalDate endDateOfDairyDames= LocalDate.of(2021, 3,15);
        Period sellByDateDairyDames = Period.between(startDayOfDairyDames,endDateOfDairyDames);

        LocalDate startDayOfBeutifullFields= LocalDate.of(2021,2,19);
        LocalDate endDateOfBeutifullFields= LocalDate.of(2021, 3,25);
        Period sellByDateBeutifullFields = Period.between(startDayOfBeutifullFields,endDateOfBeutifullFields);

        LocalDate startDayOfBrillianBaunty= LocalDate.of(2020,8,25);
        LocalDate endDateOfBrillianBaunty= LocalDate.of(2021, 3,25);
        Period sellByDateBrillianBaunty = Period.between(startDayOfBrillianBaunty,endDateOfBrillianBaunty);



        LocalDate startDayOfBoldBaunty= LocalDate.of(2020,8,25);
        LocalDate endDayOfBoldBaunty= LocalDate.of(2021, 3,25);
        Period sellByDateBoldBaunty = Period.between(startDayOfBoldBaunty,endDayOfBoldBaunty);


        NotAlchohol pepsicola = new NotAlchohol("Pepsi",sellByDatePepsi, 250, LevelOfValidality.LONG );
        NotAlchohol cocaCola = new NotAlchohol("Coca-Cola No Sugar",sellByDateCola, 350, LevelOfValidality.LONG );
        NotAlchohol fanta = new NotAlchohol("Fanta ",sellByDateFanta, 150, LevelOfValidality.LONG );
        NotAlchohol sprite = new NotAlchohol("Sprite",sellByDateSprite, 200, LevelOfValidality.LONG );
        NotAlchohol mirinda = new NotAlchohol("Miranda",sellByDateMirinda, 130, LevelOfValidality.LONG );

        AlcocholDrinks hennesy= new AlcocholDrinks("Hennesy",sellByDateHennesy,300,LevelOfValidality.LONG);
        AlcocholDrinks jackDaniels= new AlcocholDrinks("Jack Daniels",sellByDateJackDaniels,250,LevelOfValidality.LONG);
        AlcocholDrinks bacardi= new AlcocholDrinks("Bacardi",sellByDateBacardi,300,LevelOfValidality.LONG);
        AlcocholDrinks captainMorgan= new AlcocholDrinks("Captain Morgan",sellByDateCaptainMorgan,100,LevelOfValidality.LONG);
        AlcocholDrinks crownRoyal= new AlcocholDrinks("Crown Royal",sellByDateCrownRoyal,450,LevelOfValidality.LONG);

        MilkGoods freshFields= new MilkGoods("Butter fat",sellByDateFreshFields, 500,LevelOfValidality.SHORT_PERIOD);
        MilkGoods dairydames= new MilkGoods("Powdered Milk",sellByDateDairyDames, 750,LevelOfValidality.SHORT_PERIOD);
        MilkGoods beatifullFieds= new MilkGoods("Yogurt ",sellByDateBeutifullFields, 1000,LevelOfValidality.SHORT_PERIOD);
        MilkGoods brilliantBounty= new MilkGoods("Pudding",sellByDateBrillianBaunty, 780,LevelOfValidality.SHORT_PERIOD);
        MilkGoods boldBaunty= new MilkGoods("Cream",sellByDateBoldBaunty, 350,LevelOfValidality.SHORT_PERIOD);


        Set<AlcocholDrinks> alcocholDrinksSet = new HashSet<>();
        alcocholDrinksSet.add(hennesy);
        alcocholDrinksSet.add(jackDaniels);
        alcocholDrinksSet.add(bacardi);
        alcocholDrinksSet.add(captainMorgan);
        alcocholDrinksSet.add(crownRoyal);

        System.out.println("check the size of list  "+alcocholDrinksSet.size());
        System.out.println("Check if  it  crownRoyal is in  list  "+alcocholDrinksSet.contains(crownRoyal));
        System.out.println("Check if  the list is empty  "+alcocholDrinksSet.isEmpty());
        System.out.println("removing bacardi from the list  " +alcocholDrinksSet.remove(bacardi));
        System.out.println(" size of it "+ alcocholDrinksSet.size());
        Iterator<AlcocholDrinks>alcocholDrinksIterator=alcocholDrinksSet.iterator();
        while(alcocholDrinksIterator.hasNext()) {
            System.out.println("Printing amount list after all operations "+ alcocholDrinksIterator.next());
        }

        System.out.println(   "size " + alcocholDrinksSet.size());
        System.out.println("____________________________ deviding the lists ");
Set<NotAlchohol> notAlchoholsLinkedSet= new LinkedHashSet<>();
        notAlchoholsLinkedSet.add(cocaCola);
        notAlchoholsLinkedSet.add(pepsicola);
        notAlchoholsLinkedSet.add(fanta);
        notAlchoholsLinkedSet.add(sprite);
        notAlchoholsLinkedSet.add(mirinda);

        System.out.println("check the size of list  "+notAlchoholsLinkedSet.size());
        System.out.println("Check if  it  Sprite is in  list  "+notAlchoholsLinkedSet.contains(sprite));
        System.out.println("Check if  the list is empty  "+notAlchoholsLinkedSet.isEmpty());
        System.out.println("removing bacardi from the list  " +notAlchoholsLinkedSet.remove(mirinda));
        System.out.println(" size of it "+ notAlchoholsLinkedSet.size());
        Iterator<NotAlchohol>notAlchoholsLinkedSets=notAlchoholsLinkedSet.iterator();
        while(notAlchoholsLinkedSets.hasNext()) {
            System.out.println("Printing amount list after all operations "+ notAlchoholsLinkedSets.next());
        }
        System.out.println(alcocholDrinksSet.removeAll(alcocholDrinksSet));
        System.out.println(   "size " + alcocholDrinksSet.size());

        System.out.println("Treeset task starts here: ");

        TreeSet<MilkGoods> milkTreeSet= new TreeSet<MilkGoods>(new MilkGoodsComparator());

        milkTreeSet.add(freshFields);
        milkTreeSet.add(dairydames);
        milkTreeSet.add(beatifullFieds);
        milkTreeSet.add(boldBaunty);
        milkTreeSet.add(brilliantBounty);
        System.out.println("Before we compare "+ milkTreeSet);
        System.out.println("____________");
        for (MilkGoods amountOf: milkTreeSet){
            System.out.println( amountOf.getAmountOfGoods()+" is number of "+ "products "+ amountOf.getNameOfPoduct());
        }
    }
}
