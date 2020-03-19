public class Simple {

    public static void main(String[] args) {

        Logic read = new Logic();

        while (true) {
            try {
                read.read();
            } catch (RuntimeException e) {
                System.out.println("Неверный формат!");
                break;
            }
            if (read.isExitFlag()) {
                System.out.println("Выход...");
                break;
            }
            int res = Operation.calculate(read.getVar1(), read.getVar2(), read.getOpers());
            if (read.flag){
                System.out.println(Converting.arabicToRoman(res));
            } else System.out.println(res);
        }
    }
}


