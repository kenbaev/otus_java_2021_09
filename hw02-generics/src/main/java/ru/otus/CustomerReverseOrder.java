package ru.otus;


import java.util.ArrayDeque;
import java.util.Deque;

public class CustomerReverseOrder {
    private final Deque<Customer> stackCustomer = new ArrayDeque<>();

    public void add(Customer customer) {
        stackCustomer.push(customer);
    }

    public Customer take() {
        return stackCustomer.pop();
    }
}
