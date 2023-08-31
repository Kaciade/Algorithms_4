package Package;

public class Main {

    public static void main(String[] args) {

        HashTable hashTable = new HashTable<>();

        hashTable.add(1, 5);
        System.out.println(hashTable.find(1));

        hashTable.add(4, 8);
        System.out.println(hashTable.find(4));

        hashTable.add(5, 9);
        System.out.println(hashTable.find(5));

        hashTable.add(6, 9);
        System.out.println(hashTable.find(6));

        hashTable.add(7, 20);
        System.out.println(hashTable.find(7));

        hashTable.add(8, 22);
        System.out.println(hashTable.find(8));


    }


}