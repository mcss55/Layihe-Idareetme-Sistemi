package com.fym.layiheidareetmesistemi.Core.Rules.Abstracts.RegionAndCity;

import com.fym.layiheidareetmesistemi.Core.DTO.Request.Job.JobRegistrationRequest;

public interface IRegionAndCityRules {
    void checkNameLength(JobRegistrationRequest job);
    void checkNullFields(JobRegistrationRequest job);
}
