package com.fym.layiheidareetmesistemi.Core.Rules.Abstracts.NonWorkingDay;

import com.fym.layiheidareetmesistemi.Core.DTO.Request.NonWorkingDay.NonWorkingDayRegistrationRequest;

public interface INonWorkingDayRules {
    void checkNullFields(NonWorkingDayRegistrationRequest days);
}
