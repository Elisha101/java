// Дана строка sql-запроса "select * from students where ". 
// Сформируйте часть WHERE этого запроса, используя StringBuilder. 
// Данные для фильтрации приведены ниже в виде json строки.
// Если значение null, то параметр не должен попадать в запрос.

// Параметры для фильтрации: {"name":"Ivanov", "country":"Russia", "city":"Moscow", "age":"null"}
// ===============================================================================================

// package lesson2;
// import java.util.LinkedHashMap;
// import java.util.Map;


// public class dz {
//     public static void main(String[] args) {
//         Map<String, String> map = new LinkedHashMap<>();
//         map.put("name","Ivanov");
//         map.put("country","Russia");
//         map.put("city","Moskow");
//         map.put("age",null);

//         System.out.println(getQuery(map));
//     }

//     public static String getQuery(Map<String, String> params) {
//         StringBuilder result = new StringBuilder();
//         if (params == null || params.isEmpty())
//             return result.toString();

//         for (Map.Entry<String, String> pair : params.entrySet()) {
//             if (pair.getKey() == null || pair.getValue() == null)
//                 continue;

//             result.append(pair.getKey()).append(" = '").append(pair.getValue()).append("' and ");
//         }

//         if (result.length() > 5)
//             result.delete(result.length() - 5, result.length());

//         return result.toString();
//     }
// }



// Реализуйте алгоритм сортировки пузырьком числового массива, результат после каждой итерации запишите в лог-файл.
// ================================================================================================================

package lesson2;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;


public class dz {
    private static File log;
    private static FileWriter fileWriter;

    public static void main(String[] args) {
        try {
            log = new File("log.txt");
            log.createNewFile();
            fileWriter = new FileWriter(log);
            int[] sortArr = { 22, 55, 0, 10, -3, 8 };
            bubbleSort(sortArr);
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                fileWriter.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }


    public static void bubbleSort(int[] sortArr){
        for (int i = 0; i < sortArr.length - 1; i++) {
            for(int j = 0; j < sortArr.length - i - 1; j++) {
                if(sortArr[j + 1] < sortArr[j]) {
                    int swap = sortArr[j];
                    sortArr[j] = sortArr[j + 1];
                    sortArr[j + 1] = swap;
                }
            }
            writeLog(Arrays.toString(sortArr));
        }
    }    

    public static void writeLog(String note) {
        
        try(FileWriter writer = new FileWriter("log.txt"))
        {
           fileWriter.write(note + "\n"); 
        }
        catch(IOException e){
            e.printStackTrace();
        }
    }
}