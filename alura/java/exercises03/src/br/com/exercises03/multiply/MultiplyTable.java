package br.com.exercises03.multiply;

public class MultiplyTable implements Table{

    @Override
    public void showTable(int number) {
        System.out.println("+===+===+===+===+===+===+");
        for (int i = 1; i <= 10; i++) {
            System.out.printf("%d * %d = %d\n", number, i, number*i);
        }
        System.out.println("+===+===+===+===+===+===+");
    }
}
