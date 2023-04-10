package org.springboot.api.entity;


import lombok.Getter;

import javax.persistence.*;

@Entity
@Table(name = "account")
@Getter
public class AccountEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "account_id")
    int accountId;
    @Column(name = "emp_id")
    int empId;
    @Column(name = "customer_id")
    int customerId;
    @Column(name = "accbranch_name")
    String accBranchName;
    @Column(name = "acount_start")
    String acountStart;


}
