package case_study.FuramaResort.services;

import case_study.FuramaResort.models.Facility;
import case_study.FuramaResort.models.House;
import case_study.FuramaResort.models.Room;
import case_study.FuramaResort.models.Villa;
import case_study.FuramaResort.utils.ReadAndWrite;
import case_study.FuramaResort.utils.ReadAndWriteMap;

import java.io.IOException;
import java.util.*;

import static case_study.FuramaResort.utils.ReadAndWriteMap.read;

public class FacilityServiceImpl implements FacilityService{
    private static int choice;
    private Scanner scanner = new Scanner(System.in);

    static Map<Facility,Integer> facilityIntegerMap;

    static {
        facilityIntegerMap = new HashMap<Facility,Integer>();
        try {
            facilityIntegerMap = (Map<Facility, Integer>) read("D:\\A0321I1-HuynhBaDan\\modude2\\src\\case_study\\FuramaResort\\data\\Facility.csv");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void displayMenuFacility() throws IOException {
        System.out.println("1. Display list facility");
        System.out.println("2. Add new facility");
        System.out.println("3. Display list facility maintenance");
        System.out.println("4. Return main menu");
        System.out.println("mời bạn chọn");
        choice = scanner.nextInt();

        switch (choice){
            case 1:
                displayElement();
                break;
            case 2:
                addNew();
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

    @Override
    public void displayElement() {
        for (Map.Entry entry : facilityIntegerMap.entrySet()){
            System.out.println(entry);
        }
    }

    @Override
    public void addNew() {
        System.out.println("1.Add New Villa");
        System.out.println("2.Add New House");
        System.out.println("3.Add New Room");
        System.out.println("4.Back to menu");
        choice = scanner.nextInt();

        switch (choice){
            case 1:
                addVila();
                break;
            case 2:
                addHouse();
                break;
            case 3:
                addRoom();
                break;
            case 4:
                break;
            default:
                break;
        }
    }

    public void addVila(){
        Villa villa = new Villa();
        System.out.println("nhập thông tin");
        System.out.println("Tên dịch vụ");
        scanner.nextLine();
        villa.setTenDichvu(scanner.nextLine());

        System.out.println("Diện tích");
        villa.setDienTich(scanner.nextInt());

        System.out.println("Chi phí");
        villa.setChiPhi(scanner.nextInt());

        System.out.println("Số người");
        villa.setSoNguoi(scanner.nextInt());

        System.out.println("Tiêu Chuẩn phòng");
        villa.setTieuChuanPhong(scanner.nextInt());

        System.out.println("Diện tích hồ bơi");
        villa.setDienTichHoBoi(scanner.nextInt());

        System.out.println("Số tầng");
        villa.setSoTang(scanner.nextInt());

        facilityIntegerMap.put(villa,0);

        ReadAndWriteMap.write(facilityIntegerMap,"D:\\A0321I1-HuynhBaDan\\modude2\\src\\case_study\\FuramaResort\\data\\Facility.csv");

    }

    public void addRoom(){
        Room room = new Room();
        System.out.println("nhập thông tin");
        System.out.println("Tên dịch vụ");
        scanner.nextLine();
        room.setTenDichvu(scanner.nextLine());

        System.out.println("Dịch vụ kèm theo");
        room.setDichVuKemTheo(scanner.nextLine());

        System.out.println("Diện tích");
        room.setDienTich(scanner.nextInt());

        System.out.println("Chi phí");
        room.setChiPhi(scanner.nextInt());

        System.out.println("Số người");
        room.setSoNguoi(scanner.nextInt());

        facilityIntegerMap.put(room,0);
        ReadAndWriteMap.write(facilityIntegerMap,"D:\\A0321I1-HuynhBaDan\\modude2\\src\\case_study\\FuramaResort\\data\\Facility.csv");
    }

    public void addHouse(){
        House house = new House();
        System.out.println("nhập thông tin");
        System.out.println("Tên dịch vụ");
        scanner.nextLine();
        house.setTenDichvu(scanner.nextLine());

        System.out.println("Diện tích");
        house.setDienTich(scanner.nextInt());

        System.out.println("Chi phí");
        house.setChiPhi(scanner.nextInt());

        System.out.println("Số người");
        house.setSoNguoi(scanner.nextInt());

        System.out.println("Tiêu Chuẩn phòng");
        house.setTieuChuanPhong(scanner.nextInt());

        System.out.println("Số tầng");
        house.setSoTang(scanner.nextInt());

        facilityIntegerMap.put(house,0);
        ReadAndWriteMap.write(facilityIntegerMap,"D:\\A0321I1-HuynhBaDan\\modude2\\src\\case_study\\FuramaResort\\data\\Facility.csv");
    }

    @Override
    public void facilityMaintenance() throws IOException {
        List<Facility> maintenanceList = new ArrayList<>();
         for (Map.Entry entry : facilityIntegerMap.entrySet()){
             if ((int)entry.getValue() == 5){
                 maintenanceList.add((Facility) entry.getKey());
                 ReadAndWrite.write(maintenanceList,"D:\\A0321I1-HuynhBaDan\\modude2\\src\\case_study\\FuramaResort\\data\\FacilityMaintenance.csv");
             }
         }

         ReadAndWrite.read("D:\\A0321I1-HuynhBaDan\\modude2\\src\\case_study\\FuramaResort\\data\\FacilityMaintenance.csv");
         if (maintenanceList.size() == 0){
             System.out.println("chưa có mục nào");
         }else {
             for (Facility element : maintenanceList){
                 System.out.println(element);
             }
         }
    }
}
