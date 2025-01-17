package model;


public class Usuario {
    private int id;
    private String nome;
    private String email;
    private String senha;
    private boolean admin;
    
    public Usuario(int id, String nome, String email, String senha, boolean admin){
        this.id = id;
        this.nome = nome;
        this.email = email;
        this.senha = senha;
        this.admin = admin;
    }
    
    public int getId(){ return id; }
    public void setId(int id){ this.id = id; }
    
    public String getNome(){ return nome; }
    public void setNome(String nome){ this.nome = nome; }
    
    public String getEmail(){ return email; }
    public void setEmail(String email){ this.email = email; }
    
    public String getSenha(){ return senha; }
    public void setSenha(String senha){ this.senha = senha; }
    
    public boolean isAdmin(){ return admin; }
    public void setAdmin(boolean admin){ this.admin = admin; }
}
