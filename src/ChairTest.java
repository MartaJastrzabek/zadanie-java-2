public class ChairTest {
    public static void main(String[] args) {
        Chair chair1 = new Chair();
        chair1.color = "blue";
        chair1.legsNumber = 4;
        chair1.hasWheels = false;

        Chair chair2 = new Chair();
        chair2.color = "black";
        chair2.legsNumber = 1;
        chair2.hasWheels = true;

        System.out.println("Chair 1 is " + chair1.color + ", has " + chair1.legsNumber + " leg and has wheels: " + chair1.hasWheels);
        System.out.println("Chair 2 is " + chair2.color + ", has " + chair2.legsNumber + " leg and has wheels: " + chair2.hasWheels);
    }
}
