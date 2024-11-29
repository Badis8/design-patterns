package com.turtles.designpatterns.factory.turtleFactory;

class DramaticTurtle implements Turtle {
    @Override
    public void hide() {
        System.out.println("DramaticTurtle: *dives underwater with a massive splash* I AM INVISIBLE NOW!");
    }
}
