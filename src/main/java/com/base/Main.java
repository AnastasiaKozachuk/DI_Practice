package com.base;

import com.base.figures.Figure;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {


    public static void main(String[] args) {

        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

        Figure theFigure = context.getBean("squareFigure", Figure.class);
        System.out.println("Constructor injection: ");
        System.out.println(theFigure.getFigureName());
        System.out.println(theFigure.getFigureColor());

        Figure theFigure2 = context.getBean("triangleFigure", Figure.class);
        System.out.println("\n\nSetter injection: ");
        System.out.println(theFigure2.getFigureName());
        System.out.println(theFigure2.getFigureColor());
        System.out.flush();

        AllFigures allFigures = context.getBean("allFigures", AllFigures.class);
        System.out.println("\n\nList injection: ");
        allFigures.perform();

        System.out.flush();
        context.close();
    }

}
