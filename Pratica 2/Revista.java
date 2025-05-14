public class Revista extends Publicacao{
    private int numero;
    private int volume;
    private String org;

    public Revista(String titulo, int ano, int numero, int volume, String org) {
        super(titulo, ano);
        this.numero = numero;
        this.volume = volume;
        this.org = org;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    public String getOrg() {
        return org;
    }

    public void setOrg(String org) {
        this.org = org;
    }

    public String toString(){
        return "REVISTA | Titulo: " + titulo + " | Org: " + org  + " | Numero: " + numero + " | Volume: " + volume +  " | Ano: " + ano;
    }
}
