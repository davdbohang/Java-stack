public class ProjectTest {
    public static void main(String[] args) {
        Project test = new Project();
        Project test2 = new Project("Project 1", "Description for Project 1", 25);
        Project test3 = new Project("Project 2");

        ProjectPortfolio test = new ProjectPortfolio();

        System.out.println(test.elevatorPitch());
        System.out.println(test2.elevatorPitch());
        System.out.println(test3.elevatorPitch());
        System.out.println(test.ProjectPortfolio());
    }
}