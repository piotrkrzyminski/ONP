import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Stack s = new StackArray(100);

        System.out.print("Write an expression(Each value must be separated by a space): ");

        String line = in.nextLine();

        System.out.println(line);

        if(line.equals("")) {
            System.out.println("Expression cannot be empty");
            return;
        }

        String[] parts = line.trim().split(" ");

        for(String part : parts) {
            if(part.matches("\\d|[-]?[1-9]\\d*")) {

                int number = Integer.valueOf(part);
                System.out.println("adding " + number);
                s.push(number);

            } else {

                int value1 = s.pop();
                int value2 = s.pop();

                switch(part) {
                    case ("+"):
                        s.push(value2 + value1);
                        break;
                    case ("-"):
                        s.push(value2 - value1);
                        break;
                    case ("*"):
                        s.push(value2 * value1);
                        break;
                    case ("/"):
                        s.push(value2 / value1);
                        break;
                    default:
                        System.out.println("Incompatible operator");
                        return;
                }
            }
        }

        if(!s.isEmpty())
            System.out.println("wynik: " + s.pop());
    }
}