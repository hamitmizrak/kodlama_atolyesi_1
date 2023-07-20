package com.hamitmizrak.controller;

import com.hamitmizrak.business.dto.RegisterDto;
import com.hamitmizrak.data.entity.RegisterEntity;

import java.util.List;

public interface IRegisterApi {

    // Create
    public RegisterDto registerCreate(RegisterDto registerDto);

    // List
    public List<RegisterDto> registerList();
}
