package ru.otus;

import java.util.Map;
import java.util.TreeMap;
import java.util.AbstractMap;

public class CustomerService {
    private TreeMap<Customer, String> customerMap = new TreeMap<>();

    public Map.Entry<Customer, String> getSmallest() {
        var smallestCustomerEntry = customerMap.firstEntry();

        return getEntryWithCopyOfCustomer(smallestCustomerEntry);
    }

    public Map.Entry<Customer, String> getNext(Customer customer) {
        var nextCustomerEntry = customerMap.higherEntry(customer);

        return getEntryWithCopyOfCustomer(nextCustomerEntry);
    }

    private Map.Entry<Customer, String> getEntryWithCopyOfCustomer(Map.Entry<Customer, String> mapEntry) {
        if (null != mapEntry) {
            Customer customer = new Customer(mapEntry.getKey());

            return new AbstractMap.SimpleEntry<>(customer, mapEntry.getValue());
        } else {
            return null;
        }
    }

    public void add(Customer customer, String data) {
        customerMap.put(customer, data);
    }
}
