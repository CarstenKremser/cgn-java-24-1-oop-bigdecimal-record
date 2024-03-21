package org.example.bankservice;

public record Client(
        String firstName,
        String lastName,
        int customerNumber
) {
}
