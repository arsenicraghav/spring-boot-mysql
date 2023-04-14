package org.springboot.api.entity;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "account")
@Getter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class AccountEntity {
    @Id
    @Column(name = "account_id")
    int accountId;
    @Column(name = "emp_id")
    int empId;
    @Column(name = "customer_id")
    int customerId;
    @Column(name = "accbranch_name")
    String accBranchName;
    @Column(name = "acount_start")
    Integer acountStart;
}
