package model;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Node {
    private Kid data;
    private Node left;
    private Node right;
    private int count; //Contador
    private int height;

    public Node(Kid data) {
        this.data = data;
        this.left = null;
        this.right = null;
        this.count = 1;
        this.height = 1; // Asumiendo que la altura mínima de un nodo es 1
    }

    public void add(Kid kid) {
        Node newNode = new Node(kid);
        if (this.root == null) {
            this.root = newNode;
            return;
        }

        Node current = this.root;
        Node parent = null;
        while (current != null) {
            parent = current;
            if (kid.id < current.data.id) {
                current = current.left;
            } else if (kid.id > current.data.id) {
                current = current.right;
            } else {
                System.out.println("No se permiten duplicados de id");
                return;
            }
        }

        if (kid.getId() < parent.data.getId()) {
            parent.left = newNode;
        } else {
            parent.right = newNode;
        }
    } //Fin del método añadir

    public boolean hasChildren(Node node) {
        return (node.left != null) || (node.right != null);
    } //Fin del método tiene hijos


} //Fin de la clase
