package Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class ProductsArray
{


    public void ProductsArray() {

        Scanner impresion = new Scanner(System.in);

        System.out.println("Bienevido \nPor favor indique Cuantos productos se van a ingresar");
        int ingreseproductos = impresion.nextInt();

        String nombreproducto[] = new String[ingreseproductos];

        for (int i = 0; i < ingreseproductos; i++)
        {
            System.out.println("Ingrese el producto "+(i+1));
            nombreproducto[i]=impresion.next();
        }
        for (int j =0 ;j< ingreseproductos;j++)
        {

            System.out.println( nombreproducto[j]);

        }

        System.out.println("----------");

        System.out.println("por favor ingrese la primera letra del producto que desea buscar  ");
        String letraproducto;
        letraproducto = impresion.next();

        for ( int m =0 ;m<nombreproducto.length;m++)
        {

            if (nombreproducto[m].startsWith(letraproducto))
            {
                System.out.println("Productos encontrados");
                System.out.println( nombreproducto[m] );
            }


        }

        System.out.println("----------");

        Arrays.sort(nombreproducto);
        System.out.print("Nombres ordenados alfabéticamente: \n");
        for (String nombresproducto : nombreproducto) {
            System.out.print(nombresproducto+"\n");
        }
        System.out.println();


    }
}