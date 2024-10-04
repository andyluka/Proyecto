
package models;

public class Administrador {
    public String usu;
    public String pass;

    public Administrador(){
        usu ="aiep";
        pass ="2024";
    }

    public String getUsu() {
        return usu;
    }

    public void setUsu(String userd) {
        this.usu = userd;
    }

    public String getPass() {
        return pass;
    }

    public void setClave(String clave) {
        this.pass = clave;
    }
}