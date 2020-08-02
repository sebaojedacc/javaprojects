import java.util.Scanner;

public class Main {
    public static int buscarCerveza (Cervezas c [], String marca, int contadorCervezas ){
        int indice = 0;
        boolean encontrado = false;

        for ( int i=0;i<contadorCervezas;i++){
            if(c [i].getMarca().equals (marca)){
                encontrado = true;
                indice = i;
            }
        }

        if (encontrado == false){
            indice = -1;
        }

        return indice;
    }


    public static void main (String[] args) {
        Scanner entrada = new Scanner (System.in);
        String nombre;
        String marca;
        String tipo;
        float grados;
        String pais;
        int opcion;
        int contadorCervezas=0;
        String nombreCerveza;
        int indiceCerveza;
        int buscarCerveza;



        //Crear objeto cervezas

        Cervezas[] cervezas = new Cervezas[200];

          //Crear menu del programa
        do{
            System.out.println ("\t.*BIENVENIDO A LA WIKICHELA*");
            System.out.println ("1- Agregar una nueva cerveza");
            System.out.println ("2- Buscar cerveza");
            System.out.println ("3- Mostrar todas las cervezas");
            System.out.println ("4- Salir");
            System.out.println ("Digite una opción del menu: ");
            opcion = entrada.nextInt ();
            entrada.nextLine ();

            switch(opcion){
                case 1:
                    System.out.print ("\nIngrese el nombre de la chela: ");
                    nombre = entrada.nextLine ();
                    System.out.print("Ingrese la marca: ");
                    marca = entrada.nextLine ();
                    System.out.print ("Ingrese el tipo de chela (Lager,Dark,Ambar): ");
                    tipo = entrada.nextLine ();
                    System.out.print ("Ingrese los grados de alcohol:  ");
                    grados = entrada.nextFloat ();
                    entrada.nextLine ();
                    System.out.print ("Ingrese el pais de origen: ");
                    pais = entrada.nextLine ();

                    cervezas [contadorCervezas] = new Cervezas (nombre,marca,tipo,grados,pais);
                    contadorCervezas++;
                    break;

                case 2:
                    System.out.println ("Ingrese la marca de la cerveza que quiere buscar:  ");
                    marca = entrada.nextLine ();
                    entrada.nextLine ();

                    indiceCerveza = buscarCerveza (cervezas,marca,contadorCervezas);
                    if(indiceCerveza ==-1) {
                        System.out.println ("La cerveza  no existe :( ");
                    }
                    else{
                        System.out.println ("Las caracteristicas de la cerveza son : ");
                        System.out.println (cervezas[indiceCerveza].datos ());
                    }
                    break;
                case 3:
                    for(int i=0;i<contadorCervezas;i++){
                        System.out.println ("Los datos de las cervezas agregadas hasta hoy son :  "+(i+1));
                        System.out.println (cervezas[i].datos ());
                    }
                    break;
                case 4: break;
                default:
                    System.out.println ("La opcion seleccionada no existe");
                    break;
            }
            System.out.println ("");
        }
        while(opcion != 7);



  //     for (int i = 0; i < cervezas.length; i++) {
//
            //System.out.println ("Ingrese la caracteristicas de la cerveza: ");
            //System.out.println ("Nombre: ");
            //nombre = entrada.nextLine ();
            //System.out.println ("Marca: ");
            //marca = entrada.nextLine ();
            //System.out.println ("Tipo (Lager,Ambar,Dark): ");
            //tipo = entrada.nextLine ();
            //System.out.println ("Grados de alcohol:º ");
            //grados = entrada.nextFloat ();
            //System.out.println ("Pais de origen: ");
          //  pais = entrada.nextLine ();

        //    cervezas [i] = new Cervezas [String nombre, String marca,String tipo,int grados,String pais];



      //  }
    }
}