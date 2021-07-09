package bai_6.bai_tap.lop_point2d_va_lop_point3d;

public class Point3D extends Point2D {
    private float z;
    Point3D(){
    }
    Point3D(float x,float y,float z){
        super(x,y);
        this.z = z;
    }

    public float getZ() {
        return z;
    }

    public void setZ(float z) {
        this.z = z;
    }

    public void setXYZ(float x,float y,float z){
        super.setX(x);
        super.setX(y);
        setZ(z);
    }

    public float[] getXYZ(){
        float floats[] = new float[3];
        floats[1] = getX();
        floats[2] = getY();
        floats[3] = getZ();
        return floats;
    }

    @Override
    public String toString() {
        return  "Point2D " +
                "z = " + getZ() +
                ", which is a subclass of " +
                super.toString();
    }

//    public static void main(String[] args) {
//        Point2D point3D = new Point3D(5f,5f,5f);
//        System.out.println(point3D);
////        System.out.println(((Point3D) point3D).getXYZ());
//
//    }
}
