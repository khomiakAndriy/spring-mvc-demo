package com.luv2code.springdemo.mvc;


import javax.validation.constraints.*;

public class Customer {
    private String firstName;
    @NotNull (message = "is required")
    @Size (min = 1, message = "is required")
    private String lastName;

    @NotNull (message = "is required")
    @Min(value = 0, message = "must be greater tnen or equel to 0 ")
    @Max(value = 10, message = "must be less tnen or equel to 10 ")
    private int freePasses;

    @Pattern(regexp = "^[a-zA-Z0-9]{5}", message = "only 5 chars/digits")
    private String postalCode;

    public String getPostalCode() {
        return postalCode;
    }

    public void setPostalCode(String postalCode) {
        this.postalCode = postalCode;
    }

    public int getFreePasses() {
        return freePasses;
    }

    public void setFreePasses(int freePasses) {
        this.freePasses = freePasses;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
}
