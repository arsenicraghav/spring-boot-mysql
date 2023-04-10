package org.springboot.api.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;

@Builder
@Getter
@AllArgsConstructor
public class Account {

    int accountId;
    int empId;
    int customerId;
    String branchName;
    String startYear;
}
