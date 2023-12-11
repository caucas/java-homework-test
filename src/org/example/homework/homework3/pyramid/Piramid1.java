package org.example.homework.homework3.pyramid;

public class Piramid1 {
    //01: 0 - номер пирамиды, 1, 2...  - ее вершины
    protected String vertex11;
    protected String vertex12;
    protected String vertex13;

    public Piramid1(String vertex11, String vertex12, String vertex13) {
        this.vertex11 = vertex11;
        this.vertex12 = vertex12;
        this.vertex13 = vertex13;
    }


    public void print() {
        System.out.println(vertex11);
        System.out.println(vertex12);
        System.out.println(vertex13);
    }
}
