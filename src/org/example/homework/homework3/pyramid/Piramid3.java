package org.example.homework.homework3.pyramid;

public class Piramid3 extends Piramid2 {
    protected String vertex31;

    public Piramid3(String vertex11, String vertex12, String vertex13, String vertex21,
                    String vertex22, String vertex31) {
        super(vertex11, vertex12, vertex13, vertex21, vertex22);
        this.vertex31 = vertex31;
    }

    @Override
    public void print() {
        System.out.println(vertex31);
    }
}
