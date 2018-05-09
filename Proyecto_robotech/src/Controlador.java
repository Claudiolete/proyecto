import java.util.Scanner;
public class Controlador
{
    Scanner scanner = new Scanner(System.in);
    Contenedor contenedor= new Contenedor();
    int menu;

    void eleccion_modelo()
    {
        int  modelo ;
        System.out.println("Seleccione el modelo de Valkyrie (1)(2)(3)");
        modelo = scanner.nextInt();
        if (modelo==3)
        {
            modelo=modelo+1;
        }
        contenedor.creacion_de_armas_fighter(modelo);
        menu = contenedor.modo_fighter();
    }

    void menu()
    {
        while(true)
        {
            int opcion;
            //menu del modo fighter
            while (menu == 1) {
                System.out.println("--------------------------------------------------");
                contenedor.impresion_de_estado();
                System.out.println("--------------------------------------------------");
                System.out.println("(1) Establecer modo G.E.R.W.A.L.K ");
                System.out.println("(2) Establecer modo BATTROID ");
                System.out.println("(3) Aumentar velocidad 90 km/h ");
                System.out.println("(4) Disminuir velocidad 90 km/h ");
                opcion = scanner.nextInt();
                switch (opcion)
                {
                    case 3: contenedor.aumentarVelocidad();

                }

            }
            while (menu == 2) {

            }
        }

    }

}
