package com.base.figures;

import com.base.services.ColorService;

public class TriangleFigure implements Figure {

    private ColorService colorService;

    public void setColorService(ColorService colorService) {
        this.colorService = colorService;
    }

    public String getFigureName() {
        return "I am triangle!";
    }

    public String getFigureColor() {
        return colorService.getColor();
    }
}
