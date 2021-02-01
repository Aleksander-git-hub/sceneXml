package com.lab_scene_xml.scene;

import com.lab_scene_xml.graphical_objects.GraphicalObject;

import java.util.List;

public class Scene
{
   private List<GraphicalObject> graphicalObjects;

    public void drawScene() {
       for (GraphicalObject graphicalObject : graphicalObjects) {
           System.out.println("---Draw Scene---");
           graphicalObject.draw();
       }
   }

    public List<GraphicalObject> getGraphicalObjects() {
        return graphicalObjects;
    }

    public void setGraphicalObjects(List<GraphicalObject> graphicalObjects) {
        this.graphicalObjects = graphicalObjects;
    }
}
