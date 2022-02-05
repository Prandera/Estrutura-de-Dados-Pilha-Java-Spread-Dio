package one.digitalinnovation;

public class Main {

    public static void main(String[] args) {

        Pilha minhaPilha = new Pilha();

        //A pilha ainda nao aceita o dado direto. Temos que criar um novo nó com o valor
        //Isso sera refatorado e arrumado ao longo do curso!
        minhaPilha.push(new No(1));
        minhaPilha.push(new No(2));
        minhaPilha.push(new No(3));
        minhaPilha.push(new No(4));
        minhaPilha.push(new No(5));
        minhaPilha.push(new No(6));

        //Chama o metodo @Override toString que criamos.
        System.out.println(minhaPilha);

        //minhaPilha.pop(); Simplificando
        System.out.println(minhaPilha.pop());

        minhaPilha.push(new No(69));
        System.out.println(minhaPilha);
    }
}
