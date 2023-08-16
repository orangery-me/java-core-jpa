package model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class TheOrder {
    @Id @GeneratedValue
    private int orderID;
    private String address;
    @ManyToOne()
    private Customer customer;
    public TheOrder(){}
    public TheOrder(String address, Customer customer) {
        this.address = address;
        this.customer = customer;
    }
    public int getOrderID() {
        return orderID;
    }
    public void setOrderID(int orderID) {
        this.orderID = orderID;
    }
    public String getAddress() {
        return address;
    }
    public void setAddress(String address) {
        this.address = address;
    }
    public Customer getCustomer() {
        return customer;
    }
    public void setCustomer(Customer customer) {
        this.customer = customer;
    }
    @Override
    public String toString() {
        return "TheOrder [orderID=" + orderID + ", address=" + address + ", customer id=" + customer.getId() + "]";
    };
    
}
