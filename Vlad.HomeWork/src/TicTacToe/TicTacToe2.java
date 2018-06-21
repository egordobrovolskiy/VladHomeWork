package TicTacToe;


import java.util.Scanner;

public class TicTacToe2 {
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
                        System.out.print("Игрок №1 выберете столбик от 1 до 3: ");
                        y = scan.nextInt();
                        if ((x < 1 || x > 4) || (y < 1 || y > 4) || table[x][y] == 'x' || table[x][y] == 'o') {
                            System.out.println("Ход не верный, попробуй ещё раз!");
                        }


                        //проверяем на соответсвие хода, а также на повтор хода
                    } while ((x < 1 || x > 4) || (y < 1 || y > 4) || (table[x][y] == 'x' || table[x][y] == 'o'));
                    table[x][y] = 'x';
                } else {
                    do {
                        System.out.print("Игрок №2 выберете строку от 1 до 3: ");
                        Scanner scan = new Scanner(System.in);
                        x = scan.nextInt();
                        System.out.print("Игрок №2 выберете столбик от 1 до 3: ");
                        y = scan.nextInt();
                        if ((x < 1 || x > 4) || (y < 1 || y > 4) || table[x][y] == 'x' || table[x][y] == 'o') {
                            System.out.println("Ход не верный, попробуй ещё раз!");
                        }

                        //проверяем на соответсвие хода, а также на повтор хода
                    } while ((x < 1 || x > 4) || (y < 1 || y > 4) || (table[x][y] == 'x' || table[x][y] == 'o'));

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
            if (table[1][j] == table[2][j] && table[1][j] == table[3][j] && (table[j][1] == 'x' || table[j][1] == 'o')) {
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
        for (int i = 0; i < table.length; i++) {
            for (int j = 0; j < table[i].length; j++) {
                System.out.print(table[i][j] + " ");
            }
            System.out.println();
        }
    }
}