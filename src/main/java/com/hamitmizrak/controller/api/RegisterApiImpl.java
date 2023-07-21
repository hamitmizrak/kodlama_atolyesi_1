package com.hamitmizrak.controller.api;

import com.hamitmizrak.business.dto.RegisterDto;
import com.hamitmizrak.business.services.IRegisterServices;
import com.hamitmizrak.controller.IRegisterApi;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;
import java.util.List;

// LOMBOK
@RequiredArgsConstructor

// API
@RestController
@CrossOrigin
@RequestMapping("/register/v1/api")
public class RegisterApiImpl implements IRegisterApi {

    private final IRegisterServices iRegisterServices;

    // http://localhost:4444/register/v1/api/create
    @PostMapping(value = "/create",consumes = {"application/json"})
    @Override
    public ResponseEntity<RegisterDto> registerCreate(@RequestBody RegisterDto registerDto) {
        System.out.println(registerDto);
        return ResponseEntity.ok(iRegisterServices.registerCreate(registerDto));
    }

    // http://localhost:4444/register/v1/api/list
    @GetMapping("/list")
    @Override
    public ResponseEntity<List<RegisterDto>> registerList() {
        return ResponseEntity.ok(iRegisterServices.registerList()) ;
    }

} //end class
