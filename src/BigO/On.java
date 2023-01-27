package BigO;

public class On { // O(n) -> Linear Complexity

    public static void main(String[] args) {

        // elimizdeki veri seti arttikca calistirilma suresi de dogru orantili olarak artiyor

        int[] arr = {10, 2, 20, 40, 55, 7};

        // array in butun elemanlarini ekrana yazin
        for (int i = 0; i < arr.length; i++) {
            if (i != arr.length - 1) {
                System.out.print(arr[i] + ", ");
            } else System.out.print(arr[i]);
        }

    }

}
