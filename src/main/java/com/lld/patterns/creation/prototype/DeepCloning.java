package com.lld.patterns.creation.prototype;
/*
1. Creates a new object and recursively copies all fields, including nested objects. This ensures that the cloned object and the original object are completely independent of each other.
2. Any changes made to the cloned object will not be reflected in the original object.
3. To create a deep copy, you need to override the clone() method.
4. Deep cloning is preferred if the object’s fields contain references to other objects.
5. It is slower and uses more memory because it duplicates all objects and their nested objects.
 */
public class DeepCloning {
    public static void main(String[] args)
    {
        School school=new School("Government School");
        Student student=new Student("student1",85,school);
        System.out.println("Original Obj "+student+" name: "+student.getName()+" marks: "+student.getMarks()+" school: "+student.getSchool().getSchoolName());
        Student clonedStudent = student.clone();
        System.out.println("Cloned Obj "+clonedStudent+" name: "+clonedStudent.getName()+" marks: "+clonedStudent.getMarks()+" school: "+clonedStudent.getSchool().getSchoolName());
        clonedStudent.setMarks(90);
        System.out.println("Original Obj "+student+" name: "+student.getName()+" marks: "+student.getMarks()+" school: "+student.getSchool().getSchoolName());
        System.out.println("Cloned Obj "+clonedStudent+" name: "+clonedStudent.getName()+" marks: "+clonedStudent.getMarks()+" school: "+clonedStudent.getSchool().getSchoolName());
        clonedStudent.getSchool().setSchoolName("High School"); // no changes in the original object.
        System.out.println("Original Obj "+student+" name: "+student.getName()+" marks: "+student.getMarks()+" school: "+student.getSchool().getSchoolName());
        System.out.println("Cloned Obj "+clonedStudent+" name: "+clonedStudent.getName()+" marks: "+clonedStudent.getMarks()+" school: "+clonedStudent.getSchool().getSchoolName());
        student.getSchool().setSchoolName("Higher Secondary School"); // no changes in the cloned object.
        System.out.println("Original Obj "+student+" name: "+student.getName()+" marks: "+student.getMarks()+" school: "+student.getSchool().getSchoolName());
        System.out.println("Cloned Obj "+clonedStudent+" name: "+clonedStudent.getName()+" marks: "+clonedStudent.getMarks()+" school: "+clonedStudent.getSchool().getSchoolName());
    }
}
