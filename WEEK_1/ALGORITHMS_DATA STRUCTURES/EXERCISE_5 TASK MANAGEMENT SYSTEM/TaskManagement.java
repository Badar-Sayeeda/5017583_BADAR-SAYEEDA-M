package taskmanagementsystem;

public class TaskManagement {
    private Node head;

    private class Node {
        Task task;
        Node next;

        Node(Task task) {
            this.task = task;
        }
    }

    // Add a task to the linked list
    public void addTask(Task task) {
        if (task == null) {
            System.out.println("Cannot add null task");
            return;
        }
        Node newNode = new Node(task);
        newNode.next = head;
        head = newNode;
    }

    // Search for a task by its ID
    public Task searchTask(int taskId) {
        Node current = head;
        while (current != null) {
            if (current.task.getTaskId() == taskId) {
                return current.task;
            }
            current = current.next;
        }
        return null;
    }

    // Print the names of all tasks
    public void traverseTasks() {
        Node current = head;
        while (current != null) {
            System.out.println(current.task.getTaskName());
            current = current.next;
        }
    }

    // Delete a task by its ID
    public void deleteTask(int taskId) {
        if (head == null) return;
        if (head.task.getTaskId() == taskId) {
            head = head.next;
            return;
        }
        Node current = head;
        while (current.next != null) {
            if (current.next.task.getTaskId() == taskId) {
                current.next = current.next.next;
                return;
            }
            current = current.next;
        }
        System.out.println("Task with ID " + taskId + " not found!");
    }
}

