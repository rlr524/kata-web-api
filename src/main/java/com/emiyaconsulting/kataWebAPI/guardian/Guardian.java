package com.emiyaconsulting.kataWebAPI.guardian;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Guardian {
    @Id
    private String guardianId;
    private String lastName;
    private String firstName;
    private String relationship;
    private String email;

    public Guardian(String guardianId, String lastName, String firstName, String relationship, String email) {
        this.guardianId = guardianId;
        this.lastName = lastName;
        this.firstName = firstName;
        this.relationship = relationship;
        this.email = email;
    }

    public Guardian() {
    }

    public String getGuardianId() {
        return guardianId;
    }

    public void setGuardianId(String guardianId) {
        this.guardianId = guardianId;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getRelationship() {
        return relationship;
    }

    public void setRelationship(String relationship) {
        this.relationship = relationship;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
