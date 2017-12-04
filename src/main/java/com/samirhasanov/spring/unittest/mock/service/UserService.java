/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.samirhasanov.spring.unittest.mock.service;

import com.samirhasanov.spring.unittest.mock.dao.IUserDao;
import com.samirhasanov.spring.unittest.mock.domain.User;
import java.util.List;

/**
 *
 * @author Hasanov (Asus)
 */
public class UserService implements IUserService {
    private final IUserDao userDao;
    
    public UserService(IUserDao userDao) {
        this.userDao = userDao;
    }
    
    @Override
    public List<User> getAll() {
        return this.userDao.getAll();
    }

    @Override
    public User getById(Long id) {
        return this.userDao.getById(id);
    }
    
}
