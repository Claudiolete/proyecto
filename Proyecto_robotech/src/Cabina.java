public class Cabina
{
    private double velocidad = 0;
    private int altura = 0;
    private int distancia = 0;
    private boolean estacionado = true;

    public Cabina() {
    }


    public double getVelocidad() {
        return velocidad;
    }

    public void setVelocidad(double velocidad) {
        this.velocidad = this.velocidad + velocidad;
        if (this.velocidad > 750)
        {
            this.velocidad = 750;
        }
    }

    public int getAltura() {
        return altura;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }

    public int getDistancia() {
        return distancia;
    }

    public void setDistancia(int distancia) {
        this.distancia = distancia;
    }

    public boolean isEstacionado() {
        return estacionado;
    }

    public void setEstacionado(boolean estacionado) {
        this.estacionado = estacionado;
    }
}
