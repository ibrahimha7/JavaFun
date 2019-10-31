public class Projecttest {
    public static void main(String[] args) {
        Project project = new Project();
        Project project2 = new Project("Second Project");
        Project project3 = new Project("Third Project", "This is the project's description.");
        Project project4 = new Project("Fourth Project", 25000, "Expensive project!");

        Portfolio portfolio = new Portfolio();

        project.setName("My First project");
        project.setDescription("This is an awesome description.");
        project.setInitialCost(400);

        
        portfolio.addProject(project);
        portfolio.addProject(project2);
        portfolio.addProject(project3);
        portfolio.addProject(project4);

        
        portfolio.showPortfolio();
    }
}