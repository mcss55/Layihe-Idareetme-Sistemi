package com.fym.layiheidareetmesistemi.Core.Rules.Abstracts.ProjectProperties;

import com.fym.layiheidareetmesistemi.Core.DTO.Request.ProjectProperties.StatusRegistrationRequest;

public interface IStatusRules {
    void checkNameLength(StatusRegistrationRequest status);
    void checkNullFields(StatusRegistrationRequest status);
}
