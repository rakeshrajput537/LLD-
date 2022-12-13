package com.lld.designpatterns.builder;

public class Student {
    private Student(){}
    private String name;
    private int age;
    private int batch;
    private String university;
    private int gradeYr;
    private Student(Builder builder){
        this.name = builder.name;
        this.age = builder.age;
        this.university = builder.university;
        this.batch = builder.batch;
    }

    public static class Builder{
        private String name;
        private int age;
        private int batch;
        private String university;
        private int gradeYr;

        public Builder setName(String name) {
            this.name = name;
            return this;
        }

        public Builder setAge(int age) {
            this.age = age;
            return this;
        }

        public Builder setBatch(int batch) {
            this.batch = batch;
            return this;
        }

        public Builder setUniversity(String university) {
            this.university = university;
            return this;
        }

        public Builder setGradeYr(int gradeYr) {
            this.gradeYr = gradeYr;
            return this;
        }

        public Student build(){
            return new Student(this);
        }
    }
    public static Builder getBuilder(){
        return new Builder();
    }
    public static void main(String[] args) {
        Student st = Student.getBuilder()
                .setAge(20)
                .setName("Raka")
                .setBatch(2020)
                .setGradeYr(2020)
                .setUniversity("NIT")
                .build();
    }
}
