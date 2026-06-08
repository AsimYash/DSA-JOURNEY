class Solution {
    public int minOperations(String[] logs) {
        int n = 0;
        for (int i = 0; i<logs.length; i++){
              if (logs[i].equals("../")){
                if (n>0)
                n--;
              }
              else if (logs[i].equals("./"))
              n = n;
              else
              n++;
        }
        return n;
    }
}
