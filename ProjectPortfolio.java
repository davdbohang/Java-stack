import java.util.ArrayList;

public class ProjectPortfolio {
    public static void main(String[] args) {
    }
    public ArrayList<Project> Projects;
    public ProjectPortfolio() {
        this.Projects= new ArrayList<Project>();
    }

    public void AddToPortfolio(Project p) {
        Projects.add(p);
    }
    public String getPortfolio() {
        return Projects.toString();
    }
    public void showPortfolio () {
        double total = 0;
        for (Project p : Projects) {
            total += p.getInitialCost(); 
            System.out.println(p.elevatorPitch());
        }
        System.out.println(String.format("Total Cost: %f", total));
    }
}