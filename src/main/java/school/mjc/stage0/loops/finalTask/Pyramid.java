package school.mjc.stage0.loops.finalTask;

public class Pyramid {
    public void printPyramid(int cathetusLength) {
        for (int i = 0; i <cathetusLength; i++) {
            for (int j = 0; j <cathetusLength*2-1 ; j++) {
                if(j<cathetusLength-1-i)
                    System.out.print(" ");
                else if (j>cathetusLength-1+i) {
                    System.out.print("");
                } else{
                    if(j<cathetusLength)
                    System.out.print(cathetusLength-j);
                    else
                        System.out.print(j-cathetusLength+2);
                }
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        new Pyramid().printPyramid(7);
    }
}
