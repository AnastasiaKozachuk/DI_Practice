package com.base;

import com.base.figures.Figure;
import java.util.Collection;

public class AllFigures {

    Collection<Figure> figureList;


    public void setFigureList(Collection<Figure> figureList) {
        this.figureList = figureList;
    }

    public void perform() {
        for (Figure figure : figureList) {
            System.out.println(figure.getFigureName() + " " + figure.getFigureColor());
        }
    }
}
