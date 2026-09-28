class Solution {
    public int[] asteroidCollision(int[] asteroids) {

        int[] stack = new int[asteroids.length];
        int top = 0;

        for (int a : asteroids) {

            boolean destroyed = false;

            while (top > 0 && stack[top - 1] > 0 && a < 0) {

                if (stack[top - 1] < -a) {
                    top--;          
                    continue;
                }

                else if (stack[top - 1] == -a) {
                    top--;            
                }

                destroyed = true;
                break;
            }

            if (!destroyed) {
                stack[top++] = a;
            }
        }

        return Arrays.copyOf(stack, top);
    }
}