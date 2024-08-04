public class Container {
    
    private ListaEncadeada conteudo;
    private Container proximo;

    public Container(ListaEncadeada conteudo, Container proximo){
        this.conteudo = conteudo;
        this.proximo = proximo;
    }

    public void setConteudo(ListaEncadeada conteudo){
        this.conteudo = conteudo;
    }

    public ListaEncadeada getConteudo(){
        return conteudo;
    }

    public void setProximo(Container proximo){
        this.proximo = proximo;
    }

    public Container getProximo(){
        return proximo;
    }

}
