package org.liz.test.models;

public class Rover extends ObjectTerrestrial{

    private Integer position;
    private Integer z;

    public Rover() {
    }

    public Rover(Integer position, Integer z) {
        this.position = position;
        this.z = z;
    }

    public Integer getPosition() {
        return position;
    }

    public void setPosition(Integer position) {
        this.position = position;
    }

    public Integer getZ() {
        return z;
    }

    public void setZ(Integer z) {
        this.z = z;
    }
}
