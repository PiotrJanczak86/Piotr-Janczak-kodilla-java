package com.kodilla.testing.shape;

import java.util.ArrayList;

public class ShapeCollector {

    public ArrayList<Shape> FiguresList = new ArrayList<>();

    public void addFigure(Shape shape){
        FiguresList.add(shape);
    }
    
    public boolean removeFigure(Shape shape){
        boolean result = false;
        if (FiguresList.contains(shape)) {
            FiguresList.remove(shape);
            result = true;
        }
        return result;
    }
    public Shape getFigure(int n){
        if((n < FiguresList.size()) && (n >= 0)){
            return FiguresList.get(n);
        } else{
            return null;  
        }
    }

    public String showFigures(){
        String List = "";
        for (Shape shape: FiguresList) {
            List += shape.getShapeName() + " ";
        }
        System.out.println(List);
        return List;
    }

    public int getSize(){
        return FiguresList.size();
    }

}
