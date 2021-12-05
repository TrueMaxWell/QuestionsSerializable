package com.company.Serialization;

import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        Human human1 = new Human("Oleg", 30);
        Human human2 = new Human("Viktor", 25);

        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(byteArrayOutputStream);
        objectOutputStream.writeObject(human1);
        objectOutputStream.writeObject(human2);


        ObjectInputStream objectInputStream = new ObjectInputStream(new ByteArrayInputStream(byteArrayOutputStream.toByteArray()));
        Human human1clone = (Human) objectInputStream.readObject();
        Human human2clone = (Human) objectInputStream.readObject();

        System.out.println(human1);
        System.out.println(human2);
        System.out.println("clone " + human1clone);
        System.out.println("clone " + human2clone);




    }
}
