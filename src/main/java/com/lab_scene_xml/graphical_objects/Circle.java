package com.lab_scene_xml.graphical_objects;

import com.lab_scene_xml.coordinates.Coordinates;

public class Circle extends GraphicalObject
{
    @Override
    public void draw() {
        System.out.println("Draw circle.\n" + "Color: " + getColor()
                + "Coordinates: " + getCoordinates());
    }
}
