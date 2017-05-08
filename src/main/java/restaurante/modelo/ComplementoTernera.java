package restaurante.modelo;

public class ComplementoTernera extends DecoradorComplemento{
       
    public ComplementoTernera(Plato p) {
        super(p,1.50,120,"Ternera asada",0,0,1);
        precio= 1.50;
        calorias = 120;
    }

    @Override
    public int getNumeroComplementosTernera() {
        return 1 + plato.getNumeroComplementosTernera();
    }
    
}
