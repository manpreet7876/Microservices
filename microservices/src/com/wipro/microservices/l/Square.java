package com.wipro.microservices.l;

public class Square extends Rectangle {
    public Square(int side) {
        super(side, side); // Call the parent class constructor
    }

    @Override
    public void setWidth(int width) {
        super.setWidth(width);
        super.setHeight(width); // Keep width == height
    }

    @Override
    public void setHeight(int height) {
        super.setWidth(height);
        super.setHeight(height); // Keep width == height
    }
}
