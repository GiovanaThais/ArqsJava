package sample;

public class Model_login {
    String textoNome;
    int textoID;
    String textoSenha;
    String textoSenha1;

    public Model_login(String tNome,int tID,String senha0,String senha1){ //construtor passando parametros
        textoNome = tNome;
        textoID = tID;
        textoSenha = senha0;
        textoSenha1 = senha1;
    }

    public Model_login() { //construtor

    }
}
