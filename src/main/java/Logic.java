import java.util.Scanner;

public class Logic {
        Integer[] arabic;
        String[] roman;

        private int num1;
        private int num2;
        private char operation;

        boolean flag = false;

        public boolean exitFlag;
        final char resultChar = '=';


        public void read() {
            arabic = new Integer[] {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
            roman = new String[] {"I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX", "X"};

            System.out.println("Введите в одну строчку выражение из двух целых чисел от 0 до 10" +
                    " арабскими либо римскими цифрами"  +
                    ", знака операции между ними'+', '-', '*', '/' и знака равно в конце '=': ");
            Scanner scanner = new Scanner(System.in);
            String value = scanner.nextLine();

            try {
                if ((value.charAt(value.length() - 1) != resultChar)) {
                    throw new RuntimeException();
                }

                value = value.substring(0, value.length() - 1);
                String[] simbol = value.split("[+-/*]");


                M: for (String s: simbol) {
                    for (String item : roman) {
                        if (s.equals(item)) {
                            flag = true;
                            continue M;
                        }
                    }
                    flag = false;
                }

                if (flag) {
                    num1 = romanToNumber(simbol[0]);
                    num2 = romanToNumber(simbol[1]);
                } else {
                    num1 = Integer.parseInt(simbol[0]);
                    num2 = Integer.parseInt(simbol[1]);
                }
                operation = value.charAt(simbol[0].length());




                if ((num1 > 10 | num1 < 0) | (num2 > 10 | num2 < 0)) {
                    throw new IllegalArgumentException();
                }
            } catch (RuntimeException e) {
                throw new IllegalArgumentException("Неверный формат данных");
            }
        }

        private static int romanToNumber(String roman) {
            switch (roman) {
                case "I":
                    return 1;
                case "II":
                    return 2;
                case "III":
                    return 3;
                case "IV":
                    return 4;
                case "V":
                    return 5;
                case "VI":
                    return 6;
                case "VII":
                    return 7;
                case "VIII":
                    return 8;
                case "IX":
                    return 9;
                case "X":
                    return 10;
                default:
                    return -1;
            }
        }

        public int getVar1() {
            return num1;
        }

        public int getVar2() {
            return num2;
        }

        public char getOpers() {
            return operation;
        }

        public boolean isExitFlag() {
            return exitFlag;
        }
    }

