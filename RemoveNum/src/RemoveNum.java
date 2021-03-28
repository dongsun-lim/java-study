import java.util.*;
import java.util.stream.Collectors;

public class RemoveNum {

    public static void main(String[] args) {

        int[] source1 = new int[]{1,1,3,3,0,1,1};   // A : [1, 3, 0, 1]
        int[] source2 = {4, 4, 4, 3, 3};            // A : [4, 3]

        for (int i : solution(source1)) {
            System.out.printf("%d ", i);
        }
    }

    public static int[] solution(int []arr) {
//        Array to list
//        List<Integer> list = Arrays.stream(arr)
//                .boxed()
//                .collect(Collectors.toList());

        int[] answer = {};

        Deque<Integer> deque = new ArrayDeque<>();
        deque.push(arr[0]);

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] != deque.getLast()) {
                deque.addLast(arr[i]);
            }
        }

        answer = deque.stream()
                .mapToInt(i -> i)
                .toArray();

        return answer;
    }

    public static int[] mySolution(int []arr) {
        List<Integer> list = new ArrayList<Integer>();
        list.add(arr[0]);

        for (int i = 1; i < arr.length; i++) {
            if (arr[i-1] != arr[i]) {
                list.add(arr[i]);
            }
        }

        return list.stream().mapToInt(i -> i).toArray();

/*        int[] output = new int[arr.length];
        int preValue = output[0] = arr[0];
        int idx = 1;

        for (int i = 1; i < arr.length; i++) {
            if (preValue != arr[i]) {
                output[idx] = arr[i];
                preValue = arr[i];
                idx++;
            }
        }

        int[] answer = new int[idx];
        System.arraycopy(output, 0, answer, 0, idx);
        return answer;*/
    }
}
