public List<Task> getTasksSortedByPriority() {
    return tasks.stream()
                .sorted(Comparator.comparingInt(Task::getPriority))
                .collect(Collectors.toList());
}
