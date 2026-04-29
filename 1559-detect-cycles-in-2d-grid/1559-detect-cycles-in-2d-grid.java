class Solution {

    public boolean containsCycle(char[][] grid) {
        int m = grid.length, n = grid[0].length;
        boolean[][] visited = new boolean[m][n];

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (!visited[i][j]) {
                    if (dfs(grid, visited, i, j, -1, -1)) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    private boolean dfs(char[][] grid, boolean[][] visited, int r, int c, int pr, int pc) {

        visited[r][c] = true;

        int[] dr = {-1, 1, 0, 0};
        int[] dc = {0, 0, -1, 1};

        for (int d = 0; d < 4; d++) {
            int nr = r + dr[d];
            int nc = c + dc[d];

            if (nr < 0 || nc < 0 || nr >= grid.length || nc >= grid[0].length)
                continue;

            if (grid[nr][nc] != grid[r][c])
                continue;

            if (!visited[nr][nc]) {
                if (dfs(grid, visited, nr, nc, r, c))
                    return true;
            } else if (nr != pr || nc != pc) {
                // visited and not parent → cycle
                return true;
            }
        }

        return false;
    }
}