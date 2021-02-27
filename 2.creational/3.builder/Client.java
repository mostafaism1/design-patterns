public class Client {

    public static void main(String[] args) {

        RobotBuilder robotBuilder = new OldRobotBuilder();
        RobotDirector robotDirector = new RobotDirector(robotBuilder);

        robotDirector.makeRobot();
        Robot robot = robotBuilder.getRobot();

        System.out.println(robot);
    }
    
}
