package dependency;

public class CustomerRepositoryImpl implements CustomerRepository {
    public String findCustomerById(int id) {
        return "Customer with ID: " + id;
    }

}
