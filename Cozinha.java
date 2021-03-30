import java.util.ArrayList;
import java.util.Date;

public abstract class  Cozinha {

  public TipoCozinha tipo;
  String pratoPrincipal;
  String nomeRestaurante;
  int numeroPratos;  
  int numeroCozinheiros;
  int tempoPreparo;
  
  private int horaFechar;
  private int horaAbrir;
  ArrayList<Ingrediente> Ingredientes;
  ArrayList<Funcionario> Funcionarios;
    
  public Cozinha (
    TipoCozinha tipo,
    String nomeRestaurante, 
    ArrayList<Ingrediente> Ingredientes,
    ArrayList<Funcionario> Funcionarios,
    String pratoPrincipal,
    int numeroPratos,
    int tempoPreparo) {
    this.tipo = tipo;
    this.Ingredientes = Ingredientes;
    this.Funcionarios = Funcionarios;
    this.pratoPrincipal = pratoPrincipal;
    this.nomeRestaurante = nomeRestaurante;
    this.numeroPratos = numeroPratos;
    this.tempoPreparo = tempoPreparo;
    
  }

  public Cozinha (ArrayList<Funcionario> Funcionarios){
    this.Funcionarios = Funcionarios;
  }

  public int getHoraFechar(){
    return horaFechar;
  }

  // public void setHoraFechar(int horaFechar){
  //   this.horaFechar = horaFechar;
  // }

  public int getHoraAbrir(){
    return horaAbrir;
  }

  // public void setHoraAbrir(int horaAbrir){
  //   this.horaAbrir = horaAbrir;
  // }

  void Saudacao() {
    System.out.println();
    System.out.println("------> RESTAURANTE <------");
    System.out.println(" Bem vindo ao Restaurante " + tipo + ": " + nomeRestaurante + ". O prato principal é: " + pratoPrincipal + " dentre " + numeroPratos + " pratos!! O tempo de preparo é (em média): " + tempoPreparo + " Hora(s).");
  }
   
  void ImprimiHoraAbrirFechar(int horaAbrir, int horaFechar ){
    System.out.println();
    System.out.println("A hora de abrir é: " + horaAbrir + " Horas." + "\n" + "A hora de fechar é: " + horaFechar + " Horas.");
    System.out.println();
  }
   
  void ImprimirIngrediente(){
    for ( Ingrediente ingrediente : Ingredientes) {
    System.out.println( ingrediente.nome + "----> data de validade: " + ingrediente.dataValidade);
    }
  }

  void ImprimirFuncionarios(){
    System.out.println("");
    System.out.println("O restaurante "+ nomeRestaurante + " possui " + Funcionarios.size() + " funcionarios: " );
    for ( Funcionario funcionario : Funcionarios) {
      System.out.println(" Funcionari@ " + funcionario.nomeFuncionario + " possui a função: " + funcionario.funcaoFuncionario);
    } 
  }

}
