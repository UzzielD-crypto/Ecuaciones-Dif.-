import java.util.Scanner;

public class defmatriz {

    // Método que solicita la matriz al usuario por consola
    public static double[][] leerMatrizPorConsola() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese el número de ecuaciones (variables): ");
        int n = scanner.nextInt();

        double[][] matriz = new double[n][n + 1];

        System.out.println("\nIngrese los coeficientes y el término independiente para cada ecuación:");
        for (int i = 0; i < n; i++) {
            System.out.println("Ecuación " + (i + 1) + ":");
            for (int j = 0; j < n; j++) {
                System.out.print("  Coeficiente x" + (j + 1) + ": ");
                matriz[i][j] = scanner.nextDouble();
            }
            System.out.print("  Término independiente (b" + (i + 1) + "): ");
            matriz[i][n] = scanner.nextDouble();
        }
        return matriz;
    }

    // Método original visto en clase (matriz predeterminada)
    public static double[][] defmatriz() {
        return new double[][] {
                { 3.0, -0.1, -0.2,  7.85 },
                { 0.1,  7.0, -0.3, -19.3 },
                { 0.3, -0.2, 10.0,  71.4 }
        };
    }
}
