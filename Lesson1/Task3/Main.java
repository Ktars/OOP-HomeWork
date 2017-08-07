package com.OOP;

public class Main {

    public static void main(String[] args) {
        Vector3d vectorA = new Vector3d(4,11,2);
        Vector3d vectorB = new Vector3d(2,1,4);
        Vector3d vectorS = new Vector3d();
        Vector3d vectorV = new Vector3d();
        int scalar = 0;

        vectorS.sumVector(vectorA,vectorB,vectorS);

        vectorS.scalar(vectorA,vectorB, scalar);

        vectorV.vect(vectorA,vectorB,vectorV);
    }
}
