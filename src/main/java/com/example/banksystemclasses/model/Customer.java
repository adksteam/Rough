package com.example.banksystemclasses.model;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.Date;

@Embeddable
@Getter @Setter

public class Customer
{
    //@NotNull(message="First_Name must not be empty")
    @Column(name="First_Name")

    private String firstName;

    //@NotNull(message="Last_Name must not be empty")
    @Column(name="Last_Name")
    private String lastName;

    //@NotNull(message="Date should not be null.")
    @Column(name="DOB")
    @Temporal(TemporalType.DATE)
    private Date dob;


}
