package Lesson04;

import java.util.Scanner;

public class Lesson04 {

    static Scanner sc = new Scanner(System.in);
    static int PLAYERX, PLAYERY;
    static int ENDX, ENDY;
    static int ENEMYX, ENEMYY;
    static char[][] MAP = new char[5][5];
    static int TURN = 10;

    public static void main(String[] args) {
        PLAYERX = 2;
        PLAYERY = 2;

        do {
            ENDX = (int) (Math.random() * 4);
            ENDY = (int) (Math.random() * 4);
        } 
        while (ENDX == PLAYERX && ENDY == PLAYERY);

        for (int x = 0; x < MAP.length; x++) {
            for (int y = 0; y < MAP[0].length; y++) {
                if (x == PLAYERX && y == PLAYERY) {
                    MAP[x][y] = 'X';
                } else if (x == ENDX && y == ENDY) {
                    MAP[x][y] = 'O';
                } else {
                    MAP[x][y] = '-';
                }
            }
        }

        while (true) {
            loadMap();
            char input = input();
            move(input);
            switch(check()){
                case 1:
                    System.out.println("WIN");
                    break;
                default:
                    System.out.println("Sap den roi cu tim de");
            } 
        }
    }

    private static void loadMap() {
        for (int x = 0; x < MAP.length; x++) {
            for (int y = 0; y < MAP[0].length; y++) {
                System.out.print(MAP[x][y] + " ");
            }
            System.out.println();
        }
    }

    public static char input() {
        System.out.print("Nhap vao WASD: ");
        String value = sc.nextLine();  //String, output => char
        return value.charAt(0);
    }

    private static void move(char input) {
        switch (input) {
            case 'W':
                if (PLAYERX == 0) {
                    MAP[PLAYERX][PLAYERY] = '-';
                    PLAYERX=4;
                    MAP[PLAYERX][PLAYERY] = 'X';
                } else {
                    MAP[PLAYERX][PLAYERY] = '-';
                    PLAYERX--;
                    MAP[PLAYERX][PLAYERY] = 'X';
                }
                /*
                MAP[PLAYERX][PLAYERY] = '-';
                PLAYERX = (PLAYERX - 1 +5)%5;
                MAP[PLAYERX][PLAYERY] = 'X';
                */
                break;
            case 'A':
                if (PLAYERY == 0) {
                    MAP[PLAYERX][PLAYERY] = '-';
                    PLAYERX=4;
                    MAP[PLAYERX][PLAYERY] = 'X';
                } else {
                    MAP[PLAYERX][PLAYERY] = '-';
                    PLAYERY--;
                    MAP[PLAYERX][PLAYERY] = 'X';
                }
                /*
                MAP[PLAYERX][PLAYERY] = '-';
                PLAYERY = (PLAYERY - 1 +5)%5;
                MAP[PLAYERX][PLAYERY] = 'X';
                */
                break;
            case 'S':
                if (PLAYERX == 4) {
                    MAP[PLAYERX][PLAYERY] = '-';
                    PLAYERX=0;
                    MAP[PLAYERX][PLAYERY] = 'X';
                } else {
                    MAP[PLAYERX][PLAYERY] = '-';
                    PLAYERX++;
                    MAP[PLAYERX][PLAYERY] = 'X';
                }
                /*
                MAP[PLAYERX][PLAYERY]='-';
                PLAYERX = (PLAYERX+1)%5;
                MAP[PLAYERX][PLAYERY]='X';
                NHIN NGUY HIEM HON
                */
                break;
            case 'D':
                if (PLAYERY == 4) {
                    MAP[PLAYERX][PLAYERY] = '-';
                    PLAYERY=0;
                    MAP[PLAYERX][PLAYERY] = 'X';
                } else {
                    MAP[PLAYERX][PLAYERY] = '-';
                    PLAYERY++;
                    MAP[PLAYERX][PLAYERY] = 'X';
                }
                break;
                /*
                MAP[PLAYERX][PLAYERY]='-';
                PLAYERY = (PLAYERY+1)%5;
                MAP[PLAYERX][PLAYERY]='X';
                */
        }
        TURN--;
    }

    private static int check() {
        if (PLAYERX == ENDX && PLAYERY == ENDY) {
            return 1;
        }
        else{
            if(TURN==0 || (PLAYERX == ENEMYX && PLAYERY == ENEMYY) || (ENEMYX == ENDX && ENEMYY == ENDY)){
                return -1;
            }
            return 0;
        }
    }
    
    private static void enemy(){
        
    }
}