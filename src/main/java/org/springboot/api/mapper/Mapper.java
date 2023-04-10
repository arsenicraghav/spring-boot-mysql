package org.springboot.api.mapper;

import org.springboot.api.dto.Account;
import org.springboot.api.dto.Customer;
import org.springboot.api.dto.Employee;
import org.springboot.api.entity.AccountEntity;
import org.springboot.api.entity.CustomerEntity;
import org.springboot.api.entity.EmployeeEntity;

public class Mapper {
    public static Account map(AccountEntity a) {
        return Account.builder()
                .accountId(a.getAccountId())
                .branchName(a.getAccBranchName())
                .empId(a.getEmpId())
                .customerId(a.getCustomerId())
                .startYear(a.getAcountStart())
                .build();
    }

    public static Customer map(CustomerEntity c) {
        return Customer.builder()
                .empId(c.getEmpId())
                .custId(c.getCustomerId())
                .firstName(c.getCustomerFname())
                .lastName(c.getCustomerLname())
                .email(c.getCustomerEmail())
                .address(c.getCustomerAddress())
                .age(c.getCustomerAge())
                .mobileNumber(c.getCustomerMobno())
                .build();
    }

    public static Employee map(EmployeeEntity e) {

        return Employee.builder()
                .employeeId(e.getEmpId())
                .firstName(e.getEmpFname())
                .lastName(e.getEmpLname())
                .email(e.getEmpEmail())
                .age(e.getEmpAge())
                .address(e.getAdress())
                .mobileNumber(e.getMobnum())
                .build();
    }
}