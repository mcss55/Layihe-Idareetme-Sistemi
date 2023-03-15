package com.fym.layiheidareetmesistemi.Core.Rules.Abstracts.SettlementAndVillage;

import com.fym.layiheidareetmesistemi.Core.DTO.Request.SettlementAndVillage.SettlementAndVillageRegistrationRequest;

public interface ISettlementAndVillageRules {
    void  checkSettlementAndVillageName(SettlementAndVillageRegistrationRequest request);
    void checkNullFields(SettlementAndVillageRegistrationRequest request);
}
