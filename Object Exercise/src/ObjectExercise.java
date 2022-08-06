public class ObjectExercise {
    public static void main(String [] args) {
        HouseForSale house1 = new HouseForSale("LOT 2 Billberry St", "North Port", 4, 3, 2046, 439800);
        HouseForSale house2 = new HouseForSale("5721 SW 31st St", "Ocala", 3, 2, 1832, 311700, "$90 annually");
        HouseForSale house3 = new HouseForSale("1840 Bobcat Trl", "North Port", 3, 2, 1550, 475000, "$100 annually");
        HouseForSale house4 = new HouseForSale("893 SW 128th Ave", "Okeechobee", 4, 2, 2232, 599000);
        HouseForSale house5 = new HouseForSale("1206 SW Malaga Ave", "Port Saint Lucie", 4, 2, 2310, 495000);
        HouseForSale house6 = new HouseForSale("Port Charlotte", 3, 2, 2046, 439800);

        System.out.println("Thank you for checking out our listing!");
        String HouseForSaleString = house4.toString();
        System.out.println(HouseForSaleString);


        System.out.println("These cities are the same: " + house2.equals(house3));

        System.out.println(house4.getClass());


        System.out.println(house2.hashCode());
        System.out.println(house6.hashCode());
        System.out.println(house5.hashCode());
        System.out.println(house1.city.hashCode() == house3.city.hashCode());
    }
}
