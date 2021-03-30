import java.util.ArrayList;


public class CozinhaMineira extends Cozinha {

  public CozinhaMineira (
    
    String nomeRestaurante, 
    ArrayList<Ingrediente> Ingredientes,
    ArrayList<Funcionario> Funcionarios,
    String pratoPrincipal,
    int numeroPratos,
    int tempoPreparo) {
    super(TipoCozinha.Mineiro, nomeRestaurante, Ingredientes, Funcionarios, pratoPrincipal, numeroPratos, tempoPreparo);
  } 

}

