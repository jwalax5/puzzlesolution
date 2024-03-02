package com.puzzlesolution;


import lombok.Data;


@Data
public class Board {
    private Size size;
    private Orb[][] orbs;

    // 2D array of com.puzzlesolution.Orb
    public enum Size {
        LARGE,
        NORMAL,
        SMALL;
    }

    public Board(Size size) {
        this.size = size;
        setUpBoard();
        fillBoard();
        printOrbs();
    }

    public void setUpBoard() {
        switch (this.size) {
            case LARGE:
                orbs = new Orb[7][6];
                break;
            case NORMAL:
                orbs = new Orb[6][5];
                break;
            case SMALL:
                orbs = new Orb[5][4];
                break;
            default:
                throw new RuntimeException("No board size!");
        }
    }

    public void fillBoard(){
        for(int i=0;i< orbs.length;i++){
            for(int j=0;j<orbs[0].length;j++){
                orbs[i][j] = Orb.generateRandomOrb();
            }
        }
    }
    public void printOrbs() {
        System.out.println("board heigh " + orbs[0].length);
        System.out.println("board weight " + orbs.length);

        for(int i=0;i< orbs.length;i++){
            for(int j=0;j<orbs[0].length;j++){
                System.out.println("x:" + i + "y:" + j + " orb : " +orbs[i][j].name());
            }
        }
    }
}
