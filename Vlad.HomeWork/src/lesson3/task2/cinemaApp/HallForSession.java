package lesson3.task2.cinemaApp;


public class HallForSession {

    private boolean[][] seats;

    HallForSession(int rowNumber, int placeInRow) {
        this.seats = new boolean[rowNumber][placeInRow];
    }

    void reserve(int rowNumber, int placeInRow) {
        if (!isReserve(rowNumber, placeInRow)) {
            this.seats[rowNumber][placeInRow] = true;
        }
    }

    private Boolean isReserve(int rowNumber, int placeInRow) {
        return seats[rowNumber][placeInRow];
    }

    int freeCount() {
        int result = 0;
        for (boolean[] row : seats) {
            for (boolean place : row) {
                if (!place) {
                    result++;
                }
            }
        }
        return result;

    }

    int reserveCount() {
        int result = 0;
        for (boolean[] row : seats) {
            for (boolean place : row) {
                if (place) {
                    result++;
                }
            }
        }
        return result;
    }

    @Override
    public String toString() {
        return (seats == null ? null : printSeats(seats));
    }

    private String printSeats(boolean[][] seats) {
        boolean flag = true;
        for (int i = 0; i < seats.length; i++) {
            boolean[] row = seats[i];
            for (boolean aRow : row) {
                while (flag) {
                    for (int k = 1; k <= row.length; k++) {
                        if (k < 10) {
                            System.out.print(" " + k + " ");
                        } else {
                            System.out.print(" " + k);
                        }
                    }
                    System.out.println();
                    flag = false;
                }

                boolean seat = aRow;
                if (seat) {
                    System.out.print("[X]");
                } else {
                    System.out.print("[ ]");
                }
            }
            System.out.print("(" + (i + 1) + ")");
            System.out.println();
        }

        return "";
    }
}
