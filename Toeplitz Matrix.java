class Main {

    public static void main(String[] args) {

        int[][] matrix = {
            {1, 2, 3},
            {4, 1, 2},
            {5, 4, 1}
        };

        boolean result = true;

        for (int i = 1; i < 3; i++) {
            for (int j = 1; j < 3; j++) {

                if (matrix[i][j] != matrix[i - 1][j - 1]) {
                    result = false;
                }
            }
        }

        System.out.println(result);
    }
}