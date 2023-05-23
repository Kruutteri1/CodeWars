package kyu4;

/**
 *  4 kyu - Codewars style ranking system.
 *
 *  https://www.codewars.com/kata/51fda2d95d6efda45e00004e/java
 *
 *
 *  DESCRIPTION:
 * Write a class called User that is used to calculate the amount that a user will progress through a ranking system similar to the one Codewars uses.
 */



public class RankSystem {
    int rank = -8;
    int progress = 0;

    public void incProgress(int rank) {
        if (rank < -8 || rank > 8 || rank == 0) {
            throw new IllegalArgumentException("Invalid rank value: " + this.rank);
        }
        if (this.rank < 0 && rank > 0) {
            rank--;
        }
        if (this.rank > 0 && rank < 0) {
            rank++;
        }
        if (this.rank == rank) {
            this.progress += 3;
        }
        if (this.rank - 1 == rank) {
            this.progress += 1;
        }
        if (this.rank - 2 >= rank) {
            this.progress += 0;
        }

        if (this.rank < rank) {
            int d = rank - this.rank;
            this.progress += (10 * d * d);
        }

        while (this.progress >= 100 && this.rank < 8) {
            if (++this.rank == 0) {
                this.rank++;
            }
            this.progress -= 100;
        }

        if (this.rank == 8) {
            this.progress = 0;
        }
    }
}