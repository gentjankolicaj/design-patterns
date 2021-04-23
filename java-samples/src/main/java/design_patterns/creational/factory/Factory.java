package design_patterns.creational.factory;


public class Factory {

    public Factory() {
        super();
    }

    public Shape produceShape(ShapeType shapeType) throws RuntimeException {
        if (shapeType == null)
            throw new RuntimeException("ShapeType is null.Must be of a known type.");
        else if (shapeType.equals(ShapeType.TRIANGLE))
            return new Triangle();
        else if (shapeType.equals(ShapeType.RECTANGLE))
            return new Rectangle();
        else if (shapeType.equals(ShapeType.SQUARE))
            return new Square();
        else if (shapeType.equals(ShapeType.CIRCLE))
            return new Circle();
        else
            throw new RuntimeException("ShapeType is unimplemented.");


    }


}