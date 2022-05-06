package com.company;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class CustomerTest {
    Address billingAddress;
    Address shippingAddress;
    Customer customer;

    @Before public void setUp() throws Exception {
        billingAddress = new Address("2908 Forest Rd","Apt104","KY","Kingswood","42069");
        shippingAddress = new Address("131 Waterloo Ave","","VA","Northtown","50041");
        customer = new Customer("John","Smith","jsmith11@email.com","555-481-3320", shippingAddress, billingAddress, false);
    }
    @Test
    public void shouldReturnBillingAddress() {
        customer.getBillingAddress();
        assertEquals(billingAddress, customer.getBillingAddress());
    }
    @Test
    public void shouldReturnShippingAddress() {
        customer.getShippingAddress();
        assertEquals(shippingAddress, customer.getShippingAddress());
    }
    @Test
    public void isCustomerVip() {
        customer.isVip();
        assertEquals(false, customer.isVip());
    }
}
