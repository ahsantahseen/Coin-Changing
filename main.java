class coinChange {
    // Initializing an array to store the coins needed for change
    static int[] MinCoins = new int[200];

    // Intializing the function for coins needed
    static int getMinCoins(int[] coins, int value) {
        // Initializing counter aka number of coins needed
        int counter = 0;
        // looping till coins array length
        for (int i = 0; i < coins.length; i++) {
            // while value is greater than or equal to a coin
            while (value >= coins[i]) {
                // Whenever true subract value from coin, example 1998-1000, so that we can get
                // 1 coin counter and store it in the variable
                value -= coins[i];
                MinCoins[counter] = coins[i];
                counter++;
            }
            // if 0 then just break since we aint got no 0
            if (value == 0) {
                break;
            }
        }
        // Return number of Coins needed as each cycle in loop required a coin
        return counter;
    }

    public static void main(String[] args) {
        // Initializing fundemantal stuff
        int coins[] = { 1000, 500, 100, 50, 20, 10, 5, 2, 1 };
        // Storing result of number of coins in variable
        int m = getMinCoins(coins, 1998);
        // Outputting the Results
        System.out.println("The number of coins needed are " + m);
        System.out.println("The coins are:");
        for (int i = 0; i < m; i++) {
            System.out.print(MinCoins[i] + " ");
        }
    }
}