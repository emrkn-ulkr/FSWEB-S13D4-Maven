package org.example;

public class Point {
    private int x;
    private int y;

    public Point(int x, int y){
        this.x = x;
        this.y = y;
    }

    public int getX(){
        return this.x;
    }

    public int getY(){
        return this.y;
    }

    public void setX(int x){
        this.x =x;
    }

    public void setY(int y){
        this.y=y;
    }

    public double distance(){
        // Math.sqrt → karekök (square root)
        // Math.pow → üs alma (power)
        return Math.sqrt(Math.pow(x - 0, 2) + Math.pow(y - 0, 2));
    }

    public double distance(Point p){
        return Math.sqrt(Math.pow(x - p.x, 2) + Math.pow(y - p.y, 2));
    }

    public double distance(int a, int b){
        return Math.sqrt(Math.pow(x - a, 2) + Math.pow(y - b, 2));
    }
}
