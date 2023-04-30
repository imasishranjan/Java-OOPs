interface Area {
    float pi = 3.1415F;
    float compute (float x, float y);
}
class Rectengle implements Area {
    public float compute (float x, float y) {
        return (x+y);
    }
}
class Circle implements Area {
    public float compute (float r, float y) {
        return pi*r*r;
    }
}
class Cynclinder implements Area {
    public float compute (float r,float h) {
        return (2*pi*r*(r+h));
    }
}
class ExInterface1 {
    public static void main (String args[]) {
        Rectengle r = new Rectengle();
        Circle c = new Circle();
        Cynclinder cy = new Cynclinder();
        float area1 = r.compute(100,50);
        float area2 = c.compute(100,10);
        float area3 = cy.compute(10.5F,25.6F);
        System.out.println("Area of a Rectengle: "+area1);
        System.out.println("Area of a Circle: "+area2);
        System.out.println("Area of a Cynlinder: "+area3);
    }
}