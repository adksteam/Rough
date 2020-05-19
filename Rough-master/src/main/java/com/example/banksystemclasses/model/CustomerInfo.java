package com.example.banksystemclasses.model;

//import com.sun.istack.NotNull;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Table(name = "Customers_info")
@SecondaryTables({
        @SecondaryTable(name = "customer", pkJoinColumns = @PrimaryKeyJoinColumn(name = "customerInfo_id")),
        @SecondaryTable(name = "customerContact", pkJoinColumns = @PrimaryKeyJoinColumn(name = "customerInfo_id"))
})
@Getter@Setter
public class CustomerInfo
{
    @Id
    @GeneratedValue
    @Column(name="Customer_Id")
    private Long id;

    //@NotNull(message="password must not be empty")
    @Column(name="Password")
    private String password;

    //@NotNull(message="Aadhaar Number must not be empty")
    @Column(name="Aadhaar_No")
    private String aadhaarNo;

    //@NotNull(message="PAN Number must not be empty")
    @Column(name="PAN_No")
    private String panNo;

    @Embedded
    Customer customer;

    @Embedded
    CustomerContact customerContact;
    


}
