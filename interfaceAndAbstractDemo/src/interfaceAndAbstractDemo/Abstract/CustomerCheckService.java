package interfaceAndAbstractDemo.Abstract;

import interfaceAndAbstractDemo.Entities.Customer;

public interface CustomerCheckService {
    boolean checkIfRealPerson(Customer customer);
}
