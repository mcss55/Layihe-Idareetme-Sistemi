package com.fym.layiheidareetmesistemi.Core.Rules.Concretes.RegionAndCity;

import com.fym.layiheidareetmesistemi.Core.DTO.Request.Job.JobRegistrationRequest;
import com.fym.layiheidareetmesistemi.Core.Rules.Abstracts.RegionAndCity.IRegionAndCityRules;

public class RegionAndCityRules implements IRegionAndCityRules {
    @Override
    public void checkNameLength(JobRegistrationRequest job) {
            if (job.getJobName().length() < 3)
                throw new IllegalArgumentException("İş adı en az 3 uzunluğunda olmalıdır.");

    }

    @Override
    public void checkNullFields(JobRegistrationRequest job) {
        if (job.getJobName() == null)
            throw new IllegalArgumentException("İş adı boş ola bilməz!.");
    }
}
