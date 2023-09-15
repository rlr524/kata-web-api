package com.emiyaconsulting.kataWebAPI.guardian;

import java.util.ArrayList;

public class GuardianRepository {
    private final ArrayList<Guardian> guardians;

    public GuardianRepository() {
        this.guardians = new ArrayList<Guardian>();
        this.guardians.add(new Guardian("202302011", "Guardian",
                "Gary", "Father", "garyguardian@kata.com"));
    }

    public ArrayList<Guardian> getGuardians() {
        return this.guardians;
    }
}
