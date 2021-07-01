package edu.mum.cs.cs425.demos.studentrecordsmgmtapp.model;


import java.util.Comparator;

public class StudentComparator implements Comparator<edu.mum.cs.cs425.demos.studentrecordsmgmtapp.model.Student> {


    @Override
    public int compare(edu.mum.cs.cs425.demos.studentrecordsmgmtapp.model.Student o1, edu.mum.cs.cs425.demos.studentrecordsmgmtapp.model.Student o2) {
          return o1.getName().compareTo(o2.getName());
    }
}
