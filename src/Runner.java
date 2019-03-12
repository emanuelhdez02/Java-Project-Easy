import java.util.Scanner;

public class Runner {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Provide a number for your response: 1 = Never 2 = Rarely 3 = Sometimes 4 = Always");

        System.out.println("Hello, What is your name?");

        String name = sc.next();

        Question q = new Question(name);


        for (int i = 0; i < q.question.length; i++) {
            boolean isValid = false;

            System.out.println(q.question[i]);


            while (!isValid) {
                if (sc.hasNextInt()) {
                    q.response[i] = sc.nextInt();
                    isValid = true;
                } else {
                    System.out.println("Not a number! Try Again");
                    sc.next();
                }
            }
        }
    }
}

