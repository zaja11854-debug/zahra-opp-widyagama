class Game {
    String judul;
    String genre;

    Game(String judul, String genre) {
        this.judul = judul;
        this.genre = genre;
    }

    public static void main(String[] args) {
        Game game1 = new Game("Mobile Legends", "MOBA");
        Game game2 = new Game("Minecraft", "Sandbox");

        System.out.println("Judul: " + game1.judul);
        System.out.println("Genre: " + game1.genre);

        System.out.println("Judul: " + game2.judul);
        System.out.println("Genre: " + game2.genre);
    }
}