/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package smartpark.modelos;

/**
 *
 * @author felipe
 */
public class Vaga {
    private long id;
    private double preco;
    private boolean ocupado;
    private Veiculo veiculo;

    public Vaga(){}
    public Vaga(long id, double preco){
        this.id = id;
        this.preco = preco;
    }

    //metodos
    public String ToString(){
        if(!ocupado){
            return id + " " + preco + " " + "~>livre";
        }else{
            return id + " " + preco + " " + "~>ocupado";
        }
        
    }

    public void OcupaVaga(/*Veiculo veiculo*/){
        //this.veiculo = veiculo;
        this.ocupado = true;
    }
    public void LiberaVaga(long id){
        this.veiculo = null;
        this.ocupado = false;
    }

    //Getters e Setterss

    
    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public boolean isOcupado() {
        return ocupado;
    }

    public void setOcupado(boolean ocupado) {
        this.ocupado = ocupado;
    }

    public Veiculo getVeiculo() {
        return veiculo;
    }

    public void setVeiculo(Veiculo veiculo) {
        this.veiculo = veiculo;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }
    
}

