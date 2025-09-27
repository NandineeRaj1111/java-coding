public class polymorphing {
    public static void main(String[] args) {
        plane Plane = new plane();
        boat Boat = new boat();
        bike Bike= new bike();
        // Bike.go();
        // Plane.go();
        // Boat.go();
        vehicle[] Vehicle = {Bike,Boat,Plane};
        for(vehicle Vehicles: Vehicle){
            Vehicles.go();
        }

    }
    
}
