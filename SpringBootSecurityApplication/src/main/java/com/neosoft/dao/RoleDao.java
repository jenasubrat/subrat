package com.neosoft.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.neosoft.entity.Role;

@Repository
public interface RoleDao extends CrudRepository<Role, String> {

}

