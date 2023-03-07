 public class Program {
    public static void main(String[] args) throws ParseException {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter with the matrix lines number: ");
        int line = sc.nextInt();
        System.out.print("Enter with the matrix column number: ");
        int column = sc.nextInt();
        int[][] matrix = new int[line][column];
        for(int i=0;i<line;i++) {
            for (int j = 0; j < column; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }
        System.out.print("Enter with the number to research: ");
        int numberResearch = sc.nextInt();
        for(int i=0;i<line;i++) {
            for (int j = 0; j < column; j++) {
                if (matrix[i][j] == numberResearch) {
                    System.out.println("Position " + i + "," + j);
                    if ((j - 1) >= 0) {
                        System.out.println("Left: " + matrix[i][j - 1]);
                    }
                    if ((i - 1) >= 0) {
                        System.out.println("Up: " + matrix[i - 1][j]);
                    }
                    if ((j + 1) <= (column-1)) {
                        System.out.println("Right: " + matrix[i][j + 1]);
                    }
                    if ((i + 1) <= (line-1)) {
                        System.out.println("Down: " + matrix[i + 1][j]);
                    }
                    System.out.println();
                }
            }
        }

	sc.close();

	}
}