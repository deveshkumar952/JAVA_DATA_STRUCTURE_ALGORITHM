public class Main {
    public static void main(String[] args) {
        // LinkedList ll = new LinkedList();
        // ll.createLL(7);
        // ll.insertNode(1);
        // ll.insertNode(6);
        // // ll.insertNode(4);
        // // ll.insertNode(5);
        // // ll.insertNode(5);
        // ll.traverselLL();
        // vid_138_remove_duplicates q = new vid_138_remove_duplicates();
        // // q.deleteDups(ll);
        // // ll.traverselLL();
        // // Node n = q.nthToLast(ll, 2);
        // // System.out.println(n.value);
        // // LinkedList t = q.partition(ll, 03);
        // LinkedList llB = new LinkedList();
        // llB.createLL(5);
        // llB.insertNode(9);
        // llB.insertNode(2);
        // llB.traverselLL();
        // LinkedList result = q.sumLists(ll, llB);
        // result.traverselLL();

        LinkedList llA = new LinkedList();
        llA.insertNode(3);
        llA.insertNode(1);
        llA.insertNode(5);
        llA.insertNode(9);
        LinkedList llB = new LinkedList();
        llB.insertNode(2);
        llB.insertNode(4);
        llB.insertNode(6);

        // vid_138_remove_duplicates q = new vid_138_remove_duplicates();
        // q.addSameNode(llA, llB, 7);
        // q.addSameNode(llA, llB, 2);
        // q.addSameNode(llA, llB, 1);
        // Node inter = q.findIntersection(llA, llB);
        // System.out.println(inter.value);

        vid_138_remove_duplicates ops = new vid_138_remove_duplicates();
        LinkedList result = ops.sumLists(llA, llB);
        System.out.print("Sum List: ");
        result.traverselLL();

    }}
