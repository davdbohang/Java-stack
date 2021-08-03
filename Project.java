public class Project {
    private String name;
    private String description;
    private double initialCost = 0;

    public Project() {
        this.name = "No Project Name Entered";
        this.description = "No Project Description Entered";
    }
    public Project(String name, String description, double initialCost) {
        this.name = name;
        this.description = description;
        this.initialCost = initialCost;
    }
    public Project(String name) {
        this.name = name;
        this.description = "No Project Description Entered";
    }

    public String getName() {
        return this.name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return this.description;
    }
    public void setDescription(String description) {
        this.description = description;
    }

    public double getInitialCost() {
        return this.initialCost;
    }
    public void getInitialCost(double initialCost) {
        this.initialCost = initialCost;
    }

    public String elevatorPitch() {
        return this.name + " : " + this.description + " : " + "$" + this.initialCost;
    }

}