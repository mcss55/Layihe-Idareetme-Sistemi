package com.fym.layiheidareetmesistemi.Core.Rules.Abstracts.ProjectProperties;

import com.fym.layiheidareetmesistemi.Core.DTO.Request.ProjectProperties.PriorityRegistrationRequest;

public interface IPriorityRules {

    void checkNameLength(PriorityRegistrationRequest request);
    void checkOrderNumber(PriorityRegistrationRequest request);
    void checkNullFields(PriorityRegistrationRequest request);
}
