package taskmanagementsystem;

public class TaskManagementTest {
    public static void main(String[] args) {
        TaskManagement taskManagement = new TaskManagement();

        Task t1 = new Task(1, "Task 1", "Incomplete");
        Task t2 = new Task(2, "Task 2", "Complete");

        taskManagement.addTask(t1);
        taskManagement.addTask(t2);

        System.out.println("All Tasks:");
        taskManagement.traverseTasks();

        System.out.println("Searching for task with ID 1:");
        System.out.println(taskManagement.searchTask(1));

        taskManagement.deleteTask(1);
        System.out.println("All Tasks after deletion:");
        taskManagement.traverseTasks();
    }
}

