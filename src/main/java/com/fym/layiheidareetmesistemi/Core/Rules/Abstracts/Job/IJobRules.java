package com.fym.layiheidareetmesistemi.Core.Rules.Abstracts.Job;

import com.fym.layiheidareetmesistemi.Core.DTO.Request.Job.JobRegistrationRequest;

public interface IJobRules {
    void checkJobNameLength(JobRegistrationRequest job);
    void checkNullFields(JobRegistrationRequest job);
}
