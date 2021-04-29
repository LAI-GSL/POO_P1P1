
package HERENCIA;

/**
 *
 * @author familia
 */
public abstract class Animal implements metodos { 

    protected String Tamano;
    protected String TipoDeReproducción;
    protected String Sonido;
    protected String Defecar;
    protected String Dormir;

    Animal() {

    }

    public String getTamano() {
        return Tamano;
    }

    public void setTamano(String Tamano) {
        this.Tamano = Tamano;
    }

    public String getTipoDeReproducción() {
        return TipoDeReproducción;
    }

    public void setTipoDeReproducción(String TipoDeReproducción) {
        this.TipoDeReproducción = TipoDeReproducción;
    }

    @Override
    public String getSonido() {
        return Sonido;
    }

    @Override
    public void setSonido(String Sonido) {
        this.Sonido = Sonido;
    }

    @Override
    public String getDefecar() {
        return Defecar;
    }

    @Override
    public void setDefecar(String Defecar) {
       this.Defecar = Defecar;
    }

    @Override
    public String getDormir() {
       return Dormir;
    }

    @Override
    public void setDormir(String Dormir) {
       this.Dormir = Dormir;
    }
 

}
