package com.hamitmizrak.business.services;

import com.hamitmizrak.bean.ModelMapperBean;
import com.hamitmizrak.business.dto.RegisterDto;
import com.hamitmizrak.data.entity.RegisterEntity;
import com.hamitmizrak.data.repository.IRegisterRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;

// LOMBOK
@RequiredArgsConstructor

@Service
public class RegisterServicesImpl implements IRegisterServices{


    /*
    @Autowired
    private  ModelMapperBean modelMapperBean;


      @Autowired
    public RegisterServicesImpl(ModelMapperBean modelMapperBean) {
        this.modelMapperBean = modelMapperBean;
    }
    */

    // INJECTION
    private final ModelMapperBean modelMapperBean;
    private final IRegisterRepository iRegisterRepository;


    // MODEL MAPPER
    @Override
    public RegisterDto EntityToDto(RegisterEntity registerEntity) {
        return modelMapperBean.modelMapperMethod().map(registerEntity,RegisterDto.class);
    }

    @Override
    public RegisterEntity DtoToEntity(RegisterDto registerDto) {
        return modelMapperBean.modelMapperMethod().map(registerDto,RegisterEntity.class);
    }

    // CREATE
    @Override
    @Transactional
    public RegisterDto registerCreate(RegisterDto registerDto) {
        if(registerDto!=null){
            RegisterEntity registerEntity=DtoToEntity(registerDto);
           RegisterEntity saveEntity= iRegisterRepository.save(registerEntity);
            registerDto.setId(saveEntity.getId());
        }
        return registerDto;
    }

    // LIST
    @Override
    public List<RegisterDto> registerList() {
     Iterable<RegisterEntity> registerEntitiesList=   iRegisterRepository.findAll();
     List<RegisterDto> registerDtoList=new ArrayList<>();
     for(RegisterEntity entity: registerEntitiesList){
         RegisterDto registerDto=EntityToDto(entity);
         registerDtoList.add(registerDto);
     }
     // Iterable To List
      return registerDtoList;
    }
}
