public class Produto {

    private String nome;
    private double preco;
    private int quantidade;
    private String categoria;

    // Construtor padrão
    public Produto() {
        this.nome = "Sem nome";
        this.preco = 0.0;
        this.quantidade = 0;
        this.categoria = "Sem categoria";
    }

    // Construtor parametrizado
    public Produto(String nome, double preco, int quantidade, String categoria) {
        this.nome = nome;
        setPreco(preco);
        setQuantidade(quantidade);
        this.categoria = categoria;
    }

    // Getters e Setters com validação

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        if(nome != null && !nome.isEmpty()){
            this.nome = nome;
        }
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        if(preco >= 0){
            this.preco = preco;
        }
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        if(quantidade >= 0){
            this.quantidade = quantidade;
        }
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    // Métodos específicos

    public double calcularValorTotal(){
        return preco * quantidade;
    }

    public void adicionarEstoque(int quantidade){
        if(quantidade > 0){
            this.quantidade += quantidade;
        }
    }

    // toString

    @Override
    public String toString() {
        return "Produto{" +
                "Nome='" + nome + '\'' +
                ", Preço=" + preco +
                ", Quantidade=" + quantidade +
                ", Categoria='" + categoria + '\'' +
                '}';
    }
}