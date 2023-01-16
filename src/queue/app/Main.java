package queue.app;

import java.util.*;

public class Main {
    public static Queue<String> queue = new LinkedList<>();
    public static Scanner scan = new Scanner(System.in);
    public static void main(String[] args) {
        MainMenu();
    }
    public static void addQueue(){
        int index = 0;
        while(true){
            System.out.println("===========Registrasi===========");
            System.out.print("Nama pasien : "); String name = scan.nextLine();
            add(name);
            System.out.println("Nomor antrian anda : "+(index+1));
            System.out.println("================================");
            String x = input("Tambah data lagi? [y/n]");
            if(x.equals("n")){
                System.out.println("Jumlah antrian saat ini ["+queue.size()+"]");
                System.out.println();
                break;
            } else {
                // looping to the first menu.
            }

        }
    }
    public static void MainMenu(){
        while(true){
            ShowPasient();
            System.out.println("Jumlah antrian saat ini ["+queue.size()+"]");
            System.out.println("[1] Tambah pasien");
            System.out.println("[2] Panggil pasien");
            System.out.println("[3] Keluar");
            String j = input(">> ");
            if(Integer.parseInt(j) == 1){
                addQueue();
            } else if(Integer.parseInt(j) == 2){
                System.out.print("Panggil pasien atas nama : ");
                String calling = scan.nextLine();
                callPasient(calling);
            } else if(Integer.parseInt(j) == 3){
                System.exit(0);
            } else{
                System.exit(1);
            }
        }
    }
    public static void callPasient(String nama){
        try{
            System.out.println();
            System.out.println("Panggilan kepada ["+nama+"] silahkan masuk keruangan.");
            queue.remove(nama);
        } catch (NoSuchElementException e){
            System.out.println("Data tidak ada.");
        }
        ShowPasient();
    }
    public static void ShowPasient(){
        int index = 0;
        for(var i : queue){
            System.out.println("["+(index+1)+"] "+i);
        }
    }
    public static void add(String data){
        queue.offer(data);
    }
    public static String input(String command){
        System.out.print(command+":");
        String in = scan.nextLine();
        return in;
    }
}
