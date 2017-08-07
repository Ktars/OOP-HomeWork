package com.OOP;

public class Vector3d {

    int X;
    int Y;
    int Z;

    public Vector3d(int x, int y, int z) {
        X = x;
        Y = y;
        Z = z;
    }

    public Vector3d() {
        super();
    }


    public void sumVector(Vector3d A, Vector3d B, Vector3d S){
        S.X = B.X+A.X;
        S.Y = B.Y+A.Y;
        S.Z = B.Z+A.Z;

        System.out.println("S("+S.X+";"+S.Y+";"+S.Z+")");
    }

    public void scalar(Vector3d A, Vector3d B, int scalar){
        scalar = A.X*B.X+A.Y*B.Y+A.Z*B.Z;
        System.out.println("Scalar: "+scalar);
    }

    public void vect(Vector3d A, Vector3d B, Vector3d V){
        V.X = A.Y*B.Z-A.Z*B.Y;
        V.Y = A.Z*B.X-A.X*B.Z;
        V.Z = A.X*B.Y-A.Y*B.X;

        System.out.println("V("+V.X+";"+V.Y+";"+V.Z+")");
    }
}
