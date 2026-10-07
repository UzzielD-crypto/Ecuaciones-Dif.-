import java.util.Scanner;

public class Lanzador_gauss {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("-----------------------------------------------");
        System.out.println("    MÉTODO DE GAUSS - MÉTODOS NUMÉRICOS        ");
        System.out.println("-----------------------------------------------");
        System.out.println("    1. Ingresar datos por consola              ");
        System.out.println("2. Usar matriz por defecto del ejemplo en clase");
        System.out.print("    Seleccione una opción:                       ");
        int opcion = scanner.nextInt();

        double[][] matriz;

        if (opcion == 1) {
            // 1. Lectura por consola
            matriz = defmatriz.leerMatrizPorConsola();
        } else {
            // 2. Carga matriz predeterminada
            matriz = defmatriz.defmatriz();
        }

        // 3. Aplicar la eliminación gaussiana
        Gauss.eliminacionGaussiana(matriz);

        // 4. Obtener los resultados mediante sustitución regresiva
        double[] soluciones = Gauss.sustitucionRegresiva(matriz);

        // 5. Imprimir resultados finales
        System.out.println("\n Soluciones del sistema:");
        for (int i = 0; i < soluciones.length; i++) {
            System.out.printf("x%d = %.4f\n", (i + 1), soluciones[i]);
        }
    }
}