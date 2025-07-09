import java.util.List;
import java.util.stream.Collectors;

public class TaskManager {
    private List<Task> tasks;

    public TaskManager(List<Task> tasks) {
        this.tasks = tasks;
    }

    public List<Task> findAllCompletedTasks() {
        return tasks.stream()
                    .filter(Task::isCompleted)
                    .collect(Collectors.toList());
    }
}
