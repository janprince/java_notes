package Practice;

class Vehicle{
    int passengers;
    int mph;
    boolean renewable_energy;

    Vehicle(int num_of_passengers, int mph, boolean energy){
        passengers = num_of_passengers;
        this.mph = mph; // since both have same name, use "this" keyword to differentiate the instance variable.
        renewable_energy =energy;
    }

    int get_range(int distance){
        int range = distance * mph;
        return range;
    }
}