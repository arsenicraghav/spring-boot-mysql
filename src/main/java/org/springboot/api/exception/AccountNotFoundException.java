package org.springboot.api.exception;

public class AccountNotFoundException extends RuntimeException {

    public AccountNotFoundException(Integer id) {
        super("Account not found " + id);
    }
}
