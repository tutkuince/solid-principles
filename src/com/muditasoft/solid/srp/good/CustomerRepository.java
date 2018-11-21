package com.muditasoft.solid.srp.good;

public interface CustomerRepository {
    void create(Customer customer);

    void update(Customer customer);

    void delete(Customer customer);
}
