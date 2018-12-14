# Implementar uma Pilha
Dado uma interface Lista, contendo, pelo menos, os seguintes métodos:

interface Lista<T> {
    void append(T valor); // adiciona um elemento no final da lista.
    void addFirst(T valor); // adiciona um elemento no inicio da lista.
    void removeLast(); // remove o último elemento da lista.
    void removeFirst(); // remove o primeiro elemento da lista.
    int size(); // retorna o número de elementos na lista.
    T get(int index); retorna o elemento com o indice indicado.
}
Implemente uma classe Pilha que utilize um objeto que implementa uma Lista como estrutura de armazenamento.