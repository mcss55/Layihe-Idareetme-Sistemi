package com.fym.layiheidareetmesistemi.Core.Rules.Concretes.Customer;

import com.fym.layiheidareetmesistemi.Core.DTO.Request.Customer.CustomerRegistrationRequest;
import com.fym.layiheidareetmesistemi.Core.Exceptions.Customer.CustomerException;
import com.fym.layiheidareetmesistemi.Core.Rules.Abstracts.Customer.ICustomerRules;

public class CustomerRules implements ICustomerRules {
    @Override
    public void checkFirstNameLength(CustomerRegistrationRequest customer) {
        if (customer.getFirstName().length() < 3)
            throw new CustomerException("Müştəri adının uzunluğu minimum 3 olmalıdır!");
    }

    @Override
    public void checkLegalAddressLength(CustomerRegistrationRequest customer) {
        if (customer.getLegalAddress().length() < 3)
            throw new CustomerException("Müştəri adres adının uzunluğu minimum 3 olmalıdır!");
    }

    @Override
    public void checkActualAddressLength(CustomerRegistrationRequest customer) {
        if (customer.getActualAddress().length() < 3)
            throw new CustomerException("Müştəri adres adının uzunluğu minimum 3 olmalıdır!");
    }

    @Override
    public void checkPhoneNumberLength(CustomerRegistrationRequest customer) {
        if (customer.getPhoneNumber().length() != 10)
            throw new CustomerException("Müştəri telefon nömrəsinin uzunluğu 9 olamlıdır!");
    }

    @Override
    public void checkVoenLength(CustomerRegistrationRequest customer) {
        if (customer.getVoen().length() < 3)
            throw new CustomerException("Müştəri vöen adının uzunluğu minimum 3 olmalıdır!");
    }

    @Override
    public void checkNullFields(CustomerRegistrationRequest customer) {
        if (customer.getFirstName() == null) throw new CustomerException("Müştəri adı boş olmamalıdır!");
        if (customer.getPhoneNumber() == null) throw new CustomerException("Müştəri nömrəsi boş olmamalıdır!");
        if (customer.getVoen() == null) throw new CustomerException("Müştəri vöeni boş olmamalıdır!");
        if (customer.getActualAddress() == null) throw new CustomerException("Müştəri hazırkı adresi boş olmamalıdır!");
        if (customer.getLegalAddress() == null) throw new CustomerException("Müştəri rəsmi adresi boş olmamalıdır!");

    }
}
