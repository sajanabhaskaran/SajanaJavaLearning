package com.equalsChecking;

public class TestHuman {
    public static void main(String[] args) {
        TestHuman testHuman= new TestHuman();
        testHuman.testEquals();

    }

    private void testEquals() {
        Human saj= new Human("Adult","Sajana","1234",23);
        Human sree= new Human("Adult","Sreeraj","3456",39);
        System.out.println(saj.equals(sree));
        System.out.println(saj.hashCode());
        System.out.println(sree.hashCode());
        saj.getPersonalNum().hashCode();
    }
}
