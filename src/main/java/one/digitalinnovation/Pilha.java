package one.digitalinnovation;

public class Pilha {

    private No refNoEntradaPilha;

    public Pilha(){
        this.refNoEntradaPilha = null;
    }

    public No top(){
        return refNoEntradaPilha;
    }

    public No pop(){
        if(!this.isEmpty()){
            No noPoped = refNoEntradaPilha;
            refNoEntradaPilha = refNoEntradaPilha.getRefNo();
            return noPoped;
        }
        return null;
    }

    public void push(No novoNo){
        No refAuxiliar = refNoEntradaPilha;
        refNoEntradaPilha = novoNo;
        refNoEntradaPilha.setRefNo(refAuxiliar);
    }

    public boolean isEmpty(){
//        if(refNoEntradaDaPilha == null){
//            return true;
//        } return false;
        return refNoEntradaPilha == null ? true : false;
        // Como ler:
        //Referencia do No de Entrada está vazio? Se sim, retorne true, caso contrário, retorne false.
    }

    @Override
    public String toString(){
        String stringRetorno = "---------------\n";
        stringRetorno += "    PILHA\n";
        stringRetorno += "---------------\n";

        No noAuxiliar = refNoEntradaPilha;

        while(true){
            if(noAuxiliar != null){
                stringRetorno += "[No{dado=" + noAuxiliar.getDado() + "}]\n";
                noAuxiliar = noAuxiliar.getRefNo();
            }else{
                break;
            }
        }
        stringRetorno += "===============\n";
        return stringRetorno;
    }
}
