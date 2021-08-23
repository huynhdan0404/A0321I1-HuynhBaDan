package case_study.FuramaResort.services;

import case_study.FuramaResort.models.Facility;
import case_study.FuramaResort.models.House;
import case_study.FuramaResort.models.Room;
import case_study.FuramaResort.models.Villa;

import java.util.*;

public class FacilityServiceImpl implements FacilityService{
    private static String tenDichvu;
    private static int dienTich;
    private static int chiPhi;
    private static int soNguoi;
    private static int tieuChuanPhong;
    private static int dienTichHoBoi;
    private static int soTang;
    private static String dichVuKemTheo;
    private static int choice;

    private static HashMap<Facility,Integer> facilityList;
    private static Scanner scanner = new Scanner(System.in);

    static {
        facilityList = new HashMap<Facility,Integer>();
        facilityList.put(new Villa("Vila1",200,7000000,4,3,20,1),0);
        facilityList.put(new House("House1",100,5000000,4,3,1),0);
        facilityList.put(new Room("Rom1",70,3000000,4,"các dịch vụ kèm theo"),0);
    }

    public static void displayMenuFacility(){
        System.out.println("1. Display list facility");
        System.out.println("2. Add new facility");
        System.out.println("3. Display list facility maintenance");
        System.out.println("4. Return main menu");
        System.out.println("mời bạn chọn");
        choice = scanner.nextInt();

        switch (choice){
            case 1:
                displayFacility();
                break;
            case 2:
                addFacility();
                break;
            case 3:
                facilityMaintenance();
                break;
            case 4:
                break;
            default:
                break;
        }

    }

    public static void displayFacility(){
            for (Facility facility : facilityList.keySet())
                System.out.println(facility);
    }

    public static void addFacility(){
        System.out.println("1.Add New Villa");
        System.out.println("2.Add New House");
        System.out.println("3.Add New Room");
        System.out.println("4.Back to menu");
        choice = scanner.nextInt();

        switch (choice){
            case 1:
                //addVila
                System.out.println("nhập thông tin");
                System.out.println("Tên dịch vụ");
                scanner.nextLine();
                tenDichvu = scanner.nextLine();

                System.out.println("Diện tích");
                dienTich = scanner.nextInt();

                System.out.println("Chi phí");
                chiPhi = scanner.nextInt();

                System.out.println("Số người");
                soNguoi = scanner.nextInt();

                System.out.println("Tiêu Chuẩn phòng");
                tieuChuanPhong = scanner.nextInt();

                System.out.println("Diện tích hồ bơi");
                dienTichHoBoi = scanner.nextInt();

                System.out.println("Số tầng");
                soTang = scanner.nextInt();

                facilityList.put(new Villa(tenDichvu,dienTich,chiPhi,soNguoi,tieuChuanPhong,dienTichHoBoi,soTang),0);
                break;
            case 2:
                //addHouse
                System.out.println("nhập thông tin");
                System.out.println("Tên dịch vụ");
                scanner.nextLine();
                tenDichvu = scanner.nextLine();

                System.out.println("Diện tích");
                dienTich = scanner.nextInt();

                System.out.println("Chi phí");
                chiPhi = scanner.nextInt();

                System.out.println("Số người");
                soNguoi = scanner.nextInt();

                System.out.println("Tiêu Chuẩn phòng");
                tieuChuanPhong = scanner.nextInt();

                System.out.println("Số tầng");
                soTang = scanner.nextInt();

                facilityList.put(new House(tenDichvu,dienTich,chiPhi,soNguoi,tieuChuanPhong,soTang),0);
                break;
            case 3:
                //addRoom
                System.out.println("nhập thông tin");
                System.out.println("Tên dịch vụ");
                scanner.nextLine();
                tenDichvu = scanner.nextLine();

                System.out.println("Diện tích");
                dienTich = scanner.nextInt();

                System.out.println("Chi phí");
                chiPhi = scanner.nextInt();

                System.out.println("Số người");
                soNguoi = scanner.nextInt();

                System.out.println("Dịch vụ kèm theo");
                scanner.nextLine();
                dichVuKemTheo = scanner.nextLine();

                facilityList.put(new Room(tenDichvu,dienTich,chiPhi,soNguoi,dichVuKemTheo),0);
            default:
                break;
        }

    }

    public static void facilityMaintenance(){
         List<Facility> facilities = new ArrayList<>();
         for (Facility facility : facilityList.keySet()){
             for (Integer values : facilityList.values()){
                 if (values == 5){
                     facilities.add(facility);
                 }
             }
         }
    }
}
