package com.naoki.model;

/**
 * Created by niwane on 7/10/14.
 */
public class BookingRecord {
    private String firstName;
    private String lastName;
    private String birthday;
    private String something;
    public BookingRecord() {
    }

    public BookingRecord(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
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
