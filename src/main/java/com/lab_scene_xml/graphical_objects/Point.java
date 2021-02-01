package com.lab_scene_xml.graphical_objects;

import com.lab_scene_xml.coordinates.Coordinates;

public class Point extends GraphicalObject
{
    @Override
    public void draw() {
        System.out.println("Draw point.\n" + "Color: " + getColor()
                + "Coordinates: " + getCoordinates());
    }
}
