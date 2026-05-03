package manager;

import model.Customer;
import model.Hotel;

// This class handles customer-related operations.
public class CustomerManager {

    // Adds a new customer to the hotel.
    public void addCustomer(Hotel hotel, Customer customer){
        hotel.addCustomer(customer);
    }

    // Shows all customers in the hotel.
    public void showCustomers(Hotel hotel){
        hotel.showCustomers();
    }
}