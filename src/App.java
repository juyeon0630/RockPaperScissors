

public class App {
    public static void main(String[] args) throws Exception {

        var player1 = new Person();
        var game = new Game(player1);

        String msg = game.start();

        System.out.printf(msg);

    }
}
