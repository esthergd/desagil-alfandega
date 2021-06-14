package br.edu.insper.desagil.alfandega;

public class ItemTarifado extends Item{
	private double tarifa;

	public ItemTarifado(String nome, double valor, double rate, double tarifa) {
		super(nome, valor, rate);
		this.tarifa = tarifa;
	}
	
	public double getTarifa() {
		return this.tarifa;
	}
}
// Abstração: como vários dos atributos do ItemTarifado eram os mesmo do Item, fiz com que o Item se transformasse numa
// superclasse em relação à classe ItemTarifado. Com isso, três dos quatro atributos originalmente presentes na
// ItemTarifado foram herdados da classe Item.