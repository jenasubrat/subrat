package com.neosoft.service;

import java.util.HashSet;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import com.neosoft.dao.ProjectDao;
import com.neosoft.dao.RoleDao;
import com.neosoft.dao.UserDao;
import com.neosoft.entity.Project;
import com.neosoft.entity.Role;
import com.neosoft.entity.User;

@Service
public class UserService {

	@Autowired
	private UserDao userDao;

	@Autowired
	private RoleDao roleDao;

	@Autowired
	private ProjectDao projectDao;

	@Autowired
	private PasswordEncoder passwordEncoder;

	public User registerNewUser(User user) {
		Role role = roleDao.findById("User").get();
		Set<Role> roles = new HashSet<Role>();
		roles.add(role);
		user.setRole(roles);
		user.setUserPassword(getEncodedPassword(user.getUserPassword()));
		return userDao.save(user);
	}

	public void initRolesAndUser() {
		Role adminRole = new Role();
		adminRole.setRoleName("Admin");
		adminRole.setRoleDescription("Admin role");
		roleDao.save(adminRole);

		Role userRole = new Role();
		userRole.setRoleName("User");
		userRole.setRoleDescription("Default role for newly created record");
		roleDao.save(userRole);

		Project adminProject = new Project();
		adminProject.setProjName("java");
		adminProject.setDuration("2 years");
		projectDao.save(adminProject);

		Project userProject = new Project();
		userProject.setProjName("sql");
		userProject.setDuration("2 years");
		projectDao.save(userProject);

		User adminUser = new User();
		adminUser.setUserName("admin123");
		adminUser.setUserPassword(getEncodedPassword("admin@pass"));
		adminUser.setUserFirstName("admin");
		adminUser.setUserLastName("admin");
		Set<Project> adminProjects = new HashSet<>();
		adminProjects.add(adminProject);
		adminUser.setProjects(adminProjects);
		Set<Role> adminRoles = new HashSet<>();
		adminRoles.add(adminRole);
		adminUser.setRole(adminRoles);
		userDao.save(adminUser);

		/*
		 * User user = new User(); user.setUserName("kalyan123");
		 * user.setUserPassword(getEncodedPassword("kalyan@pass"));
		 * user.setUserFirstName("kalyan"); user.setUserLastName("nandaluri");
		 * Set<Project> userProjects = new HashSet<>(); userProjects.add(userProject);
		 * user.setProjects(userProjects); Set<Role> userRoles = new HashSet<>();
		 * userRoles.add(userRole); user.setRole(userRoles); userDao.save(user);
		 */

	}

	public String getEncodedPassword(String password) {
		return passwordEncoder.encode(password);
	}
}
