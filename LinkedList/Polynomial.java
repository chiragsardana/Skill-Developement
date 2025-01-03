class Polynomial {
    static class Node {
        int coefficient;
        int exponent;
        Node next;

        Node(int coefficient, int exponent) {
            this.coefficient = coefficient;
            this.exponent = exponent;
            this.next = this; // Points to itself in a circular list
        }
    }

    private Node head = null;

    // Add a term to the polynomial
    public void addTerm(int coefficient, int exponent) {
        Node newNode = new Node(coefficient, exponent);
        if (head == null) {
            head = newNode;
            head.next = head; // Circular link
        } else {
            Node current = head;
            Node prev = null;

            while (current.exponent >= exponent && current.next != head) {
                prev = current;
                current = current.next;
            }

            if (prev == null && exponent > current.exponent) { // Insert at the head
                newNode.next = head;

                // Find the tail to maintain circular structure
                Node tail = head;
                while (tail.next != head) {
                    tail = tail.next;
                }
                tail.next = newNode;
                head = newNode;
            } else if (current.next == head && current.exponent >= exponent) { // Append at the end
                current.next = newNode;
                newNode.next = head;
            } else { // Insert in between
                prev.next = newNode;
                newNode.next = current;
            }
        }
    }

    // Evaluate the polynomial for a given x
    public double evaluate(double x) {
        double result = 0.0;
        if (head != null) {
            Node current = head;

            while (true) {
                result += current.coefficient * Math.pow(x, current.exponent);
                current = current.next;
                if (current == head) break; // Exit the loop when back at the head
            }
        }
        return result;
    }

    // Add two polynomials
    public static Polynomial addPolynomials(Polynomial p1, Polynomial p2) {
        Polynomial result = new Polynomial();

        if (p1.head != null) {
            Node current = p1.head;
            while (true) {
                result.addTerm(current.coefficient, current.exponent);
                current = current.next;
                if (current == p1.head) break; // Exit when back at the head
            }
        }

        if (p2.head != null) {
            Node current = p2.head;
            while (true) {
                result.addTerm(current.coefficient, current.exponent);
                current = current.next;
                if (current == p2.head) break; // Exit when back at the head
            }
        }

        return result;
    }

    // Display the polynomial
    public void display() {
        if (head == null) {
            System.out.println("Polynomial is empty");
            return;
        }

        Node current = head;
        boolean first = true;
        while (current != head || first) {
            first = false; // To handle the first node specifically
            System.out.print(current.coefficient + "x^" + current.exponent);
            current = current.next;
            if (current != head) {
                System.out.print(" + ");
            }
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Polynomial p1 = new Polynomial();
        p1.addTerm(3, 2); // 3x^2
        p1.addTerm(4, 1); // 4x^1
        p1.addTerm(2, 0); // 2

        System.out.println("Polynomial 1:");
        p1.display();

        Polynomial p2 = new Polynomial();
        p2.addTerm(5, 3); // 5x^3
        p2.addTerm(2, 2); // 2x^2
        p2.addTerm(1, 0); // 1

        System.out.println("Polynomial 2:");
        p2.display();

        Polynomial result = Polynomial.addPolynomials(p1, p2);
        System.out.println("Result of addition:");
        result.display();

        double value = result.evaluate(2); // Evaluate at x = 2
        System.out.println("Evaluation of result at x = 2: " + value);
    }
}
