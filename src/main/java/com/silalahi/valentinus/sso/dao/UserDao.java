package com.silalahi.valentinus.sso.dao;

import org.springframework.data.repository.PagingAndSortingRepository;

import com.silalahi.valentinus.sso.entity.User;

public interface UserDao extends PagingAndSortingRepository<User, String> {

	User findByUserName(String username);

}
