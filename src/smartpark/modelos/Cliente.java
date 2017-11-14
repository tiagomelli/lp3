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
public class Cliente {
    private long id;
    private String cpf;
    private String nome;
    // List<Veiculo> carros;

    public Cliente() {
    }

    public Cliente(long id, String cpf, String nome) {
        this.id = id;
        this.cpf = cpf;
        this.nome = nome;
    }

    //Metodos
    public void CadastrarVeiculo(){}
    public void RemoverVeiculo(){}
    public void VisualizarVeiculos(){}

    //Getters e Setters

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
