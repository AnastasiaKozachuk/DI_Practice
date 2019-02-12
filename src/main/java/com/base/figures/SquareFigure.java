package com.base.figures;

import com.base.colors.ColorService;

public class SquareFigure implements Figure {

    private ColorService colorService;

    public SquareFigure(ColorService colorService) {
        this.colorService = colorService;
    }

    public String getFigureName() {
        return "I am square!";
    }

    public String getFigureColor() {
        return colorService.getColor();
    }
}
