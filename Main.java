import java.util.ArrayList;

class Main {

  public static void main(String[] args) {

    // Instancia de produtos das cozinhas
    Ingrediente arroz = new Ingrediente("Arroz", "03/2022");
    Ingrediente feijao = new Ingrediente("Feijão", "04/2021");
    Ingrediente farinha = new Ingrediente("Farinha", "05/2020");
    Ingrediente carnePorco = new Ingrediente("Carne de Porco", "04/2020");
    Ingrediente linguica = new Ingrediente("Linguiça", "05/2020");
    Ingrediente champignon = new Ingrediente("Champignon", "05/2023");
    Ingrediente brocolis = new Ingrediente("Brócolis", "03/2023");
    Ingrediente macarrao = new Ingrediente("Macarrão", "01/2022");
    Ingrediente carne = new Ingrediente("Carne", "04/2020");
    Ingrediente molho = new Ingrediente("Molho", "11/2023");

    // Cozinha Mineira
    ArrayList<Ingrediente> ingredientesCozinhaMineira = new ArrayList<Ingrediente>();
    ingredientesCozinhaMineira.add(arroz);
    ingredientesCozinhaMineira.add(feijao);
    ingredientesCozinhaMineira.add(farinha);
    ingredientesCozinhaMineira.add(carnePorco);
    ingredientesCozinhaMineira.add(linguica);

    Funcionario funcionarioMineira1 = new Funcionario("Ana", "Gerente");
    Funcionario funcionarioMineira2 = new Funcionario("Maria", "Cozinheira");
    Funcionario funcionarioMineira3 = new Funcionario("João", "Limpeza");
    Funcionario funcionarioMineira4 = new Funcionario("Jozé", "Auxiliar de cozinha");

    ArrayList<Funcionario> funcionariosCozinhaMineira = new ArrayList<Funcionario>();
    funcionariosCozinhaMineira.add(funcionarioMineira1);
    funcionariosCozinhaMineira.add(funcionarioMineira2);
    funcionariosCozinhaMineira.add(funcionarioMineira3);
    funcionariosCozinhaMineira.add(funcionarioMineira4);

    CozinhaMineira cozinhaMineira = new CozinhaMineira("Tia Maria", ingredientesCozinhaMineira,
        funcionariosCozinhaMineira, "feijoada", 20, 1);

    cozinhaMineira.Saudacao();

    cozinhaMineira.ImprimiHoraAbrirFechar(14, 20);

    System.out.println("------// Uso interno//-------");
    System.out.println("Ingrediente da cozinha: " + cozinhaMineira.nomeRestaurante);
    System.out.println("");
    cozinhaMineira.ImprimirIngrediente();
    System.out.println("");
    System.out.println("Funcionários da cozinha: " + cozinhaMineira.nomeRestaurante);
    cozinhaMineira.ImprimirFuncionarios();

    // Cozinha Chinesa
    ArrayList<Ingrediente> ingredientesCozinhaChinesa = new ArrayList<Ingrediente>();
    ingredientesCozinhaChinesa.add(champignon);
    ingredientesCozinhaChinesa.add(macarrao);
    ingredientesCozinhaChinesa.add(carne);

    Funcionario funcionarioChinesa1 = new Funcionario("Marcos", "Gerente");
    Funcionario funcionarioChinesa2 = new Funcionario("Paulo", "Cozinheiro");
    Funcionario funcionarioChinesa3 = new Funcionario("Bernado", "Limpeza");

    ArrayList<Funcionario> funcionariosCozinhaChinesa = new ArrayList<Funcionario>();
    funcionariosCozinhaChinesa.add(funcionarioChinesa1);
    funcionariosCozinhaChinesa.add(funcionarioChinesa2);
    funcionariosCozinhaChinesa.add(funcionarioChinesa3);

    CozinhaChinesa cozinhaChinesa = new CozinhaChinesa("Xing Fun", ingredientesCozinhaChinesa,
        funcionariosCozinhaChinesa, "Yakissoba", 12, 2);

    cozinhaChinesa.Saudacao();

    cozinhaChinesa.ImprimiHoraAbrirFechar(10, 21);

    System.out.println("------// Uso interno//-------");
    System.out.println("Ingrediente da cozinha: " + cozinhaChinesa.nomeRestaurante);
    System.out.println("");
    cozinhaChinesa.ImprimirIngrediente();
    System.out.println("");
    System.out.println("Funcionários da cozinha: " + cozinhaChinesa.nomeRestaurante);
    cozinhaChinesa.ImprimirFuncionarios();

    // Cozinha Italiana
    ArrayList<Ingrediente> ingredientesCozinhaItaliana = new ArrayList<Ingrediente>();
    ingredientesCozinhaItaliana.add(molho);
    ingredientesCozinhaItaliana.add(macarrao);
    ingredientesCozinhaItaliana.add(carne);

    Funcionario funcionarioItaliana1 = new Funcionario("Marcia", "Gerente");
    Funcionario funcionarioItaliana2 = new Funcionario("Paula", "Cozinheira/Limpeza");

    ArrayList<Funcionario> funcionariosCozinhaItaliana = new ArrayList<Funcionario>();
    funcionariosCozinhaItaliana.add(funcionarioItaliana1);
    funcionariosCozinhaItaliana.add(funcionarioItaliana2);

    CozinhaItaliana cozinhaItaliana = new CozinhaItaliana("Siena", ingredientesCozinhaItaliana,
        funcionariosCozinhaItaliana, "Pizza", 8, 2);

    cozinhaItaliana.Saudacao();

    cozinhaItaliana.ImprimiHoraAbrirFechar(13, 22);

    System.out.println("------// Uso interno//-------");
    System.out.println("Ingrediente da cozinha: " + cozinhaItaliana.nomeRestaurante);
    System.out.println("");
    cozinhaItaliana.ImprimirIngrediente();
    System.out.println("");
    System.out.println("Funcionários da cozinha: " + cozinhaItaliana.nomeRestaurante);
    cozinhaItaliana.ImprimirFuncionarios();
  }
}