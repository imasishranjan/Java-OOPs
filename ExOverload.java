class Overload {
    int volume (int x) {
        return (x * x * x);
    }
    long volume (long x, int y, int z) {
        return (x * y * z);
    }
    double volume (double r) {
        return (4.0/3.0*3.1415F*r*r*r);
    }
    float volume (float r, float h) {
        return (1.0F/3.0F*3.1415F*r*r*h);
    }
    double volume (double r, double h) {
        return (3.1415*r*r*h);
    }
}
class ExOverload {
    public static void main(String args[]) {
        Overload OL = new Overload();
        int v1 = OL.volume(10);
        double v2 = OL.volume(10.5);
        long v3 = OL.volume(100L,25,10);
        float v4 = OL.volume(5.2F,10.5F);
        double v5 = OL.volume(5.6,10.2);
        System.out.println("Volume of cube = "+v1);
        System.out.println("Volume of RectengleBox = "+v3);
        System.out.println("Volume of Shpere = "+v2);
        System.out.println("Volume of Cynlinder = "+v5);
        System.out.println("Volume of a cone = "+v4);
    }
}