package advance.dev;

import java.sql.Array;
import java.util.Scanner;

/**
 * BT1:
 * @author LAPTOP KIM ANH
 *
 */

public class MainApp {
	static Student[] input() {
		Student[] stu = new Student[10];
		for(int i = 0; i < 10; i++) {
			Scanner sc = new Scanner(System.in);
			System.out.println("Nhap vao ten: ");
			String name = sc.next();
			System.out.println("Nhap vao tuoi:");
			int age = sc.nextByte();
			System.out.println("Nhap vao dia chi:");
			String address = sc.next();
			System.out.println("Nhap vao so dien thoai:");
			String numberPhone = sc.next();
			System.out.println("Nhap DTB= ");
			float diemTB = sc.nextFloat();
			Student std = new Student(name, age, address, numberPhone, diemTB);	
			stu[i] = std;
			System.out.println("==============");
		}
		return stu;
	}
	static void print(Student[] stu) {
		for (int i = 0; i < 10; i++) {
			String str = String.format("Ten: %s, Tuoi: %d, DiaChi: %s, SDT: %s, diemTb: %f", stu[i].name,stu[i].age,stu[i].address,stu[i].numberPhone,stu[i].diemTB);
			System.out.println(str);
		}
	}
	public static void main(String[] args) {
		Student[] student = new Student[10];
		student = input();
		print(student);
		
	}
}
