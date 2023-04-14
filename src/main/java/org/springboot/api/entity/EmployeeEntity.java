package org.springboot.api.entity;

import lombok.Getter;

import javax.persistence.*;

@Entity
@Table(name = "employee")
@Getter
public class EmployeeEntity {
    @Id
    @Column(name = "emp_id")
    int empId;
    @Column(name = "emp_fname")
    String empFname;
    @Column(name = "emp_lname")
    String empLname;
    @Column(name = "emp_age")
    int empAge;
    @Column(name = "emp_email")
    String empEmail;
    @Column(name = "mobnum")
    long mobnum;
    @Column(name = "adress")
    String adress;
}
