package com.devd.spring.bookstoreaccountservice.repository;

import com.devd.spring.bookstoreaccountservice.model.Role;
import org.springframework.data.repository.CrudRepository;

/**
 * @author: Devaraj Reddy,
 * Date : 2019-05-17
 */
public interface RoleRepository extends CrudRepository<Role, Long> {
}