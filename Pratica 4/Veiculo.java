public abstract class Veiculo {
        private String modelo;
        private String marca;
        private int ano;

        public Veiculo(String modelo, String marca, int ano){
            this.modelo = modelo;
            this.marca = marca;
            this.ano = ano;
        }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        if(ano > 0) {
            this.ano = ano;
        } else { throw new IllegalArgumentException("Ano invalido");}
    }

    public abstract void ligar();
}
