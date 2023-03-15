package com.fym.layiheidareetmesistemi.Core.Rules.Concretes.NonWorkingDay;

import com.fym.layiheidareetmesistemi.Core.DTO.Request.NonWorkingDay.NonWorkingDayRegistrationRequest;
import com.fym.layiheidareetmesistemi.Core.Rules.Abstracts.NonWorkingDay.INonWorkingDayRules;

public class NonWorkingDayRules implements INonWorkingDayRules {
    @Override
    public void checkNullFields(NonWorkingDayRegistrationRequest days) {
        if(days.getDate() == null) {
            throw new IllegalArgumentException("Günler boş olamaz");
        }
    }
}
