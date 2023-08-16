package model;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
@Entity
public class Customer {
    @Id @GeneratedValue
    private int id;
    private String name;
    private String email;
    @OneToMany(mappedBy = "customer")
    private List<TheOrder> orders;

    public Customer(){};
    public Customer(String name, String email) {
        this.name = name;
        this.email = email;
    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public List<TheOrder> getOrders() {
        return orders;
    }
    public void setOrders(List<TheOrder> orders) {
        this.orders = orders;
    }
    @Override
    public String toString() {
        return "Customer [id=" + id + ", name=" + name + ", email=" + email + ", orders=" + orders.size() + "]";
    }
    
}
