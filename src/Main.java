import java.util.*;



public class Main {
    static Set<Laptops> notes = new HashSet<>();
    static int rub_num;
    static int ram_num;
    static int hard_num;

    public static void main(String[] args) {
        Laptops lenovoG36 = new Laptops("Lenovo G36", 29677, "Red",
                "MatrasExtract 2.0", 16, 200);
        Laptops acerFn456 = new Laptops("Acer FN 456", 39999, "Blue",
                "Extractors", 8, 1000);
        Laptops honor345 = new Laptops("Honor 345", 86599, "Black",
                "Super9999", 32, 1000);
        Laptops lenovoG34 = new Laptops("Lenovo G34", 25677, "Red",
                "MatrasExtract", 8, 150);
        Laptops ToshibaGs2345 = new Laptops("Toshiba GS2345", 120499, "White",
                "Fanatsuki5000", 32, 2345);
        Laptops Akura = new Laptops("Akura", 40000, "Red",
                "AkuraBersonto", 32, 1200);

        //Set<Laptops> notes = new HashSet<>();
        notes.add(lenovoG36);
        notes.add(acerFn456);
        notes.add(honor345);
        notes.add(ToshibaGs2345);
        notes.add(Akura);

        Scanner reader = new Scanner(System.in);
        System.out.println("Введите суму больше которой не намерены платить: ");

        String rub = reader.nextLine();
        rub_num = Integer.parseInt(rub);

        System.out.println("Введите минимальны размер ОЗУ: ");

        String ram = reader.nextLine();
        ram_num = Integer.parseInt(ram);

        System.out.println("Введите минимальный объем ЖД: ");

        String hard = reader.nextLine();
        hard_num = Integer.parseInt(hard);

        System.out.println("Введите цифру критерия отбора, где 1-Деньги, 2-ОЗУ, 3-Объем ЖД: ");

        String otbor = reader.nextLine();
        int otbor_num = Integer.parseInt(otbor);
        metodOtbora(otbor_num);
    }
    public static HashSet<Laptops> prices(int a){
        HashSet<Laptops> res_rub = new HashSet<>();
        for (Laptops laptops: notes){
            if (a>laptops.getPrice()) res_rub.add(laptops);
        }
        return res_rub;
    }
    public static HashSet<Laptops> ram(int a){
        HashSet<Laptops> res_ram = new HashSet<>();
        for (Laptops laptops: notes){
            if (a>laptops.getRam_capacity()) res_ram.add(laptops);
        }
        return res_ram;
    }
    public static HashSet<Laptops> hdCap(int a){
        HashSet<Laptops> res_hdCap = new HashSet<>();
        for (Laptops laptops: notes){
            if (a>laptops.getHardDiskCapacity()) res_hdCap.add(laptops);
        }
        return res_hdCap;
    }

    public static void metodOtbora(int a) {

        switch (a) {
            case 1:
                System.out.printf("подходящие вам модели: " + prices(rub_num) );
                break;
            case 2:
                System.out.printf("подходящие вам модели: " + ram(ram_num) );
                break;
            case 3:
                System.out.printf("подходящие вам модели: " + hdCap(hard_num) );
                break;
            default:
                break;
        }
    }


}