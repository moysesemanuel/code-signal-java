/*O desafio aqui é encontrar o bug e resolver para que o código rode normalmente. 
 * O erro estava em que a variável planets estava 8planets, e o nome da variável não pode começar com um número.
*/
package condeSignal.desafio;

public class desafio3 {
    public static void main(String[] args) {
        int earthOrbitRadius = 149600000; //em quilometros.
        System.err.println("The Earth's orbit radius is " + earthOrbitRadius + " kilometers.");

        int planets = 8;
        System.out.println("There are " + planets + " planets in the Solar System.");
    }
}
