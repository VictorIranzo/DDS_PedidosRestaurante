package restaurante.modelo;

public class ComplementoGamba extends DecoradorComplemento{
     
    public ComplementoGamba(Plato p) {
        super(p,1.50,90,"Gambas crujientes",1,0,0);
    }
    
    @Override
    public int getNumeroComplementosGamba() {
        return 1 + plato.getNumeroComplementosGamba();
    }

}
