package org.liz.test.controllers;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.liz.test.models.User;
import org.liz.test.services.UserService;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.mockito.Mockito.*;

@ExtendWith(MockitoExtension.class)
public class UserControllerTest {
    @Mock
    UserService userService;

    @InjectMocks
    UserController userController;

    @Before
    public void setup(){
        MockitoAnnotations.initMocks(this);
    }

    @Test
    public void getUserTest(){
        User user = userController.getUser(31);
        Mockito.verify(userService).getUser(31);
    }

    @Test
    public void getUserObjectTest(){
        User userMock = new User();
        userMock.setId(31);
        userMock.setName("Silvio");
        userMock.setPassword("Silvio");

        when(userService.getUser(11)).thenReturn(userMock);

        User user = userController.getUser(11);
//        Assert.assertNull(user);
        Assert.assertEquals(user, userMock);

    }

    @Test(expected = IllegalArgumentException.class)
    public void getUserTestShouldThrowError(){
        when(userService.getUser(null)).thenThrow(new IllegalArgumentException("Error to argument"));
        User user = userController.getUser(null);
    }

    @Test
    public void deleteUserTest(){
        userController.removeUser(31);
        verify(userService).remove(31);
    }
    @Test
    public void deleteManyUser(){
        Integer[] ids = {1, 2, 3};
        userController.removeManyUser(ids);

        verify(userService, atLeast(2)).remove(anyInt());
//        verify(userService, atMost(2)).remove(anyInt());
    }

}
