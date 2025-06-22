package javaPro.lesson2.employee;

public class Developer extends Employee {
    private String[] projects;

    public Developer(String name, int age, String[] projects) {
        super(name, age, "Developer");
        this.projects = projects;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Projects:");
        if (projects != null && projects.length > 0) {
            for (String project : projects) {
                System.out.println(" - " + project);
            }
        } else {
            System.out.println("No projects.");
        }
    }

}