package javaPro.lesson1.arrayService;

public class ArraySortDemo {

    public static void main(String[] args) {
        ArrayService service = new ArrayService();

        int[] array = service.createArrayFromUserInput();
        array = service.fillArrayFromUserInput(array);
        service.sort(array);
        service.printArray(array);
    }

}