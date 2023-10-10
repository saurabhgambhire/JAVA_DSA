package Recursion;

public class Ruler {
    public static void main(String[] args) {
        drawOneTick(4,-1);
        drawTicks(1);
        drawRuler(2,1);
    }

    private static void drawRuler(int nInches, int majorLength) {
        drawOneTick(majorLength,0);
        for (int i = 0; i < nInches; i++) {
            drawTicks(majorLength-1);
            drawOneTick(majorLength,i);
        }
    }

    private static void drawTicks(int tickLength) {
        if (tickLength>0)
        {
            drawTicks(tickLength-1);
            drawOneTick(tickLength,-1);
            drawTicks(tickLength-1);
        }
    }

    public static void drawOneTick(int tickLength, int tickLabel)
    {
        for (int i = 0; i < tickLength; i++) {
            System.out.print("-");
            if (tickLabel>=0)
                System.out.print(" "+tickLabel  );
            System.out.println();
        }
    }

}
