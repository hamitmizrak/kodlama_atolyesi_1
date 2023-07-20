package com.hamitmizrak.data.repository;

import com.hamitmizrak.data.entity.RegisterEntity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IRegisterRepository extends CrudRepository<RegisterEntity,Long> {
    // CRUD : Database
}
