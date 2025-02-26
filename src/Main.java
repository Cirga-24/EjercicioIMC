import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        /*Ejercicio de masa corporal
        *
        * imc = peso/(Estatura * Estatura)
        * <18.49 = bajo
        * 18.50 -> 24.99 = normal
        * 25 -> 29.99 = Sobrepeso
        * 30 -> 34.99 = Obesidad Leve
        * 35 -> 39.99 = Obesidad media
        * >40 = Obesidad Mórbida
        *
        * */

        Scanner teclado = new Scanner(System.in);
        teclado.useLocale(Locale.US);
        double peso, estatura, imc;
        boolean anormal = false;
        String indice = "";
        System.out.println("Ingrese su peso:");
        peso = teclado.nextDouble();
        System.out.println("Ingrese su altura:");
        estatura = teclado.nextDouble();

        imc = peso/(estatura*estatura);

        if (imc < 18.49){indice = "Peso bajo"; anormal = true;}
        else if (imc > 18.5 && imc < 24.99){indice = "Peso normal"; anormal = false;}
        else if (imc > 25 && imc < 29.99){indice = "Sobrepeso"; anormal = true;}
        else if (imc > 30 && imc < 34.99){indice = "Obesidad Leve"; anormal = true;}
        else if (imc > 35 && imc < 39.99){indice = "Obesidad Media"; anormal = true;}
        else if (imc > 40){indice = "Obesidad Mórbida"; anormal = true;}

        if (anormal = true){
            System.out.println("Usted padece de " + indice);
        } else {
            System.out.println("Felicidades, está en un rango normal de índice de masa corporal");
        }
    }

}