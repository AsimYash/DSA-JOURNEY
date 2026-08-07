class Solution {
    public int canCompleteCircuit(int[] gas, int[] cost) {
        int totalGas = 0;
        int totalCost = 0;
        int fuel = 0;
        int start = 0;
        for (int i = 0; i < gas.length; i++) {
            totalGas = totalGas+gas[i];
            totalCost = totalCost+cost[i];
            fuel = fuel+gas[i] - cost[i];
            if (fuel < 0){
                start = i + 1;
                fuel = 0;
            }
        }
        if (totalGas < totalCost)
        return -1;
        return start;
    }
}
