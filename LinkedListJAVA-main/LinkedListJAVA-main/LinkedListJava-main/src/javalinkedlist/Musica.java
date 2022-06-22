
package javalinkedlist;
//import java.lang.Comparable;
public class Musica implements Comparable<Musica>{
    private String nome;
    private String artista;
    private String genero;
    private int numIntegrantes;
    private int posicao;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getArtista() {
        return artista;
    }

    public void setArtista(String artista) {
        this.artista = artista;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }
    
    public int getNumIntegrantes(){
        return numIntegrantes;
    }
    
    public void setNumIntegrantes(int numIntegrantes){
       this.numIntegrantes = numIntegrantes; 
    }
    
    public void setPosicao(int posicao){
        this.posicao = posicao;
    }
    
    public int getPosicao(){
        return posicao;
    }
    
    public int compareTo(Musica outraMusica){
      return this.getNome().
              compareTo(outraMusica.getNome());
    }
    
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Musica outraMusica = (Musica) o;

        return this.nome != null ? (outraMusica.nome).equals(this.nome) : outraMusica.nome == null;
    }

    
     @Override
    public String toString(){
        return "Nome: " + getNome() + " / " + "Artista: " + getArtista() + " / " + "Genêro: " + getGenero() + " / " + "Número de Integrantes: " + getNumIntegrantes() + " / " + "Posição: " + getPosicao();
    }// fim toString
    
}
