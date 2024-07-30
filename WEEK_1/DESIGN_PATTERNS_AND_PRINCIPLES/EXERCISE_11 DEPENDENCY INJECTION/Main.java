package dependency;

public class Main {
    public static void main(String[] args) {
        // Create an instance of CustomerRepositoryImpl
        CustomerRepository repository = new CustomerRepositoryImpl();

        // Inject the repository into CustomerService
        CustomerService service = new CustomerService(repository);

        // Use the service to get customer details
        String customer = service.getCustomer(1);
        System.out.println(customer); // Output: Customer with ID: 1
    }
}
