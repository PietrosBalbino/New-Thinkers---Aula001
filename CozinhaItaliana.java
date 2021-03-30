import java.util.ArrayList;


public class CozinhaItaliana extends Cozinha {

  public CozinhaItaliana (
    
    String nomeRestaurante, 
    ArrayList<Ingrediente> Ingredientes,
    ArrayList<Funcionario> Funcionarios,
    String pratoPrincipal,
    int numeroPratos,
    int tempoPreparo) {
    super(TipoCozinha.Italiana, nomeRestaurante, Ingredientes, Funcionarios, pratoPrincipal, numeroPratos, tempoPreparo);
  } 

}