package org.springboot.api.entity;

import lombok.Getter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "customer")
@Getter
public class CustomerEntity {
    @Id
    @Column(name = "customer_id")
    int customerId;
    @Column(name = "customer_fname")
    String customerFname;
    @Column(name = "customer_lname")
    String customerLname;
    @Column(name = "customer_age")
    int customerAge;
    @Column(name = "customer_email")
    String customerEmail;
    @Column(name = "customer_mobno")
    long customerMobno;
    @Column(name = "customer_address")
    String customerAddress;
    @Column(name = "emp_id")
    int empId;
}
