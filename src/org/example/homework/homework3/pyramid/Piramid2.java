package org.example.homework.homework3.pyramid;

public class Piramid2 extends Piramid1 {
    protected String vertex21;
    protected String vertex22;

    public Piramid2(String vertex11, String vertex12,
                    String vertex13, String vertex21, String vertex22) {
        super(vertex11, vertex12, vertex13);
        this.vertex21 = vertex21;
        this.vertex22 = vertex22;

    }

    @Override
    public  void print() {
        System.out.println(vertex21);
        System.out.println(vertex22);
    }
}
