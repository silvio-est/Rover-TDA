package org.liz.test.models;

public class MapTerrestrial {

    ObjectTerrestrial[][] map;

    public MapTerrestrial(int a, int al){
        map = new ObjectTerrestrial[a][al];
    }

    public void addObject(ObjectTerrestrial objectTerrestrial, int x, int y) {
        map[x][y] = objectTerrestrial;
    }

    public ObjectTerrestrial getObject(int x, int y) {
        return map[x][y];
    }
}
