public class TrapedWater {

    /**
     * @param h
     * @return
     */
    public static int trapedWater(int h[]){
        //left maxBoundary from array
        int leftMax[] = new int[h.length];
        leftMax[0] = h[0];
        for(int i=1; i<h.length; i++){
            leftMax[i] = Math.max(h[i], leftMax[i-1]);
        }

        //right max Boundary from array

        int rightMax[] = new int[h.length];
        rightMax[h.length - 1] = h[h.length - 1];

        for(int i=h.length - 2; i>=0; i--){
            rightMax[i] = Math.max(h[i], rightMax[i+1]);
        }

        int trapedWater = 0;
        for(int i=0; i<h.length; i++){
            int waterlevel = Math.min(leftMax[i], rightMax[i]);
            h[i];
        }
        return trapedWater;
    }

    public static void main(String[] args) {
        int h[] =  {0, 1, 0, 2, 1, 0, 1, 3, 2, 1, 2, 1} ;

        System.out.println(trapedWater(h));
    }
}
