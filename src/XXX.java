class XXX {
    public static void main(String[] args) {
        String[][] twoDimArray = new String[9][9];

        for (int i = 0; i < twoDimArray.length; i++) {
            for (int j = 0; j < twoDimArray.length; j++) {
                if (i == j || i == 9 - j - 1 || i == 9 / 2 || j == 9 / 2) {
                    twoDimArray[i][j] = "*";
                } else {
                    twoDimArray[i][j] = ".";
                }
            }
        }
        for (String[] strings : twoDimArray) {
            for (int c = 0; c < twoDimArray.length; c++) {
                System.out.print(strings[c] + " ");
            }
            System.out.println();
        }
    }
}
