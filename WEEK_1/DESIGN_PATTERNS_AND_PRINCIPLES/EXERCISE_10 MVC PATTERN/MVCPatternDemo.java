package mvcpattern;

public class MVCPatternDemo {
    public static void main(String[] args) {
        // Create a student model
        Student student = new Student("John Doe", 1, "A");
        
        // Create a view to display student details
        StudentView view = new StudentView();
        
        // Create a controller to manage the interaction between the model and view
        StudentController controller = new StudentController(student, view);
        
        // Display initial student details
        controller.updateView();
        
        // Update student details
        controller.setStudentName("Jane Doe");
        controller.setStudentGrade("B");
        
        // Display updated student details
        controller.updateView();
    }
}

