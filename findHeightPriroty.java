public Optional<Task> findHighestPriorityUnfinishedTask() {
    return tasks.stream()
                .filter(task -> !task.isCompleted())
                .min(Comparator.comparingInt(Task::getPriority));
}
