public class Carro {
    private String nome;
    private String anoDoCarro;
    private double precoUm;
    private double precoDois;
    private double precoTres;


    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getAnoDoCarro() {
        return anoDoCarro;
    }

    public void setAnoDoCarro(String anoDoCarro) {
        this.anoDoCarro = anoDoCarro;
    }

    public double getPrecoUm() {
        return precoUm;
    }

    public void setPrecoUm(double precoUm) {
        this.precoUm = precoUm;
    }

    public double getPrecoDois() {
        return precoDois;
    }

    public void setPrecoDois(double precoDois) {
        this.precoDois = precoDois;
    }

    public double getPrecoTres() {
        return precoTres;
    }

    public void setPrecoTres(double precoTres) {
        this.precoTres = precoTres;
    }

    void ModeloCarro(){
        System.out.println(getNome());
    }
    void PrecosAnos(){
        System.out.println(getPrecoUm());
        System.out.println(getPrecoDois());
        System.out.println(getPrecoTres());
    }
    void MaiorPreco(double maior){
        if (precoUm > precoDois && precoUm > precoTres){
            precoUm = maior;
            System.out.println("Maior preço: " + maior);
        } else if (precoDois > precoUm && precoDois > precoTres) {
            precoDois = maior;
            System.out.println("Maior preço: " + maior);
        } else {
            precoTres = maior;
            System.out.println("Maior preço: " + maior);
        }
    }

    void MenorPreco(double menor){
        if (precoUm < precoDois && precoUm < precoTres){
            precoUm = menor;
            System.out.println("Maior preço: " + menor);
        } else if (precoDois < precoUm && precoDois < precoTres) {
            precoDois = menor;
            System.out.println("Maior preço: " + menor);
        } else {
            precoTres = menor;
            System.out.println("Maior preço: " + menor);
        }
    }
}

