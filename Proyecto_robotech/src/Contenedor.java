import java.util.ArrayList;

public class Contenedor
{
    // creacion de las partes que contiene el robot
    private  Brazo brazo_L, brazo_R;
    private  Pierna pierna_L,pierna_R;
    private  Ala ala_L,ala_R;
    private  Arma arma_misiles = new Arma();
    private  Cabina cabina;
    private ArrayList <Arma>  armas_lasers= new ArrayList<Arma>();
    private Pista pista;
    //metodo que crea todas las partes
    Contenedor()
    {
        brazo_L = new Brazo();
        brazo_R = new Brazo();
        pierna_L = new Pierna();
        pierna_R = new Pierna();
        ala_L = new Ala();
        ala_R = new Ala();
        cabina = new Cabina();
        arma_misiles.setEstado(true);
        pista = new Pista(1000);
    }
    //establecimiento modo fighter
    public int modo_fighter()
    {
        ala_R.setEstado(true);
        ala_L.setEstado(true);
        brazo_R.setEstado(false);
        brazo_L.setEstado(false);
        pierna_R.setEstado(false);
        pierna_L.setEstado(false);
        return 1;

    }
    //Segun el modelo que eliga el usuario se crean las armas
    void creacion_de_armas_fighter(int x)
    {
        for(int i = 0 ; i < (x-1) ; i++)
        {
            Arma arma_laser = new Arma();//creamos la cantidad de objetos tipo arma requerida por el usuario
            agregar_lasers(arma_laser);//Llamamos al metodo que agrega los objetos al Arraylist
        }
    }

    void agregar_lasers(Arma x)
    {
        this.armas_lasers.add(x);//En el Arraylist tipo arma agregamos los objetos creados


    }
    //se establece el modo gerwalk
    void modo_gerwalk(int opcion_brazo_arma)
    {
        brazo_R.setEstado(true);
        brazo_L.setEstado(true);
        pierna_R.setEstado(true);
        pierna_L.setEstado(true);

        if(opcion_brazo_arma == 1)
        {
            brazo_L.setEstado_arma(true);
        }
        if(opcion_brazo_arma == 2)
        {
            brazo_R.setEstado_arma(true);
        }
    }
    //se establece el modo battroid
    void modo_battroid()
    {
        ala_L.setEstado(false);
        ala_R.setEstado(false);
        pierna_L.setEstado(true);
        pierna_R.setEstado(true);
        brazo_L.setEstado(true);
        brazo_R.setEstado(true);

    }
    void impresion_de_estado()
    {
        if(ala_L.isEstado())
        {
            if(pierna_L.isEstado())
            {
                System.out.println(" El modo de VARIABLE FIGHTER VALKYRIE es : G.E.R.W.A.L.K.");
            }
            else
            {
                System.out.println(" El modo de VARIABLE FIGHTER VALKYRIE es : FIGHTER");
            }
        }
        else
        {
            System.out.println(" El modo de VARIABLE FIGHTER VALKYRIE es : BATTROID");
        }
        if(cabina.isEstacionado())
        {
            System.out.println("Se encuentra estacionado en el Hangar ");
            System.out.println("SUGERENCIA : Aumente velocidad para salir ");
        }
        else {
            if (cabina.getAltura() > 0) {
                System.out.println("Vuelo a :" + cabina.getAltura() + " metros");
            } else {
                System.out.println(" VARIABLE FIGHTER VALKYRIE se encuentra en tierra ");
            }
        }
        System.out.println("Velocidad :" + cabina.getVelocidad() + " km/h");
    }
    public void aumentarVelocidad()
    {
        cabina.setVelocidad(90);
    }
    public void disminuirVelocidad()
    {

    }

}
