package com.fym.layiheidareetmesistemi.Core.Rules.Concretes.SettlementAndVillage;

import com.fym.layiheidareetmesistemi.Core.DTO.Request.SettlementAndVillage.SettlementAndVillageRegistrationRequest;
import com.fym.layiheidareetmesistemi.Core.Rules.Abstracts.SettlementAndVillage.ISettlementAndVillageRules;

public class SettlementAndVillageRules implements ISettlementAndVillageRules {
    @Override
    public void checkSettlementAndVillageName(SettlementAndVillageRegistrationRequest request) {
            if (request.getName().length() < 3)
                throw new IllegalArgumentException("Kənd və ya qəsəbə adı minimum 3 simvol olmalıdır");

    }

    @Override
    public void checkNullFields(SettlementAndVillageRegistrationRequest request) {
        if (request.getName() == null)
            throw new IllegalArgumentException("Kənd və ya qəsəbə adı boş ola bilməz");
    }
}
