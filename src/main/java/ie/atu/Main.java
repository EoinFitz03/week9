package ie.atu;

public class Main {
    public static void main(String[] args) {
        Customer myCustomer = new Customer("Eoin","cortoon","1234","1234",true);
        System.out.println(myCustomer.toString());

        Customer Customer2 = new Customer();

        Customer2.setName("john");
        Customer2.setAddress("tuam");
        Customer2.setNumber("09876");
        Customer2.setCustomerNumber("67899");
        Customer2.setMailingList(false);

        System.out.println(Customer2.toString());

    }


}