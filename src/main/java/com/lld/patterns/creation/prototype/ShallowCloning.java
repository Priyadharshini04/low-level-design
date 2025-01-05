package com.lld.patterns.creation.prototype;
/*
1. Original and the cloned object will point to the same objects in memory.
2. Any changes made to the cloned object will be reflected in the original object and vice versa.
3. Default version of the clone() method creates a shallow copy.
4. Shallow cloning is preferred if the object’s fields are only primitive types.
5. It is faster and uses less memory compared to deep cloning.
*/
public class ShallowCloning {
    public static void main(String[] args)
    {
        School school=new School("Government School");
        Student student=new Student("student1",85,school);
        System.out.println("Original Obj "+student+" name: "+student.getName()+" marks: "+student.getMarks()+" school: "+student.getSchool().getSchoolName());
        Student clonedStudent = student.clone();
        System.out.println("Cloned Obj "+clonedStudent+" name: "+clonedStudent.getName()+" marks: "+clonedStudent.getMarks()+" school: "+clonedStudent.getSchool().getSchoolName());
        clonedStudent.setMarks(90); // no changes in the original object since it is a primitive
        System.out.println("Original Obj "+student+" name: "+student.getName()+" marks: "+student.getMarks()+" school: "+student.getSchool().getSchoolName());
        System.out.println("Cloned Obj "+clonedStudent+" name: "+clonedStudent.getName()+" marks: "+clonedStudent.getMarks()+" school: "+clonedStudent.getSchool().getSchoolName());
        clonedStudent.getSchool().setSchoolName("High School"); // changes in the original object since it is an object reference.
        System.out.println("Original Obj "+student+" name: "+student.getName()+" marks: "+student.getMarks()+" school: "+student.getSchool().getSchoolName());
        System.out.println("Cloned Obj "+clonedStudent+" name: "+clonedStudent.getName()+" marks: "+clonedStudent.getMarks()+" school: "+clonedStudent.getSchool().getSchoolName());
        student.getSchool().setSchoolName("Higher Secondary School"); // changes in the cloned object since it is an object reference.
        System.out.println("Original Obj "+student+" name: "+student.getName()+" marks: "+student.getMarks()+" school: "+student.getSchool().getSchoolName());
        System.out.println("Cloned Obj "+clonedStudent+" name: "+clonedStudent.getName()+" marks: "+clonedStudent.getMarks()+" school: "+clonedStudent.getSchool().getSchoolName());
    }
}
