class Solution {
   private static final int MOD = (int) (1e9 + 7);
private static final int[] DIRS = {-1, 0, 1};

public int numWays(int steps, int arrLen) {
    return numWays(steps, arrLen, 0, new HashMap<>());
}

private int numWays(int steps, int arrLen, int i, Map<Pair, Integer> memo) {
    if (i < 0 || i >= arrLen)
        return 0;
    if (steps == 0)
        return i == 0 ? 1 : 0;

    var key = new Pair(steps--, i);
    if (memo.containsKey(key))
        return memo.get(key);

    var ways = 0L;
    for (var dir : DIRS)
        ways += numWays(steps, arrLen, i + dir, memo);

    memo.put(key, (int) (ways % MOD));
    return memo.get(key);
}
}