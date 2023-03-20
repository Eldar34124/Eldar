public class Main {
    public static void main(String[] args){
        StringBuilder sa=new StringBuilder(" |StringBuilder eto tip dlya tekstovyh znachenyi");
        sa.append("а также можно добавлять сколько угодно значений разного типа");
        sa.append('A');
        sa.append('B');
        sa.append('C');
        sa.append('D');
        sa.append('E');
        sa.append('F');
        sa.append('G');
        sa.append('H');
        sa.append('L');
        sa.append('M');
        sa.append('N');
        sa.append('O');
        sa.append('P');
        sa.append('Q');
        sa.append('R');
        sa.append('S');
        sa.append('T');
        sa.append('U');
        sa.append('V');
        sa.append('W');
        sa.append('Y');
        sa.append('Z');

        System.out.println(sa.length());
        System.out.println(sa);
        int[] t={1,2,3,4,5 ,4567,98,678,987687,6,0};
        for (int i = 0; i <t.length; i++) {
         sa.append(t[i]+" ");

        }
        System.out.println(sa);
    }
}