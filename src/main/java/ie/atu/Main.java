package ie.atu;

public class Main {
    public static void main(String[] args) {
        Person myPerson = new Person("Eoin","cortoon","122445");
        System.out.println(myPerson.toString());

        Customer myCustomer = new Customer("Eoin","cortoon","1234","1234",true);
        System.out.println(myCustomer.toString());
    }
}