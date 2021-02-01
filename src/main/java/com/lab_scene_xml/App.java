package com.lab_scene_xml;

import com.lab_scene_xml.scene.Scene;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App
{
    public static void main( String[] args ) {
        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("applicationContext.xml");
        Scene scene = context.getBean("sceneBean", Scene.class);
        scene.drawScene();
        context.close();
    }
}
