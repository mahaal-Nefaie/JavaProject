public class Car extends Vehicle {
    private int seatingCapcity:
    public Car (String ownerName, String brand, String model, int year, int seatingCapcity){
        super(ownerName, brand, model, year);
        this.seatingCapcity = seatingCapcity;
    }
    public void setseatingCapcity(int seatingCapcity){
        this.seatingCapcity = seatingCapcity;
    }

    public int getseatingCapcity(){
        return seatingCapcity;
    }

    @Override
    public void displayInfo(){
        System.out.println("owner : " + getownerName());
        System.out.println("Car :" + getbrand() + "model : " getmodel() + "year : " getyear() + "Seating Capacity :" getseatingCapcity());
        System.out.println("Seating Capacity :" + seatingCapcity);
    }
}