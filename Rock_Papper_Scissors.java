/*
 * Libreries import for Java!!
 */
import java.util.Scanner;
import java.util.Random;
/*
 * principal class
 */
public class Rock_Papper_Scissors
{
    private int human_player_option;
    private int computer_player_option; //declaration of atributte

    //Scanner instance
    Scanner scanner = new Scanner(System.in);

    //constructor
    public Rock_Papper_Scissors()
    {
        human_player_option = 1;
        computer_player_option = 1;
    }

    public int getHuman_player_option()
    {
        return human_player_option;
    }

    public void setHuman_player_option(int human_player_option)
    {
        this.human_player_option = human_player_option;
    }


    public int getComputer_player_option()
    {
        return computer_player_option;
    }


    public void setComputer_player_option(int computer_player_option)
    {
        this.computer_player_option = computer_player_option;
    }

    //method for introduce to the Game
    public void Welcome()
    {
        System.out.println("Hi, dear player");
        System.out.println("Welcome to the game \"Rock Paper Scissors\"!");
        System.out.println();
        System.out.println("You can choose between Rock, Papper, Scissors");
        System.out.println("To play, you need to type the number of your choice");
        System.out.println("1 for Rock");
        System.out.println("2 for Papper");
        System.out.println("3 for Scissors");
        System.out.println();
        System.out.println("");
        System.out.println("---RULES---");
        System.out.println("The rules are the following:");
        System.out.println("");
        System.out.println("If both players chose the same option - it's a DRAW!!");
        System.out.println("If one player chooses Rock and the other Player chooses Scissors or vice versa - WINNER");
        System.out.println("Rock crushes scissors");
        System.out.println("Scissors cut paper");
        System.out.println("Paper covers rock");
        System.out.println("");
        System.out.println("So who would be able the WINNER?");
        System.out.print  ("Let's find out...\n");
    }
    //method that shows who won
    public void Play()
    {
        //intance ramdom for computer_player_option
        Random random = new Random();
        computer_player_option = random.nextInt(3)+1;
        System.out.println("1- Rock");
        System.out.println("2- Papper");
        System.out.println("3- Scissors");
        System.out.println(" Add your option: -> ");
        human_player_option = scanner.nextInt();
    }

    public void Show_Results()
    {
        //exploring the three options
        switch (human_player_option) 
        {
            case 1:
                System.out.println("Your option: " +human_player_option);
                System.out.println("Rock!!");
                break;
            case 2:
                System.out.println("Your option: " +human_player_option);
                System.out.println("Papper!!");
                break;
            case 3:
                System.out.println("Your option: " +human_player_option);
                System.out.println("Scissors!!");
                break;
            default:
                System.out.println("Option no valid!!");
                break;
        }
        
        switch (computer_player_option) 
        {
             case 1:
                System.out.println("Conmputer option: " +computer_player_option);
                System.out.println("Rock!!");
                break;
            case 2:
                System.out.println("Conmputer option: " +computer_player_option);
                System.out.println("Papper!!");
                break;
            case 3:
                System.out.println("Conmputer option: " +computer_player_option);
                System.out.println("Scissors!!");
                break;
            default:
                System.out.println("Option no valid!!");
                break;
        }
        //conditons for the play
        if (human_player_option == 1 && computer_player_option == 1 || 
            human_player_option == 2 && computer_player_option == 2 || 
            human_player_option == 3 && computer_player_option == 3) 
        {
            System.out.println("Tiee!");
        }
        else if (human_player_option == 1 && computer_player_option == 2)
        {
            System.out.println("Defeat!! You have lost");
        }
        else if (human_player_option == 2 && computer_player_option == 1)
        {
            System.out.println("Victory!! You have gained the round!!");
        }
        else if (human_player_option == 2 && computer_player_option == 3)
        {
            System.out.println("Defeat!! You have lost");
        }
        else if (human_player_option == 3 && computer_player_option == 2)
        {
            System.out.println("Victory!! You have gained the round!!");
        }
        else if (human_player_option == 3 && computer_player_option == 1)
        {
            System.out.println("Defeat!! You have lost");
        }
        else if (human_player_option == 1 && computer_player_option == 3)
        {
            System.out.println("Victory!! You have gained the round!!");
        }

        System.out.println("Do you want to continue playing?");
        System.out.print("Type y for yes, or n for no : ");
        char answer = scanner.next().charAt(0);

        if (answer == 'n' || answer == 'N')
        {
            System.out.println("Goodbye! Thanks for playing.");
        }
        else if (answer == 'y' || answer == 'Y')
        {
            Play();
            Show_Results();
        }
    }
    /*
     * main method for the test
     */
    public static void main(String[] args) 
    {
        //create a new object of the class
        Rock_Papper_Scissors game = new Rock_Papper_Scissors();
        //call the method to welcome the use
        game.Welcome();
        //start the game loop
        game.Play();
        game.Show_Results();
    }
}