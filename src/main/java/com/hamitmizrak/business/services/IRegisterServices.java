package com.hamitmizrak.business.services;

// E: Entity
// D: Dto

import com.hamitmizrak.business.dto.RegisterDto;
import com.hamitmizrak.data.entity.RegisterEntity;

import java.util.List;

public interface IRegisterServices {

    // Model Mapper
    public RegisterDto EntityToDto  (RegisterEntity registerEntity);
    public RegisterEntity DtoToEntity( RegisterDto registerDto);

    // Create
    public RegisterDto registerCreate(RegisterDto registerDto);

    // List
    public List<RegisterDto>  registerList();
}
