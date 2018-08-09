package listapilhavermelhopreta;

/**
 *
 * @author hargus
 */
public class ListaPilhaVermelhoPreta {

    public Object[] pilha;
    public int posicaoPilhaV;
    public int posicaoPilhaP;
    
    public ListaPilhaVermelhoPreta() {
        this.posicaoPilhaV = -1;
        this.posicaoPilhaP = 11;
        this.pilha = new Object[10];
    }
    
    //isEmpty
    public boolean isEmptyV() {
        if (this.posicaoPilhaV == -1) {
            return true;
        }
        return false;
    }
    
    public boolean isEmptyP() {
        if (this.posicaoPilhaP == 11) {
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
        return this.posicaoPilhaP;
    }
    
    //Tops
    public Object topVermelho() {
        //top
        if (this.isEmptyV()) {
            return null;
        }
        return this.pilha[this.posicaoPilhaV];
    }
    
    public Object topPreto() {
        //top
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
    public void pushVermelhor(Object e){
        if ((this.posicaoPilhaP - this.posicaoPilhaV) == 1 ) {
            //pilha vermelha cheia
        } else{
            this.pilha[++posicaoPilhaV] = e;
        }
    }
    
    public void pushPreto(Object e){
        if ((this.posicaoPilhaV - this.posicaoPilhaP) == 1 ) {
            //pilha preta cheia
        } else{
            this.pilha[--posicaoPilhaP] = e;
        }
    } 
    
    
    
    public static void main(String[] args) {
        // TODO code application logic here
    }
    
}
