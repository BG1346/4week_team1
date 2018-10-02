package team1;

public class App {

    public static void main(String[] args) {
        User user1 = new User();
        user1.setName("jason");
        user1.setAge(29);
        user1.setYears("senior");
        System.out.println(user1.getName()+" "+user1.getAge()+" "+user1.getYears());
    }
}
