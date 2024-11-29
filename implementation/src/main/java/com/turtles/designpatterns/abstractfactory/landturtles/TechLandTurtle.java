package com.turtles.designpatterns.abstractfactory.landturtles;

import com.turtles.designpatterns.abstractfactory.TeckTurtle;

public class TechLandTurtle implements TeckTurtle {
        @Override
        public void hide() {
            System.out.println("TechTurtle: *activates cloaking device* Beep-boop! I'm invisible in the digital realm.");
        }

      
    }
 
