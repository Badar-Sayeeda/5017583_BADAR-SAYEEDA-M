package mvcpattern;

class StudentView {
    public void displayStudentDetails(String name, int id, String grade) {
        System.out.println("Student: " + name);
        System.out.println("ID: " + id);
        System.out.println("Grade: " + grade);
    }
}
