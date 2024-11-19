package es.jmg;
/**
    4. Write a Java program to print the results of the following operations.
    Test Data:
    a. -5 + 8 * 6
    b. (55+9) % 9
    c. 20 + -3*5 / 8
    d. 5 + 15 / 3 * 2 - 8 % 3
    Expected Output :
    43
    1
    19
    13
 */
public class Basico04 {
    // private. Varriables quedan encapsuladas. 
    // Si queremos acceder a ellas desde un método estático=> variables también estáticas
    private static int a;
    private static int b;
    private static int c;
    private static int d;

    private static void calcularSeries(){
        a = -5 + 8 * 6;
        b = (55+9) % 9;
        c = 20 + -3*5 / 8;
        d = 5 + 15 / 3 * 2 - 8 % 3;

    }
    public static void main(String[] args) {
        // Prohibido usar System.out.println(); Ahh!. Usar puntos de ruptura y depurar.
        calcularSeries();
    }
}
/* Orden de preferencia de los operadores matemáticos enn Java:
1º ()
2º *, / , %
3º +, -
 */