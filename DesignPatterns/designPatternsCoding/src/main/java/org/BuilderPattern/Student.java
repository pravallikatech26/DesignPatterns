package org.BuilderPattern;

public class Student {
    private String name;
    private int age;
    private String surname;
    private  String phoneNo;
    private  String university;
    private int gradYear;

    private Student(){  }
    private Student(Builder builder){
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

    public static Builder getBuilder(){
        return new Builder();
    }

    public static class Builder {
        private String name;
        private int age;
        private String surname;
        private  String phoneNo;
        private  String university;
        private int gradYear;

        Student build(){
            if(this.getGradYear() < 2010){
                throw new RuntimeException("Graduation should be completed after 2010 ");
            }
            if(this.getPhoneNo().length() != 10){
                throw new RuntimeException("Check phoneNumber");
            }

            return new Student(this);
        }

        public String getName() {
            return name;
        }

        public Builder setName(String name) {
            this.name = name;
            return this;
        }

        public int getAge() {
            return age;
        }

        public Builder setAge(int age) {
            this.age = age;
            return this;
        }

        public String getSurname() {
            return surname;
        }

        public Builder setSurname(String surname) {
            this.surname = surname;
            return this;
        }

        public String getPhoneNo() {
            return phoneNo;
        }

        public Builder setPhoneNo(String phoneNo) {
            this.phoneNo = phoneNo;
            return this;
        }

        public String getUniversity() {
            return university;
        }

        public Builder setUniversity(String university) {
            this.university = university;
            return this;
        }

        public int getGradYear() {
            return gradYear;
        }

        public Builder setGradYear(int gradYear) {
            this.gradYear = gradYear;
            return this;
        }
    }
}
