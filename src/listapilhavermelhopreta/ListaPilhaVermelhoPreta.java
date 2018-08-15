package listapilhavermelhopreta;

/**
 *
 * @author hargus
 */
public class ListaPilhaVermelhoPreta {

    public Object[] pilha;
    public int posicaoPilhaV;
    public int posicaoPilhaP;
    public int tamanho;
    
    public ListaPilhaVermelhoPreta(int t) {
        this.tamanho = t - 1;
        this.posicaoPilhaV = -1;
        this.posicaoPilhaP = this.tamanho;
        this.pilha = new Object[t];
    }
    
    //isEmpty
    public boolean isEmptyV() {
        if (this.posicaoPilhaV == -1) {
            return true;
        }
        return false;
    }
    
    public boolean isEmptyP() {
        if (this.posicaoPilhaP == this.tamanho) {
            return true;
        }
        return false;
    }
    
    //Sizes
    public int sizeV() {
        if (this.isEmptyV()) {
            return 0;
        }
        return this.posicaoPilhaV + 1;
    }
    
    public int sizeP() {
        if (this.isEmptyP()) {
            return 0;
        }
        return this.pilha.length - (this.posicaoPilhaP + 1);
    }
    
    //Tops
    public Object topVermelho() {
        if (this.isEmptyV()) {
            return null;
        }
        return this.pilha[this.posicaoPilhaV];
    }
    
    public Object topPreto() {
        if (this.isEmptyP()) {
            return null;
        }
        return this.pilha[this.posicaoPilhaP];
    }
    
    //Pops
    public Object popVermelho() {
        if (isEmptyV()) {
            return null;
        }
        return this.pilha[this.posicaoPilhaV--];
    }
    
    public Object popPreto() {
        if (isEmptyP()) {
            return null;
        }
        return this.pilha[this.posicaoPilhaP++];
    }
    
    //Pushs
    public void pushVermelho(Object e){
        if ((this.posicaoPilhaP - this.posicaoPilhaV) == 1 ) {
            
            Object[] newPilha = new Object[this.pilha.length * 2];
            for(int i = 0; i <= this.posicaoPilhaV; i++ ){
                newPilha[i] = this.pilha[i];
            }
            for(int p = 0; p < this.sizeP(); p++){
                newPilha[(newPilha.length -1) - p ] = this.pilha[(this.pilha.length - 1) - p];
                this.posicaoPilhaP = (newPilha.length -1) - p;
                System.out.println("index da nova pilha: " + ((newPilha.length -1) - p));
                System.out.println("index da pilha velha: " + ((this.pilha.length - 1) - p));
            }
            this.pilha = newPilha;
            this.pilha[++posicaoPilhaV] = e;
        }
        this.pilha[++posicaoPilhaV] = e;
    }
    
    public void pushPreto(Object e){
        if ((this.posicaoPilhaP - this.posicaoPilhaV) == 1 ) {
            
            Object[] newPilha = new Object[this.pilha.length * 2];
            for(int i = 0; i <= this.posicaoPilhaV; i++ ){
                newPilha[i] = this.pilha[i];
            }
            for(int p = 0; p < this.sizeP(); p++){
                newPilha[(newPilha.length -1) - p ] = this.pilha[(this.pilha.length - 1) - p];
                this.posicaoPilhaP = (newPilha.length -1) - p;
                System.out.println("index da nova pilha: " + ((newPilha.length -1) - p));
                System.out.println("index da pilha velha: " + ((this.pilha.length - 1) - p));
            }
            this.pilha = newPilha;
            this.pilha[--posicaoPilhaP] = e;
        }
        
        this.pilha[--posicaoPilhaP] = e;
        
    } 
    
    
    public static void main(String[] args) {
        ListaPilhaVermelhoPreta p = new ListaPilhaVermelhoPreta(3);
        /*System.out.println("Tamanho preto: " + p.sizeP());
        System.out.println("Tamanho vermelho: " + p.sizeV());
        System.out.println("Preto vazio? " + p.isEmptyP());
        System.out.println("Vermelho vazio? " + p.isEmptyV());
        System.out.println("Inserindo no preto...");
        System.out.println("posição preto: " + p.posicaoPilhaP);*/
        p.pushPreto("preto");
        p.pushPreto("ultimo preto");
        System.out.println("posição preto: " + p.posicaoPilhaP);
        /*System.out.println("Tamanho preto: " + p.sizeP() );
        System.out.println("---------------------");
        System.out.println("Inserindo no vermelho...");*/
        p.pushVermelho("elemento vermelho");
        System.out.println("posição vermelho: " + p.posicaoPilhaV);
        /*System.out.println("---------------------");
        System.out.println("Preto vazio? " + p.isEmptyP());
        System.out.println("Tamanho preto: " + p.sizeP());
        System.out.println("Topo do Preto: " + p.topPreto());
        System.out.println("---------------------");
        System.out.println("Vermelho vazio? " + p.isEmptyV());
        System.out.println("Tamanho vermelho: " + p.sizeV());
        System.out.println("Topo do Vermelhor: " + p.topVermelho());
        System.out.println("Posição preto: " + p.posicaoPilhaP);
        System.out.println("Posição vermelho: " + p.posicaoPilhaV);
        System.out.println("Tamanho total: " + p.tamanho);*/
        
    }
    
}
