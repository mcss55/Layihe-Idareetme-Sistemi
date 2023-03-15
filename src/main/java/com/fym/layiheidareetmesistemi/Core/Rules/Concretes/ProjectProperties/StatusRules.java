package com.fym.layiheidareetmesistemi.Core.Rules.Concretes.ProjectProperties;

import com.fym.layiheidareetmesistemi.Core.DTO.Request.ProjectProperties.StatusRegistrationRequest;
import com.fym.layiheidareetmesistemi.Core.Exceptions.ProjectProperties.StatusException;
import com.fym.layiheidareetmesistemi.Core.Rules.Abstracts.ProjectProperties.IStatusRules;

public class StatusRules implements IStatusRules {
    @Override
    public void checkNameLength(StatusRegistrationRequest status) {
        if(status.getName().length() < 3 || status.getName().length() > 50) {
            throw new StatusException("Ad 3 simvoldan az ola bilməz");
        }
    }

    @Override
    public void checkNullFields(StatusRegistrationRequest status) {
        if(status.getName() == null) {
            throw new StatusException("Ad boş ola bilməz");
        }
    }
}
