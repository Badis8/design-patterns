package com.turtles.designpatterns.abstractfactory.landturtles;

import com.turtles.designpatterns.abstractfactory.DramaticTurtle;

public class DramaticLandTurtle implements DramaticTurtle{

    @Override
    public void hide() {
       System.out.print("dives into water , drawns");
    }
    
}
