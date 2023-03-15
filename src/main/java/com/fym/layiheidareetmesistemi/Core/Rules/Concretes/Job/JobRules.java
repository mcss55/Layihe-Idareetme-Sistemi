package com.fym.layiheidareetmesistemi.Core.Rules.Concretes.Job;
import com.fym.layiheidareetmesistemi.Core.DTO.Request.Job.JobRegistrationRequest;
import com.fym.layiheidareetmesistemi.Core.Exceptions.Job.JobException;
import com.fym.layiheidareetmesistemi.Core.Rules.Abstracts.Job.IJobRules;

public class JobRules implements IJobRules {
    @Override
    public void checkJobNameLength(JobRegistrationRequest job) {
        if (job.getJobName().length() < 3)
            throw new JobException("İş adı uzunluğu minimum 3 olmalıdır!");
    }

    @Override
    public void checkNullFields(JobRegistrationRequest job) {
        if (job.getJobName() == null)
            throw new JobException("İşin adı boş ola bilməz!");
    }
}
