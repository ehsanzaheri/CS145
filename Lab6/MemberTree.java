class MemberTree {
    private class Node {
        ClubMember member;
        Node left, right;

        Node(ClubMember member) {
            this.member = member;
        }
    }

    private Node root;

    void insert(ClubMember member) {
        root = insertRecursive(root, member);
    }

    private Node insertRecursive(Node node, ClubMember member) {
        if (node == null) return new Node(member);

        if (member.id < node.member.id)
            node.left = insertRecursive(node.left, member);
        else if (member.id > node.member.id)
            node.right = insertRecursive(node.right, member);
        // ignore duplicate IDs

        return node;
    }

    ClubMember find(int id) {
        return findRecursive(root, id);
    }

    private ClubMember findRecursive(Node node, int id) {
        if (node == null) return null;
        if (id == node.member.id) return node.member;
        return id < node.member.id ? findRecursive(node.left, id) : findRecursive(node.right, id);
    }

    void remove(int id) {
        root = removeRecursive(root, id);
    }

    private Node removeRecursive(Node node, int id) {
        if (node == null) return null;

        if (id < node.member.id) {
            node.left = removeRecursive(node.left, id);
        } else if (id > node.member.id) {
            node.right = removeRecursive(node.right, id);
        } else {
            if (node.left == null) return node.right;
            if (node.right == null) return node.left;

            Node minNode = findMin(node.right);
            node.member = minNode.member;
            node.right = removeRecursive(node.right, minNode.member.id);
        }

        return node;
    }

    private Node findMin(Node node) {
        while (node.left != null) node = node.left;
        return node;
    }

    void printInOrder() {
        printInOrderRecursive(root);
    }

    private void printInOrderRecursive(Node node) {
        if (node != null) {
            printInOrderRecursive(node.left);
            System.out.println(node.member);
            printInOrderRecursive(node.right);
        }
    }

    void printPreOrder() {
        printPreOrderRecursive(root);
    }

    private void printPreOrderRecursive(Node node) {
        if (node != null) {
            System.out.println(node.member);
            printPreOrderRecursive(node.left);
            printPreOrderRecursive(node.right);
        }
    }

    void printPostOrder() {
        printPostOrderRecursive(root);
    }

    private void printPostOrderRecursive(Node node) {
        if (node != null) {
            printPostOrderRecursive(node.left);
            printPostOrderRecursive(node.right);
            System.out.println(node.member);
        }
    }
}
