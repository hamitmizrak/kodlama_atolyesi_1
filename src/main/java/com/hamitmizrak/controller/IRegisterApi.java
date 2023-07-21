package com.hamitmizrak.controller;

import com.hamitmizrak.business.dto.RegisterDto;
import com.hamitmizrak.data.entity.RegisterEntity;
import org.springframework.http.ResponseEntity;

import java.util.List;

public interface IRegisterApi {

    // Create
    public ResponseEntity<RegisterDto>  registerCreate(RegisterDto registerDto);

    // List
    public ResponseEntity<List<RegisterDto>>  registerList();
}
