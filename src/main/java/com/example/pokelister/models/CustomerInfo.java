package com.example.pokelister.models;

import javax.persistence.*;

@Entity
@Table(name = "customer")
public class CustomerInfo {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column
    private String firstName;

    @Column
    private String lastName;

    @Column
    private String billingAddress;

    @Column
    private String shippingAddress;

    @Column
    private String cellPhone;

    @OneToOne
    private User user;

    public CustomerInfo(User user){
        this.user = user;
    }

    public CustomerInfo(String firstName,
                        String lastName,
                        String billingAddress,
                        String shippingAddress,
                        String cellPhone) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.billingAddress = billingAddress;
        this.shippingAddress = shippingAddress;
        this.cellPhone = cellPhone;
    }

    public CustomerInfo() {

    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getBillingAddress() {
        return billingAddress;
    }

    public void setBillingAddress(String billingAddress) {
        this.billingAddress = billingAddress;
    }

    public String getShippingAddress() {
        return shippingAddress;
    }

    public void setShippingAddress(String shippingAddress) {
        this.shippingAddress = shippingAddress;
    }

    public String getCellPhone() {
        return cellPhone;
    }

    public void setCellPhone(String cellPhone) {
        this.cellPhone = cellPhone;
    }
}
