import java.util.ArrayList;
import java.util.Scanner;


public class TANTAI031022 {
    public static ArrayList<Block> blockchain = new ArrayList<Block>();



    public static void main(String[] args) {
        //Nhập số lượng khối
        int soluong;
        //String data;
        System.out.println("Nhap so luong khoi cua chuoi");
        Scanner sc = new Scanner(System.in);
        soluong = sc.nextInt();
        /////////////add our blocks to the blockchain ArrayList:
        System.out.println("Khoi tao khoi dau tien: " + 0);
        blockchain.add(new Block("", "0"));
        System.out.println("Trying to Mine block  " + 0);
        blockchain.get(0).mineBlock(TANTAI021022_CHAIN.difficulty);
        /////////////
        for (int i = 1; i < soluong; i++) {
            System.out.println("Nhap du lieu khoi " + i);
            System.out.println("Nhap ho ten:");
            Scanner te = new Scanner(System.in);
            String ten = te.nextLine();
            System.out.println("Nhap noi sinh:");
            Scanner ns = new Scanner(System.in);
            String noisinh = ns.nextLine();
            /////////////////////////////////////////////////////
            blockchain.add(new Block(ten + noisinh, blockchain.get(blockchain.size() - 1).hash));
            System.out.println("Trying to Mine block " + i);
            blockchain.get(i).mineBlock(TANTAI021022_CHAIN.difficulty);
        }
    }
}