package com.fym.layiheidareetmesistemi.Core.Rules.Abstracts.Project;

import com.fym.layiheidareetmesistemi.Core.DTO.Request.Project.ProjectRegistrationRequest;

public interface IProjectRules {

    void checkProjectNameLength(ProjectRegistrationRequest project);
    void checkRegistrationDateLength(ProjectRegistrationRequest project);
    void checkLbmLength(ProjectRegistrationRequest project);
    void checkAboutLength(ProjectRegistrationRequest project);
    void checkNoteLength(ProjectRegistrationRequest project);
    void checkSettlementAndVillageLength(ProjectRegistrationRequest project);
    void checkBuildingAndHouseLength(ProjectRegistrationRequest project);

    void checkExpirationDateLength(ProjectRegistrationRequest project);

     void checkNullFields(ProjectRegistrationRequest project);


}
