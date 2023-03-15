package com.fym.layiheidareetmesistemi.Core.Rules.Concretes.Project;

import com.fym.layiheidareetmesistemi.Core.DTO.Request.Project.ProjectRegistrationRequest;
import com.fym.layiheidareetmesistemi.Core.Exceptions.Project.ProjectException;
import com.fym.layiheidareetmesistemi.Core.Rules.Abstracts.Project.IProjectRules;

public class ProjectRules implements IProjectRules{
    @Override
    public void checkProjectNameLength(ProjectRegistrationRequest project) {
        if (project.getProjectName().length() < 3)
            throw new ProjectException("Pryektin ad uzunluğu minimum 3 olmalıdır!");
    }

    @Override
    public void checkRegistrationDateLength(ProjectRegistrationRequest project) {
        if (project.getRegistrationDate().length() < 7)
            throw new ProjectException("Qeydiyyat tarixi uzunluğu minimum 7 olmalıdır!");
    }

    @Override
    public void checkLbmLength(ProjectRegistrationRequest project) {
        if (project.getLbm().length() < 3)
            throw new ProjectException("LBM uzunluğu minimum 3 olmalıdır!");
    }

    @Override
    public void checkAboutLength(ProjectRegistrationRequest project) {
        if (project.getAbout().length() < 3)
            throw new ProjectException("Haqqında uzunluğu minimum 3 olmalıdır!");
    }

    @Override
    public void checkNoteLength(ProjectRegistrationRequest project) {
                if (project.getNote().length() < 3)
            throw new ProjectException("Qeyd uzunluğu minimum 3 olmalıdır!");

    }

    @Override
    public void checkSettlementAndVillageLength(ProjectRegistrationRequest project) {
        if (project.getSettlementAndVillage().length() < 3)
            throw new ProjectException("Qeyd uzunluğu minimum 3 olmalıdır!");
    }

    @Override
    public void checkBuildingAndHouseLength(ProjectRegistrationRequest project) {
        if (project.getBuildingAndHouse().length() < 3)
            throw new ProjectException("Ev və tikili ad uzunluğu minimum 3 olmalıdır!");
    }

    @Override
    public void checkExpirationDateLength(ProjectRegistrationRequest project) {
        if (project.getExpirationDate().length() < 7)
            throw new ProjectException("Bitmə tarixi uzunluğu minimum 7 olmalıdır!");
    }

    @Override
    public void checkNullFields(ProjectRegistrationRequest project) {
        if (project.getProjectName() == null)
            throw new ProjectException("Pryektin adı boş ola bilməz!");
        if (project.getRegistrationDate() == null)
            throw new ProjectException("Qeydiyyat tarixi boş ola bilməz!");
        if (project.getLbm() == null)
            throw new ProjectException("LBM boş ola bilməz!");
        if (project.getAbout() == null)
            throw new ProjectException("Haqqında boş ola bilməz!");
        if (project.getNote() == null)
            throw new ProjectException("Qeyd boş ola bilməz!");
        if (project.getSettlementAndVillage() == null)
            throw new ProjectException("Qeyd boş ola bilməz!");
        if (project.getBuildingAndHouse() == null)
            throw new ProjectException("Ev və tikili adı boş ola bilməz!");
        if (project.getExpirationDate() == null)
            throw new ProjectException("Bitmə tarixi boş ola bilməz!");
    }
}
