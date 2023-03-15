package com.fym.layiheidareetmesistemi.Core.Rules.Abstracts.Customer;

import com.fym.layiheidareetmesistemi.Core.DTO.Request.Customer.CustomerRegistrationRequest;

public interface ICustomerRules {

    void checkFirstNameLength(CustomerRegistrationRequest customer);
    void checkLegalAddressLength(CustomerRegistrationRequest customer);
    void checkActualAddressLength(CustomerRegistrationRequest customer);
    void checkPhoneNumberLength(CustomerRegistrationRequest customer);
    void checkVoenLength(CustomerRegistrationRequest customer);
    void checkNullFields(CustomerRegistrationRequest customer);
}
