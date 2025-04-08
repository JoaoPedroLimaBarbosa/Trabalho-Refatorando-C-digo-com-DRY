class Produto {
    private String nome;
    private double preco;
    private double percentualDesconto;

    public Produto(String nome, double preco, double percentualDesconto) {
        this.nome = nome;
        this.preco = preco;
        this.percentualDesconto = percentualDesconto;
    }

    public double calcularPrecoFinal() {
        return preco - (preco * percentualDesconto);
    }

    public void exibirPrecoFinal() {
        System.out.println(nome + " - Preço final: R$ " + calcularPrecoFinal());
    }
}

public class Loja {
    public static void main(String[] args) {
        Produto celular = new Produto("Celular", 2000.0, 0.10);
        Produto notebook = new Produto("Notebook", 4500.0, 0.15);
        Produto tablet = new Produto("Tablet", 1500.0, 0.05);

        celular.exibirPrecoFinal();
        notebook.exibirPrecoFinal();
        tablet.exibirPrecoFinal();
    }
}
