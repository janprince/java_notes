package Revision;


public class revision {
    public static void main(String args[]){

        // new Student object
        Student Prince = new Student(10839289, "prince", 23, 1);
        Prince.paying();
        Prince.changeName("Prince Jan Kumi");
        System.out.println("Id: " + Prince.name + " \npaid: " + Prince.paid + " \nYears Left to Complete: " + Prince.numYearsLeft());

        int sum = Student.sum(3, 6);
        System.out.println(sum);
    }
}
