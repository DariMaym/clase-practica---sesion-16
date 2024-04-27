import java.util.Scanner;
//Darien José Mayorga Moreno
//numero de carnet: 2024-1356U

public class App {

public static int num1;
public static int num2;
public static int num3;
//usado el Math evaluamos los numero para saber cuales son los menores y sumarlos
public static int sumarnumerosmenores (int num1,int num2, int num3){
    int nummenor1= Math.min(num1, num2) ;
    int nummenor2= Math.min(Math.max(num1, num2), num3) ;
    return nummenor1+nummenor2; 
}
//de igual forma, volvemos a ocupar el math para evaluar los numeros
    public static int restarnumerosgrandes (int num1, int num2, int num3){
        int nummayor= Math.max(num1, num2);
        int nummayor2= Math.max(Math.min(num1, num2), num3);
        //con esta condición evitamos que el resultado de la resta sea negativo 
        if (nummayor2>nummayor) {
            return nummayor2-nummayor;
        }else {
            return nummayor-nummayor2; 
        }
}


public static void main(String[] args) throws Exception {

        Scanner leer = new Scanner(System.in);
        do {

            try {
                System.out.println("Ingrese tres numeros enteros diferentes");
                num1 = leer.nextInt();
                num2 = leer.nextInt();
                num3 = leer.nextInt();
            } catch (Exception e) {
                System.out.println(e);
                System.out.println("Ingrese valores correctos");
                leer.nextLine();
            }

    } while (num1 == num2 || num1 == num3 || num2 == num3);

    //Imrpimimos los resultados
    System.out.println("La suma de los dos numeros más pequeños es: "+ sumarnumerosmenores(num1, num2, num3));
    System.out.println("La resta de los dos numeros mas grandes es: " + restarnumerosgrandes(num1, num2, num3));

    //evaluar cual es el mayor, podía haberse hecho con el math tambien
    if (num1>num2 && num1>num3) {
        System.out.println("El numero mayor es: " + num1);
    }

    if (num2>num1 && num2>num3) {
        System.out.println("El numero mayor es: " + num2);
    }

    if (num3>num1 && num3>num2) {
        System.out.println("El numero mayor es: " + num3);
    }
    leer.close();

    //yo lo habia hecho solo con if-else, pero como mencionó que utilizaramos metodos apliqué el math
    //el math simplifica las operaciones pero al incio fue algo complidito entenderlo, un amigo me lo tuvo que explicar

    }
}
