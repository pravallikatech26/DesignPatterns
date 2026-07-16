package org.BuilderPattern;

public class Student {
    private String name;
    private int age;
    private String surname;
    private  String phoneNo;
    private  String university;
    private int gradYear;

    private Student(){  }
    Student(Builder builder){
        if(builder.getGradYear() < 2010){
            throw new RuntimeException("Graduation should be completed after 2010 ");
        }
        if(builder.getPhoneNo().length() != 10){
            throw new RuntimeException("Check phoneNumber");
        }

        name = builder.getName();
        age = builder.getAge();
        surname = builder.getSurname();
        phoneNo = builder.getPhoneNo();
        university = builder.getUniversity();
        gradYear = builder.getGradYear();
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", surname='" + surname + '\'' +
                ", phoneNo='" + phoneNo + '\'' +
                ", university='" + university + '\'' +
                ", gradYear=" + gradYear +
                '}';
    }
}
