/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author USUARIO
 */
public class Usuario {
    private int id;
    private String email;
    private String assunto;
    private String numerodecontato;
    private String descricao;

    public Usuario(String email, String assunto, String descricao, String numerodecontato) {
        this.email = email;
        this.assunto = assunto;
        this.descricao = descricao;
        this.numerodecontato = numerodecontato;
    }

 
  



    
    
    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAssunto() {
        return assunto;
    }

    public void setAssunto(String assunto) {
        this.assunto = assunto;
    }

    public String getNumerodecontato() {
        return numerodecontato;
    }

    public void setNumerodecontato(String numerodecontato) {
        this.numerodecontato = numerodecontato;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
    
    
    
}
