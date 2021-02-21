package com.stringBufferBuider;

public class Builder {
    public static void main(String[] args) {
        StringBuilder builder= new StringBuilder("Hello");
        builder.append(" java");
        System.out.println(builder);
        builder.toString();

    }
}
