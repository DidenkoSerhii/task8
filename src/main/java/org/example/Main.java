
package org.example;

// Базовий клас для фігури
abstract class Shape {
    protected String name;

    public Shape(String name) {
        this.name = name;
    }

    // Метод для виведення назви фігури
    public void displayName() {
        System.out.println("Name of the shape: " + name);
    }

    // Абстрактний метод для відображення фігури
    public abstract void draw();
}

// Класи, що наслідуються від Shape
class Circle extends Shape {
    public Circle(String name) {
        super(name);
    }

    @Override
    public void draw() {
        System.out.println("Drawing a circle");
    }
}

class Quad extends Shape {
    public Quad(String name) {
        super(name);
    }

    @Override
    public void draw() {
        System.out.println("Drawing a quadrilateral");
    }
}

class Triangle extends Shape {
    public Triangle(String name) {
        super(name);
    }

    @Override
    public void draw() {
        System.out.println("Drawing a triangle");
    }
}

class Rectangle extends Shape {
    public Rectangle(String name) {
        super(name);
    }

    @Override
    public void draw() {
        System.out.println("Drawing a rectangle");
    }
}

class Pentagon extends Shape {
    public Pentagon(String name) {
        super(name);
    }

    @Override
    public void draw() {
        System.out.println("Drawing a pentagon");
    }
}

// Клас, що приймає фігуру та виводить її назву
class ShapeDrawer {
    public void drawShape(Shape shape) {
        shape.draw();
    }
}

// Приклад використання
class Main {
    public static void main(String[] args) {
        Circle circle = new Circle("Circle");
        Quad quad = new Quad("Quad");
        Triangle triangle = new Triangle("Triangle");
        Rectangle rectangle = new Rectangle("Rectangle");
        Pentagon pentagon = new Pentagon("Pentagon");

        ShapeDrawer drawer = new ShapeDrawer();
        drawer.drawShape(circle);
        drawer.drawShape(quad);
        drawer.drawShape(triangle);
        drawer.drawShape(rectangle);
        drawer.drawShape(pentagon);
    }
}
