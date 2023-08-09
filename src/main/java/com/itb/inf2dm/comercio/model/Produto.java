package com.itb.inf2dm.comercio.model;

public class Produto {
private long id;
private String descricao;
private String nome;
private String codigoBarras;
private Double preco;
private String codStatus;

   //public: modificador de acesso livre para todas as classes
   //private: modificador de acesso restrito apenas para membros da
   //propria classe. entende-se por "membros " (atributos e / ou metodos)

   //Metodos setter's e getter's : Adicionar e Recuperar dados do atributo"Respectivamente"
public Long getId() {
	return id;
}
public void setId(Long id) {
	this.id = id;
}
public String getDescricao() {
	return descricao;
}
public void setDescricao(String descricao) {
	this.descricao = descricao;
}
public String getNome() {
	return nome;
}
public void setNome(String nome) {
	this.nome = nome;
}
public String getCodigoBarras() {
	return codigoBarras;
}
public void setCodigoBarras(String codigoBarras) {
	this.codigoBarras = codigoBarras;
}
public Double getPreco() {
	return preco;
}
public void setPreco(Double preco) {
	this.preco = preco;
	
}
public String getCodStatus(){
	return codStatus;
}
public void setCodStatus(String codStatus){
	this.codStatus = codStatus;

}
}