package basicEgorov._06_05_2023;

import java.util.ArrayList;
import java.util.Collections;

public class GamePlay {

    static class Player {
        String name;
        int age;
        String ligname;
        int point;

        public Player(String name, int age, String ligname) {
            this.name = name;
            this.age = age;
            this.ligname = ligname;
            this.point = 0;
        }

        // Метод для вывода информации о игроке
        public void printInfo() {
            System.out.println("Имя: " + name + ", Возраст: " + age + ", Лига: " + ligname + ", Баллы: " + point);
        }
    }

    static class League {
        ArrayList<Player> players;

        public League() {
            players = new ArrayList<>();
        }

        // Метод для добавления игрока в лигу
        public void addPlayer(Player player) {
            players.add(player);
        }

        // Метод для проведения игр и подсчета баллов
        public void play() {
            for (int i = 0; i < players.size(); i++) {
                for (int j = i + 1; j < players.size(); j++) {
                    Player player1 = players.get(i);
                    Player player2 = players.get(j);

                    // Проводим игру между двумя игроками и определяем победителя
                    int result = (int) (Math.random() * 2);
                    if (result == 0) {
                        player1.point++;
                    } else {
                        player2.point++;
                    }
                }
            }
        }

        // Метод для сортировки игроков по убыванию баллов
        public void sortPlayersByPoints() {
            Collections.sort(players, (o1, o2) -> o2.point - o1.point);
        }

        // Метод для вывода информации о игроках в лиге
        public void printPlayersInfo() {
            System.out.println("Игроки в лиге:");
            for (Player player : players) {
                player.printInfo();
            }
        }
    }

}
class Main {
    public static void main(String[] args) {
        // Создаем 4 лиги
        GamePlay.League league1 = new GamePlay.League();
        GamePlay.League league2 = new GamePlay.League();
        GamePlay.League league3 = new GamePlay.League();
        GamePlay.League league4 = new GamePlay.League();

        // Создаем 4 игрока в каждой лиге
        GamePlay.Player player1 = new GamePlay.Player("Игрок1", 20, "Лига1");
        GamePlay.Player player2 = new GamePlay.Player("Игрок2", 22, "Лига1");
        GamePlay.Player player3 = new GamePlay.Player("Игрок3", 25, "Лига1");
        GamePlay.Player player4 = new GamePlay.Player("Игрок4", 21, "Лига1");
        GamePlay.Player player5 = new GamePlay.Player("Игрок5", 24, "Лига2");
        GamePlay.Player player6 = new GamePlay.Player("Игрок6", 26, "Лига2");
        GamePlay.Player player7 = new GamePlay.Player("Игрок7", 23, "Лига2");
        GamePlay.Player player8 = new GamePlay.Player("Игрок8", 22, "Лига2");
        GamePlay.Player player9 = new GamePlay.Player("Игрок9", 21, "Лига3");
        GamePlay.Player player10 = new GamePlay.Player("Игрок10", 20, "Лига3");
        GamePlay.Player player11 = new GamePlay.Player("Игрок11", 23, "Лига3");
        GamePlay.Player player12 = new GamePlay.Player("Игрок12", 24, "Лига3");
        GamePlay.Player player13 = new GamePlay.Player("Игрок13", 22, "Лига4");
        GamePlay.Player player14 = new GamePlay.Player("Игрок14", 25, "Лига4");
        GamePlay.Player player15 = new GamePlay.Player("Игрок15", 24, "Лига4");
        GamePlay.Player player16 = new GamePlay.Player("Игрок16", 23, "Лига4");

        // Добавляем игроков в соответствующие лиги
        league1.addPlayer(player1);
        league1.addPlayer(player2);
        league1.addPlayer(player3);
        league1.addPlayer(player4);

        league2.addPlayer(player5);
        league2.addPlayer(player6);
        league2.addPlayer(player7);
        league2.addPlayer(player8);

        league3.addPlayer(player9);
        league3.addPlayer(player10);
        league3.addPlayer(player11);
        league3.addPlayer(player12);

        league4.addPlayer(player13);
        league4.addPlayer(player14);
        league4.addPlayer(player15);
        league4.addPlayer(player16);

        // Проводим игры в каждой лиге
        league1.play();
        league2.play();
        league3.play();
        league4.play();

        // Сортируем игроков по убыванию баллов и выводим информацию о игроках в каждой лиге
        league1.sortPlayersByPoints();
        System.out.println("Лига 1:");
        league1.printPlayersInfo();

        league2.sortPlayersByPoints();
        System.out.println("Лига 2:");
        league2.printPlayersInfo();

        league3.sortPlayersByPoints();
        System.out.println("Лига 3:");
        league3.printPlayersInfo();

        league4.sortPlayersByPoints();
        System.out.println("Лига 4:");
        league4.printPlayersInfo();
    }

}
