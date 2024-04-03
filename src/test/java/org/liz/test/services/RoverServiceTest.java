package org.liz.test.services;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.liz.test.models.MapTerrestrial;
import org.liz.test.models.Obstacle;
import org.liz.test.models.Rover;

public class RoverServiceTest {

    private RoverService roverService;
    private Rover rover;
    private Obstacle obstacle;

    @Before
    public void setup(){
        MapTerrestrial mapTerrestrial = new MapTerrestrial(10, 10);
        roverService = new RoverServiceImpl(mapTerrestrial);

//      Crete Rover in the map
        rover = new Rover();
        mapTerrestrial.addObject(rover, 5, 5);

//      Create obstacle in the map
        obstacle = new Obstacle();
        mapTerrestrial.addObject(obstacle,5,1);
    }

    @Test
    public void positionRoverInTheMap(){
        Assert.assertEquals(roverService.getObject(5, 5), rover);
    }

    @Test
    public void positionInTheMapNull(){
        Assert.assertNull(roverService.getObject(5, 0));
    }

    @Test
    public void positionObstacleInTheMap(){
        Assert.assertEquals(roverService.getObject(5, 1), obstacle);
    }

    @Test
    public void forwardTwoPositionRover(){
        roverService.executeCommand("AA", 0);

        Assert.assertEquals(roverService.getObject(5, 3), rover);
    }

}





















