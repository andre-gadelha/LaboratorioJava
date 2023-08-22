package br.com.appcompras;

public class Compra implements Comparable<Compra> {

    private String descricaoProduto;
    private int valorProduto;

    public Compra(String descricaoProduto, int valorProduto) {
        this.descricaoProduto = descricaoProduto;
        this.valorProduto = valorProduto;
    }

    public String getDescricaoProduto() {
        return descricaoProduto;
    }

    public int getValorProduto() {
        return valorProduto;
    }

    @Override
    public String toString() {
        return "Compra{" + "descricaoProduto = '" + descricaoProduto + '\'' +
                " valorProduto = " + valorProduto +
                '}';
    }

    @Override
    public int compareTo(Compra outraCompra) {
        return Double.valueOf(this.valorProduto).compareTo(Double.valueOf(outraCompra.valorProduto));
    }
}
