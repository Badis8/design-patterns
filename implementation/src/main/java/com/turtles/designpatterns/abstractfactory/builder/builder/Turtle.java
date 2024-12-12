package com.turtles.designpatterns.abstractfactory.builder.builder;

import com.turtles.designpatterns.abstractfactory.builder.badbuilder.Nails;
import com.turtles.designpatterns.abstractfactory.builder.badbuilder.Shell;

public class Turtle {
    private Shell shell;
    private Nails nail;
    public void setShell(Shell shell) {
        this.shell = shell;
    }
    public void setNail(Nails nail) {
        this.nail = nail;
    }
    Turtle(){
        
    }
}
