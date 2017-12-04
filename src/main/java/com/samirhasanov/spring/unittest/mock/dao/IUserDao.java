/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.samirhasanov.spring.unittest.mock.dao;

import com.samirhasanov.spring.unittest.mock.domain.User;
import java.util.List;

/**
 *
 * @author Hasanov (Asus)
 */
public interface IUserDao {
    public List<User> getAll();
    public User getById(Long id);
}
