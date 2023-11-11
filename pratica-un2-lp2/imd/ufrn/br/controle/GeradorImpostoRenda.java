package imd.ufrn.br.controle;

import imd.ufrn.br.modelo.Pessoa;

public class GeradorImpostoRenda {
  private double totalTibuto;

  public GeradorImpostoRenda(){

  }

  public double getTotalTributo(){
    return this.totalTibuto;
  }

  public double calcularValorTotalTributo(Pessoa pessoa){
    this.totalTibuto = 0;

    this.totalTibuto += pessoa.calcularTributos();
    this.totalTibuto += pessoa.getConta().calcularTributos();
    this.totalTibuto += pessoa.getSeguro().calcularTributos();

    return this.totalTibuto;
  }
}
