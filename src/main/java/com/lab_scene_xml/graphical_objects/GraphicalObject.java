package com.lab_scene_xml.graphical_objects;

import com.lab_scene_xml.coordinates.Coordinates;

public abstract class GraphicalObject
{
    protected String color;
    protected Coordinates coordinates;

    public abstract void draw();

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Coordinates getCoordinates() {
        return coordinates;
    }

    public void setCoordinates(Coordinates coordinates) {
        this.coordinates = coordinates;
    }
}
