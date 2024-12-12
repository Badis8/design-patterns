package com.turtles.designpatterns.abstractfactory.builder.builder;

import com.turtles.designpatterns.abstractfactory.builder.badbuilder.Nails;
import com.turtles.designpatterns.abstractfactory.builder.badbuilder.Shell;

public class NormalBuilder implements Builder {

    private Turtle turle;


    @Override
    public void addShell() {
        this.turle.setShell(new Shell());
    }

    @Override
    public void addNails() {
        this.turle.setNail(new Nails());
    }

    @Override
    public void reset() {
        this.turle = new Turtle();
    }

    @Override
    public Turtle getTrutle() {
       Turtle turle=this.turle;
       this.reset();
       return turle;
    }
        
}
