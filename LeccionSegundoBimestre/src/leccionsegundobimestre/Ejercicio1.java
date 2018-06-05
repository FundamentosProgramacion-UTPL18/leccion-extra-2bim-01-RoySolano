/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package leccionsegundobimestre;

/**
 *
 * @author Usuario
 */
public class Ejercicio1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double [] arreglo1 = {110,220,430,140,250,460};
        double [] arreglo2 = {10,20,30,40,50,60};
        double division;//variable que almacena temporalmente el nuevo valor del arreglo 3
        double [] arreglo3 = new double[arreglo1.length];
        double promedio = 0;// promedio entre los valores del arreglo 3
        double suma_arreglo3 = 0;//variable acumuladora de los valores del arreglo 3
        for (int contador = 0; contador < arreglo1.length; contador++){//ciclo para operar con los valores de los arreglo 1 y 2
            division = arreglo1[contador]/arreglo2[contador];
            arreglo3[contador] = division;// insertación del valor correspondiente en el arreglo 3
        }
        for (int contador2 = 0; contador2 < arreglo1.length; contador2++){//ciclo para operar con los valores del arreglo 3
            suma_arreglo3 = suma_arreglo3+arreglo3[contador2];
            promedio = (suma_arreglo3)/(contador2+1);
        }
        System.out.println("Reporte");//presentación del primer encabezado
        System.out.printf("%-12s%-12s%s\n","Arreglo1","Arreglo2","Resultado");//presentación de los encabezados siguientes
        for (int contador3 = 0; contador3 < arreglo1.length; contador3++){//ciclo para la presentación del cuerpo del reporte
            System.out.printf("%-12.2f%-12.2f%.2f\n",arreglo1[contador3],arreglo2[contador3],arreglo3[contador3]);
        }
        System.out.printf("El promedio del arreglo 3 es: %.2f\n",promedio);// presentación del promedio entre los valores del arreglo 3
    }
    
}
