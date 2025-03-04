package com.thinne.noPattern;

public class Employee {
    private String position;

    public Employee(String position) {
        this.position = position;
    }

    public void performDuties() {
        if (position.equals("Đội Trưởng")) {
            System.out.println("Công việc: Đi tuần, Gán việc cho nhân viên");
        } else if (position.equals("Giám đốc")) {
            System.out.println("Công việc: Quản lý công ty, Đưa ra quyết định chiến lược");
        } else if (position.equals("Nhân viên VP")) {
            System.out.println("Công việc: Pha trà, Phê duyệt giấy tờ");
        } else if (position.equals("Nhân viên Xưởng")) {
            System.out.println("Công việc: Sản xuất, Vận hành máy móc");
        } else if (position.equals("Kế Toán Trưởng")) {
            System.out.println("Công việc: Quản lý tài chính, Lập báo cáo");
        } else {
            System.out.println("Chức vụ không hợp lệ");
        }
    }
}
