package com.example.banksystemclasses.model;


import lombok.Getter;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Embeddable;


@Embeddable
@Getter @Setter
public class CustomerContact {

    //@NotNull(message="Address Line-1 can not be empty.")
    @Column(name="Address",table = "customer_contact")
    //@Pattern(regexp="^[A-Za-z]+",message="Please enter Address in correct format.")
    private String address;


    //@NotNull(message="City cannot be null.")
    @Column(name="City", table = "customer_contact")
//    @Pattern(regexp="^[A-Za-z]+",message="Please enter city in correct format.")
    private String city;

    //@NotNull(message="ZIP Code can not be empty.")
    @Column(name="ZIP_Code",table = "customer_contact")
//    @Pattern(regexp="^[0-9]{6}",message="Please enter 6-Digit ZIP Code.")
    private String zipCode;

    //@NotNull(message="State can not be empty.")
    @Column(name="State",table = "customer_contact")
//    @Pattern(regexp="^[A-Za-z]+",message="Please enter State in correct format.")
    private String state;

    //@NotNull(message="Country can not be empty.")
    @Column(name="Country",table = "customer_contact")
    //@Pattern(regexp="^[A-Za-z]+",message="Please enter Country in correct format.")
    private String country;

    //@NotNull(message="Mobile_No must not be null")
    @Column(name="Mobile_No",table = "customer_contact")
//    @Pattern(regexp="^[0-9]{10}",message="Please enter 10-Digit Mobile No.")
    private String mobileNo;

    //@NotNull(message="Email should not be missing")
    //@Email(message="Email format should be like customer@db.com")
    @Column(name="Email",table = "customer_contact")
    private String email;


}
