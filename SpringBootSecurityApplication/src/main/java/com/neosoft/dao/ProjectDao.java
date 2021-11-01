package com.neosoft.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.neosoft.entity.Project;
@Repository
public interface ProjectDao extends CrudRepository<Project, String> {

}


