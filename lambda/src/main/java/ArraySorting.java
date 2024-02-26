public class ArraySorting {
    public static void main(String[] args) {
        ArraySorting as = new ArraySorting();
       // as.sort();

        QuickSort qa = new QuickSort();
        BubbleSort bs = new BubbleSort();

        //Behaviour parameterization
        qa.sort();
        bs.sort();

        //lambda implementation
        //our lambda have to exactly match our interface method/ same signature
//        MyLambda myLambda = () -> System.out.println("Sorting the array");
//        Sorting myLambda2 = () -> System.out.println("Sorting the array");

        Sorting noLambda = new QuickSort();
        noLambda.sort();

        Sorting quickSort = () -> System.out.println("Quick Sort with lambda");
        as.sort(quickSort);

        Sorting bubbleSort = () -> System.out.println("Bubble Sort with Lambda");
        as.sort(bubbleSort);

    }

    private void sort(Sorting sorting){
        sorting.sort();
    }
}

