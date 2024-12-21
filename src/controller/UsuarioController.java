package controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import model.Usuario;


public class UsuarioController {
    private static List<Usuario> usuarios = new ArrayList<>();
    private static int nextId = 1;
    private static Usuario usuarioLogado = null;
    
    public boolean fazerLogin(String email, String senha) {
        try {
            Optional<Usuario> usuario = usuarios.stream()
                    .filter(u -> u.getEmail().equals(email) && u.getSenha().equals(senha))
                    .findFirst();
            
            if (usuario.isPresent()) {
                usuarioLogado = usuario.get();
                return true;
            } else {
                return false;
            }
        } catch (Exception e) {
            return false;
        }
    }
    
    public Usuario getUsuarioLogado(){ return usuarioLogado; }
    
    public void logout(){ usuarioLogado = null; }
    
    public Usuario cadastrarUsuario(String nome, String email, String senha, boolean admin) {
        if (email == null || email.trim().isEmpty()) {
            throw new IllegalArgumentException("Email não pode ser vazio");
        }
        
        boolean emailExists = usuarios.stream()
                .anyMatch(u -> u.getEmail().equals(email));
        
        if (emailExists) {
            throw new IllegalArgumentException("Email já cadastrado");
        }
        
        Usuario novoUsuario = new Usuario(nextId++, nome, email, senha, admin);
        usuarios.add(novoUsuario);
        return novoUsuario;        
    }
    
    public static void limparUsuarios() {
        usuarios.clear();
        nextId = 1;
    }       
}