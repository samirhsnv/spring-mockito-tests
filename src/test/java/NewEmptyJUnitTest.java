/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import com.samirhasanov.spring.unittest.mock.dao.IUserDao;
import com.samirhasanov.spring.unittest.mock.domain.User;
import com.samirhasanov.spring.unittest.mock.service.UserService;
import java.util.ArrayList;
import java.util.List;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import static org.mockito.Mockito.*;
import org.mockito.MockitoAnnotations;
import org.mockito.runners.MockitoJUnitRunner;

/**
 *
 * @author Hasanov (Asus)
 */
@RunWith(MockitoJUnitRunner.class)
public class NewEmptyJUnitTest {
    
    @Mock 
    private IUserDao userDao;
    
    @InjectMocks
    private UserService userService;
    
    public NewEmptyJUnitTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
//        MockitoAnnotations.initMocks(this);
    }
    
    @Test
    public void doTestGetAll() {
        List<User> users = new ArrayList<>();
        users.add(new User(1L, "Samir Hasanov"));
        users.add(new User(2L, "Murad Rzayev"));
        
        when(userDao.getAll()).thenReturn(users);
        
        List<User> result = userService.getAll();
        assertEquals(result.size(), 2);
    }
    
    @Test
    public void doTestGetById() {
        User samir = new User(1L, "Samir Hasanov");
        User murad = new User(2L, "Murad Rzayev");
        
        when(userDao.getById(1L)).thenReturn(samir);
        when(userDao.getById(2L)).thenReturn(murad);
        
        User result = userService.getById(2L);
        assertNotNull(result);
        assertEquals(result.getFullname(), "Murad Rzayev");
    }
    
    @After
    public void tearDown() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
}
