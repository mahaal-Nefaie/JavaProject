public class Motorcycle extends Vehicle {
    private int engineSize:
    public Car (String ownerName, String brand, String model, int year, int engineSize){
        super(ownerName, brand, model, year);
        this.engineSize = engineSize;
    }
    public void setengineSize(int engineSize){
        this.engineSize = engineSize;
    }

    public int getengineSize(){
        return engineSize;
    }

    @Override
    public void displayInfo(){
        System.out.println("owner : " + getownerName());
        System.out.println("Car :" + getbrand() + "model : " getmodel() + "year : " getyear() + "Seating Capacity :" getengineSize());
        System.out.println("Engine Size: " + engineSize + " cc");
    }
}