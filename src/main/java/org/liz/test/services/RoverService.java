package org.liz.test.services;

import org.liz.test.models.MapTerrestrial;
import org.liz.test.models.ObjectTerrestrial;

public interface RoverService {
    void executeCommand(String commands, Integer z);
    ObjectTerrestrial getObject(int x, int y);
}
