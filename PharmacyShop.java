public class PharmacyShop {

    private Address address;
    private Medicine[] medicines;
    private int medicineCount;
    private Owner owner;


    public PharmacyShop(Owner owner, Address address) {
        this.owner = owner;
        this.address = address;
        this.medicines = new Medicine[] {
                new Medicine("M001", "Paracetamol", 50.0, 100, "PharmaCorp", "B123", "15/08/2025"),
                new Medicine("M002", "Ibuprofen", 75.0, 80, "HealthMed", "B124", "10/12/2024"),
                new Medicine("M003", "Amoxicillin", 120.0, 50, "BioPharma", "B125", "20/05/2026"),
                new Medicine("M004", "Ciprofloxacin", 150.0, 60, "MedLife", "B126", "30/11/2025"),
                new Medicine("M005", "Metformin", 90.0, 70, "GlucoCare", "B127", "25/07/2024")
        };
    }

    public void updateMedicine(String id, int newQuantity, double newPrice) {
        for (Medicine medicine : medicines) {
            if (medicine.getMedicineId().equals(id)) {
                medicine.setPrice(newPrice);
                System.out.println("Medicine updated successfully.");
                return;
            }
        }
    }
}
