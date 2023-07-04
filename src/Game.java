import java.util.Random;
import java.util.Scanner;

public class Game {
  Person player1;
  
  private static String[] deck = {"가위", "바위", "보"};
  
  public Game(Person player1) {
    this.player1 = player1;
  }

  public String start() {
    try(Scanner deck1 = new Scanner(System.in);)  {
        Person computer = new Person();
            
            System.out.println("player1: 가위,바위,보 중 하나를 입력해주세요.");
            
            this.player1.deck = deck1.next();
    
            Random random = new Random();
            int random_num = random.nextInt(deck.length);
            computer.deck = deck[random_num];
    
            System.out.println(computer.deck);
    
            String msg = "";
            if(player1.deck.equals(deck[0])) {
                if(computer.deck.equals(deck[1])) {
                     msg = "패배";
                    } else if(computer.deck.equals(deck[2])) {
                        msg = "승리";
                    } else {
                        msg = "무승부";
                    }
            } else if(this.player1.deck.equals(deck[1])) {
                if(computer.deck.equals(deck[2])) {
                    msg = "패배";
                    } else if(computer.deck.equals(deck[0])) {
                        msg = "승리";
                    } else {
                        msg = "무승부";
                    }
            } else {
                if(computer.deck.equals(deck[0])) {
                    msg = "패배";
                    } else if(computer.deck.equals(deck[1])) {
                        msg = "승리";
                    } else {
                        msg = "무승부";
                    }
            }

            return msg;
        }

    }

  }