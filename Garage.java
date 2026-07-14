public class Garage {
    private Vehicle [] vehicles;
    private int count;

    public Garage(){
        this.vehicles = new vehicles[100];
        this.count = 0;
    }

    public void addVehicle(Vehicle vehicle){
        if (count < vehicles.length ){
            vehicles[count] = vehicle;
            count++;
            System.out.println("Vehicle added to the garage");
        }else {
            System.out.println("Garage is full. can not add more Vehicle");
        }
    }

    public void updateVehicle(String brand, String model, int year, String newOwner, String currentOwner){
        boolean found = false;
        for( int i = 0; i < count ; i++){
            if(vehicles[i].getownerName.equalsIgnoreCase(currentOwner)){
                vehicles[i].setbrand(brand);
                vehicles[i].setmodel(model);
                vehicles[i].setyear(year);
                vehicles[i].setownerName(ownerName);
                System.out.println("Vehicle updateed successfully .");
                found = true;
                break;
            }

        }

        if(!found){
            System.out.println("Vehicle with owner " + crrentOwner + " not found. update failed.");
        }
    }

}


public void removeVehicle(String ownerName){
     boolean found = false;
        for( int i = 0; i < count ; i++){
             if(vehicles[i].getownerName().equalsIgnoreCase(currentOwner)){
                vehicles[i]. =  vehicles[count - 1];
                  vehicles[count - 1] = null;
                  count--;
                  System.out.println("Vehicle removed from the garage .");
                  found = true;
                  break;
             }
        }
        if(!found){
            System.out.println("Vehicle with owner " + crrentOwner + " not found. removal failed.");
        }

}

public void displayVehicles(){
    if(count == 0){
        System.out.println("The Garage is empty .");
    }else{
        for(int i = 0; i < count ; i++){
            vehicles[i]displayInfo();
            System.out.println();
        }
    }
}

public void displayVehiclDetails(String ownerName){
     boolean found = false;
        for( int i = 0; i < count ; i++){
             if(vehicles[i].getownerName().equalsIgnoreCase(currentOwner)){
                vehicles[i].displayInfo();
                found = true;
                  break;
             }
        }
        if(!found){
            System.out.println("Vehicle with owner " + crrentOwner + " not found.");
        }

}