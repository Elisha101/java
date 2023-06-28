// // 1. Вычислить n-ое треугольного число(сумма чисел от 1 до n), n! (произведение чисел от 1 до n).
// // ===============================================================================================


// package lesson1;
// import java.util.Scanner;

// public class dz {
//     public static void main(String[] args) {
//         System.out.printf("Введите число n: ");
//         Scanner num = new Scanner(System.in);
//         int n = num.nextInt();
//         int sum = 0;
//         int mult = 1;
//         for (int i = 1; i <= n; i++) {
//             sum += i;
//             mult *= i;            
//         }
//         System.out.printf("Сумма чисел от 1 до %d: %d%n", n, sum);
//         System.out.printf("Произведение чисел от 1 до %d: %d%n", n, mult);
//         num.close();
//      }
// }

// 2. Вывести все простые числа от 1 до 1000. 
// ==============================================


// package lesson1;

// public class dz {
//     public static void main(String[] args) {
//         for (int i = 1; i <= 1001; i++) {
//             // поставили флаг
//             boolean isPrime = true;  
//             for (int j = 2; j <= Math.floor(Math.sqrt(i)); j++){
//                 //Если j - делитель, флаг = false
//                 if ((i % j) == 0) { 
//                     isPrime = false;
//                     break;
//                 }
//             }
//             if (isPrime){
//                 System.out.print(i + " "); //если делителей нет, флаг остался True, число на печать
//             }
//         }
//     }
// }

// // 3. Реализовать простой калькулятор
// // ====================================


// package lesson1;
// import java.util.Scanner;

// public class dz {
//     static Scanner scanner = new Scanner(System.in);
//     public static void main(String[] args) {
        
//         System.out.println("Введите первое число:");
//         Scanner n1 = new Scanner(System.in);
//         int num1 = n1.nextInt();
        
//         System.out.println("Введите второе число:");
//         Scanner n2 = new Scanner(System.in);
//         int num2 = n2.nextInt();

//         System.out.println("Введите операцию:");
//         char operation = scanner.next().charAt(0);

//         int result = 0;
//         switch (operation){
//             case '+':
//                 result = num1 + num2;
//                 break;
//             case '-':
//                 result = num1 - num2;
//                 break;
//             case '*':
//                 result = num1 * num2;
//                 break;
//             case '/':
//                 result = num1 / num2;
//                 break;
//             }
//     System.out.println("Результат операции: " + result);
//     n1.close();
//     n2.close();
//     }
// }


