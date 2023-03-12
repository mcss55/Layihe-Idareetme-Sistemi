package com.fym.layiheidareetmesistemi.Core.Utils.Mappers.Abstracts;

import org.modelmapper.ModelMapper;

public interface ModelService {
    ModelMapper forResponse();
    ModelMapper forRequest();
}
