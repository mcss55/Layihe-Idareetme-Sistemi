package com.fym.layiheidareetmesistemi.Core.Rules.Concretes.StreetAndAvenue;

import com.fym.layiheidareetmesistemi.Core.DTO.Request.StreetAndAvenue.StreetAndAvenueRegistrationRequest;
import com.fym.layiheidareetmesistemi.Core.Exceptions.StreetAndAvenue.StreetAndAvenueException;
import com.fym.layiheidareetmesistemi.Core.Rules.Abstracts.StreetAndAvenue.IStreetAndAvenueRules;

public class StreetAndAvenueRules implements IStreetAndAvenueRules {
    @Override
    public void checkNameLength(StreetAndAvenueRegistrationRequest streetAndAvenue) {
        if (streetAndAvenue.getName().length() < 3)
            throw new StreetAndAvenueException("Küçə və ya rayonun adı 3 simvoldan az ola bilməz!");
    }

    @Override
    public void checkAssignmentLength(StreetAndAvenueRegistrationRequest streetAndAvenue) {
        if (streetAndAvenue.getAssignment().length() < 3)
            throw new StreetAndAvenueException("Küçə və ya rayonun təyinatı 3 simvoldan az ola bilməz!");
    }

    @Override
    public void checkNullFields(StreetAndAvenueRegistrationRequest streetAndAvenue) {
        if (streetAndAvenue.getName() == null)
            throw new StreetAndAvenueException("Küçə və ya rayonun adı boş ola bilməz!");
        if (streetAndAvenue.getAssignment() == null)
            throw new StreetAndAvenueException("Küçə və ya rayonun təyinatı boş ola bilməz!");
    }
}
