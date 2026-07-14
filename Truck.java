public class Truck extends Vehicle {
    private double cargoCapcity:
    public Truck (String ownerName, String brand, String model, int year, double cargoCapcity){
        super(ownerName, brand, model, year);
        this.cargoCapcity = cargoCapcity;
    }
    public void setcargoCapcity(double cargoCapcity){
        this.cargoCapcity = cargoCapcity;
    }

    public int getcargoCapcity(){
        return cargoCapcity;
    }

    @Override
    public void displayInfo(){
        System.out.println("owner : " + getownerName());
        System.out.println("Truck :" + getbrand() + "model : " getmodel() + "year : " getyear() + "Seating Capacity :" getcargoCapcity());
        System.out.println("Cargo Capacity :" + cargoCapcity + "tons");
    }
}