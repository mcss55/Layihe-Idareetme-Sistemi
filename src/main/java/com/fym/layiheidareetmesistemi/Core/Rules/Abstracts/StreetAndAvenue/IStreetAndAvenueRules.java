package com.fym.layiheidareetmesistemi.Core.Rules.Abstracts.StreetAndAvenue;

import com.fym.layiheidareetmesistemi.Core.DTO.Request.StreetAndAvenue.StreetAndAvenueRegistrationRequest;

public interface IStreetAndAvenueRules {

    void    checkNameLength(StreetAndAvenueRegistrationRequest streetAndAvenue);
    void checkAssignmentLength(StreetAndAvenueRegistrationRequest streetAndAvenue);
    void checkNullFields(StreetAndAvenueRegistrationRequest streetAndAvenue);
}

