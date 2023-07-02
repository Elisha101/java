// Даны два Deque, представляющие два целых числа. Цифры хранятся в обратном порядке и каждый из их узлов содержит одну цифру.
// 1) Умножьте два числа и верните произведение в виде связанного списка.
// 2) Сложите два числа и верните сумму в виде связанного списка.
// Одно или два числа могут быть отрицательными.

// Даны два Deque, цифры в обратном порядке.
// [3,2,1] - пример Deque
// [5,4,3]- пример второго Deque
// 1) 123 * 345 = 42 435
// Ответ всегда - связный список, в обычном порядке
// [4,2,4,3,5] - пример ответа

package lesson4;
import java.util.Arrays;
import java.util.Deque;
import java.util.LinkedList;
import java.util.Queue;

public class dz {
    
    static int makeInt(Deque<String> arr) {
        int result=0; // значение к возврату
        String inS;   // временная, принятый символ
        int krat = 1; // кратность, определяющая разряд числа

        while(arr.size() != 0) {
            inS = arr.pollFirst();
            if (!inS.equals("-")) {
                result = result + krat * (Integer.parseInt(inS));
                krat *= 10;
            } else {
                result *= -1;
            }
        }
        return result;
    }

    static Queue<String> Pack(int in) {
        Deque<String> q = new LinkedList<>();
        int temp = 0;
        boolean negative = false;
        if (in < 0) {
            in *= -1;
            negative = true; 
        }
        while (in > 0) {
            temp = in % 10;
            in = (in - temp) / 10;
            q.addFirst(Integer.toString(temp));
        }
        if (negative) {
            q.addFirst("-");
        }
        return q;
    }
    public static void main(String[] args) {

        // Создаем очереди
        Deque<String> list_1 = new LinkedList<>(Arrays.asList("3","2","1"));
        Deque<String> list_2 = new LinkedList<>(Arrays.asList("7","4","-"));
        Deque<String> list_3 = new LinkedList<>(Arrays.asList("5","2"));
        Deque<String> list_4 = new LinkedList<>(Arrays.asList("2","2","2"));
        System.out.println("--------------------------------------------------------------");

        // Выводим исходные данные
        System.out.println("На старте: ");
        System.out.println("Первая пара: " + list_1 + ", " + list_2);
        System.out.println("Вторая пара: " + list_3 + ", " + list_4);
        System.out.println();

        // Преобразуем очереди в числа типа int и перемножаем числа:

        // Первая пара чисел
        int first_num = makeInt(list_1);
        int second_num = makeInt(list_2);
        int composition = first_num * second_num;
        System.out.printf("%d * %d = %d\n", first_num, second_num, composition);
        // Вторая пара чисел
        first_num = makeInt(list_3);
        second_num = makeInt(list_4);
        int composition_2 = first_num * second_num;
        System.out.printf("%d * %d = %d\n", first_num, second_num, composition_2);

        //Запаковываем результаты в списки:
        System.out.println();
        System.out.println("Результирующие коллекции: ");
        System.out.println(Pack(composition));
        System.out.println(Pack(composition_2));

        //Раскланиваемся, уходим
        System.out.println("--------------------------------------------------------------");
        System.out.println();
        System.out.println("Да пребудет с нами Java....");
        
    }
    
}