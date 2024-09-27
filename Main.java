import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Person person = new Person("Ahmed Khan", 123456789);
        Address address = new Address("lane no 1", "Karachi", "A12345");

        Medicine[] list = new Medicine[10];
        {
            list[0] = new Medicine("M001", "Paracetamol", 50.0, 100, "PharmaCorp", "B123");
            list[1] = new Medicine("M002", "Ibuprofen", 75.0, 80, "HealthMed", "B124");
            list[2] = new Medicine("M003", "Amoxicillin", 120.0, 50, "BioPharma", "B125");
        }


        /*System.out.println("Owner Details : ");
        person.displayInfo();
        System.out.println("\nShop Address : ");
        address.displayInfo();
        System.out.println("\n-----------------------\n");*/

        System.out.println("Available Medicines in the store");
        int count = 0;
        for(int i = 0; i < list.length; i++){
            if(list[i] != null){
                System.out.println(list[i]);
                count++;
            }
        }

        System.out.println("Select Anyone of below by their number");
        System.out.println("1. Add a new medicine.");
        System.out.println("2. Update existing medicine details.");
        System.out.println("3. Remove a medicine from the inventory.");
        System.out.println("4. Sell a medicine (reduce quantity and calculate revenue).");
        System.out.println("5. Display all available medicines.");
        System.out.println("6. Search for a medicine by ID or name.");
        System.out.println("7. Print total revenue from sales.");
        System.out.println("8. Identify and list expired medicines based on the current date.");

        int select;
        System.out.print("\nSelect an option: ");
        Scanner scanner = new Scanner(System.in);
        select = scanner.nextInt();

        switch (select){
            case 1: {
                System.out.print("Enter Medicine ID: ");
                list[count].setMedicineId(scanner.next());
                System.out.print("Enter Medicine Name: ");
                list[count].setName(scanner.next());
                System.out.print("Enter Price: ");
                list[count].setPrice(scanner.nextDouble());
                System.out.print("Enter Quantity: ");
                list[count].setQuantity(scanner.nextInt());
                System.out.print("Enter Manufacturer: ");
                list[count].setManufacturer(scanner.next());
                System.out.print("Enter Medicine Batch Number : ");
                list[count].setBatchNumber(scanner.next());
                break;
            }

            default: {
                System.out.println("Invalid option");
            }
        }

    }
}