package org.BuilderPattern;

import org.singleton.Logger;

public class Client {
    public static void main(String[] args) {
        Logger logger = Logger.getInstance();
        Builder builder = new Builder();
        builder.setName("Pravallika");
        builder.setAge(29);
        builder.setGradYear(2018);
        builder.setPhoneNo("9009090911");

        Student student = new Student(builder);
        logger.log(student.toString());
    }
}
