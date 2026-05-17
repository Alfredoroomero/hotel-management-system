package manager;

import model.Customer;
import model.Hotel;

// This class handles customer-related operations.
public class CustomerManager {

    // Adds a new customer to the hotel if the ID is not already used
    public boolean addCustomer(Hotel hotel, Customer customer){

        if (findCustomerById(hotel, customer.getCustomerId()) != null){
            return false;
        }

        hotel.addCustomer(customer);
        return true;
    }

    //Searches for a customer by their ID
    public Customer findCustomerById(Hotel hotel, String customerId){

        for (Customer customer : hotel.getCustomers()){

            if (customer.getCustomerId().equals(customerId)){
                return customer;
            }
        }

        return null;
    }

    // Shows all customers in the hotel.
    public void showCustomers(Hotel hotel){
        hotel.showCustomers();
    }
}