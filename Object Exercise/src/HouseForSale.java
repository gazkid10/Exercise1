public class HouseForSale {
    String address;
    String city;
    int bedroom;
    int bathroom;
    int sqft;
    double price;
    String HOA;


    public HouseForSale(String address, String city, int bedroom, int bathroom, int sqft, double price, String HOA){
        this.address = address;
        this.city = city;
        this.bedroom = bedroom;
        this.bathroom = bathroom;
        this.sqft = sqft;
        this.price = price;
        this.HOA = HOA;

    }
    public HouseForSale(String address, String city, int bedroom, int bathroom, int sqft, double price){
        this.address = address;
        this.city = city;
        this.bedroom = bedroom;
        this.bathroom = bathroom;
        this.sqft = sqft;
        this.price = price;
        this.HOA = "None";
    }
    public HouseForSale(String city, int bedroom, int bathroom, int sqft, double price){
        this.city = city;
        this.bedroom = bedroom;
        this.bathroom = bathroom;
        this.sqft = sqft;
        this.price = price;
        this.HOA = "None";
        this.address = "Undisclosed, please contact the seller.";

    }
    @Override
    public String toString() {
        String returnValue = "";
        returnValue += "Address: " + this.address;
        returnValue += "\nCity: " + this.city;
        returnValue += "\nBedroom: " + this.bedroom;
        returnValue += "\nBathroom: " + this.bathroom;
        returnValue += "\nHouse size: " + this.sqft + "sqft";
        returnValue += "\nListed price: $" + this.price;
        returnValue += "\nHOA: " + this.HOA;
        return returnValue;
    }
    public boolean equals(Object obj) {
        if (!(obj instanceof HouseForSale)) return false;
        HouseForSale other = (HouseForSale) obj;
        if (!this.city.equals(other.city)) return false;
        return true;
    }
    public int hashCode() {
        return bedroom + bathroom + address.hashCode() + city.hashCode();
    }

}
