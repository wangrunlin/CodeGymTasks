package zh.codegym.task.task14.task1415;

import java.util.ArrayList;
import java.util.List;

/* 
清洁服务
*/

public class Solution {
    public static void main(String[] args) {
        List<Apartment> apartments = new ArrayList<>();
        apartments.add(new OneRoomApt());
        apartments.add(new TwoRoomApt());
        apartments.add(new ThreeRoomApt());

        cleanAllApartments(apartments);
    }

    public static void cleanAllApartments(List<Apartment> apartments) {
        // 在此编写项目 1-4 的实现
        for (int i = 0; i < apartments.size(); i++) {
            Apartment apartment = apartments.get(i);
            if (apartment instanceof OneRoomApt)
                ((OneRoomApt) apartment).clean1Room();
            else if (apartment instanceof TwoRoomApt)
                ((TwoRoomApt) apartment).clean2Rooms();
            else if (apartment instanceof ThreeRoomApt)
                ((ThreeRoomApt) apartment).clean3Rooms();
        }
    }

    static interface Apartment {
    }

    static class OneRoomApt implements Apartment {
        void clean1Room() {
            System.out.println("1 间房完成清理");
        }
    }

    static class TwoRoomApt implements Apartment {
        void clean2Rooms() {
            System.out.println("2 间房完成清理");
        }
    }

    static class ThreeRoomApt implements Apartment {
        void clean3Rooms() {
            System.out.println("3 间房完成清理");
        }
    }
}