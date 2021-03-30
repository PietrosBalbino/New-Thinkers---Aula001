import java.util.ArrayList;

public class CozinhaChinesa extends Cozinha {

  public CozinhaChinesa (    
    String nomeRestaurante, 
    ArrayList<Ingrediente> Ingredientes,
    ArrayList<Funcionario> Funcionarios,
    String pratoPrincipal,
    int numeroPratos,
    int tempoPreparo) {
    super(TipoCozinha.Chinesa, nomeRestaurante, Ingredientes, Funcionarios, pratoPrincipal, numeroPratos, tempoPreparo);
  } 

}