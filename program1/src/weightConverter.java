import java.util.Scanner;

public class weightConverter {
    public static void main(String[] args) {
        int choice;
        double weight;
        double newWeight;
        System.out.println("Welcome to the weight converter program.");

        Scanner input = new Scanner(System.in);
        System.out.println("1:convert lbs to kgs. ");
        System.out.println("2:convert lbs to kgs. ");

        System.out.print("Enter the choice: ");
        choice = input.nextInt();

        if(choice == 1){
            System.out.print("Enter the weight in lbs: ");
            weight = input.nextDouble();
            newWeight = weight * 0.453592;
            System.out.printf("The weight in kgs is:%.2f ",newWeight);

        }else if(choice == 2){
            System.out.print("Enter the weight in kgs: ");
            weight = input.nextDouble();
            newWeight = weight * 0.28462;
            System.out.printf("The weight in kgs is:%.2f ",newWeight);
        }
        else{
            System.out.println("Invalid choice.");
        }
        input.close();
    }
}
