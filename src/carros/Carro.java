/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package carros;

/**
 *
 * @author Edutec
 */
public abstract class Carro implements ICarro{
    private String nome, placa , marca;
    
    Carro(String nome, String placa, String marca){
        this.setNome(nome);
        this.setMarca(marca);
        this.setPlaca(placa);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }
    
    @Override
    public String retornaDados() {
        String retornar = "Dado do cliente:"+getNome()+getMarca()+getPlaca();
        return retornar;
    }

    @Override
    public void AlteraNome(String NNome) {
        this.setNome(NNome);
    }
}
