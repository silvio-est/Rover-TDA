package org.liz.test.services;

import org.liz.test.models.MapTerrestrial;
import org.liz.test.models.ObjectTerrestrial;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RoverServiceImpl implements RoverService {

    private MapTerrestrial mapTerrestrial;

    public RoverServiceImpl(MapTerrestrial mapTerrestrial) {
        this.mapTerrestrial = mapTerrestrial;
    }

    public RoverServiceImpl() {
    }

    @Override
    public void executeCommand(String commands, Integer z) {

    }

    @Override
    public ObjectTerrestrial getObject(int x, int y) {
        return mapTerrestrial.getObject(x, y);
    }
}
