package org.liz.test.controllers;

import org.junit.Before;
import org.junit.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.liz.test.services.RoverService;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.mockito.Mockito.*;

@ExtendWith(MockitoExtension.class)
public class RoverControllerTest {

    @Mock
    RoverService roverService;

    @InjectMocks
    private RoverController roverController;

    @Before
    public void setup(){
        MockitoAnnotations.initMocks(this);
    }

    @Test
    public void sendCommandTes(){
        roverController.sendCommand("ADAA",2);

        verify(roverService).executeCommand("ADAA",2);
    }

    @Test(expected = IllegalArgumentException.class)
    public void sendCommandNullTes(){
        roverController.sendCommand("A", null);

        verify(roverService, never()).executeCommand("A", null);
    }

    @Test(expected = IllegalArgumentException.class)
    public void verifyTypeCommandTest(){
        roverController.sendCommand("ADF",1);

        verify(roverService, never()).executeCommand("ADF",1);

    }
    @Test(expected = IllegalArgumentException.class)
    public void verifyTypeArgumentZ(){
        roverController.sendCommand("ADA", 5);
        verify(roverService, never()).executeCommand("ADA",5);
    }







}
