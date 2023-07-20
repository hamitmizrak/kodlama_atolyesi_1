package com.hamitmizrak.controller.api;

import com.hamitmizrak.business.dto.RegisterDto;
import com.hamitmizrak.business.services.IRegisterServices;
import com.hamitmizrak.controller.IRegisterApi;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import java.util.List;

// LOMBOK
@RequiredArgsConstructor

@RestController
@CrossOrigin
@RequestMapping("/register/v1/api")
public class RegisterApiImpl implements IRegisterApi {

    private final IRegisterServices iRegisterServices;

    // http://localhost:4444/register/v1/api/create
    @PostMapping("/create")
    @Override
    public RegisterDto registerCreate(RegisterDto registerDto) {
        return iRegisterServices.registerCreate(registerDto);
    }

    // http://localhost:4444/register/v1/api/list
    @GetMapping("/list")
    @Override
    public List<RegisterDto> registerList() {
        return iRegisterServices.registerList();
    }

} //end class
