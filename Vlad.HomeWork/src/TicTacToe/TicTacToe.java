package TicTacToe;

import java.util.Scanner;


public class TicTacToe {
    public static void main(String[] args) {
        char[][] table = {{'*', '1', '2', '3'},
                {'1', '_', '_', '_'},
                {'2', '_', '_', '_'},
                {'3', '_', '_', '_'}};
        ShowArray(table);
        int x;
        int y;
        //счёт ходов
        for (int i = 0; i < 10; i++) {
            //проверка на ничью
            if (i == 9) {
                System.out.println("В игре ничья");
                return;
            } else {
                //определяем какой игрок по очереди ходит
                //ход игрока
                if (i % 2 == 0) {
                    do {
                        System.out.print("Игрок №1 выберете строку от 1 до 3: ");
                        Scanner scan = new Scanner(System.in);
                        x = scan.nextInt();
                        while (!(x > 0 && x < 4)){
                            System.out.println("Не верно!!!! Введи от 1 до 3");
                            x = scan.nextInt();
                        }
                        System.out.print("Игрок №1 выберете столбик от 1 до 3: ");
                        y = scan.nextInt();
                        while (!(y > 0 && y < 4)){
                            System.out.println("Не верно!!!! Введи от 1 до 3");
                            y = scan.nextInt();
                        }
                        if (table[x][y] == 'x' || table[x][y] == 'o') {
                            System.out.println("Вы так уже ходили!");
                        }


                        //проверяем на соответсвие хода, а также на повтор хода
                    } while (table[x][y] == 'x' || table[x][y] == 'o');
                    table[x][y] = 'x';
                } else {
                    do {
                        System.out.print("Игрок №2 выберете строку от 1 до 3: ");
                        Scanner scan = new Scanner(System.in);
                        x = scan.nextInt();
                        while (!(x > 0 && x < 4)){
                            System.out.println("Не верно!!!! Введи от 1 до 3");
                            x = scan.nextInt();
                        }
                        System.out.print("Игрок №2 выберете столбик от 1 до 3: ");
                        y = scan.nextInt();
                        while (!(y > 0 && y < 4)){
                            System.out.println("Не верно!!!! Введи от 1 до 3");
                            y = scan.nextInt();
                        }
                        if (table[x][y] == 'x' || table[x][y] == 'o') {
                            System.out.println("Вы так уже ходили!");
                        }

                        //проверяем на соответсвие хода, а также на повтор хода
                    } while (table[x][y] == 'x' || table[x][y] == 'o');

                    table[x][y] = 'o';
                }
                ShowArray(table);

                if (ConditioneOfVictory(table, i))
                    return;
            }
        }

    }
    //Условие победы
    private static boolean ConditioneOfVictory(char[][] table, int i) {
        for (int j = 1; j < 4; j++) {
            if (table[j][1] == table[j][2] && table[j][1] == table[j][3] && (table[j][1] == 'x' || table[j][1] == 'o')) {
                WinnerPerson(i);
                return true;
            }
            if (table[1][j] == table[2][j] && table[1][j] == table[3][j] && (table[1][j] == 'x' || table[1][j] == 'o')) {
                WinnerPerson(i);
                return true;
            }
        }
        if (table[1][1] == table[2][2] && table[1][1] == table[3][3] && (table[1][1] == 'x' || table[1][1] == 'o')) {
            WinnerPerson(i);
            return true;
        }
        if (table[1][3] == table[2][2] && table[1][3] == table[3][1] && (table[1][3] == 'x' || table[1][3] == 'o')) {
            WinnerPerson(i);
            return true;
        }
        return false;
    }

    private static void WinnerPerson(int i) {
        if (i % 2 == 0) {
            System.out.println("Игра окончена, победил Игрок №1");
        } else {
            System.out.println("Игра окончена, победил Игрок №2");
        }
    }

    private static void ShowArray(char[][] table) {
        for (char[] aTable : table) {
            for (char anATable : aTable) {
                System.out.print(anATable + " ");
            }
            System.out.println();
        }
    }
}