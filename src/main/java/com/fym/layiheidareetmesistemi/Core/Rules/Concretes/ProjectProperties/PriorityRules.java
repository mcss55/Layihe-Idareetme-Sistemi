package com.fym.layiheidareetmesistemi.Core.Rules.Concretes.ProjectProperties;

import com.fym.layiheidareetmesistemi.Core.DTO.Request.ProjectProperties.PriorityRegistrationRequest;
import com.fym.layiheidareetmesistemi.Core.Rules.Abstracts.ProjectProperties.IPriorityRules;

public class PriorityRules implements IPriorityRules {
    @Override
    public void checkNameLength(PriorityRegistrationRequest request) {
        if (request.getName().length() < 3) {

            throw new IllegalArgumentException("Ad 3 simvoldan az ola bilməz");
        }
    }

    @Override
    public void checkOrderNumber(PriorityRegistrationRequest request) {
        if (request.getOrderNumber() < 1) {
            throw new IllegalArgumentException("Sıra nömrəsi 1-dən kiçik ola bilməz");
        }
    }


    @Override
    public void checkNullFields(PriorityRegistrationRequest request) {
        if (request.getName() == null || request.getOrderNumber() == null) {
            throw new IllegalArgumentException("Ad və ya sıra nömrəsi boş ola bilməz");
        }
    }
}
