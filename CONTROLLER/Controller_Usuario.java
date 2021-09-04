package CONTROLLER;

import MODEL.Usuario;

public class Controller_Usuario {
    
    public boolean cadastrar_usuario(String nome, String cpf, String cidade, String telefone) {
        if (nome != null && nome.length() > 0 && cpf != null && cpf.length() > 0 && cidade != null && cidade.length() > 0 && telefone != null
                && telefone.length() > 0) {
            Usuario usuario = new Usuario();
            usuario.CadstrarUsuario(usuario);
            return true;
        }
        return false;
        
    }
    
    public boolean excluir_usuario(int index) {
        if (index >= 0) {
            Usuario usuario = new Usuario();
            usuario.ExcluirUsuario(usuario);
            return true;
            
        }
        
        return false;
    }
    
    public boolean editar_usuario(int index) {
        if (index >= 0) {
            Usuario usuario = new Usuario();
            usuario.EditarUsuario(usuario);
            return true;
            
        }
        return false;
    }
}
